Feature: get points

    @smoke
    @e2e
    Scenario :hit an invader and get points
        Given I am playing
        When the ship shoots
        And the bullet hit an invader
        Then I should get some points


