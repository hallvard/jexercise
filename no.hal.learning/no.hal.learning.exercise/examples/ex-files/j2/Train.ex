<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:exercise="platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore" xmlns:jdt="platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore" xmlns:junit="platform:/plugin/no.hal.learning.exercise.junit/model/junit-exercise.ecore" xmlns:workbench="platform:/plugin/no.hal.learning.exercise.workbench/model/workbench-exercise.ecore">
  <exercise:Exercise>
    <parts xsi:type="exercise:ExercisePart" title="Train">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the TrainCar superclass."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="inheritance.TrainCar"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write the source code for the CargoCar class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="inheritance.CargoCar"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write the source code for the PassengerCar class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="inheritance.PassengerCar"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write the source code for the Train class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="inheritance.Train"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the TrainCarTest JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="inheritance.TrainCarTest"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the TrainTest JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="inheritance.TrainTest"/>
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
        <q xsi:type="exercise:StringQuestion" question="Run the TrainCar class."/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="inheritance.TrainCar"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the CargoCar class."/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="inheritance.CargoCar"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the PassengerCar class."/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="inheritance.PassengerCar"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the Train class."/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="inheritance.Train"/>
      </tasks>
    </parts>
  </exercise:Exercise>
  <exercise:ExerciseProposals exercise="/0">
    <proposals exercisePart="/0/@parts.0">
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.0/@q" answer="/0/@parts.0/@tasks.0/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459930752579" sizeMeasure="5">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class TrainCar {&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459931062192" sizeMeasure="22">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class TrainCar {&#xA;&#x9;&#xA;&#x9;private int deadWeight;&#xA;&#x9;&#xA;&#x9;public TrainCar(int startWeight) {&#xA;&#x9;&#x9;deadWeight = startWeight;&#xA;&#x9;}&#xA;&#xA;&#x9;public int getTotalWeight() {&#xA;&#x9;&#x9;return deadWeight;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void setDeadWeight(int startWeight) {&#xA;&#x9;&#x9;deadWeight = startWeight;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public int getDeadWeight() {&#xA;&#x9;&#x9;return deadWeight;&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
      </proposals>
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.1/@q" answer="/0/@parts.0/@tasks.1/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459931120905" sizeMeasure="5">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class CargoCar {&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459931344332" sizeMeasure="20" warningCount="1">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class CargoCar extends TrainCar {&#xA;&#x9;&#xA;&#x9;private int deadWeight;&#xA;&#x9;private int cargoWeight;&#xA;&#xA;&#x9;public CargoCar (int startDeadWeight, int startCargoWeight) {&#xA;&#x9;&#x9;super(startDeadWeight);&#xA;&#x9;&#x9;cargoWeight = startCargoWeight;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public int getCargoWeight() {&#xA;&#x9;&#x9;return cargoWeight;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void setCargoWeight(int newCargoWeight) {&#xA;&#x9;&#x9;cargoWeight = newCargoWeight;&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459931562429" sizeMeasure="25" warningCount="1">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class CargoCar extends TrainCar {&#xA;&#x9;&#xA;&#x9;private int deadWeight;&#xA;&#x9;private int cargoWeight;&#xA;&#xA;&#x9;public CargoCar (int startDeadWeight, int startCargoWeight) {&#xA;&#x9;&#x9;super(startDeadWeight);&#xA;&#x9;&#x9;cargoWeight = startCargoWeight;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public int getCargoWeight() {&#xA;&#x9;&#x9;return cargoWeight;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void setCargoWeight(int newCargoWeight) {&#xA;&#x9;&#x9;cargoWeight = newCargoWeight;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int getTotalWeight() {&#xA;&#x9;&#x9;return super.getTotalWeight() + getCargoWeight();&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
      </proposals>
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.2/@q" answer="/0/@parts.0/@tasks.2/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459931592930" sizeMeasure="5">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class PassengerCar {&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459931795269" sizeMeasure="25">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class PassengerCar extends TrainCar {&#xA;&#xA;&#x9;private int passengers;&#xA;&#x9;&#xA;&#x9;public PassengerCar(int startWeight, int startPassengers) {&#xA;&#x9;&#x9;super(startWeight);&#xA;&#x9;&#x9;passengers = startPassengers;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public int getPassengerCount() {&#xA;&#x9;&#x9;return passengers;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void setPassengerCount(int newPassengers) {&#xA;&#x9;&#x9;passengers = newPassengers;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int getTotalWeight() {&#xA;&#x9;&#x9;return super.getTotalWeight() + getPassengerCount() * 80;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
      </proposals>
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.3/@q" answer="/0/@parts.0/@tasks.3/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459931826710" sizeMeasure="5">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class Train {&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459931964662" sizeMeasure="21" errorCount="1">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;import java.util.Collection;&#xA;&#xA;public class Train {&#xA;&#x9;&#xA;&#x9;public Collection&lt;TrainCar> train;&#xA;&#x9;&#xA;&#x9;public void addTrainCar(TrainCar trainCar) {&#xA;&#x9;&#x9;train.add(trainCar);&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public boolean contains(TrainCar trainCar) {&#xA;&#x9;&#x9;return train.contains(trainCar);&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public int getTotalWeight() {&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459932808678" sizeMeasure="74">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;import java.util.Collection;&#xA;&#xA;public class Train {&#xA;&#x9;&#xA;&#x9;public Collection&lt;TrainCar> train;&#xA;&#x9;&#xA;&#x9;public void addTrainCar(TrainCar trainCar) {&#xA;&#x9;&#x9;train.add(trainCar);&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public boolean contains(TrainCar trainCar) {&#xA;&#x9;&#x9;return train.contains(trainCar);&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public int getTotalWeight() {&#xA;&#x9;&#x9;int totalWeight = 0;&#xA;&#x9;&#x9;for (TrainCar trainCar : train) {&#xA;&#x9;&#x9;&#x9;if (trainCar instanceof CargoCar) {&#xA;&#x9;&#x9;&#x9;&#x9;totalWeight += ((CargoCar) trainCar).getTotalWeight();&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;if (trainCar instanceof PassengerCar) {&#xA;&#x9;&#x9;&#x9;&#x9;totalWeight += ((PassengerCar) trainCar).getTotalWeight();&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;&#x9;totalWeight += trainCar.getTotalWeight();&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return totalWeight;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public int getPassengerCount() {&#xA;&#x9;&#x9;int passengerCount = 0;&#xA;&#x9;&#x9;for (TrainCar trainCar : train) {&#xA;&#x9;&#x9;&#x9;if (trainCar instanceof PassengerCar) {&#xA;&#x9;&#x9;&#x9;&#x9;passengerCount += ((PassengerCar) trainCar).getPassengerCount();&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return passengerCount;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public int getCargoWeight() {&#xA;&#x9;&#x9;int cargoWeight = 0;&#xA;&#x9;&#x9;for (TrainCar trainCar : train) {&#xA;&#x9;&#x9;&#x9;if (trainCar instanceof CargoCar) {&#xA;&#x9;&#x9;&#x9;&#x9;cargoWeight += ((CargoCar) trainCar).getCargoWeight();&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return cargoWeight;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public String toString() {&#xA;&#x9;&#x9;String theTrain = &quot;The train contains: &quot;;&#xA;&#x9;&#x9;for (TrainCar trainCar : train) {&#xA;&#x9;&#x9;&#x9;if (trainCar instanceof CargoCar) {&#xA;&#x9;&#x9;&#x9;&#x9;theTrain += &quot;/n a cargo car with a total weight of &quot; + ((CargoCar) trainCar)&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;&#x9;.getTotalWeight() + &quot; kg and a cargo weight of &quot; + ((CargoCar) trainCar)&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;&#x9;.getCargoWeight();&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;if (trainCar instanceof PassengerCar) {&#xA;&#x9;&#x9;&#x9;&#x9;theTrain += &quot;/n a passenger car with a total weight of &quot; + ((PassengerCar) trainCar)&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;&#x9;.getTotalWeight() + &quot; kg and a &quot; + ((PassengerCar) trainCar).getPassengerCount()&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;&#x9;+ &quot; passengers&quot;;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;&#x9;theTrain += &quot;/n a train car with at total weihgt of &quot; + trainCar.getTotalWeight() + &quot; kg&quot;;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;theTrain += &quot;.&quot;;&#xA;&#x9;&#x9;return theTrain;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459932957593" sizeMeasure="79">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Collection;&#xA;&#xA;public class Train {&#xA;&#x9;&#xA;&#x9;public Collection&lt;TrainCar> train;&#xA;&#x9;&#xA;&#x9;public Train() {&#xA;&#x9;&#x9;train = new ArrayList&lt;TrainCar>();&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void addTrainCar(TrainCar trainCar) {&#xA;&#x9;&#x9;train.add(trainCar);&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public boolean contains(TrainCar trainCar) {&#xA;&#x9;&#x9;return train.contains(trainCar);&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public int getTotalWeight() {&#xA;&#x9;&#x9;int totalWeight = 0;&#xA;&#x9;&#x9;for (TrainCar trainCar : train) {&#xA;&#x9;&#x9;&#x9;if (trainCar instanceof CargoCar) {&#xA;&#x9;&#x9;&#x9;&#x9;totalWeight += ((CargoCar) trainCar).getTotalWeight();&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;if (trainCar instanceof PassengerCar) {&#xA;&#x9;&#x9;&#x9;&#x9;totalWeight += ((PassengerCar) trainCar).getTotalWeight();&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;&#x9;totalWeight += trainCar.getTotalWeight();&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return totalWeight;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public int getPassengerCount() {&#xA;&#x9;&#x9;int passengerCount = 0;&#xA;&#x9;&#x9;for (TrainCar trainCar : train) {&#xA;&#x9;&#x9;&#x9;if (trainCar instanceof PassengerCar) {&#xA;&#x9;&#x9;&#x9;&#x9;passengerCount += ((PassengerCar) trainCar).getPassengerCount();&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return passengerCount;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public int getCargoWeight() {&#xA;&#x9;&#x9;int cargoWeight = 0;&#xA;&#x9;&#x9;for (TrainCar trainCar : train) {&#xA;&#x9;&#x9;&#x9;if (trainCar instanceof CargoCar) {&#xA;&#x9;&#x9;&#x9;&#x9;cargoWeight += ((CargoCar) trainCar).getCargoWeight();&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return cargoWeight;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public String toString() {&#xA;&#x9;&#x9;String theTrain = &quot;The train contains: &quot;;&#xA;&#x9;&#x9;for (TrainCar trainCar : train) {&#xA;&#x9;&#x9;&#x9;if (trainCar instanceof CargoCar) {&#xA;&#x9;&#x9;&#x9;&#x9;theTrain += &quot;/n a cargo car with a total weight of &quot; + ((CargoCar) trainCar)&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;&#x9;.getTotalWeight() + &quot; kg and a cargo weight of &quot; + ((CargoCar) trainCar)&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;&#x9;.getCargoWeight();&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;if (trainCar instanceof PassengerCar) {&#xA;&#x9;&#x9;&#x9;&#x9;theTrain += &quot;/n a passenger car with a total weight of &quot; + ((PassengerCar) trainCar)&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;&#x9;.getTotalWeight() + &quot; kg and a &quot; + ((PassengerCar) trainCar).getPassengerCount()&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;&#x9;+ &quot; passengers&quot;;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;&#x9;theTrain += &quot;/n a train car with at total weihgt of &quot; + trainCar.getTotalWeight() + &quot; kg&quot;;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;theTrain += &quot;.&quot;;&#xA;&#x9;&#x9;return theTrain;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459933130627" sizeMeasure="85">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Collection;&#xA;&#xA;public class Train {&#xA;&#x9;&#xA;&#x9;public Collection&lt;TrainCar> train;&#xA;&#x9;&#xA;&#x9;public Train() {&#xA;&#x9;&#x9;train = new ArrayList&lt;TrainCar>();&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void addTrainCar(TrainCar trainCar) {&#xA;&#x9;&#x9;train.add(trainCar);&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public boolean contains(TrainCar trainCar) {&#xA;&#x9;&#x9;return train.contains(trainCar);&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public int getTotalWeight() {&#xA;&#x9;&#x9;int totalWeight = 0;&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;for (TrainCar trainCar : train) {&#xA;&#x9;&#x9;&#x9;/*&#xA;&#x9;&#x9;&#x9;if (trainCar instanceof CargoCar) {&#xA;&#x9;&#x9;&#x9;&#x9;totalWeight += ((CargoCar) trainCar).getTotalWeight();&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;if (trainCar instanceof PassengerCar) {&#xA;&#x9;&#x9;&#x9;&#x9;totalWeight += ((PassengerCar) trainCar).getTotalWeight();&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;&#x9;totalWeight += trainCar.getTotalWeight();&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;*/&#xA;&#x9;&#x9;&#x9;totalWeight += trainCar.getTotalWeight();&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;return totalWeight;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public int getPassengerCount() {&#xA;&#x9;&#x9;int passengerCount = 0;&#xA;&#x9;&#x9;for (TrainCar trainCar : train) {&#xA;&#x9;&#x9;&#x9;if (trainCar instanceof PassengerCar) {&#xA;&#x9;&#x9;&#x9;&#x9;passengerCount += ((PassengerCar) trainCar).getPassengerCount();&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return passengerCount;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public int getCargoWeight() {&#xA;&#x9;&#x9;int cargoWeight = 0;&#xA;&#x9;&#x9;for (TrainCar trainCar : train) {&#xA;&#x9;&#x9;&#x9;if (trainCar instanceof CargoCar) {&#xA;&#x9;&#x9;&#x9;&#x9;cargoWeight += ((CargoCar) trainCar).getCargoWeight();&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return cargoWeight;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public String toString() {&#xA;&#x9;&#x9;String theTrain = &quot;The train contains: &quot;;&#xA;&#x9;&#x9;for (TrainCar trainCar : train) {&#xA;&#x9;&#x9;&#x9;if (trainCar instanceof CargoCar) {&#xA;&#x9;&#x9;&#x9;&#x9;theTrain += &quot;/n a cargo car with a total weight of &quot; + ((CargoCar) trainCar)&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;&#x9;.getTotalWeight() + &quot; kg and a cargo weight of &quot; + ((CargoCar) trainCar)&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;&#x9;.getCargoWeight();&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;if (trainCar instanceof PassengerCar) {&#xA;&#x9;&#x9;&#x9;&#x9;theTrain += &quot;/n a passenger car with a total weight of &quot; + ((PassengerCar) trainCar)&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;&#x9;.getTotalWeight() + &quot; kg and a &quot; + ((PassengerCar) trainCar).getPassengerCount()&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;&#x9;+ &quot; passengers&quot;;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;&#x9;theTrain += &quot;/n a train car with at total weihgt of &quot; + trainCar.getTotalWeight() + &quot; kg&quot;;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;theTrain += &quot;.&quot;;&#xA;&#x9;&#x9;return theTrain;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.0/@tasks.4/@q" answer="/0/@parts.0/@tasks.4/@a" completion="1.0">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459931102902" completion="1.0" successCount="1"/>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.0/@tasks.5/@q" answer="/0/@parts.0/@tasks.5/@a" completion="0.5714285714285714">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459932824061" completion="0.0" errorCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459932958548" completion="0.5" successCount="1" errorCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459932961176" completion="0.3333333333333333" successCount="1" failureCount="1" errorCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459933020389" completion="0.5" successCount="2" failureCount="1" errorCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459933022813" completion="0.6" successCount="3" failureCount="1" errorCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459933025346" completion="0.5" successCount="3" failureCount="2" errorCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459933131638" completion="0.5714285714285714" successCount="4" failureCount="2" errorCount="1"/>
      </proposals>
    </proposals>
    <proposals exercisePart="/0/@parts.1">
      <proposals xsi:type="workbench:DebugEventProposal" question="/0/@parts.1/@tasks.0/@q" answer="/0/@parts.1/@tasks.0/@a"/>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.1/@tasks.1/@q" answer="/0/@parts.1/@tasks.1/@a"/>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.1/@tasks.2/@q" answer="/0/@parts.1/@tasks.2/@a"/>
      <proposals xsi:type="workbench:PartTaskProposal" question="/0/@parts.1/@tasks.3/@q" answer="/0/@parts.1/@tasks.3/@a"/>
      <proposals xsi:type="jdt:JdtLaunchProposal" question="/0/@parts.1/@tasks.4/@q" answer="/0/@parts.1/@tasks.4/@a"/>
      <proposals xsi:type="jdt:JdtLaunchProposal" question="/0/@parts.1/@tasks.5/@q" answer="/0/@parts.1/@tasks.5/@a"/>
      <proposals xsi:type="jdt:JdtLaunchProposal" question="/0/@parts.1/@tasks.6/@q" answer="/0/@parts.1/@tasks.6/@a"/>
      <proposals xsi:type="jdt:JdtLaunchProposal" question="/0/@parts.1/@tasks.7/@q" answer="/0/@parts.1/@tasks.7/@a"/>
    </proposals>
  </exercise:ExerciseProposals>
</xmi:XMI>
