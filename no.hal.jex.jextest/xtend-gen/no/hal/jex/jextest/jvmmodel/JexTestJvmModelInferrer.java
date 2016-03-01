package no.hal.jex.jextest.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import no.hal.jex.jextest.jexTest.Instance;
import no.hal.jex.jextest.jexTest.JexTestCase;
import no.hal.jex.jextest.jexTest.JexTestSequence;
import no.hal.jex.jextest.jexTest.JexTestSuite;
import no.hal.jex.jextest.jexTest.Method;
import no.hal.jex.jextest.jexTest.ObjectTest;
import no.hal.jex.jextest.jexTest.Parameter;
import no.hal.jex.jextest.jexTest.PropertiesTest;
import no.hal.jex.jextest.jexTest.State;
import no.hal.jex.jextest.jexTest.StateFunction;
import no.hal.jex.jextest.jexTest.StateTestContext;
import no.hal.jex.jextest.jexTest.TestMemberContext;
import no.hal.jex.jextest.jexTest.TestedClass;
import no.hal.jex.jextest.jexTest.TestedConstructor;
import no.hal.jex.jextest.jexTest.TestedMethod;
import no.hal.jex.jextest.jexTest.TestedOperation;
import no.hal.jex.jextest.jexTest.Transition;
import no.hal.jex.jextest.jexTest.TransitionAction;
import no.hal.jex.jextest.jexTest.TransitionEffect;
import no.hal.jex.jextest.jexTest.TransitionExceptionEffect;
import no.hal.jex.jextest.jexTest.TransitionExpressionAction;
import no.hal.jex.jextest.jexTest.TransitionSource;
import no.hal.jex.jextest.jexTest.TransitionTargetEffect;
import no.hal.jex.jextest.jvmmodel.TestAnnotationsSupport;
import no.hal.jex.jextest.jvmmodel.Util;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.scoping.featurecalls.OperatorMapping;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class JexTestJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  @Extension
  private TypeReferenceSerializer _typeReferenceSerializer;
  
  @Inject
  @Extension
  private XbaseCompiler _xbaseCompiler;
  
  @Inject
  @Extension
  private IJvmModelAssociator _iJvmModelAssociator;
  
  @Inject
  @Extension
  private OperatorMapping _operatorMapping;
  
  @Inject
  @Extension
  private Util _util;
  
  @Inject
  @Extension
  private TestAnnotationsSupport _testAnnotationsSupport;
  
  protected void _infer(final JexTestSuite testSuite, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    EList<JexTestCase> _testCases = testSuite.getTestCases();
    for (final JexTestCase testCase : _testCases) {
      this.inferTestCase(testCase, acceptor);
    }
    String _suiteClassName = testSuite.getSuiteClassName();
    final JvmGenericType jvmClass = this._jvmTypesBuilder.toClass(testSuite, _suiteClassName);
    EList<JvmTypeReference> _superTypes = jvmClass.getSuperTypes();
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef("junit.framework.TestCase");
    this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      @Override
      public void apply(final JvmGenericType it) {
        EList<JvmMember> _members = jvmClass.getMembers();
        JvmTypeReference _typeRef = JexTestJvmModelInferrer.this._typeReferenceBuilder.typeRef("junit.framework.Test");
        final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          @Override
          public void apply(final JvmOperation it) {
            it.setStatic(true);
            it.setVisibility(JvmVisibility.PUBLIC);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
              @Override
              public void apply(final ITreeAppendable it) {
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("junit.framework.TestSuite suite = new junit.framework.TestSuite(\"");
                String _suiteClassName = testSuite.getSuiteClassName();
                _builder.append(_suiteClassName, "");
                _builder.append("\");");
                _builder.newLineIfNotEmpty();
                {
                  EList<JexTestCase> _testCases = testSuite.getTestCases();
                  for(final JexTestCase testCase : _testCases) {
                    _builder.append("\t");
                    _builder.append("suite.addTestSuite(");
                    String _testCaseClassName = JexTestJvmModelInferrer.this.testCaseClassName(testCase);
                    _builder.append(_testCaseClassName, "\t");
                    _builder.append(".class);");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("return suite;");
                _builder.newLine();
                it.append(_builder);
              }
            };
            JexTestJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
          }
        };
        JvmOperation _method = JexTestJvmModelInferrer.this._jvmTypesBuilder.toMethod(testSuite, "suite", _typeRef, _function);
        JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
        EList<Instance> _instances = testSuite.getInstances();
        for (final Instance instance : _instances) {
          EList<JvmMember> _members_1 = jvmClass.getMembers();
          String _name = instance.getName();
          JvmTypeReference _jvmType = JexTestJvmModelInferrer.this._util.jvmType(instance);
          final Procedure1<JvmField> _function_1 = new Procedure1<JvmField>() {
            @Override
            public void apply(final JvmField it) {
              it.setVisibility(JvmVisibility.DEFAULT);
              it.setStatic(true);
              XExpression _expr = instance.getExpr();
              JexTestJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _expr);
            }
          };
          JvmField _field = JexTestJvmModelInferrer.this._jvmTypesBuilder.toField(instance, _name, _jvmType, _function_1);
          JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field);
        }
        EList<StateFunction> _stateFunctions = testSuite.getStateFunctions();
        for (final StateFunction stateFunction : _stateFunctions) {
          JexTestJvmModelInferrer.this.inferStateFunctionMethods(stateFunction, jvmClass, true);
        }
        EList<Method> _methods = testSuite.getMethods();
        for (final Method method : _methods) {
          JexTestJvmModelInferrer.this.inferMethod(jvmClass, method, true);
        }
      }
    };
    acceptor.<JvmGenericType>accept(jvmClass, _function);
  }
  
  public boolean inferMethod(final JvmGenericType jvmClass, final Method method, final boolean isSuite) {
    boolean _xblockexpression = false;
    {
      String _elvis = null;
      String _name = method.getName();
      QualifiedName _create = QualifiedName.create(_name);
      QualifiedName _methodName = this._operatorMapping.getMethodName(_create);
      String _string = null;
      if (_methodName!=null) {
        _string=_methodName.toString();
      }
      if (_string != null) {
        _elvis = _string;
      } else {
        String _name_1 = method.getName();
        _elvis = _name_1;
      }
      final String methodName = _elvis;
      boolean _xifexpression = false;
      boolean _notEquals = (!Objects.equal(methodName, null));
      if (_notEquals) {
        EList<JvmMember> _members = jvmClass.getMembers();
        JvmTypeReference _returnType = method.getReturnType();
        final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          @Override
          public void apply(final JvmOperation it) {
            JvmVisibility _xifexpression = null;
            if (isSuite) {
              _xifexpression = JvmVisibility.DEFAULT;
            } else {
              _xifexpression = JvmVisibility.PRIVATE;
            }
            it.setVisibility(_xifexpression);
            it.setStatic(isSuite);
            EList<Parameter> _parameters = method.getParameters();
            JexTestJvmModelInferrer.this.initParameters(it, _parameters);
            XExpression _body = method.getBody();
            JexTestJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _body);
          }
        };
        JvmOperation _method = this._jvmTypesBuilder.toMethod(method, methodName, _returnType, _function);
        _xifexpression = this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String testCaseClassName(final JexTestCase testCase) {
    String _elvis = null;
    String _testedClassName = this._util.testedClassName(testCase);
    if (_testedClassName != null) {
      _elvis = _testedClassName;
    } else {
      String _testedClassName_1 = this._util.testedClassName(testCase);
      _elvis = _testedClassName_1;
    }
    return (_elvis + "Test");
  }
  
  protected void _infer(final JexTestCase testCase, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    this.inferTestCase(testCase, acceptor);
  }
  
  public JvmGenericType inferTestCase(final JexTestCase testCase, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xblockexpression = null;
    {
      String _testCaseClassName = this.testCaseClassName(testCase);
      String _prependPackageName = this._util.prependPackageName(_testCaseClassName, testCase);
      final JvmGenericType jvmClass = this._jvmTypesBuilder.toClass(testCase, _prependPackageName);
      EList<JvmTypeReference> _superTypes = jvmClass.getSuperTypes();
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef("junit.framework.TestCase");
      this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
      EList<TestedClass> _testedClasses = testCase.getTestedClasses();
      for (final TestedClass testedClass : _testedClasses) {
        this.inferTestedClass(testedClass, acceptor);
      }
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        @Override
        public void apply(final JvmGenericType it) {
          final JvmAnnotationReference jexerciseTestCaseAnnotation = JexTestJvmModelInferrer.this._annotationTypesBuilder.annotationRef("no.hal.jex.runtime.JExercise");
          JexTestJvmModelInferrer.this._testAnnotationsSupport.generateTestClassAnntations(testCase, jexerciseTestCaseAnnotation);
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, jexerciseTestCaseAnnotation);
          final JexTestSuite testSuite = JexTestJvmModelInferrer.this._util.<JexTestSuite>ancestor(testCase, JexTestSuite.class);
          boolean _notEquals = (!Objects.equal(testSuite, null));
          if (_notEquals) {
            EList<Instance> _instances = testSuite.getInstances();
            for (final Instance instance : _instances) {
              EList<JvmMember> _members = jvmClass.getMembers();
              String _name = instance.getName();
              JvmTypeReference _jvmType = JexTestJvmModelInferrer.this._util.jvmType(instance);
              final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
                @Override
                public void apply(final JvmField it) {
                  it.setVisibility(JvmVisibility.PRIVATE);
                  final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    @Override
                    public void apply(final ITreeAppendable it) {
                      String _suiteClassName = testSuite.getSuiteClassName();
                      String _plus = (_suiteClassName + ".");
                      String _name = instance.getName();
                      String _plus_1 = (_plus + _name);
                      it.append(_plus_1);
                    }
                  };
                  JexTestJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _function);
                }
              };
              JvmField _field = JexTestJvmModelInferrer.this._jvmTypesBuilder.toField(instance, _name, _jvmType, _function);
              JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
            }
            EList<StateFunction> _stateFunctions = testSuite.getStateFunctions();
            for (final StateFunction stateFunction : _stateFunctions) {
              JexTestJvmModelInferrer.this.inferStateFunctionMethods(stateFunction, jvmClass, false);
            }
          }
          boolean _isDefaultInstanceTest = JexTestJvmModelInferrer.this._util.isDefaultInstanceTest(testCase);
          if (_isDefaultInstanceTest) {
            EList<JvmMember> _members_1 = jvmClass.getMembers();
            String _defaultInstanceName = JexTestJvmModelInferrer.this._util.defaultInstanceName(testCase);
            JvmTypeReference _testedJvmTypeRef = JexTestJvmModelInferrer.this._util.testedJvmTypeRef(testCase);
            final Procedure1<JvmField> _function_1 = new Procedure1<JvmField>() {
              @Override
              public void apply(final JvmField it) {
                it.setVisibility(JvmVisibility.PRIVATE);
              }
            };
            JvmField _field_1 = JexTestJvmModelInferrer.this._jvmTypesBuilder.toField(testCase, _defaultInstanceName, _testedJvmTypeRef, _function_1);
            JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
          } else {
            EList<Instance> _instances_1 = testCase.getInstances();
            for (final Instance instance_1 : _instances_1) {
              {
                final JvmTypeReference type = JexTestJvmModelInferrer.this._util.jvmType(instance_1);
                EList<JvmMember> _members_2 = jvmClass.getMembers();
                String _name_1 = instance_1.getName();
                final Procedure1<JvmField> _function_2 = new Procedure1<JvmField>() {
                  @Override
                  public void apply(final JvmField it) {
                    it.setVisibility(JvmVisibility.PRIVATE);
                  }
                };
                JvmField _field_2 = JexTestJvmModelInferrer.this._jvmTypesBuilder.toField(instance_1, _name_1, type, _function_2);
                JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_2, _field_2);
                EList<JvmMember> _members_3 = it.getMembers();
                String _name_2 = instance_1.getName();
                String _plus = ("_init_" + _name_2);
                JvmOperation _inferTestInstanceInitMethod = JexTestJvmModelInferrer.this.inferTestInstanceInitMethod(_plus, instance_1);
                JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _inferTestInstanceInitMethod);
              }
            }
          }
          EList<JvmMember> _members_2 = jvmClass.getMembers();
          JvmTypeReference _typeRef = JexTestJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
          final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
            @Override
            public void apply(final JvmOperation it) {
              it.setVisibility(JvmVisibility.PROTECTED);
              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
              JvmAnnotationReference _annotationRef = JexTestJvmModelInferrer.this._annotationTypesBuilder.annotationRef(Override.class);
              JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
              final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                @Override
                public void apply(final ITreeAppendable it) {
                  JexTestJvmModelInferrer.this.generateSetUpMethodBody(testCase, it);
                }
              };
              JexTestJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
            }
          };
          JvmOperation _method = JexTestJvmModelInferrer.this._jvmTypesBuilder.toMethod(testCase, "setUp", _typeRef, _function_2);
          JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method);
          EList<Method> _methods = testCase.getMethods();
          for (final Method method : _methods) {
            JexTestJvmModelInferrer.this.inferMethod(jvmClass, method, false);
          }
          EList<StateFunction> _stateFunctions_1 = testCase.getStateFunctions();
          for (final StateFunction stateFunction_1 : _stateFunctions_1) {
            JexTestJvmModelInferrer.this.inferStateFunctionMethods(stateFunction_1, jvmClass, false);
          }
          final ArrayList<Pair<JexTestSequence, JvmOperation>> testMethods = CollectionLiterals.<Pair<JexTestSequence, JvmOperation>>newArrayList();
          EList<JexTestSequence> _testSequences = testCase.getTestSequences();
          for (final JexTestSequence sequence : _testSequences) {
            String _name_1 = sequence.getName();
            boolean _notEquals_1 = (!Objects.equal(_name_1, null));
            if (_notEquals_1) {
              String _name_2 = sequence.getName();
              String _firstUpper = StringExtensions.toFirstUpper(_name_2);
              String _plus = ("test" + _firstUpper);
              JvmTypeReference _typeRef_1 = JexTestJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
              final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
                @Override
                public void apply(final JvmOperation it) {
                  it.setVisibility(JvmVisibility.PUBLIC);
                  final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    @Override
                    public void apply(final ITreeAppendable it) {
                      EList<Instance> _instances = sequence.getInstances();
                      for (final Instance instance : _instances) {
                        JexTestJvmModelInferrer.this.generateLocalInstance(instance, it);
                      }
                      EList<Transition> _transitions = sequence.getTransitions();
                      for (final Transition transition : _transitions) {
                        JexTestJvmModelInferrer.this.generateTransition(transition, it);
                      }
                    }
                  };
                  JexTestJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
                }
              };
              final JvmOperation testMethod = JexTestJvmModelInferrer.this._jvmTypesBuilder.toMethod(sequence, _plus, _typeRef_1, _function_3);
              Pair<JexTestSequence, JvmOperation> _mappedTo = Pair.<JexTestSequence, JvmOperation>of(sequence, testMethod);
              testMethods.add(_mappedTo);
              EList<JvmMember> _members_3 = it.getMembers();
              JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, testMethod);
            }
          }
          EList<JvmMember> _members_4 = it.getMembers();
          final Function1<Pair<JexTestSequence, JvmOperation>, JvmOperation> _function_4 = new Function1<Pair<JexTestSequence, JvmOperation>, JvmOperation>() {
            @Override
            public JvmOperation apply(final Pair<JexTestSequence, JvmOperation> it) {
              return it.getValue();
            }
          };
          List<JvmOperation> _map = ListExtensions.<Pair<JexTestSequence, JvmOperation>, JvmOperation>map(testMethods, _function_4);
          JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmMember>operator_add(_members_4, _map);
          EList<JexTestSequence> _testSequences_1 = testCase.getTestSequences();
          for (final JexTestSequence sequence_1 : _testSequences_1) {
            {
              EList<Instance> _instances_2 = sequence_1.getInstances();
              for (final Instance instance_2 : _instances_2) {
                EList<JvmMember> _members_5 = it.getMembers();
                String _relativeName = JexTestJvmModelInferrer.this._util.<JexTestSequence>relativeName(instance_2, JexTestSequence.class);
                String _plus_1 = ("_init_" + _relativeName);
                JvmOperation _inferTestInstanceInitMethod = JexTestJvmModelInferrer.this.inferTestInstanceInitMethod(_plus_1, instance_2);
                JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_5, _inferTestInstanceInitMethod);
              }
              EList<Transition> _transitions = sequence_1.getTransitions();
              for (final Transition transition : _transitions) {
                {
                  boolean _and = false;
                  TransitionSource _source = transition.getSource();
                  boolean _notEquals_2 = (!Objects.equal(_source, null));
                  if (!_notEquals_2) {
                    _and = false;
                  } else {
                    TransitionSource _source_1 = transition.getSource();
                    State _state = _source_1.getState();
                    boolean _notEquals_3 = (!Objects.equal(_state, null));
                    _and = _notEquals_3;
                  }
                  if (_and) {
                    TransitionSource _source_2 = transition.getSource();
                    State _state_1 = _source_2.getState();
                    JexTestJvmModelInferrer.this.inferStateTestMethods(sequence_1, _state_1, jvmClass);
                  }
                  EList<TransitionAction> _actions = transition.getActions();
                  Iterable<TransitionExpressionAction> _filter = Iterables.<TransitionExpressionAction>filter(_actions, TransitionExpressionAction.class);
                  for (final TransitionExpressionAction action : _filter) {
                    {
                      EList<JvmMember> _members_6 = it.getMembers();
                      JvmOperation _inferActionMethod = JexTestJvmModelInferrer.this.inferActionMethod(sequence_1, action);
                      JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_6, _inferActionMethod);
                      XExpression _times = action.getTimes();
                      boolean _notEquals_4 = (!Objects.equal(_times, null));
                      if (_notEquals_4) {
                        EList<JvmMember> _members_7 = it.getMembers();
                        XExpression _times_1 = action.getTimes();
                        JvmOperation _inferTestHelperMethod = JexTestJvmModelInferrer.this.inferTestHelperMethod(sequence_1, "_transition_exprAction_times_", action, _times_1, null);
                        JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_7, _inferTestHelperMethod);
                      }
                    }
                  }
                  TransitionEffect _effect = transition.getEffect();
                  if ((_effect instanceof TransitionTargetEffect)) {
                    TransitionEffect _effect_1 = transition.getEffect();
                    final TransitionTargetEffect targetEffect = ((TransitionTargetEffect) _effect_1);
                    State _state_2 = targetEffect.getState();
                    boolean _notEquals_4 = (!Objects.equal(_state_2, null));
                    if (_notEquals_4) {
                      State _state_3 = targetEffect.getState();
                      JexTestJvmModelInferrer.this.inferStateTestMethods(sequence_1, _state_3, jvmClass);
                    }
                  }
                }
              }
            }
          }
          for (final Pair<JexTestSequence, JvmOperation> sequenceMethod : testMethods) {
            {
              final JvmAnnotationReference jexerciseTestMethodAnnotation = JexTestJvmModelInferrer.this._annotationTypesBuilder.annotationRef("no.hal.jex.runtime.JExercise");
              JexTestSequence _key = sequenceMethod.getKey();
              JexTestJvmModelInferrer.this._testAnnotationsSupport.generateTestMethodAnntations(_key, jexerciseTestMethodAnnotation);
              JvmOperation _value = sequenceMethod.getValue();
              EList<JvmAnnotationReference> _annotations_1 = _value.getAnnotations();
              JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, jexerciseTestMethodAnnotation);
            }
          }
          EList<JvmMember> _members_5 = it.getMembers();
          JvmTypeReference _typeRef_2 = JexTestJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
          final Procedure1<JvmOperation> _function_5 = new Procedure1<JvmOperation>() {
            @Override
            public void apply(final JvmOperation it) {
              it.setVisibility(JvmVisibility.PUBLIC);
              it.setStatic(true);
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeRef = JexTestJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
              JvmTypeReference _addArrayTypeDimension = JexTestJvmModelInferrer.this._jvmTypesBuilder.addArrayTypeDimension(_typeRef);
              JvmFormalParameter _parameter = JexTestJvmModelInferrer.this._jvmTypesBuilder.toParameter(testCase, "args", _addArrayTypeDimension);
              JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                @Override
                public void apply(final ITreeAppendable it) {
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("no.hal.jex.standalone.JexStandalone.main(");
                  String _simpleName = jvmClass.getSimpleName();
                  _builder.append(_simpleName, "");
                  _builder.append(".class);");
                  it.append(_builder);
                }
              };
              JexTestJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
            }
          };
          JvmOperation _method_1 = JexTestJvmModelInferrer.this._jvmTypesBuilder.toMethod(testCase, "main", _typeRef_2, _function_5);
          JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_5, _method_1);
        }
      };
      acceptor.<JvmGenericType>accept(jvmClass, _function);
      _xblockexpression = jvmClass;
    }
    return _xblockexpression;
  }
  
  public IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> inferTestedClass(final TestedClass testedClass, final IJvmDeclaredTypeAcceptor acceptor) {
    IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _xblockexpression = null;
    {
      String _name = testedClass.getName();
      String _prependPackageName = this._util.prependPackageName(_name, testedClass);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        @Override
        public void apply(final JvmGenericType it) {
          boolean _isInterface = testedClass.isInterface();
          it.setInterface(_isInterface);
          boolean _isAbstract = testedClass.isAbstract();
          it.setAbstract(_isAbstract);
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          JvmParameterizedTypeReference _superClass = testedClass.getSuperClass();
          JvmTypeReference _cloneWithProxies = JexTestJvmModelInferrer.this._jvmTypesBuilder.cloneWithProxies(_superClass);
          JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _cloneWithProxies);
          EList<JvmParameterizedTypeReference> _superInterfaces = testedClass.getSuperInterfaces();
          for (final JvmParameterizedTypeReference superInterface : _superInterfaces) {
            EList<JvmTypeReference> _superTypes_1 = it.getSuperTypes();
            JvmTypeReference _cloneWithProxies_1 = JexTestJvmModelInferrer.this._jvmTypesBuilder.cloneWithProxies(superInterface);
            JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes_1, _cloneWithProxies_1);
          }
        }
      };
      final JvmGenericType jvmTestedClass = this._jvmTypesBuilder.toClass(testedClass, _prependPackageName, _function);
      EList<TestedOperation> _methods = testedClass.getMethods();
      for (final TestedOperation op : _methods) {
        {
          JvmExecutable _xifexpression = null;
          if ((op instanceof TestedConstructor)) {
            final Procedure1<JvmConstructor> _function_1 = new Procedure1<JvmConstructor>() {
              @Override
              public void apply(final JvmConstructor it) {
              }
            };
            _xifexpression = this._jvmTypesBuilder.toConstructor(op, _function_1);
          } else {
            JvmOperation _xifexpression_1 = null;
            if ((op instanceof TestedMethod)) {
              String _name_1 = ((TestedMethod)op).getName();
              JvmParameterizedTypeReference _returnType = ((TestedMethod)op).getReturnType();
              final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
                @Override
                public void apply(final JvmOperation it) {
                  boolean _or = false;
                  boolean _isAbstract = ((TestedMethod)op).isAbstract();
                  if (_isAbstract) {
                    _or = true;
                  } else {
                    boolean _isInterface = jvmTestedClass.isInterface();
                    _or = _isInterface;
                  }
                  it.setAbstract(_or);
                }
              };
              _xifexpression_1 = this._jvmTypesBuilder.toMethod(op, _name_1, _returnType, _function_2);
            }
            _xifexpression = _xifexpression_1;
          }
          final JvmExecutable jvmMethod = _xifexpression;
          jvmMethod.setVisibility(JvmVisibility.PUBLIC);
          EList<Parameter> _parameterTypes = op.getParameterTypes();
          this.initParameters(jvmMethod, _parameterTypes);
          EList<JvmMember> _members = jvmTestedClass.getMembers();
          this._jvmTypesBuilder.<JvmExecutable>operator_add(_members, jvmMethod);
        }
      }
      _xblockexpression = acceptor.<JvmGenericType>accept(jvmTestedClass);
    }
    return _xblockexpression;
  }
  
  private boolean checkDiagnosticInCompiler = true;
  
  public JvmOperation inferTestInstanceInitMethod(final String name, final Instance instance) {
    JvmOperation _xblockexpression = null;
    {
      JvmTypeReference _jvmType = this._util.jvmType(instance);
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        @Override
        public void apply(final JvmOperation it) {
          it.setVisibility(JvmVisibility.PRIVATE);
        }
      };
      final JvmOperation method = this._jvmTypesBuilder.toMethod(instance, name, _jvmType, _function);
      XExpression _expr = instance.getExpr();
      boolean _equals = Objects.equal(_expr, null);
      if (_equals) {
        final Procedure1<ITreeAppendable> _function_1 = new Procedure1<ITreeAppendable>() {
          @Override
          public void apply(final ITreeAppendable it) {
            it.append("return new ");
            JvmTypeReference _jvmType = JexTestJvmModelInferrer.this._util.jvmType(instance);
            JexTestJvmModelInferrer.this._typeReferenceSerializer.serialize(_jvmType, instance, it);
            ITreeAppendable _append = it.append("();");
            _append.newLine();
          }
        };
        this._jvmTypesBuilder.setBody(method, _function_1);
      } else {
        if (this.checkDiagnosticInCompiler) {
          XExpression _expr_1 = instance.getExpr();
          this._jvmTypesBuilder.setBody(method, _expr_1);
        } else {
          final Procedure1<ITreeAppendable> _function_2 = new Procedure1<ITreeAppendable>() {
            @Override
            public void apply(final ITreeAppendable it) {
              XExpression _expr = instance.getExpr();
              boolean _hasDiagnostic = JexTestJvmModelInferrer.this._util.hasDiagnostic(_expr);
              if (_hasDiagnostic) {
                XExpression _expr_1 = instance.getExpr();
                JexTestJvmModelInferrer.this._util.generateUnsupportedOperationException(_expr_1, it);
              } else {
                XExpression _expr_2 = instance.getExpr();
                JexTestJvmModelInferrer.this._xbaseCompiler.toJavaExpression(_expr_2, it);
                it.append("return ");
                XExpression _expr_3 = instance.getExpr();
                JexTestJvmModelInferrer.this._xbaseCompiler.toJavaExpression(_expr_3, it);
                ITreeAppendable _append = it.append(";");
                _append.newLine();
              }
            }
          };
          this._jvmTypesBuilder.setBody(method, _function_2);
        }
      }
      _xblockexpression = method;
    }
    return _xblockexpression;
  }
  
  public void initParameters(final JvmExecutable op, final Iterable<Parameter> parameters) {
    int paramNum = 1;
    for (final Parameter parameter : parameters) {
      {
        String _elvis = null;
        String _name = parameter.getName();
        if (_name != null) {
          _elvis = _name;
        } else {
          _elvis = ("arg" + Integer.valueOf(paramNum));
        }
        JvmTypeReference _type = parameter.getType();
        final JvmFormalParameter formalParameter = this._jvmTypesBuilder.toParameter(parameter, _elvis, _type);
        boolean _isVararg = parameter.isVararg();
        if (_isVararg) {
          JvmTypeReference _parameterType = formalParameter.getParameterType();
          JvmTypeReference _addArrayTypeDimension = this._jvmTypesBuilder.addArrayTypeDimension(_parameterType);
          formalParameter.setParameterType(_addArrayTypeDimension);
          op.setVarArgs(true);
        }
        EList<JvmFormalParameter> _parameters = op.getParameters();
        this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, formalParameter);
        paramNum++;
      }
    }
  }
  
  public ITreeAppendable generateSetUpMethodBody(final JexTestCase testCase, final ITreeAppendable appendable) {
    ITreeAppendable _xifexpression = null;
    boolean _isDefaultInstanceTest = this._util.isDefaultInstanceTest(testCase);
    if (_isDefaultInstanceTest) {
      ITreeAppendable _xblockexpression = null;
      {
        StringConcatenation _builder = new StringConcatenation();
        String _defaultInstanceName = this._util.defaultInstanceName(testCase);
        _builder.append(_defaultInstanceName, "");
        _builder.append(" = new ");
        appendable.append(_builder);
        JvmTypeReference _defaultInstanceType = this._util.defaultInstanceType(testCase);
        this._typeReferenceSerializer.serialize(_defaultInstanceType, testCase, appendable);
        ITreeAppendable _append = appendable.append("();");
        _xblockexpression = _append.newLine();
      }
      _xifexpression = _xblockexpression;
    } else {
      EList<Instance> _instances = testCase.getInstances();
      for (final Instance instance : _instances) {
        StringConcatenation _builder = new StringConcatenation();
        String _name = instance.getName();
        _builder.append(_name, "");
        _builder.append(" = _init_");
        String _name_1 = instance.getName();
        _builder.append(_name_1, "");
        _builder.append("();");
        ITreeAppendable _append = appendable.append(_builder);
        _append.newLine();
      }
    }
    return _xifexpression;
  }
  
  public void inferStateFunctionMethods(final StateFunction stateFunction, final JvmGenericType jvmClass, final boolean isSuite) {
    final TestMemberContext testMemberContext = this._util.<TestMemberContext>ancestor(stateFunction, TestMemberContext.class);
    boolean _and = false;
    String _name = stateFunction.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _or = false;
      JvmParameterizedTypeReference _type = stateFunction.getType();
      boolean _notEquals_1 = (!Objects.equal(_type, null));
      if (_notEquals_1) {
        _or = true;
      } else {
        _or = (testMemberContext instanceof JexTestCase);
      }
      _and = _or;
    }
    if (_and) {
      EList<JvmMember> _members = jvmClass.getMembers();
      String _name_1 = stateFunction.getName();
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(void.class);
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        @Override
        public void apply(final JvmOperation it) {
          JvmVisibility _xifexpression = null;
          if (isSuite) {
            _xifexpression = JvmVisibility.DEFAULT;
          } else {
            _xifexpression = JvmVisibility.PRIVATE;
          }
          it.setVisibility(_xifexpression);
          it.setStatic(isSuite);
          EList<JvmFormalParameter> _parameters = it.getParameters();
          JvmTypeReference _elvis = null;
          JvmParameterizedTypeReference _type = stateFunction.getType();
          if (_type != null) {
            _elvis = _type;
          } else {
            JvmTypeReference _testedJvmTypeRef = JexTestJvmModelInferrer.this._util.testedJvmTypeRef(((JexTestCase) testMemberContext));
            _elvis = _testedJvmTypeRef;
          }
          JvmFormalParameter _parameter = JexTestJvmModelInferrer.this._jvmTypesBuilder.toParameter(stateFunction, "it", _elvis);
          JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
          EList<Parameter> _parameters_1 = stateFunction.getParameters();
          JexTestJvmModelInferrer.this.initParameters(it, _parameters_1);
          final JvmOperation method = it;
          final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
            @Override
            public void apply(final ITreeAppendable it) {
              boolean _and = false;
              if (!(!isSuite)) {
                _and = false;
              } else {
                _and = (testMemberContext instanceof JexTestSuite);
              }
              if (_and) {
                JexTestJvmModelInferrer.this.generateSuiteMethodCall(((JexTestSuite) testMemberContext), method, it);
              } else {
                XBlockExpression _test = stateFunction.getTest();
                JexTestJvmModelInferrer.this.generateTestHelperMethodCall("_test_", ((PropertiesTest) _test), it);
              }
            }
          };
          JexTestJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
        }
      };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(stateFunction, _name_1, _typeRef, _function);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      XBlockExpression _test = stateFunction.getTest();
      boolean _notEquals_2 = (!Objects.equal(_test, null));
      if (_notEquals_2) {
        XBlockExpression _test_1 = stateFunction.getTest();
        this.inferPropertiesTestMethods(((PropertiesTest) _test_1), jvmClass);
      }
    }
  }
  
  public void inferStateTestMethods(final StateTestContext stateTestContext, final State state, final JvmGenericType jvmClass) {
    EList<JvmMember> _members = jvmClass.getMembers();
    final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
      @Override
      public void apply(final ITreeAppendable it) {
        final ITreeAppendable appendable = it;
        EList<ObjectTest> _objectTests = state.getObjectTests();
        for (final ObjectTest objectTest : _objectTests) {
          XBlockExpression _test = objectTest.getTest();
          JexTestJvmModelInferrer.this.generateTestHelperMethodCall("_test_", _test, appendable);
        }
      }
    };
    JvmOperation _inferTestHelperMethod = this.inferTestHelperMethod(stateTestContext, "_test_", state, _function);
    this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _inferTestHelperMethod);
    EList<ObjectTest> _objectTests = state.getObjectTests();
    for (final ObjectTest objectTest : _objectTests) {
      XBlockExpression _test = objectTest.getTest();
      this.inferPropertiesTestMethods(((PropertiesTest) _test), jvmClass);
    }
  }
  
  public JvmOperation inferActionMethod(final StateTestContext stateTestContext, final TransitionExpressionAction action) {
    JvmOperation _xblockexpression = null;
    {
      String _relativeName = this._util.<JexTestSequence>relativeName(action, JexTestSequence.class);
      String _plus = ("_transition_exprAction_" + _relativeName);
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(void.class);
      final JvmOperation method = this.inferTestHelperMethod(stateTestContext, _plus, _typeRef, action);
      XExpression _expr = action.getExpr();
      this._iJvmModelAssociator.associateLogicalContainer(_expr, method);
      final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
        @Override
        public void apply(final ITreeAppendable it) {
          XExpression _expr = action.getExpr();
          JexTestJvmModelInferrer.this.generateAssertCall(action, _expr, it, true);
        }
      };
      this._jvmTypesBuilder.setBody(method, _function);
      _xblockexpression = method;
    }
    return _xblockexpression;
  }
  
  public JvmOperation inferTestHelperMethod(final StateTestContext innerStateTestContext, final String name, final JvmTypeReference type, final EObject context) {
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
      @Override
      public void apply(final JvmOperation it) {
        it.setVisibility(JvmVisibility.PRIVATE);
        TestMemberContext _ancestor = JexTestJvmModelInferrer.this._util.<TestMemberContext>ancestor(innerStateTestContext, TestMemberContext.class);
        it.setStatic((_ancestor instanceof JexTestSuite));
        final JvmTypeReference instanceType = JexTestJvmModelInferrer.this._util.jvmInstanceType(context);
        boolean _notEquals = (!Objects.equal(instanceType, null));
        if (_notEquals) {
          EList<JvmFormalParameter> _parameters = it.getParameters();
          JvmFormalParameter _parameter = JexTestJvmModelInferrer.this._jvmTypesBuilder.toParameter(context, "it", instanceType);
          JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        }
        StateTestContext stateTestContext = innerStateTestContext;
        if ((stateTestContext instanceof StateFunction)) {
          EList<Parameter> _parameters_1 = ((StateFunction)stateTestContext).getParameters();
          JexTestJvmModelInferrer.this.initParameters(it, _parameters_1);
          StateTestContext _ancestor_1 = JexTestJvmModelInferrer.this._util.<StateTestContext>ancestor(stateTestContext, StateTestContext.class);
          stateTestContext = _ancestor_1;
        }
        if ((stateTestContext instanceof JexTestSequence)) {
          EList<Instance> _instances = ((JexTestSequence)stateTestContext).getInstances();
          for (final Instance instance : _instances) {
            EList<JvmFormalParameter> _parameters_2 = it.getParameters();
            String _name = instance.getName();
            JvmTypeReference _jvmType = JexTestJvmModelInferrer.this._util.jvmType(instance);
            JvmFormalParameter _parameter_1 = JexTestJvmModelInferrer.this._jvmTypesBuilder.toParameter(instance, _name, _jvmType);
            JexTestJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_2, _parameter_1);
          }
        }
      }
    };
    return this._jvmTypesBuilder.toMethod(context, name, type, _function);
  }
  
  public JvmOperation inferTestHelperMethod(final StateTestContext stateTestContext, final String prefix, final EObject context, final XExpression expr, final Procedure1<? super ITreeAppendable> generator) {
    JvmOperation _xblockexpression = null;
    {
      String _relativeName = this._util.<JexTestSequence>relativeName(context, JexTestSequence.class);
      String _plus = (prefix + _relativeName);
      final JvmOperation method = this.inferTestHelperMethod(stateTestContext, _plus, null, context);
      boolean _notEquals = (!Objects.equal(expr, null));
      if (_notEquals) {
        boolean _notEquals_1 = (!Objects.equal(generator, null));
        if (_notEquals_1) {
          this._iJvmModelAssociator.associateLogicalContainer(expr, method);
          this._jvmTypesBuilder.setBody(method, ((Procedure1<ITreeAppendable>)generator));
        } else {
          this._jvmTypesBuilder.setBody(method, expr);
        }
      }
      _xblockexpression = method;
    }
    return _xblockexpression;
  }
  
  public JvmOperation inferTestHelperMethod(final StateTestContext stateTestContext, final String prefix, final EObject context, final Procedure1<? super ITreeAppendable> initializer) {
    JvmOperation _xblockexpression = null;
    {
      String _relativeName = this._util.<JexTestSequence>relativeName(context, JexTestSequence.class);
      String _plus = (prefix + _relativeName);
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(void.class);
      final JvmOperation method = this.inferTestHelperMethod(stateTestContext, _plus, _typeRef, context);
      final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
        @Override
        public void apply(final ITreeAppendable it) {
          initializer.apply(it);
        }
      };
      this._jvmTypesBuilder.setBody(method, _function);
      _xblockexpression = method;
    }
    return _xblockexpression;
  }
  
  public ITreeAppendable generateTestHelperMethodCall(final String prefix, final EObject eObject, final ITreeAppendable appendable, final boolean asStatement, final boolean newline) {
    ITreeAppendable _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(prefix, "");
      String _relativeName = this._util.<StateTestContext>relativeName(eObject, StateTestContext.class);
      _builder.append(_relativeName, "");
      _builder.append("(");
      appendable.append(_builder);
      final String instanceName = this._util.instanceName(eObject);
      String separator = "";
      boolean _notEquals = (!Objects.equal(instanceName, null));
      if (_notEquals) {
        appendable.append(instanceName);
        separator = ", ";
      }
      StateTestContext stateTestContext = this._util.<StateTestContext>ancestor(eObject, StateTestContext.class);
      if ((stateTestContext instanceof StateFunction)) {
        EList<Parameter> _parameters = ((StateFunction)stateTestContext).getParameters();
        final Function1<Parameter, CharSequence> _function = new Function1<Parameter, CharSequence>() {
          @Override
          public CharSequence apply(final Parameter it) {
            return it.getName();
          }
        };
        String _join = IterableExtensions.<Parameter>join(_parameters, separator, ", ", "", _function);
        appendable.append(_join);
        StateTestContext _ancestor = this._util.<StateTestContext>ancestor(stateTestContext, StateTestContext.class);
        stateTestContext = _ancestor;
      }
      if ((stateTestContext instanceof JexTestSequence)) {
        EList<Instance> _instances = ((JexTestSequence)stateTestContext).getInstances();
        final Function1<Instance, CharSequence> _function_1 = new Function1<Instance, CharSequence>() {
          @Override
          public CharSequence apply(final Instance it) {
            return it.getName();
          }
        };
        String _join_1 = IterableExtensions.<Instance>join(_instances, separator, ", ", "", _function_1);
        appendable.append(_join_1);
      }
      appendable.append(")");
      if (asStatement) {
        appendable.append(";");
      }
      ITreeAppendable _xifexpression = null;
      if (newline) {
        _xifexpression = appendable.newLine();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public ITreeAppendable generateSuiteMethodCall(final JexTestSuite testSuite, final JvmExecutable op, final ITreeAppendable appendable) {
    ITreeAppendable _xblockexpression = null;
    {
      String _suiteClassName = testSuite.getSuiteClassName();
      String _plus = (_suiteClassName + ".");
      String _simpleName = op.getSimpleName();
      final String suiteMethodName = (_plus + _simpleName);
      EList<JvmFormalParameter> _parameters = op.getParameters();
      final Function1<JvmFormalParameter, CharSequence> _function = new Function1<JvmFormalParameter, CharSequence>() {
        @Override
        public CharSequence apply(final JvmFormalParameter it) {
          return it.getName();
        }
      };
      String _join = IterableExtensions.<JvmFormalParameter>join(_parameters, (suiteMethodName + "("), ",", ");", _function);
      _xblockexpression = appendable.append(_join);
    }
    return _xblockexpression;
  }
  
  public ITreeAppendable generateTestHelperMethodCall(final String prefix, final EObject eObject, final ITreeAppendable appendable) {
    return this.generateTestHelperMethodCall(prefix, eObject, appendable, true, true);
  }
  
  public ITreeAppendable generateLocalInstance(final Instance instance, final ITreeAppendable appendable) {
    ITreeAppendable _xblockexpression = null;
    {
      final JvmTypeReference instanceType = this._util.jvmType(instance);
      this._typeReferenceSerializer.serialize(instanceType, instance, appendable);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      String _name = instance.getName();
      _builder.append(_name, " ");
      _builder.append(" = _init_");
      String _relativeName = this._util.<JexTestSequence>relativeName(instance, JexTestSequence.class);
      _builder.append(_relativeName, " ");
      _builder.append("();");
      appendable.append(_builder);
      _xblockexpression = appendable.newLine();
    }
    return _xblockexpression;
  }
  
  public ITreeAppendable generateStateTesterCall(final State state, final State stateRef, final ITreeAppendable appendable) {
    ITreeAppendable _xblockexpression = null;
    {
      State theState = state;
      boolean _equals = Objects.equal(theState, null);
      if (_equals) {
        theState = stateRef;
      }
      ITreeAppendable _xifexpression = null;
      boolean _notEquals = (!Objects.equal(theState, null));
      if (_notEquals) {
        _xifexpression = this.generateTestHelperMethodCall("_test_", theState, appendable);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public void generateTransition(final Transition transition, final ITreeAppendable appendable) {
    TransitionSource _source = transition.getSource();
    boolean _notEquals = (!Objects.equal(_source, null));
    if (_notEquals) {
      TransitionSource _source_1 = transition.getSource();
      State _state = _source_1.getState();
      TransitionSource _source_2 = transition.getSource();
      State _stateRef = _source_2.getStateRef();
      this.generateStateTesterCall(_state, _stateRef, appendable);
    }
    TransitionEffect _effect = transition.getEffect();
    this.generateTransitionActionsEffect(_effect, transition, appendable);
  }
  
  protected void _generateTransitionActionsEffect(final TransitionEffect effect, final Transition transition, final ITreeAppendable appendable) {
    EList<TransitionAction> _actions = transition.getActions();
    for (final TransitionAction action : _actions) {
      this.generateTransitionAction(action, transition, appendable);
    }
  }
  
  protected void _generateTransitionActionsEffect(final TransitionExceptionEffect effect, final Transition transition, final ITreeAppendable appendable) {
    TransitionEffect _effect = transition.getEffect();
    if ((_effect instanceof TransitionExceptionEffect)) {
      ITreeAppendable _append = appendable.append("try {");
      ITreeAppendable _increaseIndentation = _append.increaseIndentation();
      _increaseIndentation.newLine();
    }
    this._generateTransitionActionsEffect(((TransitionEffect) effect), transition, appendable);
    TransitionEffect _effect_1 = transition.getEffect();
    if ((_effect_1 instanceof TransitionExceptionEffect)) {
      TransitionEffect _effect_2 = transition.getEffect();
      final JvmParameterizedTypeReference exceptionClass = ((TransitionExceptionEffect) _effect_2).getExceptionClass();
      String _qualifiedName = exceptionClass.getQualifiedName();
      final String exceptionClassName = this._util.removeJavaLang(_qualifiedName);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(exceptionClassName, "");
      _builder.append(" should be thrown after ");
      EList<TransitionAction> _actions = transition.getActions();
      String _asSourceText = this._util.asSourceText(_actions, ", ");
      _builder.append(_asSourceText, "");
      final String message = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("fail(\"");
      String _quote = this._util.quote(message, "\"");
      _builder_1.append(_quote, "");
      _builder_1.append("\");");
      appendable.append(_builder_1);
      ITreeAppendable _decreaseIndentation = appendable.decreaseIndentation();
      ITreeAppendable _newLine = _decreaseIndentation.newLine();
      _newLine.append("}");
      String exceptionVar = appendable.declareSyntheticVariable(transition, "e");
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(" ");
      _builder_2.append("catch (Exception ");
      _builder_2.append(exceptionVar, " ");
      _builder_2.append(") {");
      ITreeAppendable _append_1 = appendable.append(_builder_2);
      ITreeAppendable _increaseIndentation_1 = _append_1.increaseIndentation();
      _increaseIndentation_1.newLine();
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("assertTrue(\"");
      String _quote_1 = this._util.quote(message, "\"");
      _builder_3.append(_quote_1, "");
      _builder_3.append("\", ");
      _builder_3.append(exceptionVar, "");
      _builder_3.append(" instanceof ");
      _builder_3.append(exceptionClassName, "");
      _builder_3.append(");");
      appendable.append(_builder_3);
      ITreeAppendable _decreaseIndentation_1 = appendable.decreaseIndentation();
      ITreeAppendable _newLine_1 = _decreaseIndentation_1.newLine();
      ITreeAppendable _append_2 = _newLine_1.append("}");
      _append_2.newLine();
    }
  }
  
  protected void _generateTransitionActionsEffect(final TransitionTargetEffect effect, final Transition transition, final ITreeAppendable appendable) {
    this._generateTransitionActionsEffect(((TransitionEffect) effect), transition, appendable);
    State _state = effect.getState();
    State _stateRef = effect.getStateRef();
    this.generateStateTesterCall(_state, _stateRef, appendable);
  }
  
  protected void _generateTransitionAction(final TransitionAction action, final Transition transition, final ITreeAppendable appendable) {
  }
  
  protected void _generateTransitionAction(final TransitionExpressionAction action, final Transition transition, final ITreeAppendable appendable) {
    String _xifexpression = null;
    XExpression _times = action.getTimes();
    boolean _notEquals = (!Objects.equal(_times, null));
    if (_notEquals) {
      XExpression _times_1 = action.getTimes();
      _xifexpression = appendable.declareSyntheticVariable(_times_1, "times");
    }
    String timesVar = _xifexpression;
    boolean _notEquals_1 = (!Objects.equal(timesVar, null));
    if (_notEquals_1) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("for (int ");
      _builder.append(timesVar, "");
      _builder.append(" = ");
      appendable.append(_builder);
      this.generateTestHelperMethodCall("_transition_exprAction_times_", action, appendable, false, false);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("; ");
      _builder_1.append(timesVar, "");
      _builder_1.append(" > 0; ");
      _builder_1.append(timesVar, "");
      _builder_1.append("--) {");
      ITreeAppendable _append = appendable.append(_builder_1);
      ITreeAppendable _increaseIndentation = _append.increaseIndentation();
      _increaseIndentation.newLine();
    }
    this.generateTestHelperMethodCall("_transition_exprAction_", action, appendable, true, false);
    boolean _notEquals_2 = (!Objects.equal(timesVar, null));
    if (_notEquals_2) {
      ITreeAppendable _decreaseIndentation = appendable.decreaseIndentation();
      ITreeAppendable _newLine = _decreaseIndentation.newLine();
      _newLine.append("}");
    }
    appendable.newLine();
  }
  
  public void inferPropertiesTestMethods(final PropertiesTest pt, final JvmGenericType jvmClass) {
    final JvmTypeReference returnType = this._typeReferenceBuilder.typeRef(void.class);
    StateTestContext _ancestor = this._util.<StateTestContext>ancestor(pt, StateTestContext.class);
    String _relativeName = this._util.<StateTestContext>relativeName(pt, StateTestContext.class);
    String _plus = ("_test_" + _relativeName);
    final JvmOperation propertiesMethod = this.inferTestHelperMethod(_ancestor, _plus, returnType, ((EObject) pt));
    this._iJvmModelAssociator.associateLogicalContainer(pt, propertiesMethod);
    final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
      @Override
      public void apply(final ITreeAppendable it) {
        EList<XExpression> _expressions = pt.getExpressions();
        for (final XExpression expr : _expressions) {
          JexTestJvmModelInferrer.this.generateAssertCall(pt, expr, it, false);
        }
      }
    };
    this._jvmTypesBuilder.setBody(propertiesMethod, _function);
    EList<JvmMember> _members = jvmClass.getMembers();
    this._jvmTypesBuilder.<JvmOperation>operator_add(_members, propertiesMethod);
  }
  
  public void generateAssertCall(final EObject owner, final XExpression expr, final ITreeAppendable appendable, final boolean explicitBoolean) {
    List<XExpression> exprs = Collections.<XExpression>unmodifiableList(CollectionLiterals.<XExpression>newArrayList(expr));
    String assertMethodName = null;
    JvmTypeReference _elvis = null;
    JvmTypeReference _jvmType = this._util.jvmType(expr, owner);
    if (_jvmType != null) {
      _elvis = _jvmType;
    } else {
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(void.class);
      _elvis = _typeRef;
    }
    final JvmTypeReference type = _elvis;
    String _qualifiedName = type.getQualifiedName();
    final boolean isVoid = Objects.equal(_qualifiedName, "void");
    String _qualifiedName_1 = type.getQualifiedName();
    final boolean isLogical = Objects.equal(_qualifiedName_1, "boolean");
    boolean _or = false;
    if ((expr instanceof XUnaryOperation)) {
      _or = true;
    } else {
      _or = (expr instanceof XBinaryOperation);
    }
    final boolean isOperator = _or;
    if (((!explicitBoolean) || (isOperator && isLogical))) {
      String _xifexpression = null;
      if (isLogical) {
        _xifexpression = "assertTrue";
      } else {
        String _xifexpression_1 = null;
        if ((!isVoid)) {
          _xifexpression_1 = "assertNotNull";
        }
        _xifexpression = _xifexpression_1;
      }
      assertMethodName = _xifexpression;
      boolean _and = false;
      if (!(expr instanceof XBinaryOperation)) {
        _and = false;
      } else {
        JvmIdentifiableElement _feature = ((XBinaryOperation) expr).getFeature();
        _and = (_feature instanceof JvmOperation);
      }
      if (_and) {
        final XBinaryOperation binOp = ((XBinaryOperation) expr);
        JvmIdentifiableElement _feature_1 = binOp.getFeature();
        final JvmOperation feature = ((JvmOperation) _feature_1);
        JvmDeclaredType _declaringType = feature.getDeclaringType();
        final String typeName = _declaringType.getQualifiedName();
        boolean _and_1 = false;
        boolean _startsWith = typeName.startsWith("org.eclipse.xtext.xbase.lib.");
        if (!_startsWith) {
          _and_1 = false;
        } else {
          boolean _endsWith = typeName.endsWith("Extensions");
          _and_1 = _endsWith;
        }
        if (_and_1) {
          String _simpleName = feature.getSimpleName();
          boolean _matched = false;
          if (!_matched) {
            if (Objects.equal(_simpleName, "operator_equals")) {
              _matched=true;
              assertMethodName = "assertEquals";
              XExpression _rightOperand = binOp.getRightOperand();
              XExpression _leftOperand = binOp.getLeftOperand();
              exprs = Collections.<XExpression>unmodifiableList(CollectionLiterals.<XExpression>newArrayList(_rightOperand, _leftOperand));
            }
          }
          if (!_matched) {
            if (Objects.equal(_simpleName, "operator_tripleEquals")) {
              _matched=true;
              assertMethodName = "assertEquals";
              XExpression _rightOperand_1 = binOp.getRightOperand();
              XExpression _leftOperand_1 = binOp.getLeftOperand();
              exprs = Collections.<XExpression>unmodifiableList(CollectionLiterals.<XExpression>newArrayList(_rightOperand_1, _leftOperand_1));
            }
          }
        }
      }
    }
    try {
      boolean _equals = Objects.equal(assertMethodName, null);
      if (_equals) {
        ITreeAppendable _append = appendable.append("try {");
        ITreeAppendable _increaseIndentation = _append.increaseIndentation();
        _increaseIndentation.newLine();
      }
      for (final XExpression subExpr : exprs) {
        boolean _or_1 = false;
        boolean _notEquals = (!Objects.equal(subExpr, expr));
        if (_notEquals) {
          _or_1 = true;
        } else {
          boolean _notEquals_1 = (!Objects.equal(assertMethodName, null));
          _or_1 = _notEquals_1;
        }
        this._xbaseCompiler.toJavaStatement(subExpr, appendable, _or_1);
      }
      appendable.newLine();
      StringConcatenation _builder = new StringConcatenation();
      String _asSourceText = this._util.asSourceText(expr);
      _builder.append(_asSourceText, "");
      _builder.append(" failed");
      String message = _builder.toString();
      if ((!(owner instanceof TransitionAction))) {
        final Transition transition = this._util.<Transition>ancestor(expr, Transition.class);
        boolean _and_2 = false;
        boolean _notEquals_2 = (!Objects.equal(transition, null));
        if (!_notEquals_2) {
          _and_2 = false;
        } else {
          EList<TransitionAction> _actions = transition.getActions();
          boolean _isEmpty = _actions.isEmpty();
          boolean _not = (!_isEmpty);
          _and_2 = _not;
        }
        if (_and_2) {
          EList<TransitionAction> _actions_1 = transition.getActions();
          String _asSourceText_1 = this._util.asSourceText(_actions_1, " ,");
          String _plus = ((message + " after ") + _asSourceText_1);
          message = _plus;
        }
      }
      boolean _notEquals_3 = (!Objects.equal(assertMethodName, null));
      if (_notEquals_3) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(assertMethodName, "");
        _builder_1.append("(\"");
        String _quote = this._util.quote(message, "\"");
        _builder_1.append(_quote, "");
        _builder_1.append("\"");
        appendable.append(_builder_1);
        for (final XExpression subExpr_1 : exprs) {
          {
            appendable.append(", ");
            this._xbaseCompiler.toJavaExpression(subExpr_1, appendable);
          }
        }
        ITreeAppendable _append_1 = appendable.append(");");
        _append_1.newLine();
      } else {
        final String errorVar = appendable.declareSyntheticVariable(owner, "error");
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("} catch (junit.framework.AssertionFailedError ");
        _builder_2.append(errorVar, "");
        _builder_2.append(") {");
        ITreeAppendable _append_2 = appendable.append(_builder_2);
        _append_2.newLine();
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("fail(\"");
        String _quote_1 = this._util.quote(message, "\"");
        _builder_3.append(_quote_1, "");
        _builder_3.append(": \" + ");
        _builder_3.append(errorVar, "");
        _builder_3.append(".getMessage());");
        ITreeAppendable _append_3 = appendable.append(_builder_3);
        ITreeAppendable _decreaseIndentation = _append_3.decreaseIndentation();
        _decreaseIndentation.newLine();
        ITreeAppendable _append_4 = appendable.append("}");
        _append_4.newLine();
      }
    } catch (final Throwable _t) {
      if (_t instanceof RuntimeException) {
        final RuntimeException re = (RuntimeException)_t;
        this._util.generateUnsupportedOperationException(owner, appendable);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public void infer(final EObject testCase, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (testCase instanceof JexTestCase) {
      _infer((JexTestCase)testCase, acceptor, isPreIndexingPhase);
      return;
    } else if (testCase instanceof JexTestSuite) {
      _infer((JexTestSuite)testCase, acceptor, isPreIndexingPhase);
      return;
    } else if (testCase != null) {
      _infer(testCase, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(testCase, acceptor, isPreIndexingPhase).toString());
    }
  }
  
  public void generateTransitionActionsEffect(final TransitionEffect effect, final Transition transition, final ITreeAppendable appendable) {
    if (effect instanceof TransitionExceptionEffect) {
      _generateTransitionActionsEffect((TransitionExceptionEffect)effect, transition, appendable);
      return;
    } else if (effect instanceof TransitionTargetEffect) {
      _generateTransitionActionsEffect((TransitionTargetEffect)effect, transition, appendable);
      return;
    } else if (effect != null) {
      _generateTransitionActionsEffect(effect, transition, appendable);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(effect, transition, appendable).toString());
    }
  }
  
  public void generateTransitionAction(final TransitionAction action, final Transition transition, final ITreeAppendable appendable) {
    if (action instanceof TransitionExpressionAction) {
      _generateTransitionAction((TransitionExpressionAction)action, transition, appendable);
      return;
    } else if (action != null) {
      _generateTransitionAction(action, transition, appendable);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(action, transition, appendable).toString());
    }
  }
}
