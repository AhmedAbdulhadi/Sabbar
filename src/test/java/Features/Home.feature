Feature: Testing Home Screen features

  Scenario: Verify that user is allowed to click on cookies.
    Given Open the orgam site.
    When Click on allow option in cookies.
    Then Cookies popup should be dismissed.

  Scenario Outline: : Verify that user is allowed to navigate to industries page.
    Given Open the orgam site.
    When Click on allow option in cookies.
    When Cookies popup should be dismissed.
    When I click on industries dropdown list and select <option>.
    Then I should be navigated to <option> page.

    Examples:
    |option|
    |Hospitality|
    |Retail|
