# no.hal.pg.quiz.model - the quiz game model

The quiz game model contains the class hierarchy for Quiz objects and a TaskDef subclass that links it to the [generic model](../no.hal.pg.model/). The model is in [model/quiz.ecore](model/quiz.ecore). The most important classes are the following:

* <a name="QuizTaskDef">**QuizTaskDef**</a> - the [TaskDef](../no.hal.pg.model/#TaskDef) subclass that links the quiz classes to the generic model, so they can be used in a game. The QuizTaskDef contains references to QuizParts, i.e. groups of questions and answers, that must be answered to complete the task. Various attributes control the rules for completing the task, e.g. how many correct answers are needed, how many attempts are given etc.
* <a name="QA">**QA**</a> - contains a **Question** and an **Answer**, which are both abstract classes with several subclasses.

* <a name="Question">**Question**</a> - an abstract superclass for various ways of representing/formatting questions.
* <a name="StringQuestion">**StringQuestion**</a> - a question represented as a simple String.
* <a name="XmlQuestion">**XmlQuestion**</a> - a question represented as an XML element structure, to support using arbitrary HTML to format the question.

* <a name="Answer">**Answer**</a> - an abstract superclass for various ways of representing/formatting answers. The specific kind determines how it should be output and input. It contains a single *abstract* **accept** method for accepting a proposed answer. Since there are many kinds of answers, this method takes a Object argument. It returns EBooleanObject (Ecore's wrapper for Java's Boolean class), using TRUE for correct, FALSE for wrong and null for indefinite (e.g. illegal format). 
* <a name="StringAnswer">**StringAnswer**</a> - a String answer. The **regexp** and **ignoreCase** attributes control the rules for **accept**ing a proposed answer.
* <a name="NumberAnswer">**NumberAnswer**</a> - a Number (double is used) answer, with answer within a range (controlled by **errorMargin** attribute).
* <a name="BooleanAnswer">**BooleanAnswer**</a> - a Boolean i.e yes/no answer.
* <a name="XmlAnswer">**XmlAnswer**</a> - an answer formattet (as output) as an XML element structure. It must contain an actual answer inside a PI element. This makes it possible to use arbitrary HTML to format the question.
* <a name="SingleOptionsAnswer">**SingleOptionsAnswer**</a> - an answer with options where only one is correct, i.e. suitable for input with radio buttons.
* <a name="ManyOptionsAnswer">**ManyOptionsAnswer**</a> - an answer with options where one or more are correct, i.e. suitable for input with check boxes.
