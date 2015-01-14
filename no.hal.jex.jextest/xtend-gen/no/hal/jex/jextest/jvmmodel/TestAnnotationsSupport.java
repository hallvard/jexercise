package no.hal.jex.jextest.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import no.hal.jex.jextest.jexTest.Instance;
import no.hal.jex.jextest.jexTest.JexTestCase;
import no.hal.jex.jextest.jexTest.JexTestSequence;
import no.hal.jex.jextest.jexTest.TestedClass;
import no.hal.jex.jextest.jexTest.Transition;
import no.hal.jex.jextest.jexTest.TransitionAction;
import no.hal.jex.jextest.jexTest.TransitionExpressionAction;
import no.hal.jex.jextest.jvmmodel.Util;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmStringAnnotationValue;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class TestAnnotationsSupport {
  @Inject
  @Extension
  private Util _util;
  
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  @Inject
  @Extension
  private TypesFactory _typesFactory;
  
  public JvmType testedJvmType(final JexTestCase testCase) {
    JvmType _elvis = null;
    JvmParameterizedTypeReference _testedClassRef = testCase.getTestedClassRef();
    JvmType _type = null;
    if (_testedClassRef!=null) {
      _type=_testedClassRef.getType();
    }
    if (_type != null) {
      _elvis = _type;
    } else {
      JvmType _xblockexpression = null;
      {
        EList<TestedClass> _testedClasses = testCase.getTestedClasses();
        final TestedClass testedClass = IterableExtensions.<TestedClass>head(_testedClasses);
        Set<EObject> _jvmElements = this._iJvmModelAssociations.getJvmElements(testedClass);
        EObject _head = IterableExtensions.<EObject>head(_jvmElements);
        _xblockexpression = ((JvmType) _head);
      }
      _elvis = _xblockexpression;
    }
    return _elvis;
  }
  
  public boolean toAnnotationStringValues(final EObject context, final JvmAnnotationReference annotation, final String valueName, final String... values) {
    boolean _xblockexpression = false;
    {
      JvmAnnotationType _annotation = annotation.getAnnotation();
      EList<JvmMember> _members = _annotation.getMembers();
      Iterable<JvmOperation> _filter = Iterables.<JvmOperation>filter(_members, JvmOperation.class);
      final Function1<JvmOperation, Boolean> _function = new Function1<JvmOperation, Boolean>() {
        public Boolean apply(final JvmOperation it) {
          String _simpleName = it.getSimpleName();
          return Boolean.valueOf(Objects.equal(_simpleName, valueName));
        }
      };
      final JvmOperation op = IterableExtensions.<JvmOperation>findFirst(_filter, _function);
      final JvmStringAnnotationValue annotationValue = this._typesFactory.createJvmStringAnnotationValue();
      annotationValue.setOperation(op);
      EList<String> _values = annotationValue.getValues();
      Iterables.<String>addAll(_values, ((Iterable<? extends String>)Conversions.doWrapArray(values)));
      EList<JvmAnnotationValue> _explicitValues = annotation.getExplicitValues();
      _xblockexpression = _explicitValues.add(annotationValue);
    }
    return _xblockexpression;
  }
  
  public boolean generateTestClassAnntations(final JexTestCase testCase, final JvmAnnotationReference jexerciseAnnotation) {
    boolean _xblockexpression = false;
    {
      final StringBuilder descriptionBuffer = new StringBuilder();
      String _description = testCase.getDescription();
      this.addDescription(descriptionBuffer, _description, "h3");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Tests ");
      JvmType _testedJvmType = this.testedJvmType(testCase);
      String _identifier = _testedJvmType.getIdentifier();
      _builder.append(_identifier, "");
      descriptionBuffer.append(_builder);
      String _url = testCase.getUrl();
      boolean _notEquals = (!Objects.equal(_url, null));
      if (_notEquals) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<p>(see <a href=\"");
        String _url_1 = testCase.getUrl();
        _builder_1.append(_url_1, "");
        _builder_1.append("\">");
        String _url_2 = testCase.getUrl();
        _builder_1.append(_url_2, "");
        _builder_1.append("</a>)</p>");
        descriptionBuffer.append(_builder_1);
      }
      String _string = descriptionBuffer.toString();
      _xblockexpression = this.toAnnotationStringValues(testCase, jexerciseAnnotation, "description", _string);
    }
    return _xblockexpression;
  }
  
  public boolean generateTestMethodAnntations(final JexTestSequence sequence, final JvmAnnotationReference jexerciseAnnotation) {
    boolean _xblockexpression = false;
    {
      final StringBuilder testsBuffer = new StringBuilder();
      final JexTestCase testCase = this._util.<JexTestCase>ancestor(sequence, JexTestCase.class);
      final JvmType testedClass = this.testedJvmType(testCase);
      final ArrayList<JvmExecutable> testedMembers = CollectionLiterals.<JvmExecutable>newArrayList();
      EList<Instance> _instances = testCase.getInstances();
      boolean _isEmpty = _instances.isEmpty();
      if (_isEmpty) {
        this.addDefaultConstructor(testedClass, testedMembers);
      } else {
        EList<Instance> _instances_1 = testCase.getInstances();
        for (final Instance instance : _instances_1) {
          this.collectUsedMembers(instance, testedClass, testedMembers);
        }
      }
      EList<Instance> _instances_2 = sequence.getInstances();
      for (final Instance instance_1 : _instances_2) {
        this.collectUsedMembers(instance_1, testedClass, testedMembers);
      }
      EList<Transition> _transitions = sequence.getTransitions();
      for (final Transition transition : _transitions) {
        EList<TransitionAction> _actions = transition.getActions();
        for (final TransitionAction action : _actions) {
          {
            XExpression expr = null;
            if ((action instanceof TransitionExpressionAction)) {
              XExpression _expr = ((TransitionExpressionAction)action).getExpr();
              expr = _expr;
            }
            boolean _notEquals = (!Objects.equal(expr, null));
            if (_notEquals) {
              this.collectUsedMembers(expr, testedClass, testedMembers);
            }
          }
        }
      }
      final int size = testsBuffer.length();
      for (final JvmExecutable op : testedMembers) {
        {
          int _length = testsBuffer.length();
          boolean _greaterThan = (_length > size);
          if (_greaterThan) {
            testsBuffer.append(";");
          }
          this._util.appendMethodSignature(testsBuffer, op);
        }
      }
      final StringBuilder descriptionBuffer = new StringBuilder();
      String _description = sequence.getDescription();
      this.addDescription(descriptionBuffer, _description, "h3");
      EList<Transition> _transitions_1 = sequence.getTransitions();
      final Function1<Transition, Boolean> _function = new Function1<Transition, Boolean>() {
        public Boolean apply(final Transition it) {
          EList<TransitionAction> _actions = it.getActions();
          boolean _isEmpty = _actions.isEmpty();
          return Boolean.valueOf((!_isEmpty));
        }
      };
      final Iterable<Transition> transitionExpressions = IterableExtensions.<Transition>filter(_transitions_1, _function);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Tests ");
      _builder.newLine();
      {
        boolean _isEmpty_1 = IterableExtensions.isEmpty(transitionExpressions);
        if (_isEmpty_1) {
          _builder.append("\t\t");
          _builder.append("initialization");
          _builder.newLine();
        } else {
          _builder.append("\t\t");
          _builder.append("the following sequence:");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("<ul>");
          _builder.newLine();
          {
            for(final Transition transition_1 : transitionExpressions) {
              _builder.append("\t\t");
              _builder.append("<li>");
              {
                String _description_1 = transition_1.getDescription();
                boolean _notEquals = (!Objects.equal(_description_1, null));
                if (_notEquals) {
                  String _description_2 = transition_1.getDescription();
                  _builder.append(_description_2, "\t\t");
                  _builder.append(": ");
                }
              }
              EList<TransitionAction> _actions_1 = transition_1.getActions();
              String _asSourceText = this._util.asSourceText(_actions_1, ", ");
              _builder.append(_asSourceText, "\t\t");
              _builder.append("</li>");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t\t");
          _builder.append("</ul>");
          _builder.newLine();
          _builder.append("\t\t");
        }
      }
      descriptionBuffer.append(_builder);
      int _length = testsBuffer.length();
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        String _string = testsBuffer.toString();
        String _removeJavaLang = this._util.removeJavaLang(_string);
        this.toAnnotationStringValues(sequence, jexerciseAnnotation, "tests", _removeJavaLang);
      }
      String _string_1 = descriptionBuffer.toString();
      _xblockexpression = this.toAnnotationStringValues(sequence, jexerciseAnnotation, "description", _string_1);
    }
    return _xblockexpression;
  }
  
  public void addDescription(final StringBuilder buffer, final String description, final String... tags) {
    boolean _notEquals = (!Objects.equal(description, null));
    if (_notEquals) {
      final ArrayList<String> tagList = CollectionLiterals.<String>newArrayList(tags);
      for (final String tag : tagList) {
        buffer.append((("<" + tag) + ">"));
      }
      buffer.append(description);
      ListExtensions.<String>reverse(tagList);
      for (final String tag_1 : tagList) {
        buffer.append((("</" + tag_1) + ">"));
      }
    }
  }
  
  private void addDefaultConstructor(final JvmType type, final Collection<JvmExecutable> testedMembers) {
    if ((type instanceof JvmGenericType)) {
      EList<JvmMember> _members = ((JvmGenericType)type).getMembers();
      for (final JvmMember member : _members) {
        boolean _and = false;
        if (!(member instanceof JvmConstructor)) {
          _and = false;
        } else {
          EList<JvmFormalParameter> _parameters = ((JvmExecutable) member).getParameters();
          boolean _isEmpty = _parameters.isEmpty();
          _and = _isEmpty;
        }
        if (_and) {
          this.addUsedMember(((JvmExecutable) member), type, testedMembers);
          return;
        }
      }
    }
  }
  
  private void collectUsedMembers(final Instance instance, final JvmType type, final Collection<JvmExecutable> testedMembers) {
    XExpression _expr = instance.getExpr();
    boolean _notEquals = (!Objects.equal(_expr, null));
    if (_notEquals) {
      XExpression _expr_1 = instance.getExpr();
      this.collectUsedMembers(_expr_1, type, testedMembers);
    } else {
      this.addDefaultConstructor(type, testedMembers);
    }
  }
  
  private void collectUsedMembers(final EObject expr, final JvmType type, final Collection<JvmExecutable> executables) {
    this.collectUsedMember(expr, type, executables);
    final TreeIterator<EObject> allContents = expr.eAllContents();
    while (allContents.hasNext()) {
      EObject _next = allContents.next();
      this.collectUsedMember(_next, type, executables);
    }
  }
  
  private void collectUsedMember(final EObject expr, final JvmType type, final Collection<JvmExecutable> executables) {
    JvmExecutable op = null;
    if ((expr instanceof XAbstractFeatureCall)) {
      JvmIdentifiableElement _feature = ((XAbstractFeatureCall)expr).getFeature();
      if ((_feature instanceof JvmExecutable)) {
        JvmIdentifiableElement _feature_1 = ((XAbstractFeatureCall)expr).getFeature();
        op = ((JvmExecutable) _feature_1);
      }
    } else {
      if ((expr instanceof XConstructorCall)) {
        JvmConstructor _constructor = ((XConstructorCall)expr).getConstructor();
        op = _constructor;
      }
    }
    this.addUsedMember(op, type, executables);
  }
  
  private void addUsedMember(final JvmExecutable op, final JvmType type, final Collection<JvmExecutable> testedMembers) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _notEquals = (!Objects.equal(op, null));
    if (!_notEquals) {
      _and_1 = false;
    } else {
      JvmDeclaredType _declaringType = op.getDeclaringType();
      boolean _equals = Objects.equal(_declaringType, type);
      _and_1 = _equals;
    }
    if (!_and_1) {
      _and = false;
    } else {
      boolean _contains = testedMembers.contains(op);
      boolean _not = (!_contains);
      _and = _not;
    }
    if (_and) {
      testedMembers.add(op);
    }
  }
}
