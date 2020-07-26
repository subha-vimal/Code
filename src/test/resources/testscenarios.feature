@tag
Feature: To validate the facebook application

@tag1
  Scenario: To validate the login functionality
    Given user launches google chrome
    And user opens facebook application
    When user enters valid username and invalid password 
    Then user navigates to home page
    

 