package no.hal.jex.editor.commands;

import java.util.List;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.JexPackage;
import no.hal.jex.JUnitTest;
import no.hal.jex.JavaRequirement;
import no.hal.jex.Requirement;
import no.hal.jex.JavaClass;
import no.hal.jex.JavaElement;
import no.hal.jex.JavaPack;
import no.hal.jex.Member;
import no.hal.jex.TestRunnable;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.jdt.core.JavaModelException;

public class CreateRequirementsFromJavaModelCommand extends AbstractCommand
	implements CommandActionDelegate {

	private List javaElements;
	private AbstractRequirement reqParent;
	private boolean recursive;
	
	public CreateRequirementsFromJavaModelCommand(List javaElements, AbstractRequirement reqParent, boolean recursive) {
		this.javaElements = javaElements;
		this.reqParent = reqParent;
		this.recursive = recursive;
	}
	
	public void execute() {
		try {
			createRequirementsFromJavaModel(javaElements, reqParent, recursive ? -1 : 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void createRequirementsFromJavaModel(List javaElements, AbstractRequirement reqParent, int depth) throws Exception {
		for (int i = 0; i < javaElements.size(); i++) {
			JavaElement element = (JavaElement)javaElements.get(i);
			createRequirementsFromJavaModel(element, reqParent, depth);
		}
	}

	private void createRequirementsFromJavaModel(JavaElement javaElement, AbstractRequirement reqParent, int depth) throws Exception {
		if (javaElement instanceof JavaPack) {
			if (depth != 0) {
				createRequirementsFromJavaModel(((JavaPack)javaElement).getClasses(), reqParent, depth - 1);
			}
		} else if (javaElement instanceof Member) {
			Member member = (Member)javaElement;
			EClass reqClass = JexPackage.eINSTANCE.getJavaRequirement();
			if (member instanceof TestRunnable) {
				reqClass = JexPackage.eINSTANCE.getJUnitTest();
			}
			JavaRequirement req = (JavaRequirement)ensureRequirement(reqClass, member, reqParent.getRequirements());
			// must add to parent before searching hierarchy
			reqParent.getRequirements().add(req);
			if (req instanceof JUnitTest) {
				JUnitTest testReq = (JUnitTest)req;
				if (member instanceof TestRunnable) {
					Member testElement = ((TestRunnable)member).getTestedElement();
					testReq.setText(testElement != null ? "Test " + testElement.toString() : "Test with " + javaElement.toString());
				}
			}
			if (javaElement instanceof JavaClass && depth != 0) {
				createRequirementsFromJavaModel(((JavaClass)javaElement).getMembers(), req, depth - 1);
			}
		}
	}

	/*
	private String getJUnitTestJavaElementName(Member member) {
		String name = member.getSimpleName();
		if (member instanceof JavaMethod) {
			String testMethodNamePrefix = "test";
			if (name.startsWith(testMethodNamePrefix)) {
				String methodName = name.substring(testMethodNamePrefix.length());
				if (Character.isUpperCase(methodName.charAt(0))) {
					methodName = Character.toLowerCase(methodName.charAt(0)) + methodName.substring(1);
				}
				return getJUnitTestJavaElementName(member.getParent()) + "." + methodName;
			}
		} else if (member instanceof JavaClass) {
			String testClassNameSuffix = "Test";
			if (name.endsWith(testClassNameSuffix)) {
				name = member.getFullName();
				return name.substring(0, name.length() - testClassNameSuffix.length());
			}
		}
		return null;
	}
	
	private Member findJUnitTestElement(JUnitTest testReq) {
		Member member = (Member)testReq.getJavaElement();
		String javaElementName = getJUnitTestJavaElementName(member);
		if (javaElementName == null) {
			return null;
		}
		EObject container = testReq, eo = null;
		while (container != null) {
			eo = container;
			container = container.eContainer();
		}
		return (Member)JexResource.findElement(eo, Member.class, null, javaElementName);
	}

	private boolean isJUnitTestClass(Member member) {
		return (member instanceof JavaClass && member.getName().endsWith("Test"));
	}
	private boolean isJUnitTestMethod(Member member) {
		return (member instanceof JavaMethod && isJUnitTestClass(member.getParent()) && member.getSimpleName().startsWith("test"));
	}
	*/

	private Requirement ensureRequirement(EClass eClass, Member javaElement, List otherReqs) throws JavaModelException {
		JavaRequirement newReq = (JavaRequirement)JexPackage.eINSTANCE.getEFactoryInstance().create(eClass);
		newReq.setJavaElement(javaElement);
		newReq.setText(javaElement.toString());
//		if (newReq instanceof JUnitTest && javaElement instanceof TestRunnable) {
//			((JUnitTest)newReq).setTestRunnable((TestRunnable)javaElement);
//		}
		if (otherReqs != null) {
			for (int i = 0; i < otherReqs.size(); i++) {
				JavaRequirement otherReq = (JavaRequirement)otherReqs.get(i);
				Member otherJavaElement = (Member)otherReq.getJavaElement();
				if (otherJavaElement == javaElement) {
					return otherReq;
				}
			}
			otherReqs.add(newReq);
		}
		return newReq;
	}

	public void redo() {
	}

	@Override
	protected boolean prepare() {
		return true;
	}

	@Override
	public String getDescription() {
		return "Create requirements, based on Java model" + (recursive ? ", recursively" : "");
	}

	public Object getImage() {
		return null;
	}

	public String getText() {
		return getDescription();
	}

	public String getToolTipText() {
		return getDescription();
	}
}
