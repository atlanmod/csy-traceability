/**
 */
package bxml.impl;

import bxml.AttrType;
import bxml.BxmlPackage;
import bxml.RecordItemType;
import bxml.StructType;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.StructTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.StructTypeImpl#getRecordItem <em>Record Item</em>}</li>
 *   <li>{@link bxml.impl.StructTypeImpl#getTypref <em>Typref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructTypeImpl extends MinimalEObjectImpl.Container implements StructType {
  /**
   * The cached value of the '{@link #getAttr() <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr()
   * @generated
   * @ordered
   */
  protected AttrType attr;

  /**
   * The cached value of the '{@link #getRecordItem() <em>Record Item</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordItem()
   * @generated
   * @ordered
   */
  protected EList<RecordItemType> recordItem;

  /**
   * The default value of the '{@link #getTypref() <em>Typref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypref()
   * @generated
   * @ordered
   */
  protected static final BigInteger TYPREF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypref() <em>Typref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypref()
   * @generated
   * @ordered
   */
  protected BigInteger typref = TYPREF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getStructType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttrType getAttr() {
    return attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttr(AttrType newAttr, NotificationChain msgs) {
    AttrType oldAttr = attr;
    attr = newAttr;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.STRUCT_TYPE__ATTR, oldAttr, newAttr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttr(AttrType newAttr) {
    if (newAttr != attr) {
      NotificationChain msgs = null;
      if (attr != null)
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.STRUCT_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.STRUCT_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.STRUCT_TYPE__ATTR, newAttr, newAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RecordItemType> getRecordItem() {
    if (recordItem == null) {
      recordItem = new EObjectContainmentEList<RecordItemType>(RecordItemType.class, this, BxmlPackage.STRUCT_TYPE__RECORD_ITEM);
    }
    return recordItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getTypref() {
    return typref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypref(BigInteger newTypref) {
    BigInteger oldTypref = typref;
    typref = newTypref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.STRUCT_TYPE__TYPREF, oldTypref, typref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.STRUCT_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.STRUCT_TYPE__RECORD_ITEM:
        return ((InternalEList<?>)getRecordItem()).basicRemove(otherEnd, msgs);
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
      case BxmlPackage.STRUCT_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.STRUCT_TYPE__RECORD_ITEM:
        return getRecordItem();
      case BxmlPackage.STRUCT_TYPE__TYPREF:
        return getTypref();
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
      case BxmlPackage.STRUCT_TYPE__ATTR:
        setAttr((AttrType)newValue);
        return;
      case BxmlPackage.STRUCT_TYPE__RECORD_ITEM:
        getRecordItem().clear();
        getRecordItem().addAll((Collection<? extends RecordItemType>)newValue);
        return;
      case BxmlPackage.STRUCT_TYPE__TYPREF:
        setTypref((BigInteger)newValue);
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
      case BxmlPackage.STRUCT_TYPE__ATTR:
        setAttr((AttrType)null);
        return;
      case BxmlPackage.STRUCT_TYPE__RECORD_ITEM:
        getRecordItem().clear();
        return;
      case BxmlPackage.STRUCT_TYPE__TYPREF:
        setTypref(TYPREF_EDEFAULT);
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
      case BxmlPackage.STRUCT_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.STRUCT_TYPE__RECORD_ITEM:
        return recordItem != null && !recordItem.isEmpty();
      case BxmlPackage.STRUCT_TYPE__TYPREF:
        return TYPREF_EDEFAULT == null ? typref != null : !TYPREF_EDEFAULT.equals(typref);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (typref: ");
    result.append(typref);
    result.append(')');
    return result.toString();
  }

} //StructTypeImpl
