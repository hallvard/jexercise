# Install and configure Eclipse

To browse and run the code you will need to install Eclipse for plugin development (PDE, called Eclipse IDE for Eclipse Committers in the download page @ http://www.eclipse.org/downloads/packages/eclipse-ide-eclipse-committers/neon2). You also need to install the following features from the Neon update site:
- EMF SDK - modeling support
- Maven integration support (m2e plugins)
- BIRT Framework - charting support

To properly configure m2e, you need to go to the Maven > Discovery preference, click Open Catalog and install the Tycho Configurator

# Clone the git repo
The code is in my **jexercise** repo @ https://github.com/hallvard/jexercise.git, clone it and open the import wizard with **Import > Import Existing Projects into Workspace**. Browse to where you've cloned the jexercise repo, check the **Search for nested projects** box and select the following projects:

- no.hal.emf.ui.utils
- no.hal.emf.ui.utils.feature

- no.hal.learning - parent project for whole build
- no.hal.learning.exercise - parent project for exercise stuff

- no.hal.learning.exercise.adm - tools for working with submissions for a whole class
- no.hal.learning.exercise.adm.charts - specific charts
- no.hal.learning.exercise.feature
- no.hal.learning.exercise.jdt - logging java stuff
- no.hal.learning.exercise.junit - logging junit launches
- no.hal.learning.exercise.model - core exercise stuff
- no.hal.learning.exercise.model.ui
- no.hal.learning.exercise.workbench - logging eclipse usage

- org.eclipse.paho.client.mqttv3 - logging during assignments
 
# Launching Eclipse with Exercise support

If all things are properly installed and imported, the workspace should build and you should be able to **Run As > Eclipse Application**. Once launched you can open the submissions view with **Window > Show View... > Other > Bb Submissions**. Click on the **Resources** tab and use the **Zip...** button to load data for an assignment. The tree should allow you to reveal the individual submissions (ex files) for each student.

The columns in the tree are various values derived from the ex-files, such as number of edits, time used, number of lines that have been edited, number of Java tokens, etc. So far I've mostly experimented, e.g. looking for measures of effort and performance. More can be easily added...

The other tabs in this view show charts for the the exercises aggregated across all students. More charts can easily be added...

Double-click on a student (numbers have replaced the user names) to show it on the **Exercise** view, which is the one showing logged data for individual students, the same view the students and TAs use. There are subviews for the plots and source code, that allow you to see how logged values and source code change over time.

To write code that analyzes the data, you should load the ex-files as EMF Resources, rather than working directly with the XML. The **BbSubmissionsProcessor** class is a good place to start if you want to write a "standalone" class with a main method. The class contains methods for loading all the ex-files in a zip and the main method shows how to set up EMF so you can load ex-files.
