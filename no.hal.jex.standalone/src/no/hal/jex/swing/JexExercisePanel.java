package no.hal.jex.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.runner.BaseTestRunner;
import no.hal.jex.AbstractRequirement;
import no.hal.jex.Exercise;
import no.hal.jex.JUnitTest;
import no.hal.jex.JexFactory;
import no.hal.jex.JexPackage;
import no.hal.jex.Requirement;
import no.hal.jex.impl.AbstractRequirementImpl;
import no.hal.jex.java.ReflectionHelper;
import no.hal.jex.java.ReflectiveRequirementChecker;
import no.hal.jex.java.ReflectiveTestAnnotationsToModelConverter;
import no.hal.jex.resource.JexResource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

@SuppressWarnings("serial")
public class JexExercisePanel extends JPanel implements TreeModelListener, ReflectiveRequirementChecker.BaseTestRunnerProvider {

	private Options options;

	private JTextField testClassText;
	private JTree jexTree;
	private JTextPane jexSelectionText;

	static class Options {
		String testClassName;
		boolean autoOpen, autoValidate;
		URL[] classPath;
	}

	@SuppressWarnings("unused")
	public JexExercisePanel(Options options) {
		this.options = options;
		setLayout(new BorderLayout());
		JPanel filePanel = new JPanel();
		testClassText = new JTextField(options.testClassName);
		testClassText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openJex(testClassText.getText());
			}
		});
		filePanel.add(new JLabel("Test suite/class: "));
		filePanel.add(testClassText);
		JButton fileChooserButton = null; // new JButton("File...");
		if (fileChooserButton != null) {
			fileChooserButton.addActionListener(new ActionListener() {
				private JFileChooser fileChooser;
				public void actionPerformed(ActionEvent event) {
					if (fileChooser == null) {
						fileChooser = new JFileChooser();
					}
					if (fileChooser.showOpenDialog(JexExercisePanel.this) == JFileChooser.APPROVE_OPTION) {
						File file = fileChooser.getSelectedFile();
						testClassText.setText(file.toString());
						openJex(file.getAbsolutePath());
					}
				}
			});
			filePanel.add(fileChooserButton);
		}
		add(filePanel, BorderLayout.NORTH);
		jexTree = new JTree();
		jexTree.setPreferredSize(new Dimension(300, 500));
		jexTree.setCellRenderer(new JexTreeCellRenderer());
		jexTree.setRootVisible(false);

		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		splitPane.setDividerLocation(0.3);
		splitPane.add(new JScrollPane(jexTree), JSplitPane.LEFT);
		jexSelectionText = new JTextPane();
		jexSelectionText.setContentType("text/html");
		jexSelectionText.setEditable(false);
		splitPane.add(jexSelectionText, JSplitPane.RIGHT);
		add(splitPane, BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel();
		final JButton validateButton = new JButton("Validate");
		validateButton.setEnabled(false);
		validateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				TreePath selectionPath = jexTree.getSelectionPath();
				Object selection = selectionPath .getLastPathComponent();
				if (selection instanceof AbstractRequirement) {
					validate((AbstractRequirement) selection);
				}
			}
		});
		buttonPanel.add(validateButton);
		final JButton validateAllButton = new JButton("Validate all");
		validateAllButton.setEnabled(false);
		validateAllButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				Object root = jexTree.getModel().getRoot();
				if (root instanceof AbstractRequirement) {
					validate((AbstractRequirement) root);
				}
			}
		});
		buttonPanel.add(validateAllButton);
		add(buttonPanel, BorderLayout.SOUTH);
		jexTree.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent selectionEvent) {
				Object selection = selectionEvent.getPath().getLastPathComponent();
				validateButton.setEnabled(selection instanceof AbstractRequirement);
				validateAllButton.setEnabled(jexTree.getModel().getRoot() instanceof AbstractRequirement);
				updateRequirementText(selection);
			}

		});

		requirementChecker = new ReflectiveRequirementChecker();
		requirementChecker.setBaseTestRunnerProvider(this);

		if (this.options.autoOpen) {
			testClassText.postActionEvent();
		}
		if (this.options.autoValidate) {
			validateAllButton.doClick();
		}
	}

	private void updateRequirementText(Object selection) {
		jexSelectionText.setText(selection instanceof AbstractRequirement ? getRequirementText((AbstractRequirement) selection) : "");
	}

	protected String getRequirementText(AbstractRequirement req) {
		StringBuilder builder = new StringBuilder();
		AbstractRequirement descriptionReq = AbstractRequirementImpl.findNearestPreviousRequirementWithDescription(req);
		if (descriptionReq != null) {
			appendText(builder, descriptionReq.getDescription(), null);
		}
		appendText(builder, req.getComment(), "<p>%s");
		StringBuilder message = new StringBuilder();
		if (req instanceof Requirement) {
			for (String s : ((Requirement) req).getMessages()) {
				appendText(message, escapeHtml(s), null);
			}
		}
		appendText(builder, message, "<p><b>Errors/failures</b>:<br/>%s");
		return builder.toString();
	}

	private static String escapeHtml(String s) {
		return s.
			replace("&", "&amp;")
			.replace("<", "&lt;")
			.replace(">", "&gt;")
			;
	}

	private void appendText(StringBuilder builder, CharSequence text, String format) {
		if (text != null && text.length() > 0) {
			builder.append(format != null ? String.format(format, text) : text);
		}
	}

	private ReflectiveRequirementChecker requirementChecker;

	private ClassLoader reflectionClassLoader;

	private void setReflectionClassLoader(ReflectionHelper reflectionHelper) {
		if (reflectionClassLoader == null && options.classPath != null) {
			reflectionClassLoader = new URLClassLoader(options.classPath) {
				public String toString() {
					return "URLClassLoader" + Arrays.asList(this.getURLs()) + super.toString();
				}
				@Override
				public Class<?> loadClass(String name) throws ClassNotFoundException {
					Class<?> clazz = super.loadClass(name);
//					System.out.println(name + "->" + clazz + " by " + this + " (" + clazz.getClassLoader() + ")");
					return clazz;
				}
			};
		}
		if (reflectionClassLoader != null) {
			reflectionHelper.setClassLoader(reflectionClassLoader);
		}
	}
	private void clearRequirementCheckerClassLoader() {
		this.reflectionClassLoader = null;
	}
	
	protected void validate(AbstractRequirement req) {
		setReflectionClassLoader(requirementChecker.getReflectionHelper());
		requirementChecker.validate(req, true);
		clearRequirementCheckerClassLoader();
	}

	protected void openJex(String name) {
		if (name.endsWith(JexResource.JEX_EXTENSION)) {
			openJexFile(name);
		} else {
			setReflectionClassLoader(requirementChecker.getReflectionHelper());
			Test suite = requirementChecker.createTest(name, null);
			if (suite instanceof TestSuite) {
				ReflectiveTestAnnotationsToModelConverter converter = new ReflectiveTestAnnotationsToModelConverter(JexFactory.eINSTANCE.createExercise(), (TestSuite) suite);
				setReflectionClassLoader(converter.getReflectionHelper());
				Exercise ex = converter.convert();
				openExercise(ex);
			} else {
				throw new IllegalArgumentException("Couldn't find class " + name + ", are you sure the classpath is correctly set?");
			}
		}
	}

	protected void openJexFile(String name) {
		ResourceSet resourceSet = new ResourceSetImpl();
		JexResource resource = (JexResource) resourceSet.getResource(URI.createFileURI(name), true);
		openExercise(resource.getExercise());
	}

	protected void openExercise(Exercise ex) {
		JexTreeModel treeModel = new JexTreeModel(ex);
		jexTree.setModel(treeModel);
		treeModel.addTreeModelListener(this);
		TreePath exPath = new TreePath(ex);
		expandAbstractRequirement(ex, -1, new ArrayList<AbstractRequirement>());
		jexTree.setSelectionPath(exPath);
		jexTree.requestFocusInWindow();
	}

	private void expandAbstractRequirement(AbstractRequirement req, int depth, Collection<AbstractRequirement> parents) {
		parents.add(req);
		if (depth == 0 || req.getRequirements().size() == 0) {
			jexTree.expandPath(new TreePath(parents.toArray()));
		} else {
			for (AbstractRequirement childReq : req.getRequirements()) {
				expandAbstractRequirement(childReq, depth - 1, parents);
			}
		}
		parents.remove(req);
	}

	private static void initEMF() {
		EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(JexPackage.eNS_URI, JexPackage.eINSTANCE);

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("jex", new JexResource.Factory());
	}

	public void treeNodesChanged(TreeModelEvent e) {
		Object selection = jexTree.getSelectionPath().getLastPathComponent();
		if (e.getTreePath().getLastPathComponent() == selection) {
			updateRequirementText(selection);
		}
	}

	public void treeNodesInserted(TreeModelEvent e) {
	}

	public void treeNodesRemoved(TreeModelEvent e) {
	}

	public void treeStructureChanged(TreeModelEvent e) {
	}

	//

	public BaseTestRunner createBaseTestRunner(final JUnitTest junitTest) {
		return requirementChecker.new BaseTestRunnerStub() {
			@Override
			public void testFailed(int status, Test test, Throwable t) {
				String message = t.getMessage();
				if (message != null) {
					junitTest.getMessages().add(message);
				}
			}
		};
	}

	//

	public static void main(String[] args) {
		initEMF();

		JFrame frame = new JFrame("JExercise");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Options options = new Options();
		if (args.length >= 1 && args[0] != null) {
			options.testClassName = args[0];
			options.autoOpen = true;
		}
		if (args.length >= 2 && args[1] != null) {
			try {
				String classPathString = args[1];
				URL classPathURL = (classPathString.indexOf(':') < 4 ? new File(classPathString).toURI().toURL() : new URL(classPathString));
				options.classPath = new URL[]{classPathURL};
			} catch (MalformedURLException e) {
				System.err.println(e);
			}
		}
		JexExercisePanel panel = new JexExercisePanel(options);
		frame.setContentPane(panel);
		frame.setPreferredSize(new Dimension(700, 800));
		frame.pack();
		frame.setVisible(true);
	}
}
