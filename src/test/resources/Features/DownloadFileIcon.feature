Feature:  As a user, I should be able to send messages by clicking on Message tab under Active Stream.

 # User should be able to click on upload files icon to upload files and pictures from local disks.
	#
  @P7-81
  @upload
  Scenario: Upload File Icon functionality under New Message

    Given User is on homepage and MESSAGE is displayed under ACTIVITY STREAM
    Then User clicks on Messages tab under Activity Stream Module
    When User clicks on UPLOAD FILES icon
    Then User sees UPLOAD OPTIONS at the bottom of MESSAGE INPUT FIELD
