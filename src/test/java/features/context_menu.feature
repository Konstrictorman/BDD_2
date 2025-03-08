Feature: Context Menu Interaction

  Scenario: Verify right-click action triggers an alert
    Given I open the context menu page
    When I right-click on the context menu box
    Then An alert should appear with text "You selected a context menu"
    When I accept the alert
