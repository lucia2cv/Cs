Feature: Start a new game


    Scenario :Start a new game
        Given I am on main screen
        When I input name "<name>"
        And I input age "<age>"
        And I press submit button
        Then I should see mayor activity screen

    Examples:
        | age | name |
        | 18  | hola |
