Feature: 

	#User should be able to click on Topic Icon  and see Topic Message Text box displays on top of the message box
	@P7-104
	Scenario: User should be able to click on Topic Icon
		    Given User is on homepage and MESSAGE is displayed under ACTIVITY STREAM
		    Then User clicks on Messages tab under Activity Stream Module
		    When User locates Topic Icon and clicks it
		    Then User sees Topic Text box on top of messages