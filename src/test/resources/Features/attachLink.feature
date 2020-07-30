@link
Feature: Attach link feature
  User should be able to attach link by clicking on the link icon.

  Scenario: Add recipients
    Given User is logged in
    And User is on the Announcement subheadding
    When User clicks link icon
    Then User is able to attach video