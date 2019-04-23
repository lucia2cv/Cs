Feature: End game feature

  Scenario: As a valid user I should end the game
    When I write a "name" into field with id "nombre"
    And  I write "20" into field with id "anyos"
    And  I press button with id "button"
    And  I wait for button with id "SALIR"
    Then I should see text view "PUNTUACION"
