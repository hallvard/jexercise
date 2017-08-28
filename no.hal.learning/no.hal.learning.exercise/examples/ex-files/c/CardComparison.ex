<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:exercise="platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore" xmlns:jdt="platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore" xmlns:junit="platform:/plugin/no.hal.learning.exercise.junit/model/junit-exercise.ecore" xmlns:workbench="platform:/plugin/no.hal.learning.exercise.workbench/model/workbench-exercise.ecore">
  <exercise:Exercise>
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
  <exercise:ExerciseProposals exercise="/0">
    <proposals exercisePart="/0/@parts.0">
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.0/@q" answer="/0/@parts.0/@tasks.0/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456949470693" sizeMeasure="5">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;public class CardComparator {&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456950968031" sizeMeasure="39">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.Arrays;&#xA;import java.util.Comparator;&#xA;import java.util.List;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;List&lt;Character> suitList = Arrays.asList('C','D','H','S');&#x9;&#xA;&#x9;List&lt;Integer> faceList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;&#x9;&#x9;&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456951120846" sizeMeasure="39">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.Arrays;&#xA;import java.util.Comparator;&#xA;import java.util.List;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;List&lt;Character> suitList = Arrays.asList('C','D','H','S');&#x9;&#xA;&#x9;List&lt;Integer> faceList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;&#x9;&#x9;&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456951156007" sizeMeasure="38">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.Arrays;&#xA;import java.util.Comparator;&#xA;import java.util.List;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;List&lt;Character> suitList = Arrays.asList('C','D','H','S');&#x9;&#xA;&#x9;List&lt;Integer> faceList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456991260511" sizeMeasure="40">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.Arrays;&#xA;import java.util.Comparator;&#xA;import java.util.List;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;List&lt;Character> suitList = Arrays.asList('C','D','H','S');&#x9;&#xA;&#x9;List&lt;Integer> faceList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;}&#xA;&#x9;&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456991374102" sizeMeasure="40">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.Arrays;&#xA;import java.util.Comparator;&#xA;import java.util.List;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;List&lt;Character> suitList = Arrays.asList('C','D','H','S');&#x9;&#xA;&#x9;List&lt;Integer> faceList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;}&#xA;&#x9;&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456991794018" sizeMeasure="51" warningCount="1">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.Arrays;&#xA;import java.util.Collection;&#xA;import java.util.Collections;&#xA;import java.util.Comparator;&#xA;import java.util.List;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;List&lt;Character> suitList = Arrays.asList('C','D','H','S');&#x9;&#xA;&#x9;List&lt;Integer> faceList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;Card c1 = new Card('S', 1);&#xA;&#x9;&#x9;Card c2 = new Card('S', 13);&#xA;&#x9;&#x9;Card c3 = new Card('H', 1);&#xA;&#x9;&#x9;Card c4 = new Card('H', 13);&#xA;&#x9;&#x9;Card c5 = new Card('D', 1);&#xA;&#x9;&#x9;List&lt;Card> cardList = Arrays.asList(c1,c2,c3,c4,c5);&#xA;&#x9;&#x9;Collections.sort(cardList);&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456995994305" sizeMeasure="52" errorCount="2">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Arrays;&#xA;import java.util.Collection;&#xA;import java.util.Collections;&#xA;import java.util.Comparator;&#xA;import java.util.List;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;ArrayList&lt;Character> suitList = Arrays.asList('C','D','H','S');&#x9;&#xA;&#x9;ArrayList&lt;Integer> faceList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;Card c1 = new Card('S', 1);&#xA;&#x9;&#x9;Card c2 = new Card('S', 13);&#xA;&#x9;&#x9;Card c3 = new Card('H', 1);&#xA;&#x9;&#x9;Card c4 = new Card('H', 13);&#xA;&#x9;&#x9;Card c5 = new Card('D', 1);&#xA;&#x9;&#x9;List&lt;Card> cardList = Arrays.asList(c1,c2,c3,c4,c5);&#xA;&#x9;&#x9;Collections.sort(cardList);&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456996031957" sizeMeasure="53" errorCount="2">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Arrays;&#xA;import java.util.Collection;&#xA;import java.util.Collections;&#xA;import java.util.Comparator;&#xA;import java.util.List;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;ArrayList&lt;Character> suitList = new ArrayList&lt;Character>();&#x9;&#xA;&#x9;ArrayList&lt;Integer> faceList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9; Arrays.asList('C','D','H','S')&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;Card c1 = new Card('S', 1);&#xA;&#x9;&#x9;Card c2 = new Card('S', 13);&#xA;&#x9;&#x9;Card c3 = new Card('H', 1);&#xA;&#x9;&#x9;Card c4 = new Card('H', 13);&#xA;&#x9;&#x9;Card c5 = new Card('D', 1);&#xA;&#x9;&#x9;List&lt;Card> cardList = Arrays.asList(c1,c2,c3,c4,c5);&#xA;&#x9;&#x9;Collections.sort(cardList);&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456996124388" sizeMeasure="54" warningCount="1">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Arrays;&#xA;import java.util.Collection;&#xA;import java.util.Collections;&#xA;import java.util.Comparator;&#xA;import java.util.List;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;ArrayList&lt;Character> suitList = new ArrayList&lt;Character>();&#x9;&#xA;&#x9;ArrayList&lt;Integer> faceList = new ArrayList&lt;Integer>();&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;suitList.addAll(Arrays.asList('C','D','H','S'));&#xA;&#x9;&#x9;faceList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;Card c1 = new Card('S', 1);&#xA;&#x9;&#x9;Card c2 = new Card('S', 13);&#xA;&#x9;&#x9;Card c3 = new Card('H', 1);&#xA;&#x9;&#x9;Card c4 = new Card('H', 13);&#xA;&#x9;&#x9;Card c5 = new Card('D', 1);&#xA;&#x9;&#x9;List&lt;Card> cardList = Arrays.asList(c1,c2,c3,c4,c5);&#xA;&#x9;&#x9;Collections.sort(cardList);&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456996151983" sizeMeasure="54" warningCount="1">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Arrays;&#xA;import java.util.Collection;&#xA;import java.util.Collections;&#xA;import java.util.Comparator;&#xA;import java.util.List;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;ArrayList&lt;Character> suitList = new ArrayList&lt;Character>();&#x9;&#xA;&#x9;ArrayList&lt;Integer> faceList = new ArrayList&lt;Integer>();&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;suitList.addAll(Arrays.asList('C','D','H','S'));&#xA;&#x9;&#x9;faceList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;Card c1 = new Card('S', 1);&#xA;&#x9;&#x9;Card c2 = new Card('S', 13);&#xA;&#x9;&#x9;Card c3 = new Card('H', 1);&#xA;&#x9;&#x9;Card c4 = new Card('H', 13);&#xA;&#x9;&#x9;Card c5 = new Card('D', 1);&#xA;&#x9;&#x9;List&lt;Card> cardList = Arrays.asList(c1,c2,c3,c4,c5);&#xA;&#x9;&#x9;Collections.sort(cardList);&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456996187220" sizeMeasure="54" warningCount="1">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Arrays;&#xA;import java.util.Collection;&#xA;import java.util.Collections;&#xA;import java.util.Comparator;&#xA;import java.util.List;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;ArrayList&lt;Character> suitList = new ArrayList&lt;Character>();&#x9;&#xA;&#x9;ArrayList&lt;Integer> faceList = new ArrayList&lt;Integer>();&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;suitList.addAll(Arrays.asList('C','D','H','S'));&#xA;&#x9;&#x9;faceList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;Card c1 = new Card('S', 1);&#xA;&#x9;&#x9;Card c2 = new Card('S', 13);&#xA;&#x9;&#x9;Card c3 = new Card('H', 1);&#xA;&#x9;&#x9;Card c4 = new Card('H', 13);&#xA;&#x9;&#x9;Card c5 = new Card('D', 1);&#xA;&#x9;&#x9;List&lt;Card> cardList = Arrays.asList(c1,c2,c3,c4,c5);&#xA;&#x9;&#x9;Collections.sort(cardList);&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456996244280" sizeMeasure="54" warningCount="1">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Arrays;&#xA;import java.util.Collection;&#xA;import java.util.Collections;&#xA;import java.util.Comparator;&#xA;import java.util.List;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;ArrayList&lt;Character> suitList = new ArrayList&lt;Character>();&#x9;&#xA;&#x9;ArrayList&lt;Integer> faceList = new ArrayList&lt;Integer>();&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;suitList.addAll(Arrays.asList('C','D','H','S'));&#xA;&#x9;&#x9;faceList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;Card c1 = new Card('S', 1);&#xA;&#x9;&#x9;Card c2 = new Card('S', 13);&#xA;&#x9;&#x9;Card c3 = new Card('H', 1);&#xA;&#x9;&#x9;Card c4 = new Card('H', 13);&#xA;&#x9;&#x9;Card c5 = new Card('D', 1);&#xA;&#x9;&#x9;List&lt;Card> cardList = Arrays.asList(c1,c2,c3,c4,c5);&#xA;&#x9;&#x9;Collections.sort(cardList, new CardComparator(true,'C'));&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456996323144" sizeMeasure="55" warningCount="1">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Arrays;&#xA;import java.util.Collection;&#xA;import java.util.Collections;&#xA;import java.util.Comparator;&#xA;import java.util.List;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;ArrayList&lt;Character> suitList = new ArrayList&lt;Character>();&#x9;&#xA;&#x9;ArrayList&lt;Integer> faceList = new ArrayList&lt;Integer>();&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;suitList.addAll(Arrays.asList('C','D','H','S'));&#xA;&#x9;&#x9;faceList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;Card c1 = new Card('S', 1);&#xA;&#x9;&#x9;Card c2 = new Card('S', 13);&#xA;&#x9;&#x9;Card c3 = new Card('H', 1);&#xA;&#x9;&#x9;Card c4 = new Card('H', 13);&#xA;&#x9;&#x9;Card c5 = new Card('D', 1);&#xA;&#x9;&#x9;List&lt;Card> cardList = Arrays.asList(c1,c2,c3,c4,c5);&#xA;&#x9;&#x9;System.out.println(&quot;Before: &quot; + cardList.toString());&#xA;&#x9;&#x9;Collections.sort(cardList, new CardComparator(true,'C'));&#xA;&#x9;&#x9;System.out.println(&quot;After: &quot; + cardList.toString());&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1456996356862" sizeMeasure="55" warningCount="1">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Arrays;&#xA;import java.util.Collection;&#xA;import java.util.Collections;&#xA;import java.util.Comparator;&#xA;import java.util.List;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;ArrayList&lt;Character> suitList = new ArrayList&lt;Character>();&#x9;&#xA;&#x9;ArrayList&lt;Integer> faceList = new ArrayList&lt;Integer>();&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;suitList.addAll(Arrays.asList('C','D','H','S'));&#xA;&#x9;&#x9;faceList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;Card c1 = new Card('S', 1);&#xA;&#x9;&#x9;Card c2 = new Card('S', 13);&#xA;&#x9;&#x9;Card c3 = new Card('H', 1);&#xA;&#x9;&#x9;Card c4 = new Card('H', 13);&#xA;&#x9;&#x9;Card c5 = new Card('D', 1);&#xA;&#x9;&#x9;List&lt;Card> cardList = Arrays.asList(c1,c2,c3,c4,c5);&#xA;&#x9;&#x9;System.out.println(&quot;Before: &quot; + cardList.toString());&#xA;&#x9;&#x9;Collections.sort(cardList, new CardComparator(true,'H'));&#xA;&#x9;&#x9;System.out.println(&quot;After: &quot; + cardList.toString());&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457005065682" sizeMeasure="45" warningCount="1">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Arrays;&#xA;import java.util.Collection;&#xA;import java.util.Collections;&#xA;import java.util.Comparator;&#xA;import java.util.List;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;ArrayList&lt;Character> suitList = new ArrayList&lt;Character>();&#x9;&#xA;&#x9;ArrayList&lt;Integer> faceList = new ArrayList&lt;Integer>();&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;Card c1 = new Card('S', 1);&#xA;&#x9;&#x9;Card c2 = new Card('S', 13);&#xA;&#x9;&#x9;Card c3 = new Card('H', 1);&#xA;&#x9;&#x9;Card c4 = new Card('H', 13);&#xA;&#x9;&#x9;Card c5 = new Card('D', 1);&#xA;&#x9;&#x9;List&lt;Card> cardList = Arrays.asList(c1,c2,c3,c4,c5);&#xA;&#x9;&#x9;System.out.println(&quot;Before: &quot; + cardList.toString());&#xA;&#x9;&#x9;Collections.sort(cardList, new CardComparator(true,'H'));&#xA;&#x9;&#x9;System.out.println(&quot;After: &quot; + cardList.toString());&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457005405577" sizeMeasure="57" warningCount="1">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Arrays;&#xA;import java.util.Collection;&#xA;import java.util.Collections;&#xA;import java.util.Comparator;&#xA;import java.util.List;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;ArrayList&lt;Character> suitList = new ArrayList&lt;Character>();&#x9;&#xA;&#x9;ArrayList&lt;Integer> faceList = new ArrayList&lt;Integer>();&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;suitList.addAll(Arrays.asList('C','D','H','S'));&#xA;&#x9;&#x9;faceList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;if (suitList.contains(trumf)) {&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;Card c1 = new Card('S', 1);&#xA;&#x9;&#x9;Card c2 = new Card('S', 13);&#xA;&#x9;&#x9;Card c3 = new Card('H', 1);&#xA;&#x9;&#x9;Card c4 = new Card('H', 13);&#xA;&#x9;&#x9;Card c5 = new Card('D', 1);&#xA;&#x9;&#x9;List&lt;Card> cardList = Arrays.asList(c1,c2,c3,c4,c5);&#xA;&#x9;&#x9;System.out.println(&quot;Before: &quot; + cardList.toString());&#xA;&#x9;&#x9;Collections.sort(cardList, new CardComparator(true,'H'));&#xA;&#x9;&#x9;System.out.println(&quot;After: &quot; + cardList.toString());&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457005460042" sizeMeasure="57" warningCount="1">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Arrays;&#xA;import java.util.Collection;&#xA;import java.util.Collections;&#xA;import java.util.Comparator;&#xA;import java.util.List;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;ArrayList&lt;Character> suitList = new ArrayList&lt;Character>();&#x9;&#xA;&#x9;ArrayList&lt;Integer> faceList = new ArrayList&lt;Integer>();&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;suitList.addAll(Arrays.asList('C','D','H','S'));&#xA;&#x9;&#x9;faceList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;if (suitList.contains(trumf)) {&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public static void main(String[] args) {&#xA;&#x9;&#x9;Card c1 = new Card('S', 1);&#xA;&#x9;&#x9;Card c2 = new Card('S', 13);&#xA;&#x9;&#x9;Card c3 = new Card('H', 1);&#xA;&#x9;&#x9;Card c4 = new Card('H', 13);&#xA;&#x9;&#x9;Card c5 = new Card('D', 1);&#xA;&#x9;&#x9;List&lt;Card> cardList = Arrays.asList(c1,c2,c3,c4,c5);&#xA;&#x9;&#x9;System.out.println(&quot;Before: &quot; + cardList.toString());&#xA;&#x9;&#x9;Collections.sort(cardList, new CardComparator(false,'H'));&#xA;&#x9;&#x9;System.out.println(&quot;After: &quot; + cardList.toString());&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457005540977" sizeMeasure="44" warningCount="2">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Arrays;&#xA;import java.util.Collections;&#xA;import java.util.Comparator;&#xA;import java.util.List;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;ArrayList&lt;Character> suitList = new ArrayList&lt;Character>();&#x9;&#xA;&#x9;ArrayList&lt;Integer> faceList = new ArrayList&lt;Integer>();&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;suitList.addAll(Arrays.asList('C','D','H','S'));&#xA;&#x9;&#x9;faceList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;if (suitList.contains(trumf)) {&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;}&#x9;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457005547396" sizeMeasure="42">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Arrays;&#xA;import java.util.Comparator;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;ArrayList&lt;Character> suitList = new ArrayList&lt;Character>();&#x9;&#xA;&#x9;ArrayList&lt;Integer> faceList = new ArrayList&lt;Integer>();&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;suitList.addAll(Arrays.asList('C','D','H','S'));&#xA;&#x9;&#x9;faceList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;if (suitList.contains(trumf)) {&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;}&#x9;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457005640079" sizeMeasure="43" warningCount="1">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Arrays;&#xA;import java.util.Comparator;&#xA;import java.util.List;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;List&lt;Character> suitList = Arrays.asList('C','D','H','S');&#x9;&#xA;&#x9;List&lt;Integer> faceList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;suitList.addAll(Arrays.asList('C','D','H','S'));&#xA;&#x9;&#x9;faceList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;if (suitList.contains(trumf)) {&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;}&#x9;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457005651191" sizeMeasure="41" warningCount="1">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Arrays;&#xA;import java.util.Comparator;&#xA;import java.util.List;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;List&lt;Character> suitList = Arrays.asList('C','D','H','S');&#x9;&#xA;&#x9;List&lt;Integer> faceList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;if (suitList.contains(trumf)) {&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;}&#x9;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457005677608" sizeMeasure="42">
          <edit xsi:type="exercise:StringEdit" storedString="package interfaces;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Arrays;&#xA;import java.util.Comparator;&#xA;&#xA;public class CardComparator implements Comparator&lt;Card> {&#xA;&#xA;&#x9;//internal state&#xA;&#x9;boolean aceIsGreatest;&#xA;&#x9;char trumf;&#xA;&#x9;ArrayList&lt;Character> suitList = new ArrayList&lt;Character>();&#x9;&#xA;&#x9;ArrayList&lt;Integer> faceList = new ArrayList&lt;Integer>();&#x9;&#xA;&#x9;&#xA;&#x9;CardComparator(boolean aceIsGreatest, char trumf) {&#xA;&#x9;&#x9;this.aceIsGreatest = aceIsGreatest;&#xA;&#x9;&#x9;this.trumf = trumf;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public int compare(Card c1, Card c2) {&#xA;&#x9;&#x9;suitList.addAll(Arrays.asList('C','D','H','S'));&#xA;&#x9;&#x9;faceList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));&#xA;&#x9;&#x9;if (trumf != 'S') {&#xA;&#x9;&#x9;&#x9;if (suitList.contains(trumf)) {&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;suitList.remove(suitList.indexOf(trumf));&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;suitList.add(trumf);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (aceIsGreatest) {&#xA;&#x9;&#x9;&#x9;faceList.remove(0);&#xA;&#x9;&#x9;&#x9;faceList.add(1);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;int diff = suitList.indexOf(c1.toString().charAt(0)) - &#xA;&#x9;&#x9;&#x9;&#x9;suitList.indexOf(c2.toString().charAt(0));&#xA;&#x9;&#x9;if (diff  == 0) {&#xA;&#x9;&#x9;&#x9;diff = faceList.indexOf(c1.getFace()) - &#xA;&#x9;&#x9;&#x9;&#x9;&#x9;faceList.indexOf(c2.getFace());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;return diff;&#xA;&#x9;}&#x9;&#xA;}&#xA;"/>
        </attempts>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.0/@tasks.1/@q" answer="/0/@parts.0/@tasks.1/@a" completion="1.0">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1456950998902" completion="0.0" errorCount="3"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1456991495706" completion="0.0" errorCount="3"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457005502771" completion="1.0" successCount="3"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457005658353" completion="0.3333333333333333" successCount="1" errorCount="2"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457005681747" completion="1.0" successCount="3"/>
      </proposals>
    </proposals>
    <proposals exercisePart="/0/@parts.1">
      <proposals xsi:type="workbench:DebugEventProposal" question="/0/@parts.1/@tasks.0/@q" answer="/0/@parts.1/@tasks.0/@a" performedCount="7">
        <attempts timestamp="1456991803186"/>
        <attempts timestamp="1456996161660"/>
        <attempts timestamp="1456996192379"/>
        <attempts timestamp="1456996248833"/>
        <attempts timestamp="1456996327597"/>
        <attempts timestamp="1456996359881"/>
        <attempts timestamp="1456996383963"/>
      </proposals>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.1/@tasks.1/@q" answer="/0/@parts.1/@tasks.1/@a" performedCount="152">
        <attempts timestamp="1456991814802"/>
        <attempts timestamp="1456991815502"/>
        <attempts timestamp="1456991818987"/>
        <attempts timestamp="1456991829936"/>
        <attempts timestamp="1456991831811"/>
        <attempts timestamp="1456991832768"/>
        <attempts timestamp="1456991833521"/>
        <attempts timestamp="1456991834313"/>
        <attempts timestamp="1456991834784"/>
        <attempts timestamp="1456991835169"/>
        <attempts timestamp="1456991835793"/>
        <attempts timestamp="1456991836406"/>
        <attempts timestamp="1456991836967"/>
        <attempts timestamp="1456991837541"/>
        <attempts timestamp="1456991837963"/>
        <attempts timestamp="1456991838268"/>
        <attempts timestamp="1456991838549"/>
        <attempts timestamp="1456991838767"/>
        <attempts timestamp="1456991839012"/>
        <attempts timestamp="1456991839200"/>
        <attempts timestamp="1456991839443"/>
        <attempts timestamp="1456991839648"/>
        <attempts timestamp="1456991839838"/>
        <attempts timestamp="1456991840019"/>
        <attempts timestamp="1456991840183"/>
        <attempts timestamp="1456991841088"/>
        <attempts timestamp="1456991841382"/>
        <attempts timestamp="1456991841650"/>
        <attempts timestamp="1456991841917"/>
        <attempts timestamp="1456991842109"/>
        <attempts timestamp="1456991842312"/>
        <attempts timestamp="1456991842517"/>
        <attempts timestamp="1456991842715"/>
        <attempts timestamp="1456991842879"/>
        <attempts timestamp="1456991843551"/>
        <attempts timestamp="1456991843782"/>
        <attempts timestamp="1456991844445"/>
        <attempts timestamp="1456991844740"/>
        <attempts timestamp="1456991846244"/>
        <attempts timestamp="1456991846438"/>
        <attempts timestamp="1456991846627"/>
        <attempts timestamp="1456991846858"/>
        <attempts timestamp="1456991847073"/>
        <attempts timestamp="1456991847266"/>
        <attempts timestamp="1456991847724"/>
        <attempts timestamp="1456991847929"/>
        <attempts timestamp="1456991848096"/>
        <attempts timestamp="1456991848260"/>
        <attempts timestamp="1456991848592"/>
        <attempts timestamp="1456991849039"/>
        <attempts timestamp="1456991849269"/>
        <attempts timestamp="1456991849626"/>
        <attempts timestamp="1456991849805"/>
        <attempts timestamp="1456991849957"/>
        <attempts timestamp="1456991850124"/>
        <attempts timestamp="1456991850265"/>
        <attempts timestamp="1456991850404"/>
        <attempts timestamp="1456991850544"/>
        <attempts timestamp="1456991850685"/>
        <attempts timestamp="1456991850813"/>
        <attempts timestamp="1456991850953"/>
        <attempts timestamp="1456991851094"/>
        <attempts timestamp="1456991851262"/>
        <attempts timestamp="1456991851373"/>
        <attempts timestamp="1456991851527"/>
        <attempts timestamp="1456991851668"/>
        <attempts timestamp="1456991851808"/>
        <attempts timestamp="1456996168018"/>
        <attempts timestamp="1456996169219"/>
        <attempts timestamp="1456996193869"/>
        <attempts timestamp="1456996194214"/>
        <attempts timestamp="1456996194853"/>
        <attempts timestamp="1456996198594"/>
        <attempts timestamp="1456996199833"/>
        <attempts timestamp="1456996200536"/>
        <attempts timestamp="1456996200919"/>
        <attempts timestamp="1456996201212"/>
        <attempts timestamp="1456996201534"/>
        <attempts timestamp="1456996201889"/>
        <attempts timestamp="1456996250963"/>
        <attempts timestamp="1456996251576"/>
        <attempts timestamp="1456996252078"/>
        <attempts timestamp="1456996256482"/>
        <attempts timestamp="1456996258407"/>
        <attempts timestamp="1456996259211"/>
        <attempts timestamp="1456996260156"/>
        <attempts timestamp="1456996261257"/>
        <attempts timestamp="1456996261970"/>
        <attempts timestamp="1456996265187"/>
        <attempts timestamp="1456996266169"/>
        <attempts timestamp="1456996267601"/>
        <attempts timestamp="1456996267792"/>
        <attempts timestamp="1456996267983"/>
        <attempts timestamp="1456996268124"/>
        <attempts timestamp="1456996268264"/>
        <attempts timestamp="1456996268407"/>
        <attempts timestamp="1456996268545"/>
        <attempts timestamp="1456996329239"/>
        <attempts timestamp="1456996333578"/>
        <attempts timestamp="1456996335660"/>
        <attempts timestamp="1456996339990"/>
        <attempts timestamp="1456996361352"/>
        <attempts timestamp="1456996361877"/>
        <attempts timestamp="1456996362911"/>
        <attempts timestamp="1456996363471"/>
        <attempts timestamp="1456996367174"/>
        <attempts timestamp="1456996367992"/>
        <attempts timestamp="1456996385596"/>
        <attempts timestamp="1456996385992"/>
        <attempts timestamp="1456996386490"/>
        <attempts timestamp="1456996387294"/>
        <attempts timestamp="1456996389132"/>
        <attempts timestamp="1456996389873"/>
        <attempts timestamp="1456996390421"/>
        <attempts timestamp="1456996391161"/>
        <attempts timestamp="1456996392234"/>
        <attempts timestamp="1456996393706"/>
        <attempts timestamp="1456996396473"/>
        <attempts timestamp="1456996397686"/>
        <attempts timestamp="1456996398387"/>
        <attempts timestamp="1456996399115"/>
        <attempts timestamp="1456996399283"/>
        <attempts timestamp="1456996399435"/>
        <attempts timestamp="1456996399574"/>
        <attempts timestamp="1456996399727"/>
        <attempts timestamp="1456996400199"/>
        <attempts timestamp="1456996400352"/>
        <attempts timestamp="1456996400493"/>
        <attempts timestamp="1456996400634"/>
        <attempts timestamp="1456996400787"/>
        <attempts timestamp="1456996400929"/>
        <attempts timestamp="1456996401068"/>
        <attempts timestamp="1456996401212"/>
        <attempts timestamp="1456996401361"/>
        <attempts timestamp="1456996401514"/>
        <attempts timestamp="1456996401669"/>
        <attempts timestamp="1456996401808"/>
        <attempts timestamp="1456996401962"/>
        <attempts timestamp="1456996402127"/>
        <attempts timestamp="1456996402293"/>
        <attempts timestamp="1456996402434"/>
        <attempts timestamp="1456996402587"/>
        <attempts timestamp="1456996402739"/>
        <attempts timestamp="1456996402882"/>
        <attempts timestamp="1456996403035"/>
        <attempts timestamp="1456996403174"/>
        <attempts timestamp="1456996403327"/>
        <attempts timestamp="1456996403468"/>
        <attempts timestamp="1456996403638"/>
        <attempts timestamp="1456996403761"/>
        <attempts timestamp="1456996404094"/>
        <attempts timestamp="1456996410553"/>
      </proposals>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.1/@tasks.2/@q" answer="/0/@parts.1/@tasks.2/@a" performedCount="9">
        <attempts timestamp="1456991824946"/>
        <attempts timestamp="1456996196490"/>
        <attempts timestamp="1456996252980"/>
        <attempts timestamp="1456996388315"/>
        <attempts timestamp="1456996395055"/>
        <attempts timestamp="1456996404812"/>
        <attempts timestamp="1456996405702"/>
        <attempts timestamp="1456996406418"/>
        <attempts timestamp="1456996406890"/>
      </proposals>
      <proposals xsi:type="workbench:PartTaskProposal" question="/0/@parts.1/@tasks.3/@q" answer="/0/@parts.1/@tasks.3/@a" performedCount="3">
        <attempts timestamp="1456991809604"/>
        <attempts timestamp="1456996172438"/>
        <attempts timestamp="1456996212660"/>
      </proposals>
    </proposals>
  </exercise:ExerciseProposals>
</xmi:XMI>
