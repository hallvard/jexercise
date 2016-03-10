<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:exercise="platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore" xmlns:jdt="platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore" xmlns:junit="platform:/plugin/no.hal.learning.exercise.junit/model/junit-exercise.ecore" xmlns:workbench="platform:/plugin/no.hal.learning.exercise.workbench/model/workbench-exercise.ecore">
  <exercise:Exercise>
    <parts xsi:type="exercise:ExercisePart" title="CardContainer">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the CardContainerImpl superclass."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="inheritance.CardContainerImpl"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Update the source code for the CardDeck class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="inheritance.CardDeck"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Update the source code for the CardHand class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="inheritance.CardHand"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write the source code for the CardContainer interface."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="inheritance.CardContainer"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the CardDeckTest JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="inheritance.CardDeckTest"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the CardHandTest JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="inheritance.CardHandTest"/>
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
         <q xsi:type="exercise:StringQuestion" question="Run the CardDeck class."/>
         <a xsi:type="jdt:JdtLaunchAnswer" className="inheritance.CardDeck"/>
       </tasks>
       <tasks xsi:type="exercise:Task">
         <q xsi:type="exercise:StringQuestion" question="Run the CardHand class."/>
         <a xsi:type="jdt:JdtLaunchAnswer" className="inheritance.CardHand"/>
       </tasks>
       <tasks xsi:type="exercise:Task">
         <q xsi:type="exercise:StringQuestion" question="Run the CardContainerImpl class."/>
         <a xsi:type="jdt:JdtLaunchAnswer" className="inheritance.CardContainerImpl"/>
       </tasks>
    </parts>
  </exercise:Exercise>

</xmi:XMI>
