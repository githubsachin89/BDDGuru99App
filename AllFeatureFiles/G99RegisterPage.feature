Feature: Test Guru99 Apllication

  Scenario: Test Guru99 Register page
    Given user is on guru99 register page
    Then user enter contact info as firstname lastname phone and emailId

  Scenario: test registerpage mailing info
    Then user enter address and city and state and postal code and country
