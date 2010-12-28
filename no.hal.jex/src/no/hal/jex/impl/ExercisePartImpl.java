/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.impl;


import no.hal.jex.AbstractRequirement;
import no.hal.jex.JexPackage;
import no.hal.jex.ExercisePart;

import no.hal.jex.JexPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exercise Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExercisePartImpl extends AbstractRequirementImpl implements ExercisePart {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExercisePartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JexPackage.Literals.EXERCISE_PART;
	}

	public static String getPartNumber(ExercisePart part) {
		AbstractRequirement parent = part.getParent();
		String partNumber = Integer.toString(parent.getRequirements().indexOf(part) + 1);
		if (parent instanceof ExercisePart) {
			partNumber = getPartNumber((ExercisePart)parent) + "." + partNumber;
		}
		return partNumber;
	}

	protected String getDefaultURIFragment() {
		return "#part" + getPartNumber(this);
	}
	
} //ExercisePartImpl
