@contacts
Feature: Add recipients feature
 User should be able to add users and recipients from selecting contact
 from E-mail user, Employees and Departments and Recent contact lists.

  Scenario: Add recipients
    Given User is logged in
    And User is on the Announcement subheadding
    When User clicks add more
    Then User is able to add recipients