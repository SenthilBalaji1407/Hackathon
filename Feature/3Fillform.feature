Feature: Fill the form in courses
	Scenario: Click Enterprise and find the product and fill form
		 Given user navigate to Enterprises
		 When user scroll and select the Enterprises
		 And user scroll and select  offer
		 And user scroll and select the courses
		 Then user scroll and fill the form 
		 And user scroll and capture Error msg