<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:exercise="platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore" xmlns:jdt="platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore" xmlns:workbench="platform:/plugin/no.hal.learning.exercise.workbench/model/workbench-exercise.ecore">
  <exercise:Exercise>
    <parts xsi:type="exercise:ExercisePart" title="StringMergingIterator">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Copy the source code for the StringMergingIterator class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="debugging.StringMergingIterator"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Copy the source code for the StringMergingIteratorProgram class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="debugging.StringMergingIteratorProgram"/>
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
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457269522140" sizeMeasure="52">
          <edit xsi:type="exercise:StringEdit" storedString="package debugging;&#xA;&#xA;import java.util.Iterator;&#xA;import java.util.NoSuchElementException;&#xA;&#xA;public class StringMergingIterator implements Iterator&lt;String> {&#xA;&#xA;&#x9;private Iterator&lt;String> first;&#xA;&#x9;private Iterator&lt;String> second;&#xA;&#x9;private boolean turnSwitch;&#xA;&#xA;&#x9;public StringMergingIterator(Iterator&lt;String> first, Iterator&lt;String> second){&#xA;&#x9;&#x9;this.first = first;&#xA;&#x9;&#x9;this.second = second;&#xA;&#x9;&#x9;this.turnSwitch = true;&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;public boolean hasNext() {&#xA;&#x9;&#x9;return first.hasNext() || second.hasNext();&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;public String next() {&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;if(! hasNext()){ throw new NoSuchElementException(); }&#xA;&#xA;&#x9;&#x9;String result = null;&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;if(! first.hasNext()){&#xA;&#x9;&#x9;&#x9;result = first.next();&#xA;&#x9;&#x9;} &#xA;&#x9;&#x9;else if(! second.hasNext()){&#xA;&#x9;&#x9;&#x9;result = second.next();&#xA;&#x9;&#x9;} &#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;if(turnSwitch){&#xA;&#x9;&#x9;&#x9;&#x9;result = first.next();&#xA;&#x9;&#x9;&#x9;&#x9;turnSwitch = false;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;if(!turnSwitch){&#xA;&#x9;&#x9;&#x9;&#x9;result = second.next();&#xA;&#x9;&#x9;&#x9;&#x9;turnSwitch = true;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;return result;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457271995789" sizeMeasure="58">
          <edit xsi:type="exercise:StringEdit" storedString="package debugging;&#xA;&#xA;import java.util.Iterator;&#xA;import java.util.NoSuchElementException;&#xA;&#xA;public class StringMergingIterator implements Iterator&lt;String> {&#xA;&#xA;&#x9;private Iterator&lt;String> first;&#xA;&#x9;private Iterator&lt;String> second;&#xA;&#x9;private boolean turnSwitch;&#xA;&#xA;&#x9;public StringMergingIterator(Iterator&lt;String> first, Iterator&lt;String> second){&#xA;&#x9;&#x9;this.first = first;&#xA;&#x9;&#x9;this.second = second;&#xA;&#x9;&#x9;this.turnSwitch = true;&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;public boolean hasNext() {&#xA;&#x9;&#x9;return first.hasNext() || second.hasNext();&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;public String next() {&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;if(! hasNext()){ throw new NoSuchElementException(); }&#xA;&#xA;&#x9;&#x9;String result = null;&#xA;&#x9;&#x9;&#xA;//&#x9;&#x9;if(! first.hasNext()){&#xA;//&#x9;&#x9;&#x9;result = first.next();&#xA;//&#x9;&#x9;} &#xA;//&#x9;&#x9;else if(! second.hasNext()){&#xA;//&#x9;&#x9;&#x9;result = second.next();&#xA;//&#x9;&#x9;}&#xA;&#x9;&#x9;if(! first.hasNext()){&#xA;&#x9;&#x9;&#x9;result = second.next();&#xA;&#x9;&#x9;} &#xA;&#x9;&#x9;else if(! second.hasNext()){&#xA;&#x9;&#x9;&#x9;result = first.next();&#xA;&#x9;&#x9;} &#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;if(turnSwitch){&#xA;&#x9;&#x9;&#x9;&#x9;result = first.next();&#xA;&#x9;&#x9;&#x9;&#x9;turnSwitch = false;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;if(!turnSwitch){&#xA;&#x9;&#x9;&#x9;&#x9;result = second.next();&#xA;&#x9;&#x9;&#x9;&#x9;turnSwitch = true;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;return result;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457272217437" sizeMeasure="58">
          <edit xsi:type="exercise:StringEdit" storedString="package debugging;&#xA;&#xA;import java.util.Iterator;&#xA;import java.util.NoSuchElementException;&#xA;&#xA;public class StringMergingIterator implements Iterator&lt;String> {&#xA;&#xA;&#x9;private Iterator&lt;String> first;&#xA;&#x9;private Iterator&lt;String> second;&#xA;&#x9;private boolean turnSwitch;&#xA;&#xA;&#x9;public StringMergingIterator(Iterator&lt;String> first, Iterator&lt;String> second){&#xA;&#x9;&#x9;this.first = first;&#xA;&#x9;&#x9;this.second = second;&#xA;&#x9;&#x9;this.turnSwitch = true;&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;public boolean hasNext() {&#xA;&#x9;&#x9;return first.hasNext() || second.hasNext();&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;public String next() {&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;if(! hasNext()){ throw new NoSuchElementException(); }&#xA;&#xA;&#x9;&#x9;String result = null;&#xA;&#x9;&#x9;&#xA;//&#x9;&#x9;if(! first.hasNext()){&#xA;//&#x9;&#x9;&#x9;result = first.next();&#xA;//&#x9;&#x9;} &#xA;//&#x9;&#x9;else if(! second.hasNext()){&#xA;//&#x9;&#x9;&#x9;result = second.next();&#xA;//&#x9;&#x9;}&#xA;&#x9;&#x9;if(! first.hasNext()){&#xA;&#x9;&#x9;&#x9;result += second.next();&#xA;&#x9;&#x9;} &#xA;&#x9;&#x9;else if(! second.hasNext()){&#xA;&#x9;&#x9;&#x9;result += first.next();&#xA;&#x9;&#x9;} &#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;if(turnSwitch){&#xA;&#x9;&#x9;&#x9;&#x9;result += first.next();&#xA;&#x9;&#x9;&#x9;&#x9;turnSwitch = false;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;if(!turnSwitch){&#xA;&#x9;&#x9;&#x9;&#x9;result += second.next();&#xA;&#x9;&#x9;&#x9;&#x9;turnSwitch = true;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;return result;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457272340333" sizeMeasure="58">
          <edit xsi:type="exercise:StringEdit" storedString="package debugging;&#xA;&#xA;import java.util.Iterator;&#xA;import java.util.NoSuchElementException;&#xA;&#xA;public class StringMergingIterator implements Iterator&lt;String> {&#xA;&#xA;&#x9;private Iterator&lt;String> first;&#xA;&#x9;private Iterator&lt;String> second;&#xA;&#x9;private boolean turnSwitch;&#xA;&#xA;&#x9;public StringMergingIterator(Iterator&lt;String> first, Iterator&lt;String> second){&#xA;&#x9;&#x9;this.first = first;&#xA;&#x9;&#x9;this.second = second;&#xA;&#x9;&#x9;this.turnSwitch = true;&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;public boolean hasNext() {&#xA;&#x9;&#x9;return first.hasNext() || second.hasNext();&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;public String next() {&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;if(! hasNext()){ throw new NoSuchElementException(); }&#xA;&#xA;&#x9;&#x9;String result = null;&#xA;&#x9;&#x9;&#xA;//&#x9;&#x9;if(! first.hasNext()){&#xA;//&#x9;&#x9;&#x9;result = first.next();&#xA;//&#x9;&#x9;} &#xA;//&#x9;&#x9;else if(! second.hasNext()){&#xA;//&#x9;&#x9;&#x9;result = second.next();&#xA;//&#x9;&#x9;}&#xA;&#x9;&#x9;if(! first.hasNext()){&#xA;&#x9;&#x9;&#x9;result = second.next();&#xA;&#x9;&#x9;} &#xA;&#x9;&#x9;else if(! second.hasNext()){&#xA;&#x9;&#x9;&#x9;result = first.next();&#xA;&#x9;&#x9;} &#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;if(turnSwitch){&#xA;&#x9;&#x9;&#x9;&#x9;result = first.next();&#xA;&#x9;&#x9;&#x9;&#x9;turnSwitch = false;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;if(!turnSwitch){&#xA;&#x9;&#x9;&#x9;&#x9;result = second.next();&#xA;&#x9;&#x9;&#x9;&#x9;turnSwitch = true;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;return result;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457272361741" sizeMeasure="59">
          <edit xsi:type="exercise:StringEdit" storedString="package debugging;&#xA;&#xA;import java.util.Iterator;&#xA;import java.util.NoSuchElementException;&#xA;&#xA;public class StringMergingIterator implements Iterator&lt;String> {&#xA;&#xA;&#x9;private Iterator&lt;String> first;&#xA;&#x9;private Iterator&lt;String> second;&#xA;&#x9;private boolean turnSwitch;&#xA;&#xA;&#x9;public StringMergingIterator(Iterator&lt;String> first, Iterator&lt;String> second){&#xA;&#x9;&#x9;this.first = first;&#xA;&#x9;&#x9;this.second = second;&#xA;&#x9;&#x9;this.turnSwitch = true;&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;public boolean hasNext() {&#xA;&#x9;&#x9;return first.hasNext() || second.hasNext();&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;public String next() {&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;if(! hasNext()){ throw new NoSuchElementException(); }&#xA;&#xA;&#x9;&#x9;String result = null;&#xA;&#x9;&#x9;&#xA;//&#x9;&#x9;if(! first.hasNext()){&#xA;//&#x9;&#x9;&#x9;result = first.next();&#xA;//&#x9;&#x9;} &#xA;//&#x9;&#x9;else if(! second.hasNext()){&#xA;//&#x9;&#x9;&#x9;result = second.next();&#xA;//&#x9;&#x9;}&#xA;&#x9;&#x9;if(! first.hasNext()){&#xA;&#x9;&#x9;&#x9;result = second.next();&#xA;&#x9;&#x9;} &#xA;&#x9;&#x9;else if(! second.hasNext()){&#xA;&#x9;&#x9;&#x9;result = first.next();&#xA;&#x9;&#x9;} &#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;if(turnSwitch){&#xA;&#x9;&#x9;&#x9;&#x9;result = first.next();&#xA;&#x9;&#x9;&#x9;&#x9;//turnSwitch = false;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;if(!turnSwitch){&#xA;&#x9;&#x9;&#x9;&#x9;result = second.next();&#xA;&#x9;&#x9;&#x9;&#x9;//turnSwitch = true;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;turnSwitch = !turnSwitch;&#xA;&#x9;&#x9;&#x9;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;return result;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457272431687" sizeMeasure="-1" errorCount="-1" warningCount="-1"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457272465709" sizeMeasure="59">
          <edit xsi:type="exercise:StringEdit" storedString="package debugging;&#xA;&#xA;import java.util.Iterator;&#xA;import java.util.NoSuchElementException;&#xA;&#xA;public class StringMergingIterator implements Iterator&lt;String> {&#xA;&#xA;&#x9;private Iterator&lt;String> first;&#xA;&#x9;private Iterator&lt;String> second;&#xA;&#x9;private boolean turnSwitch;&#xA;&#xA;&#x9;public StringMergingIterator(Iterator&lt;String> first, Iterator&lt;String> second){&#xA;&#x9;&#x9;this.first = first;&#xA;&#x9;&#x9;this.second = second;&#xA;&#x9;&#x9;this.turnSwitch = true;&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;public boolean hasNext() {&#xA;&#x9;&#x9;return first.hasNext() || second.hasNext();&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;public String next() {&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;if(! hasNext()){ throw new NoSuchElementException(); }&#xA;&#xA;&#x9;&#x9;String result = null;&#xA;&#x9;&#x9;&#xA;//&#x9;&#x9;if(! first.hasNext()){&#xA;//&#x9;&#x9;&#x9;result = first.next();&#xA;//&#x9;&#x9;} &#xA;//&#x9;&#x9;else if(! second.hasNext()){&#xA;//&#x9;&#x9;&#x9;result = second.next();&#xA;//&#x9;&#x9;}&#xA;&#x9;&#x9;if(! first.hasNext()){&#xA;&#x9;&#x9;&#x9;result = second.next();&#xA;&#x9;&#x9;} &#xA;&#x9;&#x9;else if(! second.hasNext()){&#xA;&#x9;&#x9;&#x9;result = first.next();&#xA;&#x9;&#x9;} &#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;if(turnSwitch){&#xA;&#x9;&#x9;&#x9;&#x9;result = first.next();&#xA;&#x9;&#x9;&#x9;&#x9;//turnSwitch = false;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;if(!turnSwitch){&#xA;&#x9;&#x9;&#x9;&#x9;result = second.next();&#xA;&#x9;&#x9;&#x9;&#x9;//turnSwitch = true;&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;turnSwitch = !turnSwitch;&#xA;&#x9;&#x9;&#x9;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;return result;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;&#xA;}&#xA;"/>
        </attempts>
      </proposals>
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.1/@q" answer="/0/@parts.0/@tasks.1/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457269519983" sizeMeasure="40">
          <edit xsi:type="exercise:StringEdit" storedString="package debugging;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Iterator;&#xA;import java.util.List;&#xA;&#xA;import org.eclipse.xtext.xbase.lib.CollectionLiterals;&#xA;&#xA;public class StringMergingIteratorProgram {&#xA;&#xA;&#x9;public static void main(String[] args) throws Exception {&#xA;&#xA;&#x9;&#x9;Iterator&lt;String> one = CollectionLiterals.&lt;String>newArrayList(&quot;a&quot;, &quot;b&quot;).iterator();&#xA;&#x9;&#x9;Iterator&lt;String> two = CollectionLiterals.&lt;String>newArrayList(&quot;c&quot;, &quot;d&quot;, &quot;e&quot;).iterator();&#xA;&#x9;&#x9; &#xA;&#x9;&#x9;StringMergingIterator mergeIterator = new StringMergingIterator(one, two); &#xA;&#x9;&#x9;&#xA;&#x9;&#x9;List&lt;String> values = new ArrayList&lt;String>();&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;while(mergeIterator.hasNext()){&#xA;&#x9;&#x9;&#x9;values.add(mergeIterator.next());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;List&lt;String> expectedOutput = CollectionLiterals.&lt;String>newArrayList(&quot;a&quot;, &quot;c&quot;, &quot;b&quot;, &quot;d&quot;, &quot;e&quot;);&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;if(values.size() != expectedOutput.size()){&#xA;&#x9;&#x9;&#x9;throw new Exception(&quot;The merged output did not contain the expected number of values. Try using the Eclipse debugger to see the difference between the lists.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;for(int i = 0; i &lt; expectedOutput.size(); i++){&#xA;&#x9;&#x9;&#x9;if(! values.get(i).equals(expectedOutput.get(i))){&#xA;&#x9;&#x9;&#x9;&#x9;throw new Exception(&quot;The iterator did not correctly merge the output. Try using the Eclipse debugger to see the difference between the lists.&quot;);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;System.out.println(&quot;Success! StringMergingIterator correctly merged the output of the two lists.&quot;);&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457272119465" sizeMeasure="41">
          <edit xsi:type="exercise:StringEdit" storedString="package debugging;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Iterator;&#xA;import java.util.List;&#xA;&#xA;import org.eclipse.xtext.xbase.lib.CollectionLiterals;&#xA;&#xA;public class StringMergingIteratorProgram {&#xA;&#xA;&#x9;public static void main(String[] args) throws Exception {&#xA;&#xA;&#x9;&#x9;Iterator&lt;String> one = CollectionLiterals.&lt;String>newArrayList(&quot;a&quot;, &quot;b&quot;).iterator();&#xA;&#x9;&#x9;Iterator&lt;String> two = CollectionLiterals.&lt;String>newArrayList(&quot;c&quot;, &quot;d&quot;, &quot;e&quot;).iterator();&#xA;&#x9;&#x9; &#xA;&#x9;&#x9;StringMergingIterator mergeIterator = new StringMergingIterator(one, two); &#xA;&#x9;&#x9;&#xA;&#x9;&#x9;List&lt;String> values = new ArrayList&lt;String>();&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;while(mergeIterator.hasNext()){&#xA;&#x9;&#x9;&#x9;values.add(mergeIterator.next());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;List&lt;String> expectedOutput = CollectionLiterals.&lt;String>newArrayList(&quot;a&quot;, &quot;c&quot;, &quot;b&quot;, &quot;d&quot;, &quot;e&quot;);&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;if(values.size() != expectedOutput.size()){&#xA;&#x9;&#x9;&#x9;System.out.println(values);&#xA;&#x9;&#x9;&#x9;throw new Exception(&quot;The merged output did not contain the expected number of values. Try using the Eclipse debugger to see the difference between the lists.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;for(int i = 0; i &lt; expectedOutput.size(); i++){&#xA;&#x9;&#x9;&#x9;if(! values.get(i).equals(expectedOutput.get(i))){&#xA;&#x9;&#x9;&#x9;&#x9;throw new Exception(&quot;The iterator did not correctly merge the output. Try using the Eclipse debugger to see the difference between the lists.&quot;);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;System.out.println(&quot;Success! StringMergingIterator correctly merged the output of the two lists.&quot;);&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457272130958" sizeMeasure="40">
          <edit xsi:type="exercise:StringEdit" storedString="package debugging;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Iterator;&#xA;import java.util.List;&#xA;&#xA;import org.eclipse.xtext.xbase.lib.CollectionLiterals;&#xA;&#xA;public class StringMergingIteratorProgram {&#xA;&#xA;&#x9;public static void main(String[] args) throws Exception {&#xA;&#xA;&#x9;&#x9;Iterator&lt;String> one = CollectionLiterals.&lt;String>newArrayList(&quot;a&quot;, &quot;b&quot;).iterator();&#xA;&#x9;&#x9;Iterator&lt;String> two = CollectionLiterals.&lt;String>newArrayList(&quot;c&quot;, &quot;d&quot;, &quot;e&quot;).iterator();&#xA;&#x9;&#x9; &#xA;&#x9;&#x9;StringMergingIterator mergeIterator = new StringMergingIterator(one, two); &#xA;&#x9;&#x9;&#xA;&#x9;&#x9;List&lt;String> values = new ArrayList&lt;String>();&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;while(mergeIterator.hasNext()){&#xA;&#x9;&#x9;&#x9;values.add(mergeIterator.next());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;List&lt;String> expectedOutput = CollectionLiterals.&lt;String>newArrayList(&quot;a&quot;, &quot;c&quot;, &quot;b&quot;, &quot;d&quot;, &quot;e&quot;);&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;if(values.size() != expectedOutput.size()){&#xA;&#x9;&#x9;&#x9;throw new Exception(&quot;The merged output did not contain the expected number of values. Try using the Eclipse debugger to see the difference between the lists.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;for(int i = 0; i &lt; expectedOutput.size(); i++){&#xA;&#x9;&#x9;&#x9;if(! values.get(i).equals(expectedOutput.get(i))){&#xA;&#x9;&#x9;&#x9;&#x9;throw new Exception(&quot;The iterator did not correctly merge the output. Try using the Eclipse debugger to see the difference between the lists.&quot;);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;System.out.println(&quot;Success! StringMergingIterator correctly merged the output of the two lists.&quot;);&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457272431632" sizeMeasure="-1" errorCount="-1" warningCount="-1"/>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457272465655" sizeMeasure="40">
          <edit xsi:type="exercise:StringEdit" storedString="package debugging;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Iterator;&#xA;import java.util.List;&#xA;&#xA;import org.eclipse.xtext.xbase.lib.CollectionLiterals;&#xA;&#xA;public class StringMergingIteratorProgram {&#xA;&#xA;&#x9;public static void main(String[] args) throws Exception {&#xA;&#xA;&#x9;&#x9;Iterator&lt;String> one = CollectionLiterals.&lt;String>newArrayList(&quot;a&quot;, &quot;b&quot;).iterator();&#xA;&#x9;&#x9;Iterator&lt;String> two = CollectionLiterals.&lt;String>newArrayList(&quot;c&quot;, &quot;d&quot;, &quot;e&quot;).iterator();&#xA;&#x9;&#x9; &#xA;&#x9;&#x9;StringMergingIterator mergeIterator = new StringMergingIterator(one, two); &#xA;&#x9;&#x9;&#xA;&#x9;&#x9;List&lt;String> values = new ArrayList&lt;String>();&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;while(mergeIterator.hasNext()){&#xA;&#x9;&#x9;&#x9;values.add(mergeIterator.next());&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;List&lt;String> expectedOutput = CollectionLiterals.&lt;String>newArrayList(&quot;a&quot;, &quot;c&quot;, &quot;b&quot;, &quot;d&quot;, &quot;e&quot;);&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;if(values.size() != expectedOutput.size()){&#xA;&#x9;&#x9;&#x9;throw new Exception(&quot;The merged output did not contain the expected number of values. Try using the Eclipse debugger to see the difference between the lists.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;for(int i = 0; i &lt; expectedOutput.size(); i++){&#xA;&#x9;&#x9;&#x9;if(! values.get(i).equals(expectedOutput.get(i))){&#xA;&#x9;&#x9;&#x9;&#x9;throw new Exception(&quot;The iterator did not correctly merge the output. Try using the Eclipse debugger to see the difference between the lists.&quot;);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;&#x9;System.out.println(&quot;Success! StringMergingIterator correctly merged the output of the two lists.&quot;);&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
      </proposals>
    </proposals>
    <proposals exercisePart="/0/@parts.1">
      <proposals xsi:type="workbench:DebugEventProposal" question="/0/@parts.1/@tasks.0/@q" answer="/0/@parts.1/@tasks.0/@a" performedCount="11">
        <attempts timestamp="1457271921327"/>
        <attempts timestamp="1457271928770"/>
        <attempts timestamp="1457271949270"/>
        <attempts timestamp="1457271958660"/>
        <attempts timestamp="1457271962340"/>
        <attempts timestamp="1457271965500"/>
        <attempts timestamp="1457271967829"/>
        <attempts timestamp="1457271968254"/>
        <attempts timestamp="1457272157633"/>
        <attempts timestamp="1457272223297"/>
        <attempts timestamp="1457272290909"/>
      </proposals>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.1/@tasks.1/@q" answer="/0/@parts.1/@tasks.1/@a"/>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.1/@tasks.2/@q" answer="/0/@parts.1/@tasks.2/@a" performedCount="81">
        <attempts timestamp="1457271928770"/>
        <attempts timestamp="1457271929498"/>
        <attempts timestamp="1457271931980"/>
        <attempts timestamp="1457271937438"/>
        <attempts timestamp="1457271941390"/>
        <attempts timestamp="1457271945530"/>
        <attempts timestamp="1457271947240"/>
        <attempts timestamp="1457271947950"/>
        <attempts timestamp="1457271949269"/>
        <attempts timestamp="1457271952651"/>
        <attempts timestamp="1457271954765"/>
        <attempts timestamp="1457271955658"/>
        <attempts timestamp="1457271956180"/>
        <attempts timestamp="1457271956510"/>
        <attempts timestamp="1457271956900"/>
        <attempts timestamp="1457271957216"/>
        <attempts timestamp="1457271957561"/>
        <attempts timestamp="1457271958110"/>
        <attempts timestamp="1457271958660"/>
        <attempts timestamp="1457271958960"/>
        <attempts timestamp="1457271959400"/>
        <attempts timestamp="1457271960093"/>
        <attempts timestamp="1457271960550"/>
        <attempts timestamp="1457271961120"/>
        <attempts timestamp="1457271961580"/>
        <attempts timestamp="1457271962040"/>
        <attempts timestamp="1457271962340"/>
        <attempts timestamp="1457271962650"/>
        <attempts timestamp="1457271962991"/>
        <attempts timestamp="1457271963290"/>
        <attempts timestamp="1457271963574"/>
        <attempts timestamp="1457271963838"/>
        <attempts timestamp="1457271964090"/>
        <attempts timestamp="1457271964381"/>
        <attempts timestamp="1457271964683"/>
        <attempts timestamp="1457271965040"/>
        <attempts timestamp="1457271965500"/>
        <attempts timestamp="1457271965898"/>
        <attempts timestamp="1457271966391"/>
        <attempts timestamp="1457271966676"/>
        <attempts timestamp="1457271966920"/>
        <attempts timestamp="1457271967135"/>
        <attempts timestamp="1457271967380"/>
        <attempts timestamp="1457271967610"/>
        <attempts timestamp="1457271967828"/>
        <attempts timestamp="1457271968036"/>
        <attempts timestamp="1457271968251"/>
        <attempts timestamp="1457271968476"/>
        <attempts timestamp="1457271968701"/>
        <attempts timestamp="1457272162859"/>
        <attempts timestamp="1457272163545"/>
        <attempts timestamp="1457272164090"/>
        <attempts timestamp="1457272167469"/>
        <attempts timestamp="1457272180848"/>
        <attempts timestamp="1457272185171"/>
        <attempts timestamp="1457272191072"/>
        <attempts timestamp="1457272229879"/>
        <attempts timestamp="1457272230589"/>
        <attempts timestamp="1457272232299"/>
        <attempts timestamp="1457272234239"/>
        <attempts timestamp="1457272244405"/>
        <attempts timestamp="1457272245739"/>
        <attempts timestamp="1457272247170"/>
        <attempts timestamp="1457272250289"/>
        <attempts timestamp="1457272256039"/>
        <attempts timestamp="1457272277189"/>
        <attempts timestamp="1457272278659"/>
        <attempts timestamp="1457272280807"/>
        <attempts timestamp="1457272282710"/>
        <attempts timestamp="1457272283367"/>
        <attempts timestamp="1457272284416"/>
        <attempts timestamp="1457272287522"/>
        <attempts timestamp="1457272290328"/>
        <attempts timestamp="1457272290909"/>
        <attempts timestamp="1457272307814"/>
        <attempts timestamp="1457272310739"/>
        <attempts timestamp="1457272311749"/>
        <attempts timestamp="1457272315419"/>
        <attempts timestamp="1457272316846"/>
        <attempts timestamp="1457272317389"/>
        <attempts timestamp="1457272317829"/>
      </proposals>
      <proposals xsi:type="workbench:PartTaskProposal" question="/0/@parts.1/@tasks.3/@q" answer="/0/@parts.1/@tasks.3/@a" performedCount="2">
        <attempts timestamp="1457272169477"/>
        <attempts timestamp="1457272236294"/>
      </proposals>
    </proposals>
  </exercise:ExerciseProposals>
</xmi:XMI>
