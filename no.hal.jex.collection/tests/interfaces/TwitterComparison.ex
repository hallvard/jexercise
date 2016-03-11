<?xml version="1.0" encoding="UTF-8"?>
<exercise:Exercise xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:exercise="platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore" xmlns:jdt="platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore" xmlns:junit="platform:/plugin/no.hal.learning.exercise.junit/model/junit-exercise.ecore" xmlns:workbench="platform:/plugin/no.hal.learning.exercise.workbench/model/workbench-exercise.ecore">
  <parts xsi:type="exercise:ExercisePart" title="TwitterComparison">
    <tasks xsi:type="exercise:Task">
      <q xsi:type="exercise:StringQuestion" question="Write source code for the UserNameComparator class."/>
      <a xsi:type="jdt:JdtSourceEditAnswer" className="interfaces.twitter.UserNameComparator"/>
    </tasks>
    <tasks xsi:type="exercise:Task">
      <q xsi:type="exercise:StringQuestion" question="Write source code for the FollowersCountComparator class."/>
      <a xsi:type="jdt:JdtSourceEditAnswer" className="interfaces.twitter.FollowersCountComparator"/>
    </tasks>
    <tasks xsi:type="exercise:Task">
      <q xsi:type="exercise:StringQuestion" question="Write source code for the TweetsCountComparator class."/>
      <a xsi:type="jdt:JdtSourceEditAnswer" className="interfaces.twitter.TweetsCountComparator"/>
    </tasks>
    <tasks xsi:type="exercise:Task">
      <q xsi:type="exercise:StringQuestion" question="Run the TwitterAccountTest JUnit test."/>
      <a xsi:type="junit:JunitTestAnswer" testRunName="interfaces.twitter.TwitterAccountTest"/>
    </tasks>
    <tasks xsi:type="exercise:Task">
      <q xsi:type="exercise:StringQuestion" question="Run the FollowersCountComparatorTest JUnit test."/>
      <a xsi:type="junit:JunitTestAnswer" testRunName="interfaces.twitter.FollowersCountComparatorTest"/>
    </tasks>
    <tasks xsi:type="exercise:Task">
      <q xsi:type="exercise:StringQuestion" question="Run the UserNameComparatorTest JUnit test."/>
      <a xsi:type="junit:JunitTestAnswer" testRunName="interfaces.twitter.UserNameComparatorTest"/>
    </tasks>
    <tasks xsi:type="exercise:Task">
      <q xsi:type="exercise:StringQuestion" question="Run the TweetsCountComparatorTest JUnit test."/>
      <a xsi:type="junit:JunitTestAnswer" testRunName="interfaces.twitter.TweetsCountComparatorTest"/>
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
  </parts>
  
</exercise:Exercise>
