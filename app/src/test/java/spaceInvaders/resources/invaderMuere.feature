Feature: invader dead
  As a user
  I want to kill the invaders with bullets

    Scenario :hit an invader and get points
        Given I am playing
        When The ship shoots
        And The bullet hit a invader
        Then The invader died