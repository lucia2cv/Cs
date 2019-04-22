Feature: bullets will rebund

    @smoke
    @e2e
    Scenario: Start a special game
        Given I am on main screen
        When I input name "<name>"
        And I input age "<age>"
        And I tap Rebotes button
        And I press submit button
        Then bullets should rebound

    Examples:
            | age | name |
            | 18  | hola |
