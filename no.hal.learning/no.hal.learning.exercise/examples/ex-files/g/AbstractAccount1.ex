<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:exercise="platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore" xmlns:jdt="platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore" xmlns:junit="platform:/plugin/no.hal.learning.exercise.junit/model/junit-exercise.ecore" xmlns:workbench="platform:/plugin/no.hal.learning.exercise.workbench/model/workbench-exercise.ecore">
  <exercise:Exercise>
    <parts xsi:type="exercise:ExercisePart" title="AbstractAccount">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write the source code for the abstract AbstractAccount class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="inheritance.AbstractAccount"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write the source code for the DebitAccount class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="inheritance.DebitAccount"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write the source code for the CreditAccount class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="inheritance.CreditAccount"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write the source code for the SavingsAccount2 class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="inheritance.SavingsAccount2"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the DebitAccountTest JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="inheritance.DebitAccountTest"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the CreditAccountTest JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="inheritance.CreditAccountTest"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the SavingsAccount2Test JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="inheritance.SavingsAccount2Test"/>
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
        <q xsi:type="exercise:StringQuestion" question="Run the DebitAccount class."/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="inheritance.DebitAccount"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the CreditAccount class."/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="inheritance.CreditAccount"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the SavingsAccount2 class."/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="inheritance.SavingsAccount2"/>
      </tasks>
    </parts>
  </exercise:Exercise>
  <exercise:ExerciseProposals exercise="/0">
    <proposals exercisePart="/0/@parts.0">
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.0/@q" answer="/0/@parts.0/@tasks.0/@a"/>
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.1/@q" answer="/0/@parts.0/@tasks.1/@a"/>
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.2/@q" answer="/0/@parts.0/@tasks.2/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459941663179" sizeMeasure="33">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class CreditAccount extends AbstractAccount {&#xA;&#x9;&#xA;&#x9;private double creditLine;&#xA;&#x9;&#xA;&#x9;public CreditAccount(double startCreditLine) {&#xA;&#x9;&#x9;creditLine = startCreditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void setCreditLine(double newCreditLine) {&#xA;&#x9;&#x9;if (newCreditLine &lt; 0 || newCreditLine != 0) {&#xA;&#x9;&#x9;&#x9;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (super.balance &lt; 0 &amp;&amp; newCreditLine &lt; Math.abs(super.balance)) {&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The credit line cannot be lower&quot;&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;+ &quot; than the current balance&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;creditLine = newCreditLine;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public double getCreditLine() {&#xA;&#x9;&#x9;return creditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public void internalWithdraw (double money) {&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459941861114" sizeMeasure="38">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class CreditAccount extends AbstractAccount {&#xA;&#x9;&#xA;&#x9;private double creditLine;&#xA;&#x9;&#xA;&#x9;public CreditAccount(double startCreditLine) {&#xA;&#x9;&#x9;creditLine = startCreditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void setCreditLine(double newCreditLine) {&#xA;&#x9;&#x9;if (newCreditLine &lt; 0 || newCreditLine != 0) {&#xA;&#x9;&#x9;&#x9;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (super.balance &lt; 0 &amp;&amp; newCreditLine &lt; Math.abs(super.balance)) {&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The credit line cannot be lower&quot;&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;+ &quot; than the current balance&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;creditLine = newCreditLine;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public double getCreditLine() {&#xA;&#x9;&#x9;return creditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public void internalWithdraw (double money) {&#xA;&#x9;&#x9;if (super.balance + creditLine &lt; money) {&#xA;&#x9;&#x9;&#x9;throw new IllegalArgumentException(&quot;The amount is too big.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;super.balance -= money;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459941901816" sizeMeasure="38">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class CreditAccount extends AbstractAccount {&#xA;&#x9;&#xA;&#x9;private double creditLine;&#xA;&#x9;&#xA;&#x9;public CreditAccount(double startCreditLine) {&#xA;&#x9;&#x9;creditLine = startCreditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void setCreditLine(double newCreditLine) {&#xA;&#x9;&#x9;if (newCreditLine &lt; 0 || newCreditLine != 0) {&#xA;&#x9;&#x9;&#x9;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (super.balance &lt; 0 &amp;&amp; newCreditLine &lt; Math.abs(super.balance)) {&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The credit line cannot be lower&quot;&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;+ &quot; than the current balance&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;creditLine = newCreditLine;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public double getCreditLine() {&#xA;&#x9;&#x9;return creditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public void internalWithdraw (double money) {&#xA;&#x9;&#x9;if (super.balance + creditLine &lt; money) {&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The amount is too big.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;super.balance -= money;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459941946386" sizeMeasure="38">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class CreditAccount extends AbstractAccount {&#xA;&#x9;&#xA;&#x9;private double creditLine;&#xA;&#x9;&#xA;&#x9;public CreditAccount(double startCreditLine) {&#xA;&#x9;&#x9;creditLine = startCreditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void setCreditLine(double newCreditLine) {&#xA;&#x9;&#x9;if (newCreditLine &lt; 0 || newCreditLine != 0) {&#xA;&#x9;&#x9;&#x9;throw new IllegalArgumentException(&quot;The credit line has to be at least 0.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (super.balance &lt; 0 &amp;&amp; newCreditLine &lt; Math.abs(super.balance)) {&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The credit line cannot be lower&quot;&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;+ &quot; than the current balance&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;creditLine = newCreditLine;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public double getCreditLine() {&#xA;&#x9;&#x9;return creditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public void internalWithdraw (double money) {&#xA;&#x9;&#x9;if (super.balance + creditLine &lt; money) {&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The amount is too big.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;super.balance -= money;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459942057001" sizeMeasure="38">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class CreditAccount extends AbstractAccount {&#xA;&#x9;&#xA;&#x9;private double creditLine;&#xA;&#x9;&#xA;&#x9;public CreditAccount(double startCreditLine) {&#xA;&#x9;&#x9;creditLine = startCreditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void setCreditLine(double newCreditLine) {&#xA;&#x9;&#x9;if (newCreditLine &lt;= 0) {&#xA;&#x9;&#x9;&#x9;throw new IllegalArgumentException(&quot;The credit line has to be at least 0.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (super.balance &lt; 0 &amp;&amp; newCreditLine &lt; Math.abs(super.balance)) {&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The credit line cannot be lower&quot;&#xA;&#x9;&#x9;&#x9;&#x9;&#x9;+ &quot; than the current balance&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;creditLine = newCreditLine;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public double getCreditLine() {&#xA;&#x9;&#x9;return creditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public void internalWithdraw (double money) {&#xA;&#x9;&#x9;if (super.balance + creditLine &lt; money) {&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The amount is too big.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;super.balance -= money;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
      </proposals>
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.3/@q" answer="/0/@parts.0/@tasks.3/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459942100331" sizeMeasure="5">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class SavingsAccount2 {&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459942492527" sizeMeasure="33">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class SavingsAccount2 extends AbstractAccount {&#xA;&#x9;&#xA;&#x9;private int withdrawals;&#xA;&#x9;private double fee;&#xA;&#x9;private int withdrawalsCount = 0;&#xA;&#x9;&#xA;&#x9;public SavingsAccount2 (int startWithdrawals, double startFee){&#xA;&#x9;&#x9;withdrawals = startWithdrawals;&#xA;&#x9;&#x9;fee = startFee;&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double money) {&#xA;&#x9;&#x9;if (money > super.balance) {&#xA;&#x9;&#x9;&#x9;throw new IllegalArgumentException(&quot;The balance is too low.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (withdrawalsCount == withdrawals) {&#xA;&#x9;&#x9;&#x9;if (money + fee > super.balance) {&#xA;&#x9;&#x9;&#x9;&#x9;throw new IllegalArgumentException(&quot;The balance is too low.&quot;);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;&#x9;super.balance -= (money + fee);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;super.balance -= money;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;withdrawalsCount ++;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459942530228" sizeMeasure="33">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class SavingsAccount2 extends AbstractAccount {&#xA;&#x9;&#xA;&#x9;private int withdrawals;&#xA;&#x9;private double fee;&#xA;&#x9;private int withdrawalsCount = 0;&#xA;&#x9;&#xA;&#x9;public SavingsAccount2 (int startWithdrawals, double startFee){&#xA;&#x9;&#x9;withdrawals = startWithdrawals;&#xA;&#x9;&#x9;fee = startFee;&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double money) {&#xA;&#x9;&#x9;if (money > super.balance) {&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance is too low.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (withdrawalsCount == withdrawals) {&#xA;&#x9;&#x9;&#x9;if (money + fee > super.balance) {&#xA;&#x9;&#x9;&#x9;&#x9;throw new IllegalArgumentException(&quot;The balance is too low.&quot;);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;&#x9;super.balance -= (money + fee);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;super.balance -= money;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;withdrawalsCount ++;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459942544373" sizeMeasure="33">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class SavingsAccount2 extends AbstractAccount {&#xA;&#x9;&#xA;&#x9;private int withdrawals;&#xA;&#x9;private double fee;&#xA;&#x9;private int withdrawalsCount = 0;&#xA;&#x9;&#xA;&#x9;public SavingsAccount2 (int startWithdrawals, double startFee){&#xA;&#x9;&#x9;withdrawals = startWithdrawals;&#xA;&#x9;&#x9;fee = startFee;&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double money) {&#xA;&#x9;&#x9;if (money > super.balance) {&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance is too low.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (withdrawalsCount == withdrawals) {&#xA;&#x9;&#x9;&#x9;if (money + fee > super.balance) {&#xA;&#x9;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance is too low.&quot;);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;&#x9;super.balance -= (money + fee);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;super.balance -= money;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;withdrawalsCount ++;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459942615410" sizeMeasure="33">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class SavingsAccount2 extends AbstractAccount {&#xA;&#x9;&#xA;&#x9;private int withdrawals;&#xA;&#x9;private double fee;&#xA;&#x9;private int withdrawalsCount = 0;&#xA;&#x9;&#xA;&#x9;public SavingsAccount2 (int startWithdrawals, double startFee){&#xA;&#x9;&#x9;withdrawals = startWithdrawals;&#xA;&#x9;&#x9;fee = startFee;&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double money) {&#xA;&#x9;&#x9;if (money > super.balance) {&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance is too low.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (withdrawalsCount == withdrawals) {&#xA;&#x9;&#x9;&#x9;if ((money + fee) > super.balance) {&#xA;&#x9;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance is too low.&quot;);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;&#x9;super.balance -= (money + fee);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;super.balance -= money;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;withdrawalsCount ++;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459942650179" sizeMeasure="33">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class SavingsAccount2 extends AbstractAccount {&#xA;&#x9;&#xA;&#x9;private int withdrawals;&#xA;&#x9;private double fee;&#xA;&#x9;private int withdrawalsCount = 0;&#xA;&#x9;&#xA;&#x9;public SavingsAccount2 (int startWithdrawals, double startFee){&#xA;&#x9;&#x9;withdrawals = startWithdrawals;&#xA;&#x9;&#x9;fee = startFee;&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double money) {&#xA;&#x9;&#x9;if (money > super.balance) {&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance is too low.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (withdrawalsCount + 1 == withdrawals) {&#xA;&#x9;&#x9;&#x9;if ((money + fee) > super.balance) {&#xA;&#x9;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance is too low.&quot;);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;&#x9;super.balance -= (money + fee);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;super.balance -= money;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;withdrawalsCount ++;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459942677081" sizeMeasure="33">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class SavingsAccount2 extends AbstractAccount {&#xA;&#x9;&#xA;&#x9;private int withdrawals;&#xA;&#x9;private double fee;&#xA;&#x9;private int withdrawalsCount = 0;&#xA;&#x9;&#xA;&#x9;public SavingsAccount2 (int startWithdrawals, double startFee){&#xA;&#x9;&#x9;withdrawals = startWithdrawals;&#xA;&#x9;&#x9;fee = startFee;&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double money) {&#xA;&#x9;&#x9;if (money > super.balance) {&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance is too low.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (withdrawalsCount == withdrawals) {&#xA;&#x9;&#x9;&#x9;if ((money + fee) > super.balance) {&#xA;&#x9;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance is too low.&quot;);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;&#x9;super.balance -= (money + fee);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;super.balance -= money;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;withdrawalsCount ++;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459942933640" sizeMeasure="34">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class SavingsAccount2 extends AbstractAccount {&#xA;&#x9;&#xA;&#x9;private int withdrawals;&#xA;&#x9;private double fee;&#xA;&#x9;private int withdrawalsCount = 0;&#xA;&#x9;&#xA;&#x9;public SavingsAccount2 (int startWithdrawals, double startFee){&#xA;&#x9;&#x9;withdrawals = startWithdrawals;&#xA;&#x9;&#x9;fee = startFee;&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double money) {&#xA;&#x9;&#x9;if (money > super.balance) {&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance is too low.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (withdrawalsCount == withdrawals) {&#xA;&#x9;&#x9;&#x9;if ((money + fee) > super.balance) {&#xA;&#x9;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance is too low.&quot;);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;&#x9;super.balance -= (money + fee);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;super.balance -= money;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;withdrawalsCount ++;&#x9;&#xA;&#x9;&#x9;System.out.println(super.balance + &quot;/n&quot;);&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459942967735" sizeMeasure="34">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class SavingsAccount2 extends AbstractAccount {&#xA;&#x9;&#xA;&#x9;private int withdrawals;&#xA;&#x9;private double fee;&#xA;&#x9;private int withdrawalsCount = 0;&#xA;&#x9;&#xA;&#x9;public SavingsAccount2 (int startWithdrawals, double startFee){&#xA;&#x9;&#x9;withdrawals = startWithdrawals;&#xA;&#x9;&#x9;fee = startFee;&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double money) {&#xA;&#x9;&#x9;if (money > super.balance) {&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance is too low.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (withdrawalsCount >= withdrawals) {&#xA;&#x9;&#x9;&#x9;if ((money + fee) > super.balance) {&#xA;&#x9;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance is too low.&quot;);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;&#x9;super.balance -= (money + fee);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;super.balance -= money;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;withdrawalsCount ++;&#x9;&#xA;&#x9;&#x9;System.out.println(super.balance + &quot;/n&quot;);&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459942977983" sizeMeasure="33">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class SavingsAccount2 extends AbstractAccount {&#xA;&#x9;&#xA;&#x9;private int withdrawals;&#xA;&#x9;private double fee;&#xA;&#x9;private int withdrawalsCount = 0;&#xA;&#x9;&#xA;&#x9;public SavingsAccount2 (int startWithdrawals, double startFee){&#xA;&#x9;&#x9;withdrawals = startWithdrawals;&#xA;&#x9;&#x9;fee = startFee;&#xA;&#x9;}&#xA;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double money) {&#xA;&#x9;&#x9;if (money > super.balance) {&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance is too low.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if (withdrawalsCount >= withdrawals) {&#xA;&#x9;&#x9;&#x9;if ((money + fee) > super.balance) {&#xA;&#x9;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance is too low.&quot;);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;&#x9;super.balance -= (money + fee);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;else {&#xA;&#x9;&#x9;&#x9;super.balance -= money;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;withdrawalsCount ++;&#x9;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.0/@tasks.4/@q" answer="/0/@parts.0/@tasks.4/@a" completion="1.0">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459942079791" completion="1.0" successCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459942081395" completion="1.0" successCount="2"/>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.0/@tasks.5/@q" answer="/0/@parts.0/@tasks.5/@a" completion="0.375">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459941862725" completion="1.0" successCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459941864879" completion="0.5" successCount="1" failureCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459941866576" completion="0.3333333333333333" successCount="1" failureCount="2"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459941875432" completion="0.25" successCount="1" failureCount="3"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459941902726" completion="0.4" successCount="2" failureCount="3"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459941905019" completion="0.3333333333333333" successCount="2" failureCount="4"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459941948498" completion="0.2857142857142857" successCount="2" failureCount="4" errorCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459942057901" completion="0.375" successCount="3" failureCount="4" errorCount="1"/>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.0/@tasks.6/@q" answer="/0/@parts.0/@tasks.6/@a" completion="0.2727272727272727">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459942497176" completion="1.0" successCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459942499576" completion="0.5" successCount="1" failureCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459942531116" completion="0.3333333333333333" successCount="1" failureCount="2"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459942545289" completion="0.25" successCount="1" failureCount="3"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459942556462" completion="0.4" successCount="2" failureCount="3"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459942562833" completion="0.3333333333333333" successCount="2" failureCount="4"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459942616314" completion="0.2857142857142857" successCount="2" failureCount="5"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459942651042" completion="0.25" successCount="2" failureCount="6"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459942677998" completion="0.2222222222222222" successCount="2" failureCount="7"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459942936096" completion="0.2" successCount="2" failureCount="8"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459942968731" completion="0.2727272727272727" successCount="3" failureCount="8"/>
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
    </proposals>
  </exercise:ExerciseProposals>
</xmi:XMI>
