package no.hal.jex.jextest.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Collection;
import no.hal.jex.jextest.jexTest.Instance;
import no.hal.jex.jextest.jexTest.JexTestCase;
import no.hal.jex.jextest.jexTest.JexTestSequence;
import no.hal.jex.jextest.jexTest.Transition;
import no.hal.jex.jextest.jexTest.TransitionAction;
import no.hal.jex.jextest.jexTest.TransitionExpressionAction;
import no.hal.jex.jextest.jvmmodel.Util;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class TestAnnotationsSupport {
  @Inject
  @Extension
  private Util _util;
  
  public boolean generateTestClassAnntations(final JexTestCase testCase, final JvmAnnotationReference jexerciseAnnotation) {
    boolean _xblockexpression = false;
    {
      StringBuilder _stringBuilder = new StringBuilder();
      final StringBuilder descriptionBuffer = _stringBuilder;
      String _description = testCase.getDescription();
      this.addDescription(descriptionBuffer, _description, "h3");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Tests ");
      JvmParameterizedTypeReference _testedClass = testCase.getTestedClass();
      String _identifier = _testedClass.getIdentifier();
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
      boolean _annotationStringValues = this._util.toAnnotationStringValues(testCase, jexerciseAnnotation, "description", _string);
      _xblockexpression = (_annotationStringValues);
    }
    return _xblockexpression;
  }
  
  public boolean generateTestMethodAnntations(final JexTestSequence sequence, final JvmAnnotationReference jexerciseAnnotation) {
    boolean _xblockexpression = false;
    {
      StringBuilder _stringBuilder = new StringBuilder();
      final StringBuilder testsBuffer = _stringBuilder;
      final JexTestCase testCase = this._util.<JexTestCase>ancestor(sequence, JexTestCase.class);
      JvmParameterizedTypeReference _testedClass = testCase.getTestedClass();
      final JvmType testedClass = _testedClass.getType();
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
              XExpression _expr = ((TransitionExpressionAction) action).getExpr();
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
      StringBuilder _stringBuilder_1 = new StringBuilder();
      final StringBuilder descriptionBuffer = _stringBuilder_1;
      String _description = sequence.getDescription();
      this.addDescription(descriptionBuffer, _description, "h3");
      EList<Transition> _transitions_1 = sequence.getTransitions();
      final Function1<Transition,Boolean> _function = new Function1<Transition,Boolean>() {
        public Boolean apply(final Transition it) {
          EList<TransitionAction> _actions = it.getActions();
          boolean _isEmpty = _actions.isEmpty();
          boolean _not = (!_isEmpty);
          return Boolean.valueOf(_not);
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
                  _builder.append(_description_2, "		");
                  _builder.append(": ");
                }
              }
              EList<TransitionAction> _actions_1 = transition_1.getActions();
              String _asSourceText = this._util.asSourceText(_actions_1, ", ");
              _builder.append(_asSourceText, "		");
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
        this._util.toAnnotationStringValues(sequence, jexerciseAnnotation, "tests", _removeJavaLang);
      }
      String _string_1 = descriptionBuffer.toString();
      boolean _annotationStringValues = this._util.toAnnotationStringValues(sequence, jexerciseAnnotation, "description", _string_1);
      _xblockexpression = (_annotationStringValues);
    }
    return _xblockexpression;
  }
  
  public void addDescription(final StringBuilder buffer, final String description, final String... tags) {
    boolean _notEquals = (!Objects.equal(description, null));
    if (_notEquals) {
      final ArrayList<String> tagList = CollectionLiterals.<String>newArrayList(tags);
      for (final String tag : tagList) {
        String _plus = ("<" + tag);
        String _plus_1 = (_plus + ">");
        buffer.append(_plus_1);
      }
      buffer.append(description);
      ListExtensions.<String>reverse(tagList);
      for (final String tag_1 : tagList) {
        String _plus_2 = ("</" + tag_1);
        String _plus_3 = (_plus_2 + ">");
        buffer.append(_plus_3);
      }
    }
  }
  
  private void addDefaultConstructor(final JvmType type, final Collection<JvmExecutable> testedMembers) {
    if ((type instanceof JvmGenericType)) {
      EList<JvmMember> _members = ((JvmGenericType) type).getMembers();
      for (final JvmMember member : _members) {
        boolean _and = false;
        if (!(member instanceof JvmConstructor)) {
          _and = false;
        } else {
          EList<JvmFormalParameter> _parameters = ((JvmExecutable) member).getParameters();
          boolean _isEmpty = _parameters.isEmpty();
          _and = ((member instanceof JvmConstructor) && _isEmpty);
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
    boolean _hasNext = allContents.hasNext();
    boolean _while = _hasNext;
    while (_while) {
      EObject _next = allContents.next();
      this.collectUsedMember(_next, type, executables);
      boolean _hasNext_1 = allContents.hasNext();
      _while = _hasNext_1;
    }
  }
  
  private void collectUsedMember(final EObject expr, final JvmType type, final Collection<JvmExecutable> executables) {
    JvmExecutable op = null;
    if ((expr instanceof XAbstractFeatureCall)) {
      final XAbstractFeatureCall featureCall = ((XAbstractFeatureCall) expr);
      JvmIdentifiableElement _feature = featureCall.getFeature();
      if ((_feature instanceof JvmExecutable)) {
        JvmIdentifiableElement _feature_1 = featureCall.getFeature();
        op = ((JvmExecutable) _feature_1);
      }
    } else {
      if ((expr instanceof XConstructorCall)) {
        final XConstructorCall constructorCall = ((XConstructorCall) expr);
        JvmConstructor _constructor = constructorCall.getConstructor();
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
      _and_1 = (_notEquals && _equals);
    }
    if (!_and_1) {
      _and = false;
    } else {
      boolean _contains = testedMembers.contains(op);
      boolean _not = (!_contains);
      _and = (_and_1 && _not);
    }
    if (_and) {
      testedMembers.add(op);
    }
  }
}
