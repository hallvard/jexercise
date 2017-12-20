package no.hal.confluence.ui.views;

import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.ccil.cowan.tagsoup.Parser;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.ValueNode;

import no.hal.confluence.ui.resources.util.xml.Sax2DomHandler;

public class WikiPageView {

	private Collection<WikiPage> wikiPages = null;
	private String[] tagsFilter = null;
	
	private Text tagsText; 
	private TreeViewer wikiPageTreeViewer;

	public boolean select(WikiPage wikiPage) {
		if (tagsFilter == null) {
			return true;
		}
		for (String filter : tagsFilter) {
			if (wikiPage.tags != null && wikiPage.tags.contains(filter)) {
				return true;
			}
		}
		return false;
	}

	private final ViewerFilter[] tagsFilters = {
		new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return WikiPageView.this.select((WikiPage) element);
			}
		}
	};

	public void createControls(final Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(1, false);
		layout.verticalSpacing = 0;
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		layout.horizontalSpacing = 0;
		composite.setLayout(layout);

		tagsText = new Text(composite, SWT.SEARCH | SWT.ICON_SEARCH | SWT.ICON_CANCEL);
		tagsText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		tagsText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				String text = tagsText.getText().trim();
				tagsFilter = (text.length() > 0 ? text.split(" ") : null);
				wikiPageTreeViewer.refresh();
			}
		});
		
		wikiPageTreeViewer = new TreeViewer(composite);
		wikiPageTreeViewer.getTree().setHeaderVisible(true);
		TreeViewerColumn labelColumn = new TreeViewerColumn(wikiPageTreeViewer, SWT.LEFT);
		labelColumn.getColumn().setText("Title");
		labelColumn.getColumn().setWidth(400);
		labelColumn.setLabelProvider(new CellLabelProvider() {
			@Override
			public void update(ViewerCell cell) {
				cell.setText(((WikiPage) cell.getElement()).title);
			}
		});
//		TreeViewerColumn targetColumn = new TreeViewerColumn(wikiPageTreeViewer, SWT.LEFT);
//		targetColumn.getColumn().setText("Import into");
//		targetColumn.getColumn().setWidth(400);
//		targetColumn.setLabelProvider(new EmfsResourceTargetLabelProvider());

		wikiPageTreeViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

//		wikiPageTreeViewer.setFilters(tagsFilters);
		wikiPageTreeViewer.setContentProvider(new ITreeContentProvider() {
			@Override
			public boolean hasChildren(Object element) {
				return true;
			}

			@Override
			public Object getParent(Object element) {
				return ((WikiPage) element).parent;
			}
			
			@Override
			public Object[] getElements(Object inputElement) {
				if (inputElement instanceof Collection<?>) {
					Collection<Object> rootElements = new ArrayList<Object>();
					for (Object item : (Collection<?>) inputElement) {
						if (item instanceof WikiPage) {
							WikiPage page = (WikiPage) item;
							if (tagsFilter != null ? select(page) : page.parent == null) {
								rootElements.add(item);
							}
						}
					}
					return rootElements.toArray();
				} else if (inputElement instanceof WikiPage) {
					return ((WikiPage) inputElement).children.toArray();
				}
				return new Object[0];
			}
			
			@Override
			public Object[] getChildren(Object parentElement) {
				return ((WikiPage) parentElement).children.toArray();
			}
		});
		wikiPageTreeViewer.setInput(wikiPages);

		wikiPageTreeViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				if (event.getSelection() instanceof IStructuredSelection) {
					WikiPage page = (WikiPage) ((IStructuredSelection) event.getSelection()).getFirstElement();
					open(page);
				}
			}
		});
		refresh();
	}

	private Browser browser;
	
	public Browser getBrowser() {
		return browser;
	}

	public void setBrowser(Browser browser) {
		this.browser = browser;
	}
	
	protected void open(WikiPage page) {
		if (page.bodyView == null) {
			String baseUrl = "https://www.ntnu.no/wiki/rest/api/content/" + page.id + "?expand=body.view";
			String urlString = baseUrl;
			try {
				InputStream input = new URL(urlString).openStream();
				ObjectMapper mapper = new ObjectMapper();
				JsonNode jsonTree = mapper.readTree(input);
				page.bodyView = getString((ObjectNode) jsonTree, "body", "view", "value");
			} catch (Exception e) {
				System.err.println(e);
			}
		}
		if (getBrowser() != null) {
			String html
			= "<html>"
			+ "  <head>"
			+ "    <link rel=\"stylesheet\" type=\"text/css\" href=\"/wiki/s/aeb88fc4c114a64b79c302a9f5009952-CDN/en_GB/6223/18ee35618f0b1bc24bd772d4d8f01347b18f1fef.3/146/_/download/superbatch/css/batch.css\" media=\"all\">"
			+ "    <link rel=\"stylesheet\" type=\"text/css\" href=\"/wiki/s/d41d8cd98f00b204e9800998ecf8427e-CDN/en_GB/6223/18ee35618f0b1bc24bd772d4d8f01347b18f1fef.3/012c7f3958c4afbb3c308926f777dadd/_/download/contextbatch/css/editor,macro-browser,fullpage-editor,-atl.general,-viewcontent,-main,-page,-atl.comments/batch.css?media=%28max-width%3A+1450px%29\" media=\"(max-width: 1450px)\">"
			+ "    <link rel=\"stylesheet\" type=\"text/css\" href=\"/wiki/s/en_GB/6223/18ee35618f0b1bc24bd772d4d8f01347b18f1fef.3/3/_/styles/colors.css\" media=\"all\">"
//			+ "    <script type=\"text/javascript\" src=\"/wiki/s/b5041722346a7574e2fdeb61b0309428-CDN/en_GB/6223/18ee35618f0b1bc24bd772d4d8f01347b18f1fef.3/147/_/download/superbatch/js/batch.js?atlassian.aui.raphael.disabled=true&amp;locale=en-GB\"></script>"
//			+ "    <script type=\"text/javascript\" src=\"/wiki/s/5e66e16c5882d403b46e2fed0b01ab7d-CDN/en_GB/6223/18ee35618f0b1bc24bd772d4d8f01347b18f1fef.3/45472a90e275affc1b22ee7d30ed4eba/_/download/contextbatch/js/atl.confluence.plugins.pagetree-desktop,main,page,viewcontent,atl.general,atl.comments/batch.js?confluence.view.edit.transition=true&amp;highlightactions=true&amp;nps-acknowledged=true&amp;locale=en-GB&amp;anonymous-access-enabled=true&amp;is-server-instance=true&amp;hostenabled=true\"></script>"
			+ "  </head>"
			+ "  <body>"
			+ page.bodyView
			+ "  </body>"
			+ "</html>"
			;

			Document doc = getXmlContent(new StringReader(html));
			// this will point them to full confluence page, not stripped version
			fixUrls(doc.getElementsByTagName("a"), "href");
			fixUrls(doc.getElementsByTagName("link"), "href");
			fixUrls(doc.getElementsByTagName("script"), "src");
			fixUrls(doc.getElementsByTagName("img"), "src");
			
			String fixedHtml = serialize(doc);
			if (fixedHtml != null) {
				html = fixedHtml;
			}
			System.out.println(html);
			
			getBrowser().setText(html, true);
		}
	}
	
	protected void fixUrls(NodeList nodes, String attrName) {
		for (int i = 0; i < nodes.getLength(); i++) {
			Node node = nodes.item(i);
			fixNode(attrName, node);
		}
	}

	protected void fixNode(String attrName, Node node) {
		NamedNodeMap attributes = node.getAttributes();
		for (int j = 0; j < attributes.getLength(); j++) {
			Node attr = attributes.getNamedItem(attrName);
			if (attr instanceof Attr) {
				String value = ((Attr) attr).getValue();
				if (value.startsWith("/wiki")) {
					((Attr) attr).setValue("https://www.ntnu.no" + value);
				}
			}
		}
	}
	
	protected Document getXmlContent(Reader source) {
		try {
//			Tidy tidy = new Tidy();
//			Document document = tidy.parseDOM(source, new OutputStreamWriter(System.out));
			Parser parser = new Parser();
			Sax2DomHandler domHandler = new Sax2DomHandler();
			parser.setContentHandler(domHandler);
			parser.setProperty("http://xml.org/sax/properties/lexical-handler", domHandler);
			parser.parse(new InputSource(source));
			return domHandler.getDocument();
		} catch (Exception e) {
			System.err.println(e);
//			Activator.logError("Exception when parsing " + source, e);
		}
		return null;
	}

	protected String serialize(Document doc) {
		StringWriter sw;
		try {
			sw = new StringWriter();
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transformer.transform(new DOMSource(doc), new StreamResult(sw));
			return sw.toString();
		} catch (Exception e) {
			System.err.println(e);
		}
		return null;
	}

	private Runnable wikiPageRefresher = new Runnable() {
		
		private Map<String, WikiPage> wikiPages;

		public void run() {
			String baseUrl = "https://www.ntnu.no/wiki/rest/api/space/tdt4100/content?expand=ancestors,metadata.labels";
			wikiPages = new HashMap<String, WikiPage>();
			int start = 0, limit = 25, lastPageCount = 0;
			do {
				lastPageCount = wikiPages.size();
				try {
					String urlString = baseUrl + "&start=" + start + "&limit=" + limit;
					InputStream input = new URL(urlString).openStream();
					ObjectMapper mapper = new ObjectMapper();
					JsonNode jsonTree = mapper.readTree(input);
					start += limit;
					traverse(getNode((ObjectNode) jsonTree, "page", "results"), null);
				} catch (Exception e) {
					System.err.println(e);
					break;
				}
			} while (wikiPages.size() > lastPageCount);
			wikiPageTreeViewer.getControl().getDisplay().asyncExec(new Runnable() {
				@Override
				public void run() {
					wikiPageTreeViewer.setInput(WikiPageView.this.wikiPages = wikiPages.values());
					wikiPageTreeViewer.getControl().getParent().layout();
				}
			});
		}
		private void traverse(JsonNode node, WikiPage childPage) {
			if (node instanceof ObjectNode) {
				ObjectNode objectNode = (ObjectNode) node;
				JsonNode type = objectNode.get("type");
				if (type instanceof ValueNode && "page".equals(((ValueNode) type).asText())) {
					String id = getString(objectNode, "id");
					WikiPage page = wikiPages.get(id);
					if (page == null) {
						page = new WikiPage();
						page.id = id;
						page.title = getString(objectNode, "title");
						page.tags = getStrings(objectNode, "metadata", "labels", "results", "name");
						wikiPages.put(id, page);
					}
					if (page.parent == null) {
						JsonNode ancestors = objectNode.get("ancestors");
						if (ancestors instanceof ArrayNode) {
							JsonNode parent = null;
							for (JsonNode ancestor : ((ArrayNode) ancestors)) {
								parent = ancestor;
							}
							if (parent != null) {
								traverse(parent, page);
							}
						}
					}
					if (childPage != null) {
						page.children.add(childPage);
						childPage.parent = page;
					}
				}
			} else if (node instanceof ArrayNode) {
				for (JsonNode child : ((ArrayNode) node)) {
					traverse(child, null);
				}
			}
		}
	};
	
	protected JsonNode getNode(JsonNode objectNode, String... props) {
		for (String prop : props) {
			JsonNode value = objectNode.get(prop);
			if (value instanceof ObjectNode) {
				objectNode = (ObjectNode) value;
			} else {
				return value;
			}
		}
		return null;
	}
	
	protected String getString(ObjectNode objectNode, String... props) {
		for (String prop : props) {
			JsonNode value = objectNode.get(prop);
			if (value instanceof ObjectNode) {
				objectNode = (ObjectNode) value;
			} else if (value instanceof ValueNode) {
				return ((ValueNode) value).asText();
			}
		}
		return null;
	}
	
	protected Collection<String> getStrings(ObjectNode objectNode, String... props) {
		for (int i = 0; i < props.length; i++) {
			String prop = props[i];
			JsonNode value = objectNode.get(prop);
			if (value instanceof ObjectNode) {
				objectNode = (ObjectNode) value;
			} else if (value instanceof ArrayNode) {
				Collection<String> strings = null;
				prop = props[i + 1];
				for (JsonNode child : (ArrayNode) value) {
					if (child instanceof ObjectNode) {
						value = ((ObjectNode) child).get(prop);
						if (value instanceof ValueNode) {
							if (strings == null) {
								strings = new ArrayList<String>();
							}
							strings.add(((ValueNode) value).asText());
						}
					}
				}
				return strings;
			}
		}
		return null;
	}
	
	protected void refresh() {
		new Thread(wikiPageRefresher).start();
	}
	
	public void setFocus() {
		tagsText.setFocus();
	}
	
	//

	public static class WikiPage {
		public String id, title;
		public WikiPage parent;
		public Collection<WikiPage> children = new ArrayList<WikiPage>();
		public Collection<String> tags;
		public String bodyView;
		
		public String toString() {
			return "[Page " + id + ": " + title + (tags != null ? " #" + tags : "") + " (" + children.size() + ")" + "]";
		}
	}
}
