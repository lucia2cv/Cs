Feature: get points


    Scenario :hit an invader and get points
        Given I am playing
        And I have some points
        When The ship shoots
        And The bullet hit an invader
        Then I should get 100 points more


