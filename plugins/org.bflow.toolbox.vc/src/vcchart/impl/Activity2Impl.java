/**
 */
package vcchart.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vcchart.Activity2;
import vcchart.VcchartPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Activity2Impl extends NamedElementImpl implements Activity2 {
	
	protected static final String SUBDIAGRAM_EDEFAULT = null;
	protected String subdiagram = SUBDIAGRAM_EDEFAULT;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Activity2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VcchartPackage.Literals.ACTIVITY2;
	}
	
	/**
	 * @generated NOT
	 */
	public String getSubdiagram() {
		return subdiagram;
	}
	
	/**
	 * @generated NOT
	 */
	public void setSubdiagram(String newSubdiagram) {
		String oldSubdiagram = subdiagram;
		subdiagram = newSubdiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VcchartPackage.ACTIVITY2__SUBDIAGRAM, oldSubdiagram, subdiagram));
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Subdiagram: ");
		result.append(subdiagram);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VcchartPackage.ACTIVITY2__SUBDIAGRAM:
				return getSubdiagram();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VcchartPackage.ACTIVITY2__SUBDIAGRAM:
				setSubdiagram((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VcchartPackage.ACTIVITY2__SUBDIAGRAM:
				setSubdiagram(SUBDIAGRAM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VcchartPackage.ACTIVITY2__SUBDIAGRAM:
				return SUBDIAGRAM_EDEFAULT == null ? subdiagram != null : !SUBDIAGRAM_EDEFAULT.equals(subdiagram);
		}
		return super.eIsSet(featureID);
	}

} //Activity2Impl
