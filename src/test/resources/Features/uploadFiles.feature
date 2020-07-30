@upload
Feature: Upload download feature
  User should be able to click on upload files icon to upload files and pictures from local disks,
  download from external drive, select documents from bixtrix24, and create files to upload.

  Background: Needs to be in the Announcement subheadding
    Given User is logged in
    And User is on the Announcement subheadding

    Scenario: Upload files
      Given User clicks on upload files icon
      And User can see the four options
      Then User clicks one of the four options to upload/download various forms of files



