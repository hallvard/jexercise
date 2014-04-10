package no.hal.jex.jextest.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import no.hal.jex.jextest.jexTest.Instance;
import no.hal.jex.jextest.jexTest.JexTestCase;
import no.hal.jex.jextest.jexTest.ObjectTest;
import no.hal.jex.jextest.jexTest.PropertiesTestOwner;
import no.hal.jex.jextest.jexTest.StateFunction;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmStringAnnotationValue;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.diagnostics.AbstractDiagnostic;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.validation.EObjectDiagnosticImpl;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class Util {
  public <T extends Object> String relativeName(final EObject eObject, final Class<T> c) {
    String name = "";
    EObject e = eObject;
    boolean _notEquals = (!Objects.equal(e, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        final EObject child = e;
        EObject _eContainer = e.eContainer();
        e = _eContainer;
        String childName = null;
        EClass _eClass = child.eClass();
        final EStructuralFeature nameFeature = _eClass.getEStructuralFeature("name");
        boolean _notEquals_1 = (!Objects.equal(nameFeature, null));
        if (_notEquals_1) {
          Object _eGet = child.eGet(nameFeature);
          childName = ((String) _eGet);
        }
        boolean _equals = Objects.equal(childName, null);
        if (_equals) {
          final EStructuralFeature feature = child.eContainingFeature();
          boolean _and = false;
          boolean _notEquals_2 = (!Objects.equal(feature, null));
          if (!_notEquals_2) {
            _and = false;
          } else {
            boolean _notEquals_3 = (!Objects.equal(e, null));
            _and = (_notEquals_2 && _notEquals_3);
          }
          if (_and) {
            String _name = feature.getName();
            Object _xifexpression = null;
            boolean _isMany = feature.isMany();
            if (_isMany) {
              Object _eGet_1 = e.eGet(feature);
              int _indexOf = ((EList<?>) _eGet_1).indexOf(child);
              _xifexpression = Integer.valueOf(_indexOf);
            } else {
              _xifexpression = "";
            }
            String _plus = (_name + ((Comparable<Object>)_xifexpression));
            childName = _plus;
          }
        }
        boolean _notEquals_4 = (!Objects.equal(childName, null));
        if (_notEquals_4) {
          String _plus_1 = ("_" + childName);
          String _plus_2 = (_plus_1 + name);
          name = _plus_2;
        }
        boolean _isInstance = c.isInstance(child);
        if (_isInstance) {
          return name;
        }
      }
      boolean _notEquals_1 = (!Objects.equal(e, null));
      _while = _notEquals_1;
    }
    return null;
  }
  
  public <T extends Object> T ancestor(final EObject eObject, final Class<T> c) {
    T _xblockexpression = null;
    {
      EObject e = eObject;
      boolean _notEquals = (!Objects.equal(e, null));
      boolean _while = _notEquals;
      while (_while) {
        {
          boolean _isInstance = c.isInstance(e);
          if (_isInstance) {
            return ((T) e);
          }
          EObject _eContainer = e.eContainer();
          e = _eContainer;
        }
        boolean _notEquals_1 = (!Objects.equal(e, null));
        _while = _notEquals_1;
      }
      _xblockexpression = (null);
    }
    return _xblockexpression;
  }
  
  public boolean isDefaultInstanceTest(final EObject eObject) {
    JexTestCase _ancestor = this.<JexTestCase>ancestor(eObject, JexTestCase.class);
    EList<Instance> _instances = _ancestor.getInstances();
    boolean _isEmpty = _instances.isEmpty();
    return _isEmpty;
  }
  
  public JvmParameterizedTypeReference defaultInstanceType(final EObject eObject) {
    JvmParameterizedTypeReference _xblockexpression = null;
    {
      final JexTestCase testCase = this.<JexTestCase>ancestor(eObject, JexTestCase.class);
      JvmParameterizedTypeReference _testedClass = null;
      if (testCase!=null) {
        _testedClass=testCase.getTestedClass();
      }
      _xblockexpression = (_testedClass);
    }
    return _xblockexpression;
  }
  
  public String defaultInstanceName(final EObject eObject) {
    JexTestCase _ancestor = this.<JexTestCase>ancestor(eObject, JexTestCase.class);
    JvmParameterizedTypeReference _testedClass = _ancestor.getTestedClass();
    String _simpleName = _testedClass.getSimpleName();
    String _firstLower = StringExtensions.toFirstLower(_simpleName);
    return _firstLower;
  }
  
  public String instanceName(final EObject eObject) {
    String _xblockexpression = null;
    {
      final PropertiesTestOwner propertiesTestOwner = this.<PropertiesTestOwner>ancestor(eObject, PropertiesTestOwner.class);
      if ((propertiesTestOwner instanceof StateFunction)) {
        return XbaseScopeProvider.IT.toString();
      } else {
        if ((propertiesTestOwner instanceof ObjectTest)) {
          final Instance instance = ((ObjectTest) propertiesTestOwner).getInstance();
          boolean _notEquals = (!Objects.equal(instance, null));
          if (_notEquals) {
            return instance.getName();
          }
        }
      }
      JexTestCase _ancestor = this.<JexTestCase>ancestor(eObject, JexTestCase.class);
      final EList<Instance> instances = _ancestor.getInstances();
      String _xifexpression = null;
      boolean _isEmpty = instances.isEmpty();
      if (_isEmpty) {
        String _defaultInstanceName = this.defaultInstanceName(eObject);
        _xifexpression = _defaultInstanceName;
      } else {
        String _xifexpression_1 = null;
        int _size = instances.size();
        boolean _equals = (_size == 1);
        if (_equals) {
          Instance _head = IterableExtensions.<Instance>head(instances);
          String _name = _head.getName();
          _xifexpression_1 = _name;
        } else {
          _xifexpression_1 = null;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public JvmTypeReference jvmType(final Instance instance) {
    JvmTypeReference _elvis = null;
    JvmTypeReference _type = instance.getType();
    if (_type != null) {
      _elvis = _type;
    } else {
      JvmParameterizedTypeReference _defaultInstanceType = this.defaultInstanceType(instance);
      _elvis = ObjectExtensions.<JvmTypeReference>operator_elvis(_type, _defaultInstanceType);
    }
    return _elvis;
  }
  
  public JvmTypeReference jvmInstanceType(final EObject eObject) {
    JvmTypeReference _xblockexpression = null;
    {
      final PropertiesTestOwner propertiesTestOwner = this.<PropertiesTestOwner>ancestor(eObject, PropertiesTestOwner.class);
      if ((propertiesTestOwner instanceof StateFunction)) {
        final StateFunction stateFunction = ((StateFunction) propertiesTestOwner);
        JvmParameterizedTypeReference _elvis = null;
        JvmParameterizedTypeReference _type = stateFunction.getType();
        if (_type != null) {
          _elvis = _type;
        } else {
          JvmParameterizedTypeReference _defaultInstanceType = this.defaultInstanceType(eObject);
          _elvis = ObjectExtensions.<JvmParameterizedTypeReference>operator_elvis(_type, _defaultInstanceType);
        }
        return _elvis;
      } else {
        if ((propertiesTestOwner instanceof ObjectTest)) {
          final Instance instance = ((ObjectTest) propertiesTestOwner).getInstance();
          boolean _notEquals = (!Objects.equal(instance, null));
          if (_notEquals) {
            return this.jvmType(instance);
          }
        }
      }
      JexTestCase _ancestor = this.<JexTestCase>ancestor(eObject, JexTestCase.class);
      final EList<Instance> instances = _ancestor.getInstances();
      JvmTypeReference _xifexpression = null;
      boolean _isEmpty = instances.isEmpty();
      if (_isEmpty) {
        JvmParameterizedTypeReference _defaultInstanceType_1 = this.defaultInstanceType(eObject);
        _xifexpression = _defaultInstanceType_1;
      } else {
        JvmTypeReference _xifexpression_1 = null;
        int _size = instances.size();
        boolean _equals = (_size == 1);
        if (_equals) {
          Instance _head = IterableExtensions.<Instance>head(instances);
          JvmTypeReference _jvmType = this.jvmType(_head);
          _xifexpression_1 = _jvmType;
        } else {
          _xifexpression_1 = null;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  @Inject
  @Extension
  private TypesFactory _typesFactory;
  
  public boolean toAnnotationStringValues(final EObject context, final JvmAnnotationReference annotation, final String valueName, final String... values) {
    boolean _xblockexpression = false;
    {
      JvmAnnotationType _annotation = annotation.getAnnotation();
      EList<JvmMember> _members = _annotation.getMembers();
      Iterable<JvmOperation> _filter = Iterables.<JvmOperation>filter(_members, JvmOperation.class);
      final Function1<JvmOperation,Boolean> _function = new Function1<JvmOperation,Boolean>() {
        public Boolean apply(final JvmOperation it) {
          String _simpleName = it.getSimpleName();
          boolean _equals = Objects.equal(_simpleName, valueName);
          return Boolean.valueOf(_equals);
        }
      };
      final JvmOperation op = IterableExtensions.<JvmOperation>findFirst(_filter, _function);
      final JvmStringAnnotationValue annotationValue = this._typesFactory.createJvmStringAnnotationValue();
      annotationValue.setOperation(op);
      EList<String> _values = annotationValue.getValues();
      this._jvmTypesBuilder.<String>operator_add(_values, ((Iterable<? extends String>)Conversions.doWrapArray(values)));
      EList<JvmAnnotationValue> _values_1 = annotation.getValues();
      boolean _add = this._jvmTypesBuilder.<JvmStringAnnotationValue>operator_add(_values_1, annotationValue);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  public String asSourceText(final EList<? extends EObject> eObjects, final String separator) {
    final Function1<EObject,String> _function = new Function1<EObject,String>() {
      public String apply(final EObject it) {
        String _asSourceText = Util.this.asSourceText(it);
        return _asSourceText;
      }
    };
    String _join = IterableExtensions.join(eObjects, separator, _function);
    return _join;
  }
  
  public String asSourceText(final EObject eObject) {
    ICompositeNode _node = NodeModelUtils.getNode(eObject);
    String _tokenText = NodeModelUtils.getTokenText(_node);
    return _tokenText;
  }
  
  public String quote(final String s, final String q) {
    String _plus = ("\\" + q);
    String _replace = s.replace(q, _plus);
    return _replace;
  }
  
  public StringBuilder appendMethodSignature(final StringBuilder buffer, final JvmExecutable op) {
    StringBuilder _xblockexpression = null;
    {
      if ((op instanceof JvmOperation)) {
        JvmTypeReference _returnType = ((JvmOperation) op).getReturnType();
        this.appendSignatureType(buffer, _returnType);
        buffer.append(" ");
      }
      String _simpleName = op.getSimpleName();
      buffer.append(_simpleName);
      buffer.append("(");
      final int size = buffer.length();
      EList<JvmFormalParameter> _parameters = op.getParameters();
      for (final JvmFormalParameter parameter : _parameters) {
        {
          int _length = buffer.length();
          boolean _greaterThan = (_length > size);
          if (_greaterThan) {
            buffer.append(",");
          }
          JvmTypeReference _parameterType = parameter.getParameterType();
          this.appendSignatureType(buffer, _parameterType);
        }
      }
      StringBuilder _append = buffer.append(")");
      _xblockexpression = (_append);
    }
    return _xblockexpression;
  }
  
  public StringBuilder appendSignatureType(final StringBuilder buffer, final JvmTypeReference type) {
    String _identifier = type.getIdentifier();
    StringBuilder _append = buffer.append(_identifier);
    return _append;
  }
  
  public String removeJavaLang(final String s) {
    String _replace = s.replace("java.lang.", "");
    return _replace;
  }
  
  public EObject getProblemObject(final Diagnostic diagnostic, final Resource resource) {
    EObject _xblockexpression = null;
    {
      if ((diagnostic instanceof AbstractDiagnostic)) {
        final URI uri = ((AbstractDiagnostic) diagnostic).getUriToProblem();
        String _fragment = uri.fragment();
        return resource.getEObject(_fragment);
      } else {
        if ((diagnostic instanceof EObjectDiagnosticImpl)) {
          return ((EObjectDiagnosticImpl) diagnostic).getProblematicObject();
        }
      }
      _xblockexpression = (null);
    }
    return _xblockexpression;
  }
  
  public boolean hasDiagnostic(final EObject eObject) {
    boolean _xblockexpression = false;
    {
      final Resource resource = eObject.eResource();
      EList<Diagnostic> _errors = resource.getErrors();
      for (final Diagnostic diagnostic : _errors) {
        {
          EObject problemObject = this.getProblemObject(diagnostic, resource);
          boolean _notEquals = (!Objects.equal(problemObject, null));
          boolean _while = _notEquals;
          while (_while) {
            {
              boolean _equals = Objects.equal(problemObject, eObject);
              if (_equals) {
                return true;
              }
              EObject _eContainer = problemObject.eContainer();
              problemObject = _eContainer;
            }
            boolean _notEquals_1 = (!Objects.equal(problemObject, null));
            _while = _notEquals_1;
          }
        }
      }
      _xblockexpression = (false);
    }
    return _xblockexpression;
  }
  
  public ITreeAppendable generateUnsupportedOperationException(final EObject problem, final ITreeAppendable appendable) {
    ITreeAppendable _append = appendable.append("throw new UnsupportedOperationException(\"Test wouldn\'t compile, due to missing or erroneous code.\");");
    return _append;
  }
  
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  public JvmTypeReference jvmType(final XExpression expr, final EObject context) {
    JvmTypeReference _xifexpression = null;
    if ((expr instanceof XAbstractFeatureCall)) {
      JvmTypeReference _xblockexpression = null;
      {
        final JvmIdentifiableElement feature = ((XAbstractFeatureCall) expr).getFeature();
        JvmTypeReference _switchResult = null;
        boolean _matched = false;
        if (!_matched) {
          if (feature instanceof JvmOperation) {
            final JvmOperation _jvmOperation = (JvmOperation)feature;
            _matched=true;
            JvmTypeReference _returnType = _jvmOperation.getReturnType();
            _switchResult = _returnType;
          }
        }
        if (!_matched) {
          if (feature instanceof JvmConstructor) {
            final JvmConstructor _jvmConstructor = (JvmConstructor)feature;
            _matched=true;
            JvmDeclaredType _declaringType = _jvmConstructor.getDeclaringType();
            JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(_declaringType);
            _switchResult = _newTypeRef;
          }
        }
        if (!_matched) {
          if (feature instanceof JvmField) {
            final JvmField _jvmField = (JvmField)feature;
            _matched=true;
            JvmTypeReference _type = _jvmField.getType();
            _switchResult = _type;
          }
        }
        if (!_matched) {
          _switchResult = null;
        }
        _xblockexpression = (_switchResult);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
}
