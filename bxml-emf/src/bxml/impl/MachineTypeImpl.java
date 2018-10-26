/**
 */
package bxml.impl;

import bxml.AbstractConstantsType;
import bxml.AbstractVariablesType;
import bxml.AbstractionType;
import bxml.AssertionsType;
import bxml.AttrType;
import bxml.BxmlPackage;
import bxml.ConcreteConstantsType;
import bxml.ConcreteVariablesType;
import bxml.ConstraintsType;
import bxml.ExtendsType;
import bxml.ImportsType;
import bxml.IncludesType;
import bxml.InitialisationType;
import bxml.InvariantType;
import bxml.LocalOperationsType;
import bxml.MachineType;
import bxml.OperationsType;
import bxml.ParametersType;
import bxml.PromotesType;
import bxml.PropertiesType;
import bxml.SeesType;
import bxml.SetsType;
import bxml.TypeInfosType;
import bxml.TypeType1;
import bxml.UsesType;
import bxml.ValuesType;
import bxml.VariantType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bxml.impl.MachineTypeImpl#getAttr <em>Attr</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getSees <em>Sees</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getPromotes <em>Promotes</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getValues <em>Values</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getSets <em>Sets</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getAbstractConstants <em>Abstract Constants</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getConcreteConstants <em>Concrete Constants</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getAbstractVariables <em>Abstract Variables</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getConcreteVariables <em>Concrete Variables</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getInitialisation <em>Initialisation</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getLocalOperations <em>Local Operations</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getTypeInfos <em>Type Infos</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link bxml.impl.MachineTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachineTypeImpl extends MinimalEObjectImpl.Container implements MachineType {
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
   * The cached value of the '{@link #getAbstraction() <em>Abstraction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstraction()
   * @generated
   * @ordered
   */
  protected AbstractionType abstraction;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected ParametersType parameters;

  /**
   * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected ConstraintsType constraints;

  /**
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected IncludesType includes;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected ImportsType imports;

  /**
   * The cached value of the '{@link #getSees() <em>Sees</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSees()
   * @generated
   * @ordered
   */
  protected SeesType sees;

  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected ExtendsType extends_;

  /**
   * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUses()
   * @generated
   * @ordered
   */
  protected UsesType uses;

  /**
   * The cached value of the '{@link #getPromotes() <em>Promotes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPromotes()
   * @generated
   * @ordered
   */
  protected PromotesType promotes;

  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected ValuesType values;

  /**
   * The cached value of the '{@link #getSets() <em>Sets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSets()
   * @generated
   * @ordered
   */
  protected SetsType sets;

  /**
   * The cached value of the '{@link #getAbstractConstants() <em>Abstract Constants</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstractConstants()
   * @generated
   * @ordered
   */
  protected AbstractConstantsType abstractConstants;

  /**
   * The cached value of the '{@link #getConcreteConstants() <em>Concrete Constants</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcreteConstants()
   * @generated
   * @ordered
   */
  protected ConcreteConstantsType concreteConstants;

  /**
   * The cached value of the '{@link #getAbstractVariables() <em>Abstract Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstractVariables()
   * @generated
   * @ordered
   */
  protected AbstractVariablesType abstractVariables;

  /**
   * The cached value of the '{@link #getConcreteVariables() <em>Concrete Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcreteVariables()
   * @generated
   * @ordered
   */
  protected ConcreteVariablesType concreteVariables;

  /**
   * The cached value of the '{@link #getVariant() <em>Variant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariant()
   * @generated
   * @ordered
   */
  protected VariantType variant;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected PropertiesType properties;

  /**
   * The cached value of the '{@link #getInvariant() <em>Invariant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvariant()
   * @generated
   * @ordered
   */
  protected InvariantType invariant;

  /**
   * The cached value of the '{@link #getInitialisation() <em>Initialisation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialisation()
   * @generated
   * @ordered
   */
  protected InitialisationType initialisation;

  /**
   * The cached value of the '{@link #getAssertions() <em>Assertions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssertions()
   * @generated
   * @ordered
   */
  protected AssertionsType assertions;

  /**
   * The cached value of the '{@link #getLocalOperations() <em>Local Operations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalOperations()
   * @generated
   * @ordered
   */
  protected LocalOperationsType localOperations;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected OperationsType operations;

  /**
   * The cached value of the '{@link #getTypeInfos() <em>Type Infos</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeInfos()
   * @generated
   * @ordered
   */
  protected TypeInfosType typeInfos;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final Object NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Object name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final TypeType1 TYPE_EDEFAULT = TypeType1.ABSTRACTION;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TypeType1 type = TYPE_EDEFAULT;

  /**
   * This is true if the Type attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean typeESet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MachineTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return BxmlPackage.eINSTANCE.getMachineType();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__ATTR, oldAttr, newAttr);
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
        msgs = ((InternalEObject)attr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__ATTR, null, msgs);
      if (newAttr != null)
        msgs = ((InternalEObject)newAttr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__ATTR, null, msgs);
      msgs = basicSetAttr(newAttr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__ATTR, newAttr, newAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractionType getAbstraction() {
    return abstraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbstraction(AbstractionType newAbstraction, NotificationChain msgs) {
    AbstractionType oldAbstraction = abstraction;
    abstraction = newAbstraction;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__ABSTRACTION, oldAbstraction, newAbstraction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstraction(AbstractionType newAbstraction) {
    if (newAbstraction != abstraction) {
      NotificationChain msgs = null;
      if (abstraction != null)
        msgs = ((InternalEObject)abstraction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__ABSTRACTION, null, msgs);
      if (newAbstraction != null)
        msgs = ((InternalEObject)newAbstraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__ABSTRACTION, null, msgs);
      msgs = basicSetAbstraction(newAbstraction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__ABSTRACTION, newAbstraction, newAbstraction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParametersType getParameters() {
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameters(ParametersType newParameters, NotificationChain msgs) {
    ParametersType oldParameters = parameters;
    parameters = newParameters;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__PARAMETERS, oldParameters, newParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameters(ParametersType newParameters) {
    if (newParameters != parameters) {
      NotificationChain msgs = null;
      if (parameters != null)
        msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__PARAMETERS, null, msgs);
      if (newParameters != null)
        msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__PARAMETERS, null, msgs);
      msgs = basicSetParameters(newParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__PARAMETERS, newParameters, newParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintsType getConstraints() {
    return constraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraints(ConstraintsType newConstraints, NotificationChain msgs) {
    ConstraintsType oldConstraints = constraints;
    constraints = newConstraints;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__CONSTRAINTS, oldConstraints, newConstraints);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraints(ConstraintsType newConstraints) {
    if (newConstraints != constraints) {
      NotificationChain msgs = null;
      if (constraints != null)
        msgs = ((InternalEObject)constraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__CONSTRAINTS, null, msgs);
      if (newConstraints != null)
        msgs = ((InternalEObject)newConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__CONSTRAINTS, null, msgs);
      msgs = basicSetConstraints(newConstraints, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__CONSTRAINTS, newConstraints, newConstraints));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncludesType getIncludes() {
    return includes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIncludes(IncludesType newIncludes, NotificationChain msgs) {
    IncludesType oldIncludes = includes;
    includes = newIncludes;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__INCLUDES, oldIncludes, newIncludes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncludes(IncludesType newIncludes) {
    if (newIncludes != includes) {
      NotificationChain msgs = null;
      if (includes != null)
        msgs = ((InternalEObject)includes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__INCLUDES, null, msgs);
      if (newIncludes != null)
        msgs = ((InternalEObject)newIncludes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__INCLUDES, null, msgs);
      msgs = basicSetIncludes(newIncludes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__INCLUDES, newIncludes, newIncludes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportsType getImports() {
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImports(ImportsType newImports, NotificationChain msgs) {
    ImportsType oldImports = imports;
    imports = newImports;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__IMPORTS, oldImports, newImports);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImports(ImportsType newImports) {
    if (newImports != imports) {
      NotificationChain msgs = null;
      if (imports != null)
        msgs = ((InternalEObject)imports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__IMPORTS, null, msgs);
      if (newImports != null)
        msgs = ((InternalEObject)newImports).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__IMPORTS, null, msgs);
      msgs = basicSetImports(newImports, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__IMPORTS, newImports, newImports));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeesType getSees() {
    return sees;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSees(SeesType newSees, NotificationChain msgs) {
    SeesType oldSees = sees;
    sees = newSees;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__SEES, oldSees, newSees);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSees(SeesType newSees) {
    if (newSees != sees) {
      NotificationChain msgs = null;
      if (sees != null)
        msgs = ((InternalEObject)sees).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__SEES, null, msgs);
      if (newSees != null)
        msgs = ((InternalEObject)newSees).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__SEES, null, msgs);
      msgs = basicSetSees(newSees, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__SEES, newSees, newSees));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendsType getExtends() {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtends(ExtendsType newExtends, NotificationChain msgs) {
    ExtendsType oldExtends = extends_;
    extends_ = newExtends;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__EXTENDS, oldExtends, newExtends);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(ExtendsType newExtends) {
    if (newExtends != extends_) {
      NotificationChain msgs = null;
      if (extends_ != null)
        msgs = ((InternalEObject)extends_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__EXTENDS, null, msgs);
      if (newExtends != null)
        msgs = ((InternalEObject)newExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__EXTENDS, null, msgs);
      msgs = basicSetExtends(newExtends, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__EXTENDS, newExtends, newExtends));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsesType getUses() {
    return uses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUses(UsesType newUses, NotificationChain msgs) {
    UsesType oldUses = uses;
    uses = newUses;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__USES, oldUses, newUses);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUses(UsesType newUses) {
    if (newUses != uses) {
      NotificationChain msgs = null;
      if (uses != null)
        msgs = ((InternalEObject)uses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__USES, null, msgs);
      if (newUses != null)
        msgs = ((InternalEObject)newUses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__USES, null, msgs);
      msgs = basicSetUses(newUses, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__USES, newUses, newUses));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PromotesType getPromotes() {
    return promotes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPromotes(PromotesType newPromotes, NotificationChain msgs) {
    PromotesType oldPromotes = promotes;
    promotes = newPromotes;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__PROMOTES, oldPromotes, newPromotes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPromotes(PromotesType newPromotes) {
    if (newPromotes != promotes) {
      NotificationChain msgs = null;
      if (promotes != null)
        msgs = ((InternalEObject)promotes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__PROMOTES, null, msgs);
      if (newPromotes != null)
        msgs = ((InternalEObject)newPromotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__PROMOTES, null, msgs);
      msgs = basicSetPromotes(newPromotes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__PROMOTES, newPromotes, newPromotes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuesType getValues() {
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValues(ValuesType newValues, NotificationChain msgs) {
    ValuesType oldValues = values;
    values = newValues;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__VALUES, oldValues, newValues);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValues(ValuesType newValues) {
    if (newValues != values) {
      NotificationChain msgs = null;
      if (values != null)
        msgs = ((InternalEObject)values).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__VALUES, null, msgs);
      if (newValues != null)
        msgs = ((InternalEObject)newValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__VALUES, null, msgs);
      msgs = basicSetValues(newValues, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__VALUES, newValues, newValues));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetsType getSets() {
    return sets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSets(SetsType newSets, NotificationChain msgs) {
    SetsType oldSets = sets;
    sets = newSets;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__SETS, oldSets, newSets);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSets(SetsType newSets) {
    if (newSets != sets) {
      NotificationChain msgs = null;
      if (sets != null)
        msgs = ((InternalEObject)sets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__SETS, null, msgs);
      if (newSets != null)
        msgs = ((InternalEObject)newSets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__SETS, null, msgs);
      msgs = basicSetSets(newSets, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__SETS, newSets, newSets));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractConstantsType getAbstractConstants() {
    return abstractConstants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbstractConstants(AbstractConstantsType newAbstractConstants, NotificationChain msgs) {
    AbstractConstantsType oldAbstractConstants = abstractConstants;
    abstractConstants = newAbstractConstants;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__ABSTRACT_CONSTANTS, oldAbstractConstants, newAbstractConstants);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstractConstants(AbstractConstantsType newAbstractConstants) {
    if (newAbstractConstants != abstractConstants) {
      NotificationChain msgs = null;
      if (abstractConstants != null)
        msgs = ((InternalEObject)abstractConstants).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__ABSTRACT_CONSTANTS, null, msgs);
      if (newAbstractConstants != null)
        msgs = ((InternalEObject)newAbstractConstants).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__ABSTRACT_CONSTANTS, null, msgs);
      msgs = basicSetAbstractConstants(newAbstractConstants, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__ABSTRACT_CONSTANTS, newAbstractConstants, newAbstractConstants));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcreteConstantsType getConcreteConstants() {
    return concreteConstants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConcreteConstants(ConcreteConstantsType newConcreteConstants, NotificationChain msgs) {
    ConcreteConstantsType oldConcreteConstants = concreteConstants;
    concreteConstants = newConcreteConstants;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__CONCRETE_CONSTANTS, oldConcreteConstants, newConcreteConstants);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConcreteConstants(ConcreteConstantsType newConcreteConstants) {
    if (newConcreteConstants != concreteConstants) {
      NotificationChain msgs = null;
      if (concreteConstants != null)
        msgs = ((InternalEObject)concreteConstants).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__CONCRETE_CONSTANTS, null, msgs);
      if (newConcreteConstants != null)
        msgs = ((InternalEObject)newConcreteConstants).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__CONCRETE_CONSTANTS, null, msgs);
      msgs = basicSetConcreteConstants(newConcreteConstants, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__CONCRETE_CONSTANTS, newConcreteConstants, newConcreteConstants));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractVariablesType getAbstractVariables() {
    return abstractVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbstractVariables(AbstractVariablesType newAbstractVariables, NotificationChain msgs) {
    AbstractVariablesType oldAbstractVariables = abstractVariables;
    abstractVariables = newAbstractVariables;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__ABSTRACT_VARIABLES, oldAbstractVariables, newAbstractVariables);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstractVariables(AbstractVariablesType newAbstractVariables) {
    if (newAbstractVariables != abstractVariables) {
      NotificationChain msgs = null;
      if (abstractVariables != null)
        msgs = ((InternalEObject)abstractVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__ABSTRACT_VARIABLES, null, msgs);
      if (newAbstractVariables != null)
        msgs = ((InternalEObject)newAbstractVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__ABSTRACT_VARIABLES, null, msgs);
      msgs = basicSetAbstractVariables(newAbstractVariables, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__ABSTRACT_VARIABLES, newAbstractVariables, newAbstractVariables));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcreteVariablesType getConcreteVariables() {
    return concreteVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConcreteVariables(ConcreteVariablesType newConcreteVariables, NotificationChain msgs) {
    ConcreteVariablesType oldConcreteVariables = concreteVariables;
    concreteVariables = newConcreteVariables;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__CONCRETE_VARIABLES, oldConcreteVariables, newConcreteVariables);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConcreteVariables(ConcreteVariablesType newConcreteVariables) {
    if (newConcreteVariables != concreteVariables) {
      NotificationChain msgs = null;
      if (concreteVariables != null)
        msgs = ((InternalEObject)concreteVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__CONCRETE_VARIABLES, null, msgs);
      if (newConcreteVariables != null)
        msgs = ((InternalEObject)newConcreteVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__CONCRETE_VARIABLES, null, msgs);
      msgs = basicSetConcreteVariables(newConcreteVariables, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__CONCRETE_VARIABLES, newConcreteVariables, newConcreteVariables));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariantType getVariant() {
    return variant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariant(VariantType newVariant, NotificationChain msgs) {
    VariantType oldVariant = variant;
    variant = newVariant;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__VARIANT, oldVariant, newVariant);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariant(VariantType newVariant) {
    if (newVariant != variant) {
      NotificationChain msgs = null;
      if (variant != null)
        msgs = ((InternalEObject)variant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__VARIANT, null, msgs);
      if (newVariant != null)
        msgs = ((InternalEObject)newVariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__VARIANT, null, msgs);
      msgs = basicSetVariant(newVariant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__VARIANT, newVariant, newVariant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertiesType getProperties() {
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperties(PropertiesType newProperties, NotificationChain msgs) {
    PropertiesType oldProperties = properties;
    properties = newProperties;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__PROPERTIES, oldProperties, newProperties);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperties(PropertiesType newProperties) {
    if (newProperties != properties) {
      NotificationChain msgs = null;
      if (properties != null)
        msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__PROPERTIES, null, msgs);
      if (newProperties != null)
        msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__PROPERTIES, null, msgs);
      msgs = basicSetProperties(newProperties, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__PROPERTIES, newProperties, newProperties));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InvariantType getInvariant() {
    return invariant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInvariant(InvariantType newInvariant, NotificationChain msgs) {
    InvariantType oldInvariant = invariant;
    invariant = newInvariant;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__INVARIANT, oldInvariant, newInvariant);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInvariant(InvariantType newInvariant) {
    if (newInvariant != invariant) {
      NotificationChain msgs = null;
      if (invariant != null)
        msgs = ((InternalEObject)invariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__INVARIANT, null, msgs);
      if (newInvariant != null)
        msgs = ((InternalEObject)newInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__INVARIANT, null, msgs);
      msgs = basicSetInvariant(newInvariant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__INVARIANT, newInvariant, newInvariant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitialisationType getInitialisation() {
    return initialisation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialisation(InitialisationType newInitialisation, NotificationChain msgs) {
    InitialisationType oldInitialisation = initialisation;
    initialisation = newInitialisation;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__INITIALISATION, oldInitialisation, newInitialisation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialisation(InitialisationType newInitialisation) {
    if (newInitialisation != initialisation) {
      NotificationChain msgs = null;
      if (initialisation != null)
        msgs = ((InternalEObject)initialisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__INITIALISATION, null, msgs);
      if (newInitialisation != null)
        msgs = ((InternalEObject)newInitialisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__INITIALISATION, null, msgs);
      msgs = basicSetInitialisation(newInitialisation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__INITIALISATION, newInitialisation, newInitialisation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertionsType getAssertions() {
    return assertions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssertions(AssertionsType newAssertions, NotificationChain msgs) {
    AssertionsType oldAssertions = assertions;
    assertions = newAssertions;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__ASSERTIONS, oldAssertions, newAssertions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssertions(AssertionsType newAssertions) {
    if (newAssertions != assertions) {
      NotificationChain msgs = null;
      if (assertions != null)
        msgs = ((InternalEObject)assertions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__ASSERTIONS, null, msgs);
      if (newAssertions != null)
        msgs = ((InternalEObject)newAssertions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__ASSERTIONS, null, msgs);
      msgs = basicSetAssertions(newAssertions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__ASSERTIONS, newAssertions, newAssertions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalOperationsType getLocalOperations() {
    return localOperations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocalOperations(LocalOperationsType newLocalOperations, NotificationChain msgs) {
    LocalOperationsType oldLocalOperations = localOperations;
    localOperations = newLocalOperations;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__LOCAL_OPERATIONS, oldLocalOperations, newLocalOperations);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocalOperations(LocalOperationsType newLocalOperations) {
    if (newLocalOperations != localOperations) {
      NotificationChain msgs = null;
      if (localOperations != null)
        msgs = ((InternalEObject)localOperations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__LOCAL_OPERATIONS, null, msgs);
      if (newLocalOperations != null)
        msgs = ((InternalEObject)newLocalOperations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__LOCAL_OPERATIONS, null, msgs);
      msgs = basicSetLocalOperations(newLocalOperations, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__LOCAL_OPERATIONS, newLocalOperations, newLocalOperations));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationsType getOperations() {
    return operations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperations(OperationsType newOperations, NotificationChain msgs) {
    OperationsType oldOperations = operations;
    operations = newOperations;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__OPERATIONS, oldOperations, newOperations);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperations(OperationsType newOperations) {
    if (newOperations != operations) {
      NotificationChain msgs = null;
      if (operations != null)
        msgs = ((InternalEObject)operations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__OPERATIONS, null, msgs);
      if (newOperations != null)
        msgs = ((InternalEObject)newOperations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__OPERATIONS, null, msgs);
      msgs = basicSetOperations(newOperations, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__OPERATIONS, newOperations, newOperations));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeInfosType getTypeInfos() {
    return typeInfos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeInfos(TypeInfosType newTypeInfos, NotificationChain msgs) {
    TypeInfosType oldTypeInfos = typeInfos;
    typeInfos = newTypeInfos;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__TYPE_INFOS, oldTypeInfos, newTypeInfos);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeInfos(TypeInfosType newTypeInfos) {
    if (newTypeInfos != typeInfos) {
      NotificationChain msgs = null;
      if (typeInfos != null)
        msgs = ((InternalEObject)typeInfos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__TYPE_INFOS, null, msgs);
      if (newTypeInfos != null)
        msgs = ((InternalEObject)newTypeInfos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BxmlPackage.MACHINE_TYPE__TYPE_INFOS, null, msgs);
      msgs = basicSetTypeInfos(newTypeInfos, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__TYPE_INFOS, newTypeInfos, newTypeInfos));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Object newName) {
    Object oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeType1 getType() {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TypeType1 newType) {
    TypeType1 oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    boolean oldTypeESet = typeESet;
    typeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BxmlPackage.MACHINE_TYPE__TYPE, oldType, type, !oldTypeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetType() {
    TypeType1 oldType = type;
    boolean oldTypeESet = typeESet;
    type = TYPE_EDEFAULT;
    typeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, BxmlPackage.MACHINE_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetType() {
    return typeESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case BxmlPackage.MACHINE_TYPE__ATTR:
        return basicSetAttr(null, msgs);
      case BxmlPackage.MACHINE_TYPE__ABSTRACTION:
        return basicSetAbstraction(null, msgs);
      case BxmlPackage.MACHINE_TYPE__PARAMETERS:
        return basicSetParameters(null, msgs);
      case BxmlPackage.MACHINE_TYPE__CONSTRAINTS:
        return basicSetConstraints(null, msgs);
      case BxmlPackage.MACHINE_TYPE__INCLUDES:
        return basicSetIncludes(null, msgs);
      case BxmlPackage.MACHINE_TYPE__IMPORTS:
        return basicSetImports(null, msgs);
      case BxmlPackage.MACHINE_TYPE__SEES:
        return basicSetSees(null, msgs);
      case BxmlPackage.MACHINE_TYPE__EXTENDS:
        return basicSetExtends(null, msgs);
      case BxmlPackage.MACHINE_TYPE__USES:
        return basicSetUses(null, msgs);
      case BxmlPackage.MACHINE_TYPE__PROMOTES:
        return basicSetPromotes(null, msgs);
      case BxmlPackage.MACHINE_TYPE__VALUES:
        return basicSetValues(null, msgs);
      case BxmlPackage.MACHINE_TYPE__SETS:
        return basicSetSets(null, msgs);
      case BxmlPackage.MACHINE_TYPE__ABSTRACT_CONSTANTS:
        return basicSetAbstractConstants(null, msgs);
      case BxmlPackage.MACHINE_TYPE__CONCRETE_CONSTANTS:
        return basicSetConcreteConstants(null, msgs);
      case BxmlPackage.MACHINE_TYPE__ABSTRACT_VARIABLES:
        return basicSetAbstractVariables(null, msgs);
      case BxmlPackage.MACHINE_TYPE__CONCRETE_VARIABLES:
        return basicSetConcreteVariables(null, msgs);
      case BxmlPackage.MACHINE_TYPE__VARIANT:
        return basicSetVariant(null, msgs);
      case BxmlPackage.MACHINE_TYPE__PROPERTIES:
        return basicSetProperties(null, msgs);
      case BxmlPackage.MACHINE_TYPE__INVARIANT:
        return basicSetInvariant(null, msgs);
      case BxmlPackage.MACHINE_TYPE__INITIALISATION:
        return basicSetInitialisation(null, msgs);
      case BxmlPackage.MACHINE_TYPE__ASSERTIONS:
        return basicSetAssertions(null, msgs);
      case BxmlPackage.MACHINE_TYPE__LOCAL_OPERATIONS:
        return basicSetLocalOperations(null, msgs);
      case BxmlPackage.MACHINE_TYPE__OPERATIONS:
        return basicSetOperations(null, msgs);
      case BxmlPackage.MACHINE_TYPE__TYPE_INFOS:
        return basicSetTypeInfos(null, msgs);
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
      case BxmlPackage.MACHINE_TYPE__ATTR:
        return getAttr();
      case BxmlPackage.MACHINE_TYPE__ABSTRACTION:
        return getAbstraction();
      case BxmlPackage.MACHINE_TYPE__PARAMETERS:
        return getParameters();
      case BxmlPackage.MACHINE_TYPE__CONSTRAINTS:
        return getConstraints();
      case BxmlPackage.MACHINE_TYPE__INCLUDES:
        return getIncludes();
      case BxmlPackage.MACHINE_TYPE__IMPORTS:
        return getImports();
      case BxmlPackage.MACHINE_TYPE__SEES:
        return getSees();
      case BxmlPackage.MACHINE_TYPE__EXTENDS:
        return getExtends();
      case BxmlPackage.MACHINE_TYPE__USES:
        return getUses();
      case BxmlPackage.MACHINE_TYPE__PROMOTES:
        return getPromotes();
      case BxmlPackage.MACHINE_TYPE__VALUES:
        return getValues();
      case BxmlPackage.MACHINE_TYPE__SETS:
        return getSets();
      case BxmlPackage.MACHINE_TYPE__ABSTRACT_CONSTANTS:
        return getAbstractConstants();
      case BxmlPackage.MACHINE_TYPE__CONCRETE_CONSTANTS:
        return getConcreteConstants();
      case BxmlPackage.MACHINE_TYPE__ABSTRACT_VARIABLES:
        return getAbstractVariables();
      case BxmlPackage.MACHINE_TYPE__CONCRETE_VARIABLES:
        return getConcreteVariables();
      case BxmlPackage.MACHINE_TYPE__VARIANT:
        return getVariant();
      case BxmlPackage.MACHINE_TYPE__PROPERTIES:
        return getProperties();
      case BxmlPackage.MACHINE_TYPE__INVARIANT:
        return getInvariant();
      case BxmlPackage.MACHINE_TYPE__INITIALISATION:
        return getInitialisation();
      case BxmlPackage.MACHINE_TYPE__ASSERTIONS:
        return getAssertions();
      case BxmlPackage.MACHINE_TYPE__LOCAL_OPERATIONS:
        return getLocalOperations();
      case BxmlPackage.MACHINE_TYPE__OPERATIONS:
        return getOperations();
      case BxmlPackage.MACHINE_TYPE__TYPE_INFOS:
        return getTypeInfos();
      case BxmlPackage.MACHINE_TYPE__NAME:
        return getName();
      case BxmlPackage.MACHINE_TYPE__TYPE:
        return getType();
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
      case BxmlPackage.MACHINE_TYPE__ATTR:
        setAttr((AttrType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__ABSTRACTION:
        setAbstraction((AbstractionType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__PARAMETERS:
        setParameters((ParametersType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__CONSTRAINTS:
        setConstraints((ConstraintsType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__INCLUDES:
        setIncludes((IncludesType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__IMPORTS:
        setImports((ImportsType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__SEES:
        setSees((SeesType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__EXTENDS:
        setExtends((ExtendsType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__USES:
        setUses((UsesType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__PROMOTES:
        setPromotes((PromotesType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__VALUES:
        setValues((ValuesType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__SETS:
        setSets((SetsType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__ABSTRACT_CONSTANTS:
        setAbstractConstants((AbstractConstantsType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__CONCRETE_CONSTANTS:
        setConcreteConstants((ConcreteConstantsType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__ABSTRACT_VARIABLES:
        setAbstractVariables((AbstractVariablesType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__CONCRETE_VARIABLES:
        setConcreteVariables((ConcreteVariablesType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__VARIANT:
        setVariant((VariantType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__PROPERTIES:
        setProperties((PropertiesType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__INVARIANT:
        setInvariant((InvariantType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__INITIALISATION:
        setInitialisation((InitialisationType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__ASSERTIONS:
        setAssertions((AssertionsType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__LOCAL_OPERATIONS:
        setLocalOperations((LocalOperationsType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__OPERATIONS:
        setOperations((OperationsType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__TYPE_INFOS:
        setTypeInfos((TypeInfosType)newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__NAME:
        setName(newValue);
        return;
      case BxmlPackage.MACHINE_TYPE__TYPE:
        setType((TypeType1)newValue);
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
      case BxmlPackage.MACHINE_TYPE__ATTR:
        setAttr((AttrType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__ABSTRACTION:
        setAbstraction((AbstractionType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__PARAMETERS:
        setParameters((ParametersType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__CONSTRAINTS:
        setConstraints((ConstraintsType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__INCLUDES:
        setIncludes((IncludesType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__IMPORTS:
        setImports((ImportsType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__SEES:
        setSees((SeesType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__EXTENDS:
        setExtends((ExtendsType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__USES:
        setUses((UsesType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__PROMOTES:
        setPromotes((PromotesType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__VALUES:
        setValues((ValuesType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__SETS:
        setSets((SetsType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__ABSTRACT_CONSTANTS:
        setAbstractConstants((AbstractConstantsType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__CONCRETE_CONSTANTS:
        setConcreteConstants((ConcreteConstantsType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__ABSTRACT_VARIABLES:
        setAbstractVariables((AbstractVariablesType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__CONCRETE_VARIABLES:
        setConcreteVariables((ConcreteVariablesType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__VARIANT:
        setVariant((VariantType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__PROPERTIES:
        setProperties((PropertiesType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__INVARIANT:
        setInvariant((InvariantType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__INITIALISATION:
        setInitialisation((InitialisationType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__ASSERTIONS:
        setAssertions((AssertionsType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__LOCAL_OPERATIONS:
        setLocalOperations((LocalOperationsType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__OPERATIONS:
        setOperations((OperationsType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__TYPE_INFOS:
        setTypeInfos((TypeInfosType)null);
        return;
      case BxmlPackage.MACHINE_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BxmlPackage.MACHINE_TYPE__TYPE:
        unsetType();
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
      case BxmlPackage.MACHINE_TYPE__ATTR:
        return attr != null;
      case BxmlPackage.MACHINE_TYPE__ABSTRACTION:
        return abstraction != null;
      case BxmlPackage.MACHINE_TYPE__PARAMETERS:
        return parameters != null;
      case BxmlPackage.MACHINE_TYPE__CONSTRAINTS:
        return constraints != null;
      case BxmlPackage.MACHINE_TYPE__INCLUDES:
        return includes != null;
      case BxmlPackage.MACHINE_TYPE__IMPORTS:
        return imports != null;
      case BxmlPackage.MACHINE_TYPE__SEES:
        return sees != null;
      case BxmlPackage.MACHINE_TYPE__EXTENDS:
        return extends_ != null;
      case BxmlPackage.MACHINE_TYPE__USES:
        return uses != null;
      case BxmlPackage.MACHINE_TYPE__PROMOTES:
        return promotes != null;
      case BxmlPackage.MACHINE_TYPE__VALUES:
        return values != null;
      case BxmlPackage.MACHINE_TYPE__SETS:
        return sets != null;
      case BxmlPackage.MACHINE_TYPE__ABSTRACT_CONSTANTS:
        return abstractConstants != null;
      case BxmlPackage.MACHINE_TYPE__CONCRETE_CONSTANTS:
        return concreteConstants != null;
      case BxmlPackage.MACHINE_TYPE__ABSTRACT_VARIABLES:
        return abstractVariables != null;
      case BxmlPackage.MACHINE_TYPE__CONCRETE_VARIABLES:
        return concreteVariables != null;
      case BxmlPackage.MACHINE_TYPE__VARIANT:
        return variant != null;
      case BxmlPackage.MACHINE_TYPE__PROPERTIES:
        return properties != null;
      case BxmlPackage.MACHINE_TYPE__INVARIANT:
        return invariant != null;
      case BxmlPackage.MACHINE_TYPE__INITIALISATION:
        return initialisation != null;
      case BxmlPackage.MACHINE_TYPE__ASSERTIONS:
        return assertions != null;
      case BxmlPackage.MACHINE_TYPE__LOCAL_OPERATIONS:
        return localOperations != null;
      case BxmlPackage.MACHINE_TYPE__OPERATIONS:
        return operations != null;
      case BxmlPackage.MACHINE_TYPE__TYPE_INFOS:
        return typeInfos != null;
      case BxmlPackage.MACHINE_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BxmlPackage.MACHINE_TYPE__TYPE:
        return isSetType();
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
    result.append(", type: ");
    if (typeESet) result.append(type); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //MachineTypeImpl
