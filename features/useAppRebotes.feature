Feature: Use app feature

  Scenario: As a valid user I can use my app
    When I write a "name" into field with id "nombre"
    And  I write "20" into field with id "anyos"
    And  I tap button with id "REBOTES"
    And  I press button with id "button"
    Then I should see "MayorActivity"
