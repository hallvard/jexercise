<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:exercise="platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore" xmlns:jdt="platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore" xmlns:junit="platform:/plugin/no.hal.learning.exercise.junit/model/junit-exercise.ecore" xmlns:workbench="platform:/plugin/no.hal.learning.exercise.workbench/model/workbench-exercise.ecore">
  <exercise:Exercise>
    <parts xsi:type="exercise:ExercisePart" title="Highscore List">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the HighscoreListListener interface."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="patterns.observable.HighscoreListListener"/>
      </tasks>
    </parts>
    <parts xsi:type="exercise:ExercisePart" title="HighScoreList">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the HighScoreList class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="patterns.observable.HighscoreList"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the HighScoreList JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="patterns.observable.HighscoreListTest"/>
      </tasks>
    </parts>
    <parts xsi:type="exercise:ExercisePart" title="Observable Highscore List">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the ObservableList class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="patterns.observable.ObservableList"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the ObservableList JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="patterns.observable.ObservableListTest"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the ObservableHighscorelist class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="patterns.observable.ObservableHighscoreList"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the ObservableHighscoreList JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="patterns.observable.ObservableHighscoreListTest"/>
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
     <q xsi:type="exercise:StringQuestion" question="Run the HighscoreList class."/>
     <a xsi:type="jdt:JdtLaunchAnswer" className="patterns.observable.HighscoreList"/>
   </tasks>
    </parts>
  </exercise:Exercise>

</xmi:XMI>
