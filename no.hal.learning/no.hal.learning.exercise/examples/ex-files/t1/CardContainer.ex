<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:exercise="platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore" xmlns:jdt="platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore" xmlns:junit="platform:/plugin/no.hal.learning.exercise.junit/model/junit-exercise.ecore">
  <exercise:Exercise>
    <parts xsi:type="exercise:ExercisePart" title="CardContainer">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the CardContainer interface."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="interfaces.CardContainer"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the CardDeckTest JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="interfaces.CardDeckTest"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the CardHandTest JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="interfaces.CardHandTest"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the CardContainerIteratorTest JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="interfaces.CardContainerIteratorTest"/>
      </tasks>
    </parts>
  </exercise:Exercise>
  <exercise:ExerciseProposals exercise="/0">
    <proposals exercisePart="/0/@parts.0">
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.0/@q" answer="/0/@parts.0/@tasks.0/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457301186268" sizeMeasure="5">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;public interface CardContainer {&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457301246146" sizeMeasure="7">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;public interface CardContainer {&#xA;&#x9;public int getCardCount();&#xA;&#x9;public Card getCard(int n);&#xA;&#x9;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457301390078" sizeMeasure="7">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;public interface CardContainer{&#xA;&#x9;public int getCardCount();&#xA;&#x9;public Card getCard(int n);&#xA;&#x9;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457356426163" sizeMeasure="7">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;public interface CardContainer extends Iterable&lt;Card>{&#xA;&#x9;public int getCardCount();&#xA;&#x9;public Card getCard(int n);&#xA;&#x9;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457356426164" sizeMeasure="7">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;public interface CardContainer extends Iterable&lt;Card>{&#xA;&#x9;public int getCardCount();&#xA;&#x9;public Card getCard(int n);&#xA;&#x9;&#xA;}&#xA;"/>
        </attempts>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.0/@tasks.1/@q" answer="/0/@parts.0/@tasks.1/@a" completion="0.5">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457350055798" completion="1.0" successCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457350055798" completion="1.0" successCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457350057781" completion="0.5" successCount="1" errorCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457350057781" completion="0.5" successCount="1" errorCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457350130477" completion="0.6666666666666666" successCount="2" errorCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457350130477" completion="0.6666666666666666" successCount="2" errorCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457350133826" completion="0.5" successCount="2" errorCount="2"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457350133826" completion="0.5" successCount="2" errorCount="2"/>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.0/@tasks.2/@q" answer="/0/@parts.0/@tasks.2/@a" completion="0.6666666666666666">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457350201506" completion="1.0" successCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457350201506" completion="1.0" successCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457350202481" completion="0.5" successCount="1" errorCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457350202481" completion="0.5" successCount="1" errorCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457350263480" completion="0.3333333333333333" successCount="1" errorCount="2"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457350263480" completion="0.3333333333333333" successCount="1" errorCount="2"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457356293039" completion="0.5" successCount="2" errorCount="2"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457356293039" completion="0.5" successCount="2" errorCount="2"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457356293900" completion="0.4" successCount="2" errorCount="3"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457356293900" completion="0.4" successCount="2" errorCount="3"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457356432810" completion="0.5" successCount="3" errorCount="3"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457356432810" completion="0.5" successCount="3" errorCount="3"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457356434521" completion="0.5714285714285714" successCount="4" errorCount="3"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457356434521" completion="0.5714285714285714" successCount="4" errorCount="3"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457356498877" completion="0.625" successCount="5" errorCount="3"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457356498877" completion="0.625" successCount="5" errorCount="3"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457356501475" completion="0.6666666666666666" successCount="6" errorCount="3"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457356501475" completion="0.6666666666666666" successCount="6" errorCount="3"/>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.0/@tasks.3/@q" answer="/0/@parts.0/@tasks.3/@a" completion="0.5">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457349904876" completion="0.0" errorCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457349904877" completion="0.0" errorCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457349926709" completion="0.5" successCount="1" errorCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457349926709" completion="0.5" successCount="1" errorCount="1"/>
      </proposals>
    </proposals>
  </exercise:ExerciseProposals>
</xmi:XMI>
