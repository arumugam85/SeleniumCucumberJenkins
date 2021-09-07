#Author: arumugam
#Feature: Login to the OHRM Application
@login
Feature: Login to the OHRM Application

  @login
  Scenario Outline: Login with valid user
    Given User open URL "https://opensource-demo.orangehrmlive.com/"
    And User enter user id as "<email>" and password as "<password>"
    When Click Login button
    Then Page title should be "<title>"
    #And Click logout link

    Examples: 
      | email | password | title     |
      | Admin | admin123 | OrangeHRM |
