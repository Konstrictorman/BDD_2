# BDD Selenium Java Project

## Overview
This project is a **Behavior-Driven Development (BDD)** test automation framework implemented in **Java** using **Selenium** and **Cucumber**. It automates tests for different web functionalities, including **checkbox interactions** and **context menu handling** from [The Internet HerokuApp](https://the-internet.herokuapp.com).

## Author
**Ricardo Álvarez**

## Tools & Technologies Used
- **Java 17** - Programming language for test automation
- **Maven** - Build and dependency management
- **Selenium WebDriver** - Automates browser actions
- **Cucumber (Gherkin)** - Enables BDD test execution
- **JUnit 4** - Test execution framework
- **Page Object Model (POM)** - Enhances maintainability
- **GitHub Codespaces** - Cloud-based development environment

## Project Structure

BDD_2/ 
│── src/  
│ ├── java/  
│ │ ├── com/
| │ │ ├── example/
| | │ │ ├── App.java/
| | │ │ ├── DriverManager.java/ # Utility class
├── test/  
│ ├── java/  
│ │ ├── com/
| │ │ ├── example/
| | │ │ ├── AppTest.java/
│ │ ├── features/ # BDD Feature files 
│ │ │ ├── auth.feature
│ │ │ ├── checkboxes.feature 
│ │ │ ├── context_menu.feature 
│ │ │ ├── google_search.featre
│ │ ├── pages/ # Page Object Model classes 
│ │ │ │ ├── CheckBoxPage.java 
│ │ │ │ ├── ContextMenuPage.java 
│ │ │ │ ├── LoginPage.java 
│ │ ├── resources/  
| │ │ ├── cucumber.properties
│ │ ├── runners/  
| │ │ ├── TestRunner.java  
│ │ │ ├── steps/ # Step definitions for BDD 
│ │ │ │ ├── CheckboxesStepDefinitions.java 
│ │ │ │ ├── ContextMenuStepDefinitions.java 
│ │ │ │ ├── LoginSteps.java 
│ │ │ │ ├── SearchSteps.java 
│── pom.xml # Maven configuration file 
│── target/ # Location of reports and compiled classes

## How to run the tests

`mvn clean test` 

## View test reports

 `target/cucumber-reports/index.html` 
