Feature: Wiggle Task
  Scenario: 01. Open Wiggle Home page
    Given Wiggle start page opened by default
    When The user click sign in
    Then Sign in page is opened

  Scenario: 02. Open Sign up page
    Given Sign in page opened
    When The user click sign up
    Then Sign up page is opened

  Scenario: 03. Using Sign up without password
    Given Sign up page opened
    When User enter valid email
    And Press Continue button
    Then Sign up page is opened