@sanity
Feature: Find the dealers and verify


  Scenario Outline:Find the dealers and verify the dealers are in the list
    Given I am on homepage
    When I  a mouse hover on buy+sell tab
    And I click on 'Find a Dealer' page
    Then I navigate to 'car-dealers' page and verify "Find a Car Dealership Near You"
    And I should see the dealers name "<dealersName>" are displayed on page

    Examples:
      | dealersName |
      | 3 Point Motors Epping |
      | 4WD Specialist Group |
      | 5 Star Auto |
      | A & M Car Sales Pty Ltd |
      | A1 MOTORS COMPANY |
      | ANDREA MOTORI SERVICE |
      | Oxford Motors|