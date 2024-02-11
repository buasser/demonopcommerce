Feature:User Registration


  Scenario:guest user could register with valid data successfully
    Given user go to register page
    When user clicks on regsister icon button
    And user select gender type
    And user enter first name
    And user enter last name
    And user choose his day
    And user choose his month
    And user choose his year
    And user enter email
    And user fills Password field
    And user fills confirm Password field
    Then user clicks on register button
    Then user registered successfully