Feature: 

	#User story:
	# As a user, I should be able to interact with employees on the posts that I have access to.
	# Acceptance criteria:
	# 1. Users should be able to make a comment, like, or unfollow on other employees’ posts.
	@P7-111 @P7-110
		@Test
	Scenario: Interaction with other employees on posts (Test Case)
		Given User is on the homepage 
		When User clicks on the like
		Then user sees the like button and a thumbs up should appear
		