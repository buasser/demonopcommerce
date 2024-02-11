Feature:Login



  Scenario: user could login with valid email and password
    Given user go to login page
    When user click on login icon
    Then user login with valid email "test1@example.com"
    And user enter valid password "P@ssw0rd"
    And user press on login button
    Then user login to the system successfully

  Scenario: user could login with invalid email and password
    Given user go to login page
    When user click on login icon
    Then user login with email "wrong@example.com"
    And user enter password "P@ssw0rd"
    And user press on login button
    Then user user could not login to the system
