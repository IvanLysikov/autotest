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

  Scenario Outline: Enter not valid email
    Given Sign up page opened
    When The User enters "<not valid email>" in Email address field
    And The User enters valid password in Password field
    And Press Continue button
    Then Validation message in Email address fiels appears

    Examples:
      | not valid email |
      | mail            |
      | mail@           |
      | mail@gamil      |