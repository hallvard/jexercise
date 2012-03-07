package no.hal.jex.eval;

import java.util.Map;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.JUnitTest;
import no.hal.jex.JavaElement;
import no.hal.jex.JavaRequirement;
import no.hal.jex.Member;
import no.hal.jex.Requirement;
import no.hal.jex.TestRunnable;
import no.hal.jex.impl.JexFactoryImpl;

import org.eclipse.emf.ecore.ENamedElement;

public abstract class AbstractRequirementChecker {

	public static Boolean satisfiedAnd(Boolean b1, Boolean b2) {
		if (b1 == Boolean.FALSE || b2 == Boolean.FALSE) {
			return Boolean.FALSE;
		} else if (b1 == Boolean.TRUE && b2 == Boolean.TRUE) {
			return Boolean.TRUE;
		}
		return null;
	}
	
	public static Boolean satisfiedOr(Boolean b1, Boolean b2) {
		if (b1 == Boolean.TRUE || b2 == Boolean.TRUE) {
			return Boolean.TRUE;
		} else if (b1 == Boolean.FALSE || b2 == Boolean.FALSE) {
			return Boolean.FALSE;
		}
		return null;
	}

	public Boolean validate(AbstractRequirement req, boolean recursive) {
		Boolean childrenSatisfied = Boolean.TRUE;
		if (recursive) {
			for (AbstractRequirement childReq : req.getRequirements()) {
				childrenSatisfied = AbstractRequirementChecker.satisfiedAnd(childrenSatisfied, validate(childReq, recursive));
			}
		}
		req.setChildrenSatisfied(childrenSatisfied);
		Boolean satisified = validateRequirement(req);
		if (req instanceof Requirement) {
			((Requirement) req).setSatisfied(satisified);
		}
		return AbstractRequirementChecker.satisfiedAnd(childrenSatisfied, satisified);
	}

	public static void computeRequirementPoints(AbstractRequirement req, int[] points) {
		if (req instanceof JUnitTest) {
			JUnitTest test = (JUnitTest)req;
			int reqPoints = test.getPoints();
			if (test.getSatisfied() == Boolean.TRUE) {
				points[0] += reqPoints;
			}
			points[1] += reqPoints;
		}
		for (AbstractRequirement childReq : req.getRequirements()) {
			computeRequirementPoints(childReq, points);
		}
	}

	//
	
	public static boolean hasModifiers(int modifiers1, int modifiers2) {
		return (modifiers1 | modifiers2) == modifiers1;
	}

	protected static Boolean validateModifiers(int otherModifiers, Map<String, Integer> modifiersMap, int jexModifiers) {
		int flags = JexFactoryImpl.convertModifiersToModifiers(otherModifiers, modifiersMap, null) & JexFactoryImpl.MODIFIERS_MASK;
		jexModifiers &= JexFactoryImpl.MODIFIERS_MASK;
		boolean result = hasModifiers(flags, jexModifiers) && hasModifiers(jexModifiers, flags);
		return Boolean.valueOf(result);
	}

	//

	private static Boolean requiresFeature(String features, String feature) {
		int pos = (features != null ? features.indexOf(feature) : -1);
		if (pos < 0) {
			return null;
		}
		return Boolean.valueOf(pos == 0 || features.charAt(pos - 1) != '!');
	}

	private static String defaultRequiredFeatured = "modifiers types";

	private static boolean requiresFeature(JavaRequirement req, Object feature) {
		String featureName = feature.toString();
		if (feature instanceof ENamedElement) {
			featureName = ((ENamedElement)feature).getName();
		}
		Boolean required = requiresFeature(req.getRequiredFeatures(), featureName);
		if (required == null) {
			required = requiresFeature(defaultRequiredFeatured, featureName);
		}
		return required != Boolean.FALSE;
	}

	public Boolean validateRequirement(AbstractRequirement req) {
		if (req instanceof JavaRequirement) {
			Boolean result = javaRequirementSatisfied((JavaRequirement) req, requiresFeature((JavaRequirement) req, "modifiers"), requiresFeature((JavaRequirement) req, "types"));
			if (req instanceof JUnitTest) {
				if (result != Boolean.TRUE) {
					return result;
				}
				return ((JUnitTest) req).getSatisfied();
			}
			return result;
		}
		return null;
	}

	protected Boolean javaRequirementSatisfied(JavaRequirement javaRequirement, boolean requireModifiers, boolean requireTypes) {
		JavaElement jexElement = javaRequirement.getJavaElement();
		if (jexElement instanceof TestRunnable) {
			jexElement = ((TestRunnable) jexElement).getTestedElement();
		}
		return (jexElement instanceof Member ? validateJexMember((Member) jexElement, requireModifiers, requireTypes) : Boolean.FALSE);
	}

	protected Boolean validateJexMember(Member jexMember, boolean requireModifiers, boolean requireTypes) {
		Object javaElement = getRealJavaElement(jexMember);
		if (jexMember.getRequired() != Boolean.FALSE ? javaElement == null : javaElement != null) {
			return Boolean.FALSE;
		}
		Boolean modifierResult = (requireModifiers ? correctModifiers(jexMember) : Boolean.TRUE);
		Boolean typesResult = (requireTypes ? correctTypes(jexMember) : Boolean.TRUE);
		return satisfiedAnd(modifierResult, typesResult);
	}

	protected abstract Boolean correctTypes(Member jexMember);

	protected abstract int getRealModifiers(Member jexMember);
	protected abstract Map<String, Integer> getRealModifiersMap();

	protected Boolean correctModifiers(Member jexMember) {
		int realModifiers = getRealModifiers(jexMember);
		if (realModifiers >= 0) {
			int modifiers = jexMember.getModifiers();
			if ((modifiers & JexFactoryImpl.getVisibilityModifiers()) == 0) {
				modifiers |= JexFactoryImpl.getModifier("public");
			}
			return validateModifiers(realModifiers, getRealModifiersMap(), modifiers);
		}
		return Boolean.TRUE;
	}

	protected abstract Object getRealJavaElement(JavaElement jexElement);
}
