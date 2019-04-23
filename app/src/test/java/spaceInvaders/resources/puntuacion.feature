Feature: get points


    Scenario :hit an invader and get points
        Given I am playing
        And I have some points
        When the ship shoots
        And the bullet hit an invader
        Then I should get 100 points more


