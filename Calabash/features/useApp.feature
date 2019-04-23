Feature: Use app feature

  Scenario: As a valid user I can use my app
    Given I write a "name" into field with id "nombre"
    And  I write "20" into field with id "anyos"
    When  I press button with id "button"
    Then I should see "MayorActivity"

  Scenario: As a valid user I should end the game
    Given I write a "name" into field with id "nombre"
    And  I write "20" into field with id "anyos"
    When  I press button with id "button"
    And  I wait for button with id "SALIR"
    Then I should see "PUNTUACION"

  Scenario: As a valid user I can use my app
    Given I write a "name" into field with id "nombre"
    And  I write "10" into field with id "anyos"
    When  I press button with id "button"
    Then I should see "MenorActivity"

  Scenario: As a valid user I can use my app
    Given I write a "name" into field with id "nombre"
    And  I write "20" into field with id "anyos"
    And  I deactivate "REBOTES"
    When  I press button with id "button"
    Then I should see "MayorActivity"