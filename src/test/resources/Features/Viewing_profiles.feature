Feature: 

	#{color:#ff8b00}*User Story:*{color}
	#
	#As a user, I should be able to interact with employees on the posts that I have access to
	#
	#*3. Users should be able to click on reviewers’ names and visit their profiles.*
	@P7-113

		@wip
	Scenario: Clicking on reviewers, names and visiting profiles. (Test Case 3)
		Given User sees the reviewers names
		When User clicks on reviewers names
		Then User is directed to the reviewer profile page
		
		