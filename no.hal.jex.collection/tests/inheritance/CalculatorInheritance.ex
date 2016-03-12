<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:exercise="platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore" xmlns:jdt="platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore" xmlns:junit="platform:/plugin/no.hal.learning.exercise.junit/model/junit-exercise.ecore" xmlns:workbench="platform:/plugin/no.hal.learning.exercise.workbench/model/workbench-exercise.ecore">
  <exercise:Exercise>
    <parts xsi:type="exercise:ExercisePart" title="Calculator">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the SimpleCalculator superclass."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="inheritance.SimpleCalculator"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write the source code for the RPNCalculator class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="inheritance.RPNCalculator"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write the source code for the CalculatorProgram class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="inheritance.CalculatorProgram"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the SimpleCalculatorTest JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="inheritance.SimpleCalculatorTest"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the RPNCalculatorTest JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="inheritance.RPNCalculatorTest"/>
      </tasks>
    </parts>
    <parts xsi:type="exercise:ExercisePart" title="Tool usage">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use breakpoints to debug code."/>
        <a xsi:type="workbench:DebugEventAnswer" action="suspend.breakpoint"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use the debug command Step Over"/>
        <a xsi:type="workbench:CommandExecutionAnswer" elementId="org.eclipse.debug.ui.commands.StepOver" action="executeSuccess"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use the debug command Step Into"/>
        <a xsi:type="workbench:CommandExecutionAnswer" elementId="org.eclipse.debug.ui.commands.StepInto" action="executeSuccess"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use the Variables view"/>
        <a xsi:type="workbench:PartTaskAnswer" elementId="org.eclipse.debug.ui.VariableView" action="activated"/>
      </tasks>
       <tasks xsi:type="exercise:Task">
         <q xsi:type="exercise:StringQuestion" question="Run the SimpleCalculator class."/>
         <a xsi:type="jdt:JdtLaunchAnswer" className="inheritance.SimpleCalculator"/>
       </tasks>
       <tasks xsi:type="exercise:Task">
         <q xsi:type="exercise:StringQuestion" question="Run the RPNCalculator class."/>
         <a xsi:type="jdt:JdtLaunchAnswer" className="inheritance.RPNCalculator"/>
       </tasks>
       <tasks xsi:type="exercise:Task">
         <q xsi:type="exercise:StringQuestion" question="Run the CalculatorProgram class."/>
         <a xsi:type="jdt:JdtLaunchAnswer" className="inheritance.CalculatorProgram"/>
       </tasks>
    </parts>
  </exercise:Exercise>

</xmi:XMI>
