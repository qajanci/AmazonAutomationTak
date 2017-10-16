# AmazonAutomationTak
Cucumber Java automation framework for Amazon

# Cucumber Automation Framework
### Development
Developed Automation Framework Using Maven Project

  - Cucumber Reports
 
### Version
JDK - 1.8
Maven-3.0.5

### Installation and Execution

You have to  clone the Maven project in to your Local Machine:

- First Method through Command Prompt:
```sh
$ git clone [git-repo-url]
$ cd AmazonAutomationTak.git
$ mvn clean install
```
- Second Method through Eclipse IDE :
```sh
Right Click pom.xml and run as -->maven install
```
- Third Method through Eclipse IDE :
```sh
Navigatet to AmazonAutomationTak/src/test/java/com/amazon/in/CucumberRunTest.java Right Click and run as -->JUnint Test
```


**Note:** Your system has to already setup with environment variables for JDK and Maven

### Location where to find Test Graphical and HTML Reports:
- AmazonAutomationTak/target/cucumber/index.html--->Open with webbrowser
- AmazonAutomationTak/target/cucumber-html-reports/feature-overview.html--->Open with webbrowser
- AmazonAutomationTak/target/cucumber-html-reports/test-java-Home.feature.html--->Open with webbrowser





### Tech

I have used below technologies and editors:

* [IntellijIDE] - awesome for developing automation framework!
* [Maven Project] - for organising framework structure and download dependecies from remote repository
* [Cucumber-JVM] - its a tool that executes plain text functional descriptions as automated tests.
* [Cucumber-JUnit] - to run the tests
* [Slenium Webdriver] - it automates browsers. That's it!
* [JDK] - To develop and run the tests.



### Plugins

Cucumber Framework is currently extended with the following plugins/Jar files

* Cucumber pluging
* Cucumber Reports

### Todo's
 - Cross browser testing
