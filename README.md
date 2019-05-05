# Cucumber-Java Demo Project
This is a demo project for QA-Automation of web based applications using Cucumber, Selenium and java.

#CUCUMBER is a BDD tool used for QA-Automation.
Cucumber is a tool that allows the use of Gherkin language based on BDD.
Behavior Driven Development style test cases written in Gherkin are very easy to read
and understand. This allows the entire team technical and non-technical people to collaborate
and create test cases based on behaviors. 
But this is not the only benefit of cucumber. Please see this --> https://cucumber.io/docs for more information on cucumber.
Following is the example of the feature file being used in this demo project.


Feature: Login feature

Scenario: User should not be able to login with invalid credentials

    Given The user has navigated to the login page
    
    When The user clicks login after entering invalid username "invaliduser" and password "invalidpassword"
    
    Then The user should see the invalid username or password message as "Your login is invalid. Please try again."
    

# Page Object Model.
This project uses Page Object Model for housing locators for WebElements and action methods that are used in the step_definitions classes.

Page Object Model allows for reusability and efficient maintainability of locators and action methods.

# This project is a Maven project. 
A Maven project uses the .pom (Project Object Model) file that contains all the dependencies for various java libraries that might be used in the project. This makes this project ready to be plugged into a CICD platform such as Jenkins to run scheduled regression.

Isn't this amazing?

