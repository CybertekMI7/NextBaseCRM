@video
Feature: Insert video feature
  User should be able to insert videos by clicking on the video icon and entering the video URL.

  Scenario: Add recipients
    Given User is logged in
    And User is on the Announcement subheadding
    When User clicks insert video icon
    Then User is able to insert video