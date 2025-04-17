@tag
Feature: Submitform

  @smoke
  Scenario: To validate the submitform
    Given User enter the URL
    And User Validate the URL
    When User Enter the FirstName
    When User Enter the LastName
    When User Enter the Email
    When User Enter the Contact Number
    And USer Enter the Message
    Then User Submit the form Successfully
