Feature: get points
  As a user
  I want to add 100 points when the bullet hit a invader

    Scenario :hit an invader and get points
        Given I am playing
        And I have some points
        When The ship shoots
        And The bullet hit a invader
        Then I should get 100 points more


