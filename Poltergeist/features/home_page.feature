
Feature: YouTube to explore poltergiest
  In order to expolre poltergeist functionality
  As a capybara and poltergeist user
  I want to see the if it works on YouTube


Scenario: Search nintendo and go to oficial account
  Given I am on the home page
  When I fill in "search_query" with "nintendo"
  And Click on "search-icon-legacy"
  Then I should visit "https://www.youtube.com/user/Nintendo"
 
Scenario: Search digimon and watch the fist opening
  Given I am on the home page
  When I fill in "search_query" with "digimon"
  And Click on "search-icon-legacy"
  Then I should watch the video "https://www.youtube.com/watch?v=UXwunDD5Lm8"

Scenario: Make login with an user
  Given I am on the home page and sing up
  When I fill in "identifier" with "calidad.software.testing@gmail.com"
  And Coninue on "identifierNext"
  And I fill in "password" with "a1s2d3f4."
  Then Finish on "passwordNext"

Scenario: Make login with an user and like a video
  Given I am on the home page and sing up
  When I fill in "identifier" with "calidad.software.testing@gmail.com"
  And Coninue on "identifierNext"
  And I fill in "password" with "a1s2d3f4."
  And Coninue on "passwordNext"
  Then I fill in "search_query" with "digimon"
  And Click on "search-icon-legacy"
  And I should watch the video "https://www.youtube.com/watch?v=UXwunDD5Lm8"
  And like the video

Scenario: Make login with an user and dislike a video
  Given I am on the home page and sing up
  When I fill in "identifier" with "calidad.software.testing@gmail.com"
  And Coninue on "identifierNext"
  And I fill in "password" with "a1s2d3f4."
  And Coninue on "passwordNext"
  Then I fill in "search_query" with "despacito"
  And Click on "search-icon-legacy"
  And I should watch the video "https://www.youtube.com/watch?v=kJQP7kiw5Fk"
  And dislike the video
