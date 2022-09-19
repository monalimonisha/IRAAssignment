Feature: IRA AI Agent	
	
Scenario Outline: To test Ira chat workflows for accuracy of results and overall experience.	
	
Given user is on Test agent IRA page	
When the user clicks on Notification	
And the user gets into the bot	
And user types <GreetingMessage> greeting message	
Then a response message is displayed	
And user clicks <Button> button from the Menu Options	
And user selects <Option> option is clicked	
And user clicks on download	
And user types <type1>	
And user fills the form with values	
And user types <type2>	
And user clicks on <link1>	
And user closes the web view	
And user clicks on <link2>	
And user closes the call popup	

Examples:
| GreetingMessage | Button     | Option                 | type1     |    type2  |  link1  |   link2   |
| Hello           | Start Over | Download Motor Policy  | Test Bot  | New Test  | Google  |   Call    |