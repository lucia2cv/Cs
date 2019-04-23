Feature: End of game
  As a user
  I want end the game when the ship get a hit of invader

    Scenario : an invader hit the ship
        Given I am playing
        And an invader shoot
        When the bullet hit the ship
        Then the game should end


