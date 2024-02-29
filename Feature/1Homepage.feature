Feature: Coursera Home Page
	Scenario: Searching Webdevelopment Courses
		Given user navigate to home page
		When user search for the WebDevelopment Courses
		And  user selects the Language and Levels
		Then User selects course one and display the result
		And User selects course two and display the result