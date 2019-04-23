Feature: change colour of inavders

    @smoke
    @e2e
    Scenario: the player hit a barrier
        Given I am playing
        And there is a barrier
        When the ship shoots
        And hit a barrier
        Then the colour should be changed


