@regression
Feature:

  Background:
		#@P7-84
    Given user is on login page
		

	#User should be able to click on "High Priority" checkbox to set the current task to a top priority task.
  @P7-87 @P7-82
  Scenario Outline: task tab - new task - high priority checkbox
    Given user logged in as "<access type>"
    When user is in Tasks submodule of Activity Stream
    And user clicks on new task button
    And clicks on High Priority checkbox
    Then High Priority checkbox should be marked checked

    Examples:
      | access type         |
      | helpdesk_username1  |
      | helpdesk_username2  |
      | marketing_username1 |
      | marketing_username2 |
      | hr_username1        |
      | hr_username2        |

  	#User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
  @P7-88 @P7-82
  Scenario Outline: task tab - new task - click on Visual Editor
    Given user logged in as "<access type>"
    When user is in Tasks submodule of Activity Stream
    And user clicks on new task button
    And clicks on Visual Text Editor
    Then the editor text-bar should display on top of the message box.

    Examples:
      | access type         |
      | helpdesk_username1  |
      | helpdesk_username2  |
      | marketing_username1 |
      | marketing_username2 |
      | hr_username1        |
      | hr_username2        |

    #User should be able to click on upload files icon to upload files and pictures from local disks, upload from
    # external drive, select documents from bixtrix24, and create files to upload.
  @P7-89 @P7-82
  Scenario Outline: task tab - new task - upload files
    Given user logged in as "<access type>"
    When user is in Tasks submodule of Activity Stream
    And user clicks on new task button
    And clicks on upload files icon
    And uploads files from "<uploads files>"
    Then the uploaded file's name should be displayed

    Examples:
      | access type         | uploads files  |
      | helpdesk_username1  | local disks    |
      | helpdesk_username2  | external drive |
      | marketing_username1 | Bitrix24       |
      | marketing_username2 | Google Docs    |
      | hr_username1        | local disks    |
      | hr_username2        | external drive |

	#User should be able to create a quote by clicking on the Comma icon.
  @P7-90 @P7-82
  Scenario Outline: task tab - new task - click on Comma icon
    Given user logged in as "<access type>"
    When user is in Tasks submodule of Activity Stream
    And user clicks on new task button
    And clicks on Comma icon
	And inputs random text
    Then quote input box should display on top of the message box

    Examples:
      | access type         |
      | helpdesk_username1  |
      | helpdesk_username2  |
      | marketing_username1 |
      | marketing_username2 |
      | hr_username1        |
      | hr_username2        |

	#User should be able to add mention by clicking on the Add mention icon and select contacts from the lists
    # provided in dropdown.
  @P7-94 @P7-82
  Scenario Outline: task tab - new task - click on Add mention icon
    Given user logged in as "<access type>"
    When user is in Tasks submodule of Activity Stream
    And user clicks on new task button
    And clicks on Add mention icon
    And clicks '<contacts>' from the list provided in dropdown
    Then selected contact should be displayed in the message box

    Examples:
      | access type         |contacts   |
      | helpdesk_username1  |1          |
      | helpdesk_username2  |2          |
      | marketing_username1 |2          |
      | marketing_username2 |2          |
      | hr_username1        |1          |
      | hr_username2        |2          |

	#User should be able to attach link by clicking on the link icon.
  @P7-92 @P7-82
  Scenario Outline: task tab - new task - click on link icon
    Given user logged in as "<access type>"
    When user is in Tasks submodule of Activity Stream
    And user clicks on new task button
    And clicks on link icon
    And inputs '<text>' and '<url>'
    Then the '<text>' with linked '<url>' should be displayed in the message box

    Examples:
      | access type         |text       |url                        |
      | helpdesk_username1  |cybertek   |http://cybertekschool.com/ |
      | helpdesk_username2  |cybertek   |http://cybertekschool.com/ |
      | marketing_username1 |cybertek   |http://cybertekschool.com/ |
      | marketing_username2 |cybertek   |http://cybertekschool.com/ |
      | hr_username1        |cybertek   |http://cybertekschool.com/ |
      | hr_username2        |cybertek   |http://cybertekschool.com/ |

	#User should be able to click on "Checklist" to create checklists items(Things to do). User can add a
    # checklist item by clicking on add button or check mark. User can add separator lines between checklist items.
    # User can delete a checklist item by clicking on x mark.
  @P7-93 @P7-82
  Scenario Outline: task tab - new task - click on Checklist element
    Given user logged in as "<access type>"
    When user is in Tasks submodule of Activity Stream
    And user clicks on new task button
    And clicks on Checkist icon
    And inputs "<message one>" in the input box
    And clicks on add button
    And clicks on separator button
    And inputs "<message two>" in the input box
    And clicks on check mark
    Then checklist items "<message one>", separator line, and "<message two>" should be displayed
    When hovers over checklist item
    And clicks on x mark
    Then checklist item should disappear.

    Examples:
      | access type         |message one      |message two     |
      | helpdesk_username1  |call manager1    |call colleague1 |
      | helpdesk_username2  |call manager2    |call colleague2 |
      | marketing_username1 |call manager3    |call colleague3 |
      | marketing_username2 |call manager4    |call colleague4 |
      | hr_username1        |call manager5    |call colleague5 |
      | hr_username2        |call manager6    |call colleague6 |

	#User can add Deadline, Time Planning by using date pickers.
  @P7-98 @P7-82
  Scenario Outline: task tab - new task - Deadline and Time planning
    Given user logged in as "<access type>"
    When user is in Tasks submodule of Activity Stream
    And user clicks on new task button
    And clicks on Deadline input box
    And selects time "2021""09""27""11""33""pm"
    And clicks on Time planning
    And selects time for start task on "2021""09""23""09""15""pm"
    And clicks on "<days or hours or minutes>" for Duration input
    And inputs '15'
    And presses CTRL and ENTER
    And clicks on just created new task
    Then deadline, created on, start date and time should be displayed

    Examples:
      | access type         |days or hours or minutes |
      | helpdesk_username1  |days                     |
      | helpdesk_username2  |hours                    |
      | marketing_username1 |minutes                  |
      | marketing_username2 |days                     |
      | hr_username1        |hours                    |
      | hr_username2        |minutes                  |

	#User can click on More to specify the task details.
  @P7-100 @P7-82
  Scenario Outline: task tab - new task - click on More User can click on More to specify the task details.
    Given user logged in as "<access type>"
    When user is in Tasks submodule of Activity Stream
    And user clicks on new task button
    And clicks on More button
    And adds random project name
    And planned time "10" hours, and "15" minutes
    And adds reminder for "07/29/2020 09:03 am" to "to self" by "email"
    And activates repeat task "every 2 weeks on Sun at 7:01am after 7/31/2021 and end date: 9/15/2021"
    And adds previous task "Current task will start when another task will finish"
    And adds subtask
    And adds tag "urgent"
    And adds dependent task
    And clicks on ADD TASK
    Then created task should be on My tasks page
    Examples:
      | access type         |
      | helpdesk_username1  |
      | helpdesk_username2  |
      | marketing_username1 |
      | marketing_username2 |
      | hr_username1        |
      | hr_username2        |
