@login
Feature: Login feature
  As a user, I should be able to login with correct credentials
  to different accounts, and landing page should be displayed.

  @helpDesk
  Scenario: Help desk login scenario
    Given User is on the login page
    When User logs in as help desk
    Then User should see the landing page

  @marketing
  Scenario: Marketing login scenario
    Given User is on the login page
    When User logs in as marketing
    Then User should see the landing page

  @hr
  Scenario: HR login scenario
    Given User is on the login page
    When User logs in as HR
    Then User should see the landing page
