# cucumber_automation
Project description:  Automation Test Scripts for BPM Portal.

Project Structure:
Desined using selenium framework , on top of cucumber is used


Running the Scenarios:

Prerequisite: Java and Maven should be installed.

Step1 : Navigate to project location in the command prompt.
Step2 : Case Ids has be updated in the feature file in the following location
        src/main/java/com/bpm.feature/login.feature
Step3 : Type command as : mvn clean install -U -P testrun

Reports will be created in the extentReport folder in the current location with today's date.html and screenshot in the same location.


