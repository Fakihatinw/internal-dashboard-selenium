@Login
Feature: User

  @UserLogin
  Scenario Outline: User login
    Given browser is opening login page
    And username <username> and password <password>
    When sign in button clicked
    Then redirected to homepage
    Examples:
      | username                         | password   |  |
      | fakihatin.wafiyah@marinetechs.co | Marine#123 |  |