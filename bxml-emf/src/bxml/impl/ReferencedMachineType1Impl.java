/**
 */
package bxml.impl;

import bxml.AttributesType;
import bxml.BxmlPackage;
import bxml.ReferencedMachineType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referenced Machine Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.ReferencedMachineType1Impl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.ReferencedMachineType1Impl#getName <em>Name</em>}</li>
 *   <li>{@link bxml.impl.ReferencedMachineType1Impl#getRename <em>Rename</em>}</li>
 *   <li>{@link bxml.impl.ReferencedMachineType1Impl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferencedMachineType1Impl extends MinimalEObjectImpl.Container implements ReferencedMachineType1 {
  /**
   * The cached value of the '{@link #getAttr() <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr()
   * @generated
   * @ordered
   */
  protected AttributesType attr;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getRename() <em>Rename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRename()
   * @generated
   * @ordered
   */
  protected static final String RENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRename() <em>Rename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRename()
   * @generated
   * @ordered
   */
  protected String rename = RENAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferencedMachineType1Impl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getReferencedMachineType1();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributesType getAttr() {
    return attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttr(AttributesType newAttr, NotificationChain msgs) {
    AttributesType oldAttr = attr;
    attr = newAttr;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.REFERENCED_MACHINE_TYPE1__ATTR, oldAttr, newAttr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttr(AttributesType newAttr) {
    if (newAttr != attr) {
      NotificationChain msgs = null;
      if (attr != null)
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.REFERENCED_MACHINE_TYPE1__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.REFERENCED_MACHINE_TYPE1__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.REFERENCED_MACHINE_TYPE1__ATTR, newAttr, newAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.REFERENCED_MACHINE_TYPE1__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRename() {
    return rename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRename(String newRename) {
    String oldRename = rename;
    rename = newRename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.REFERENCED_MACHINE_TYPE1__RENAME, oldRename, rename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPath() {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(String newPath) {
    String oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.REFERENCED_MACHINE_TYPE1__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.REFERENCED_MACHINE_TYPE1__ATTR:
        return basicSetAttr(null, msgs);
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
      case BxmlPackage.REFERENCED_MACHINE_TYPE1__ATTR:
        return getAttr();
      case BxmlPackage.REFERENCED_MACHINE_TYPE1__NAME:
        return getName();
      case BxmlPackage.REFERENCED_MACHINE_TYPE1__RENAME:
        return getRename();
      case BxmlPackage.REFERENCED_MACHINE_TYPE1__PATH:
        return getPath();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case BxmlPackage.REFERENCED_MACHINE_TYPE1__ATTR:
        setAttr((AttributesType)newValue);
        return;
      case BxmlPackage.REFERENCED_MACHINE_TYPE1__NAME:
        setName((String)newValue);
        return;
      case BxmlPackage.REFERENCED_MACHINE_TYPE1__RENAME:
        setRename((String)newValue);
        return;
      case BxmlPackage.REFERENCED_MACHINE_TYPE1__PATH:
        setPath((String)newValue);
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
      case BxmlPackage.REFERENCED_MACHINE_TYPE1__ATTR:
        setAttr((AttributesType)null);
        return;
      case BxmlPackage.REFERENCED_MACHINE_TYPE1__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BxmlPackage.REFERENCED_MACHINE_TYPE1__RENAME:
        setRename(RENAME_EDEFAULT);
        return;
      case BxmlPackage.REFERENCED_MACHINE_TYPE1__PATH:
        setPath(PATH_EDEFAULT);
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
      case BxmlPackage.REFERENCED_MACHINE_TYPE1__ATTR:
        return attr != null;
      case BxmlPackage.REFERENCED_MACHINE_TYPE1__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BxmlPackage.REFERENCED_MACHINE_TYPE1__RENAME:
        return RENAME_EDEFAULT == null ? rename != null : !RENAME_EDEFAULT.equals(rename);
      case BxmlPackage.REFERENCED_MACHINE_TYPE1__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", rename: ");
    result.append(rename);
    result.append(", path: ");
    result.append(path);
    result.append(')');
    return result.toString();
  }

} //ReferencedMachineType1Impl
