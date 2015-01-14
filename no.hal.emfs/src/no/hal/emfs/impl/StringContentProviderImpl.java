/**
 */
package no.hal.emfs.impl;

import java.util.Arrays;
import java.util.Collection;

import no.hal.emfs.AbstractStringContents;
import no.hal.emfs.EmfsFactory;
import no.hal.emfs.EmfsPackage;
import no.hal.emfs.StringContentProvider;
import no.hal.emfs.VerbatimStringContents;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Content Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.emfs.impl.StringContentProviderImpl#getStringContents <em>String Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringContentProviderImpl extends AbstractStringContentProviderImpl implements StringContentProvider {
	/**
	 * The cached value of the '{@link #getStringContents() <em>String Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringContents()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractStringContents> stringContents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringContentProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfsPackage.Literals.STRING_CONTENT_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractStringContents> getStringContents() {
		if (stringContents == null) {
			stringContents = new EObjectContainmentEList<AbstractStringContents>(AbstractStringContents.class, this, EmfsPackage.STRING_CONTENT_PROVIDER__STRING_CONTENTS);
		}
		return stringContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfsPackage.STRING_CONTENT_PROVIDER__STRING_CONTENTS:
				return ((InternalEList<?>)getStringContents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfsPackage.STRING_CONTENT_PROVIDER__STRING_CONTENTS:
				return getStringContents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmfsPackage.STRING_CONTENT_PROVIDER__STRING_CONTENTS:
				getStringContents().clear();
				getStringContents().addAll((Collection<? extends AbstractStringContents>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EmfsPackage.STRING_CONTENT_PROVIDER__STRING_CONTENTS:
				getStringContents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EmfsPackage.STRING_CONTENT_PROVIDER__STRING_CONTENTS:
				return stringContents != null && !stringContents.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	//

	@Override
	public String getStringContent() {
		StringBuilder buffer = new StringBuilder();
		for (AbstractStringContents stringContent : getStringContents()) {
			String s = stringContent.getStringContent();
			if (s != null) {
				buffer.append(s);
			}
		}
		return buffer.toString();
	}
	
	@Override
	public void setStringContent(String contents) {
		VerbatimStringContents verbatimStringContents = EmfsFactory.eINSTANCE.createVerbatimStringContents();
		verbatimStringContents.setStringContent(contents);
		ECollections.setEList(getStringContents(), Arrays.asList(verbatimStringContents));
	}

} //StringContentProviderImpl
