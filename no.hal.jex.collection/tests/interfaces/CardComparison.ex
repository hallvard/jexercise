<?xml version="1.0" encoding="UTF-8"?>
<exercise:Exercise xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:exercise="platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore" xmlns:jdt="platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore" xmlns:junit="platform:/plugin/no.hal.learning.exercise.junit/model/junit-exercise.ecore" xmlns:workbench="platform:/plugin/no.hal.learning.exercise.workbench/model/workbench-exercise.ecore">
  <parts xsi:type="exercise:ExercisePart" title="CardContainer">
    <tasks xsi:type="exercise:Task">
      <q xsi:type="exercise:StringQuestion" question="Write source code for the CardComparator class."/>
      <a xsi:type="jdt:JdtSourceEditAnswer" className="interfaces.CardComparator"/>
    </tasks>
    <tasks xsi:type="exercise:Task">
      <q xsi:type="exercise:StringQuestion" question="Run the CardComparatorTest JUnit test."/>
      <a xsi:type="junit:JunitTestAnswer" testRunName="interfaces.CardComparatorTest"/>
    </tasks>
  </parts>
  
</exercise:Exercise>
