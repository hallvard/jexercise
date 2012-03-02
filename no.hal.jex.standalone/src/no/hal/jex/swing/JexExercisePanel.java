package no.hal.jex.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;

import junit.framework.Test;
import junit.framework.TestSuite;
import no.hal.jex.AbstractRequirement;
import no.hal.jex.Exercise;
import no.hal.jex.JexFactory;
import no.hal.jex.JexPackage;
import no.hal.jex.impl.AbstractRequirementImpl;
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
public class JexExercisePanel extends JPanel {
	
	private JTextField fileTextField;
	private JFileChooser fileChooser;
	private JTree jexTree;
	private JTextPane jexText;

	public JexExercisePanel(String fileText, boolean autoOpen) {
		setLayout(new BorderLayout());
		JPanel filePanel = new JPanel();
		fileTextField = new JTextField(fileText);
		fileTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openJex(fileTextField.getText());
			}
		});
		filePanel.add(fileTextField);
		JButton fileChooserButton = new JButton("File...");
		fileChooserButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (fileChooser == null) {
					fileChooser = new JFileChooser();
				}
				if (fileChooser.showOpenDialog(JexExercisePanel.this) == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					fileTextField.setText(file.toString());
					openJex(file.getAbsolutePath());
				}
			}
		});
		filePanel.add(fileChooserButton);
		add(filePanel, BorderLayout.NORTH);
		jexTree = new JTree();
		jexTree.setPreferredSize(new Dimension(300, 500));
		jexTree.setCellRenderer(new JexTreeCellRenderer());
		jexTree.setRootVisible(true);
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		splitPane.setDividerLocation(0.3);
		splitPane.add(new JScrollPane(jexTree), JSplitPane.LEFT);
		jexText = new JTextPane();
		jexText.setContentType("text/html");
		jexText.setEditable(false);
		splitPane.add(jexText, JSplitPane.RIGHT);
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
				jexText.setText(selection instanceof AbstractRequirement ? getRequirementText((AbstractRequirement) selection) : "");
			}
		});
		if (autoOpen) {
			fileTextField.postActionEvent();
		}
	}

	protected String getRequirementText(AbstractRequirement req) {
		AbstractRequirement descriptionReq = AbstractRequirementImpl.findNearestPreviousRequirementWithDescription(req);
		if (descriptionReq != null) {
			String description = descriptionReq.getDescription();
			if (description != null) {
				return description;
			}
		}
		return "";
	}

	private ReflectiveRequirementChecker requirementChecker = new ReflectiveRequirementChecker();
	
	protected void validate(AbstractRequirement req) {
		requirementChecker.validate(req, true);
	}

	protected void validate(TreePath selectionPath) {
	}

	protected void openJex(String name) {
		Test suite = requirementChecker.createTest(name, null);
		if (suite instanceof TestSuite) {
			ReflectiveTestAnnotationsToModelConverter converter = new ReflectiveTestAnnotationsToModelConverter(JexFactory.eINSTANCE.createExercise(), (TestSuite) suite);
			Exercise ex = converter.convert();
			openExercise(ex);
		} else {
			openJexFile(name);
		}
	}
	
	protected void openJexFile(String name) {
		ResourceSet resourceSet = new ResourceSetImpl();
		JexResource resource = (JexResource) resourceSet.getResource(URI.createFileURI(name), true);
		openExercise(resource.getExercise());
	}
	
	protected void openExercise(Exercise ex) {
		jexTree.setModel(new JexTreeModel(ex));
		TreePath exPath = new TreePath(ex);
		jexTree.expandPath(exPath);
		jexTree.setSelectionPath(exPath);
		jexTree.requestFocusInWindow();
	}
	
	private static void initEMF() {
		EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(JexPackage.eNS_URI, JexPackage.eINSTANCE);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("jex", new JexResource.Factory());
	}
	
	private static String defaultTest = "counter.CounterTest";

	public static void main(String[] args) {
		initEMF();
		
		JFrame frame = new JFrame("JExercise");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JexExercisePanel panel = new JexExercisePanel(args.length > 0 ? args[0] : defaultTest, true);
		frame.setContentPane(panel);
		frame.setPreferredSize(new Dimension(700, 800));
		frame.pack();
		frame.setVisible(true);
	}
}
