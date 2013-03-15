JExercise - test-based Java exercise
====================================
JExercise implements support for test-based exercises, by integrating an exercise model with Eclipse's UI, the Eclipse JDT and JUnit. There is also a simplified standalone version which uses Java annotations and reflection.

Overview of plugins
-------------------
 * no.hal.jex: defines the JExercise EMF data model, consisting of 1) the structure of the solution in terms of Java classes and members and 2) the requirements in terms of elements of the solution and passed JUnit tests.
 * no.hal.jex.edit: generated from no.hal.jex by the EMF genmodel generator
 * no.hal.jex.jdt: implements support for using the JDT's Java model for validating requirements
 * no.hal.jex.java: implements support for using Java reflection for validating requirements
 * no.hal.jex.ui: provides integration with Eclipse JDT's Java model and JUnit launcher, and a UI with JExercise view and editor
 * no.hal.jex.standalone: provides a Java Swing UI for viewing exercises and running the JUnit tests, using Java annotations and reflection
 * no.hal.jex.feature: the JExercise feature, which combines the above into a unit that's easy to install
 * no.hal.jex.collection: a collection of JExercises, based on JUnit tests with annotations
