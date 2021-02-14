Feature: annotation
#This is how background can be used to eliminate duplicate steps

Background:
   User navigates to Facebook

#Scenario with AND
Scenario:
    Given I am on Facebook login page
    When I enter username as "TOM"
    And I enter password as "JERRY"
    Then Login should fail
