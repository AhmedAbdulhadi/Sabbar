Feature: Login Scenario
  Scenario: Verify that user is allowed to login to my dashboard.
    Given Open the orgam site.
    When Click on allow option in cookies.
    When Cookies popup should be dismissed.
    When I click on get started button.
    When I click on signin button.
    When i fill in my login information.
    Then i should be able to navigate to dashboard app.