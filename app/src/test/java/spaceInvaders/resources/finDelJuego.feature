Feature: ship get a hit and the game end


    Scenario : an invader hit the ship
        Given I am playing
        And an invader shoot
        When the bullet hit the ship
        Then the game should end


