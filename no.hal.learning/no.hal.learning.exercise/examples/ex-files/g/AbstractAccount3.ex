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
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.0/@q" answer="/0/@parts.0/@tasks.0/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459940627332" sizeMeasure="5">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public abstract class AbstractAccount {&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459940869965" sizeMeasure="26">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public abstract class AbstractAccount {&#xA;&#xA;&#x9;protected double balance;&#xA;&#x9;&#xA;&#x9;public void deposit(double amount){&#xA;&#x9;&#x9;if(amount &lt; 0){&#xA;    &#x9;&#x9;throw new IllegalArgumentException(&quot;Amount is negative.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;balance += amount;&#xA;&#x9;}&#xA;&#x9;&#xA;    public void withdraw(double amount){&#xA;    &#x9;if(amount &lt; 0){&#xA;    &#x9;&#x9;throw new IllegalArgumentException(&quot;Amount is negative.&quot;);&#xA;    &#x9;}&#xA;    &#x9;internalWithdraw(amount);&#xA;    }&#xA;    &#xA;    public double getBalance(){&#xA;    &#x9;return balance;&#xA;    }&#xA;    &#xA;    protected abstract void internalWithdraw(double amount) throws IllegalStateException;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459940964608" sizeMeasure="26">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public abstract class AbstractAccount {&#xA;&#xA;&#x9;protected double balance;&#xA;&#x9;&#xA;&#x9;public void deposit(double amount){&#xA;&#x9;&#x9;if(amount &lt; 0){&#xA;    &#x9;&#x9;throw new IllegalArgumentException(&quot;Amount is negative.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;balance += amount;&#xA;&#x9;}&#xA;&#x9;&#xA;    public void withdraw(double amount){&#xA;    &#x9;if(amount &lt; 0){&#xA;    &#x9;&#x9;throw new IllegalArgumentException(&quot;Amount is negative.&quot;);&#xA;    &#x9;}&#xA;    &#x9;internalWithdraw(amount);&#xA;    }&#xA;    &#xA;    public double getBalance(){&#xA;    &#x9;return balance;&#xA;    }&#xA;    &#xA;    protected abstract void internalWithdraw(double amount);&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459943273969" sizeMeasure="27">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public abstract class AbstractAccount {&#xA;&#xA;&#x9;protected double balance;&#xA;&#x9;&#xA;&#x9;public void deposit(double amount){&#xA;&#x9;&#x9;if(amount &lt; 0){&#xA;    &#x9;&#x9;throw new IllegalArgumentException(&quot;Amount is negative.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;balance += amount;&#xA;&#x9;}&#xA;&#x9;&#xA;    public void withdraw(double amount){&#xA;    &#x9;if(amount &lt; 0){&#xA;    &#x9;&#x9;throw new IllegalArgumentException(&quot;Amount is negative.&quot;);&#xA;    &#x9;} else{&#xA;    &#x9;&#x9;internalWithdraw(amount);    &#x9;&#x9;&#xA;    &#x9;}&#xA;    }&#xA;    &#xA;    public double getBalance(){&#xA;    &#x9;return balance;&#xA;    }&#xA;    &#xA;    protected abstract void internalWithdraw(double amount);&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459943278139" sizeMeasure="26">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public abstract class AbstractAccount {&#xA;&#xA;&#x9;protected double balance;&#xA;&#x9;&#xA;&#x9;public void deposit(double amount){&#xA;&#x9;&#x9;if(amount &lt; 0){&#xA;    &#x9;&#x9;throw new IllegalArgumentException(&quot;Amount is negative.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;balance += amount;&#xA;&#x9;}&#xA;&#x9;&#xA;    public void withdraw(double amount){&#xA;    &#x9;if(amount &lt; 0){&#xA;    &#x9;&#x9;throw new IllegalArgumentException(&quot;Amount is negative.&quot;);&#xA;    &#x9;}&#xA;    &#x9;internalWithdraw(amount);&#xA;    }&#xA;    &#xA;    public double getBalance(){&#xA;    &#x9;return balance;&#xA;    }&#xA;    &#xA;    protected abstract void internalWithdraw(double amount);&#xA;}&#xA;"/>
        </attempts>
      </proposals>
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.1/@q" answer="/0/@parts.0/@tasks.1/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459940927459" sizeMeasure="11">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class DebitAccount extends AbstractAccount {&#xA;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) throws IllegalStateException {&#xA;&#x9;&#x9;// TODO Auto-generated method stub&#xA;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459940969360" sizeMeasure="11">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class DebitAccount extends AbstractAccount {&#xA;&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459941050087" sizeMeasure="17">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class DebitAccount extends AbstractAccount {&#xA;&#xA;&#x9;public DebitAccount(){&#xA;&#x9;&#x9;balance = 0;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#x9;&#x9;if(balance - amount &lt; 0){&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;Withdrawal amount exceed the account balance.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;balance -= amount;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459941923593" sizeMeasure="14">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class DebitAccount extends AbstractAccount {&#xA;&#xA;&#x9;public DebitAccount(){&#xA;&#x9;&#x9;balance = 0;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#x9;&#x9;balance -= amount;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459941941528" sizeMeasure="17">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class DebitAccount extends AbstractAccount {&#xA;&#xA;&#x9;public DebitAccount(){&#xA;&#x9;&#x9;balance = 0;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#x9;&#x9;if(balance - amount &lt; 0){&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;Withdrawal amount exceed the account balance.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;balance -= amount;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
      </proposals>
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.2/@q" answer="/0/@parts.0/@tasks.2/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459941077115" sizeMeasure="11">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class CreditAccount extends AbstractAccount {&#xA;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#x9;&#x9;// TODO Auto-generated method stub&#xA;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459941123209" sizeMeasure="16" warningCount="1">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class CreditAccount extends AbstractAccount {&#xA;&#xA;&#x9;private double creditLine;&#xA;&#x9;&#xA;&#x9;public CreditAccount(double creditLine){&#xA;&#x9;&#x9;balance = 0;&#xA;&#x9;&#x9;this.creditLine = creditLine;&#xA;&#x9;}&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459941205407" sizeMeasure="28">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class CreditAccount extends AbstractAccount {&#xA;&#xA;&#x9;private double creditLine;&#xA;&#x9;&#xA;&#x9;public CreditAccount(double creditLine){&#xA;&#x9;&#x9;balance = 0;&#xA;&#x9;&#x9;this.creditLine = creditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public double getCreditLine() {&#xA;&#x9;&#x9;return creditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void setCreditLine(double creditLine) {&#xA;&#x9;&#x9;if(creditLine &lt; 0){&#xA;&#x9;&#x9;&#x9;throw new IllegalArgumentException(&quot;The credit line is negative.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;this.creditLine = creditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459941370794" sizeMeasure="32">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class CreditAccount extends AbstractAccount {&#xA;&#xA;&#x9;private double creditLine;&#xA;&#x9;&#xA;&#x9;public CreditAccount(double creditLine){&#xA;&#x9;&#x9;balance = 0;&#xA;&#x9;&#x9;this.creditLine = creditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public double getCreditLine() {&#xA;&#x9;&#x9;return creditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void setCreditLine(double creditLine) {&#xA;&#x9;&#x9;if(creditLine &lt; 0){&#xA;&#x9;&#x9;&#x9;throw new IllegalArgumentException(&quot;The credit line is negative.&quot;);&#xA;&#x9;&#x9;} else{&#xA;&#x9;&#x9;&#x9;this.creditLine = creditLine;&#x9;&#x9;&#x9;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if(balance &lt; 0){&#xA;&#x9;&#x9;&#x9;this.creditLine -= balance*(-1);&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459941822688" sizeMeasure="35">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class CreditAccount extends AbstractAccount {&#xA;&#xA;&#x9;private double creditLine;&#xA;&#x9;&#xA;&#x9;public CreditAccount(double creditLine){&#xA;&#x9;&#x9;balance = 0;&#xA;&#x9;&#x9;this.creditLine = creditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public double getCreditLine() {&#xA;&#x9;&#x9;return creditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void setCreditLine(double creditLine) {&#xA;&#x9;&#x9;if(creditLine &lt; 0){&#xA;&#x9;&#x9;&#x9;throw new IllegalArgumentException(&quot;The credit line is negative.&quot;);&#xA;&#x9;&#x9;} &#xA;&#xA;&#x9;&#x9;if(balance &lt; 0 &amp;&amp; creditLine + balance &lt; 0){&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The credit line could not cover the negative balance.&quot;);&#xA;&#x9;&#x9;} else if(balance &lt; 0){&#xA;&#x9;&#x9;&#x9;creditLine += balance;&#xA;&#x9;&#x9;&#x9;balance = 0;&#xA;&#x9;&#x9;&#x9;this.creditLine = creditLine;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459941843926" sizeMeasure="35">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class CreditAccount extends AbstractAccount {&#xA;&#xA;&#x9;private double creditLine;&#xA;&#x9;&#xA;&#x9;public CreditAccount(double creditLine){&#xA;&#x9;&#x9;balance = 0;&#xA;&#x9;&#x9;this.creditLine = creditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public double getCreditLine() {&#xA;&#x9;&#x9;return creditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void setCreditLine(double creditLine) {&#xA;&#x9;&#x9;if(creditLine &lt; 0){&#xA;&#x9;&#x9;&#x9;throw new IllegalArgumentException(&quot;The credit line is negative.&quot;);&#xA;&#x9;&#x9;} &#xA;&#xA;&#x9;&#x9;if(balance &lt; 0 &amp;&amp; creditLine + balance &lt; 0){&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The credit line could not cover the negative balance.&quot;);&#xA;&#x9;&#x9;} else if(balance &lt; 0){&#xA;&#x9;&#x9;&#x9;creditLine += balance;&#xA;&#x9;&#x9;&#x9;balance = 0;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;this.creditLine = creditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459942163516" sizeMeasure="39">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class CreditAccount extends AbstractAccount {&#xA;&#xA;&#x9;private double creditLine;&#xA;&#x9;&#xA;&#x9;public CreditAccount(double creditLine){&#xA;&#x9;&#x9;balance = 0;&#xA;&#x9;&#x9;this.creditLine = creditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public double getCreditLine() {&#xA;&#x9;&#x9;return creditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void setCreditLine(double creditLine) {&#xA;&#x9;&#x9;if(creditLine &lt; 0){&#xA;&#x9;&#x9;&#x9;throw new IllegalArgumentException(&quot;The credit line is negative.&quot;);&#xA;&#x9;&#x9;} &#xA;&#xA;&#x9;&#x9;if(balance &lt; 0 &amp;&amp; creditLine + balance &lt; 0){&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The credit line could not cover the negative balance.&quot;);&#xA;&#x9;&#x9;} else if(balance &lt; 0){&#xA;&#x9;&#x9;&#x9;creditLine += balance;&#xA;&#x9;&#x9;&#x9;balance = 0;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;this.creditLine = creditLine;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#x9;&#x9;double tempBalance = balance - amount;&#xA;&#x9;&#x9;if(tempBalance &lt; 0 &amp;&amp; tempBalance*(-1) > getCreditLine()){&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;Exceed amount allowed.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;balance -= amount;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
      </proposals>
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.3/@q" answer="/0/@parts.0/@tasks.3/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459942237778" sizeMeasure="11">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class SavingsAccount2 extends AbstractAccount {&#xA;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#x9;&#x9;// TODO Auto-generated method stub&#xA;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459942655184" sizeMeasure="26">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class SavingsAccount2 extends AbstractAccount {&#xA;&#xA;&#x9;private int withdrawals;&#xA;&#x9;private double fee;&#xA;&#x9;&#xA;&#x9;public SavingsAccount2(int withdrawals, double fee){&#xA;&#x9;&#x9;balance = 0;&#xA;&#x9;&#x9;this.withdrawals = withdrawals;&#xA;&#x9;&#x9;this.fee = fee;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#x9;&#x9;if(balance - amount &lt; 0){&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance cannot be negative.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if(withdrawals &lt;= 0){&#xA;&#x9;&#x9;&#x9;amount += fee;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;withdrawals -= 1;&#xA;&#x9;&#x9;balance -= amount;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459942712467" sizeMeasure="26">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class SavingsAccount2 extends AbstractAccount {&#xA;&#xA;&#x9;private int withdrawals;&#xA;&#x9;private double fee;&#xA;&#x9;&#xA;&#x9;public SavingsAccount2(int withdrawals, double fee){&#xA;&#x9;&#x9;balance = 0;&#xA;&#x9;&#x9;this.withdrawals = withdrawals;&#xA;&#x9;&#x9;this.fee = fee;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#x9;&#x9;if(balance - amount &lt; 0){&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance cannot be negative.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;if(withdrawals &lt;= 0){&#xA;&#x9;&#x9;&#x9;amount += fee;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;withdrawals -= 1;&#xA;&#x9;&#x9;balance -= amount;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459942997916" sizeMeasure="26">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class SavingsAccount2 extends AbstractAccount {&#xA;&#xA;&#x9;private int withdrawals;&#xA;&#x9;private double fee;&#xA;&#x9;&#xA;&#x9;public SavingsAccount2(int withdrawals, double fee){&#xA;&#x9;&#x9;balance = 0;&#xA;&#x9;&#x9;this.withdrawals = withdrawals;&#xA;&#x9;&#x9;this.fee = fee;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#x9;&#x9;if(balance - amount &lt; 0){&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance cannot be negative.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;balance -= amount;&#xA;&#x9;&#x9;withdrawals --;&#xA;&#x9;&#x9;if(withdrawals &lt;= 0){&#xA;&#x9;&#x9;&#x9;balance -= fee;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459943067115" sizeMeasure="26">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class SavingsAccount2 extends AbstractAccount {&#xA;&#xA;&#x9;private int withdrawals;&#xA;&#x9;private double fee;&#xA;&#x9;&#xA;&#x9;public SavingsAccount2(int withdrawals, double fee){&#xA;&#x9;&#x9;balance = 0;&#xA;&#x9;&#x9;this.withdrawals = withdrawals;&#xA;&#x9;&#x9;this.fee = fee;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#x9;&#x9;if(balance - amount &lt; 0){&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance cannot be negative.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;balance -= amount;&#xA;&#x9;&#x9;if(withdrawals &lt;= 0){&#xA;&#x9;&#x9;&#x9;balance -= fee;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;withdrawals --;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459943082710" sizeMeasure="26">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class SavingsAccount2 extends AbstractAccount {&#xA;&#xA;&#x9;private int withdrawals;&#xA;&#x9;private double fee;&#xA;&#x9;&#xA;&#x9;public SavingsAccount2(int withdrawals, double fee){&#xA;&#x9;&#x9;balance = 0;&#xA;&#x9;&#x9;this.withdrawals = withdrawals;&#xA;&#x9;&#x9;this.fee = fee;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#x9;&#x9;if(balance - amount &lt; 0){&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance cannot be negative.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;balance -= amount;&#xA;&#x9;&#x9;if(withdrawals &lt; 0){&#xA;&#x9;&#x9;&#x9;balance -= fee;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;withdrawals --;&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459943093391" sizeMeasure="26">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class SavingsAccount2 extends AbstractAccount {&#xA;&#xA;&#x9;private int withdrawals;&#xA;&#x9;private double fee;&#xA;&#x9;&#xA;&#x9;public SavingsAccount2(int withdrawals, double fee){&#xA;&#x9;&#x9;balance = 0;&#xA;&#x9;&#x9;this.withdrawals = withdrawals;&#xA;&#x9;&#x9;this.fee = fee;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#x9;&#x9;if(balance - amount &lt; 0){&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance cannot be negative.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;balance -= amount;&#xA;&#x9;&#x9;withdrawals --;&#xA;&#x9;&#x9;if(withdrawals &lt; 0){&#xA;&#x9;&#x9;&#x9;balance -= fee;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459943157176" sizeMeasure="26">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class SavingsAccount2 extends AbstractAccount {&#xA;&#xA;&#x9;private int withdrawals;&#xA;&#x9;private double fee;&#xA;&#x9;&#xA;&#x9;public SavingsAccount2(int withdrawals, double fee){&#xA;//&#x9;&#x9;balance = 0;&#xA;&#x9;&#x9;this.withdrawals = withdrawals;&#xA;&#x9;&#x9;this.fee = fee;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#x9;&#x9;if(balance - amount &lt; 0){&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance cannot be negative.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;balance -= amount;&#xA;&#x9;&#x9;withdrawals --;&#xA;&#x9;&#x9;if(withdrawals &lt; 0){&#xA;&#x9;&#x9;&#x9;balance -= fee;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459943191257" sizeMeasure="26">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class SavingsAccount2 extends AbstractAccount {&#xA;&#xA;&#x9;private int withdrawals;&#xA;&#x9;private double fee;&#xA;&#x9;&#xA;&#x9;public SavingsAccount2(int withdrawals, double fee){&#xA;//&#x9;&#x9;balance = 0;&#xA;&#x9;&#x9;this.withdrawals = withdrawals;&#xA;&#x9;&#x9;this.fee = fee;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#x9;&#x9;if((balance - amount) &lt; 0){&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance cannot be negative.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;balance -= amount;&#xA;&#x9;&#x9;withdrawals --;&#xA;&#x9;&#x9;if(withdrawals &lt; 0){&#xA;&#x9;&#x9;&#x9;balance -= fee;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1459943543015" sizeMeasure="26">
          <edit xsi:type="exercise:StringEdit" storedString="package inheritance;&#xA;&#xA;public class SavingsAccount2 extends AbstractAccount {&#xA;&#xA;&#x9;private int withdrawals;&#xA;&#x9;private double fee;&#xA;&#x9;&#xA;&#x9;public SavingsAccount2(int withdrawals, double fee){&#xA;//&#x9;&#x9;balance = 0;&#xA;&#x9;&#x9;this.withdrawals = withdrawals;&#xA;&#x9;&#x9;this.fee = fee;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;protected void internalWithdraw(double amount) {&#xA;&#x9;&#x9;if((balance - amount) &lt; 0 || balance - amount - fee &lt; 0){&#xA;&#x9;&#x9;&#x9;throw new IllegalStateException(&quot;The balance cannot be negative.&quot;);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;balance -= amount;&#xA;&#x9;&#x9;withdrawals --;&#xA;&#x9;&#x9;if(withdrawals &lt; 0){&#xA;&#x9;&#x9;&#x9;balance -= fee;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#xA;}&#xA;"/>
        </attempts>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.0/@tasks.4/@q" answer="/0/@parts.0/@tasks.4/@a" completion="1.0">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459941055592" completion="1.0" successCount="2"/>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.0/@tasks.5/@q" answer="/0/@parts.0/@tasks.5/@a" completion="1.0">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459942203711" completion="1.0" successCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459942204924" completion="1.0" successCount="2"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459942208019" completion="1.0" successCount="3"/>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.0/@tasks.6/@q" answer="/0/@parts.0/@tasks.6/@a" completion="0.25">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459942660003" completion="0.5" successCount="1" failureCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459942998190" completion="0.3333333333333333" successCount="1" failureCount="2"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459943005369" completion="0.5" successCount="2" failureCount="2"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459943006484" completion="0.4" successCount="2" failureCount="3"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459943067359" completion="0.3333333333333333" successCount="2" failureCount="4"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459943083001" completion="0.2857142857142857" successCount="2" failureCount="5"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459943093649" completion="0.25" successCount="2" failureCount="6"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459943157465" completion="0.2222222222222222" successCount="2" failureCount="7"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459943191570" completion="0.2" successCount="2" failureCount="8"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459943274231" completion="0.18181818181818182" successCount="2" failureCount="9"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1459943551842" completion="0.25" successCount="3" failureCount="9"/>
      </proposals>
    </proposals>
    <proposals exercisePart="/0/@parts.1">
      <proposals xsi:type="workbench:DebugEventProposal" question="/0/@parts.1/@tasks.0/@q" answer="/0/@parts.1/@tasks.0/@a" completion="0.0" performedCount="3">
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
      </proposals>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.1/@tasks.1/@q" answer="/0/@parts.1/@tasks.1/@a" completion="0.0" performedCount="29">
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
        <attempts timestamp="-1" completion="0.0"/>
      </proposals>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.1/@tasks.2/@q" answer="/0/@parts.1/@tasks.2/@a"/>
      <proposals xsi:type="workbench:PartTaskProposal" question="/0/@parts.1/@tasks.3/@q" answer="/0/@parts.1/@tasks.3/@a" completion="0.0" performedCount="1">
        <attempts timestamp="-1" completion="0.0"/>
      </proposals>
      <proposals xsi:type="jdt:JdtLaunchProposal" question="/0/@parts.1/@tasks.4/@q" answer="/0/@parts.1/@tasks.4/@a"/>
      <proposals xsi:type="jdt:JdtLaunchProposal" question="/0/@parts.1/@tasks.5/@q" answer="/0/@parts.1/@tasks.5/@a"/>
      <proposals xsi:type="jdt:JdtLaunchProposal" question="/0/@parts.1/@tasks.6/@q" answer="/0/@parts.1/@tasks.6/@a"/>
    </proposals>
  </exercise:ExerciseProposals>
</xmi:XMI>
