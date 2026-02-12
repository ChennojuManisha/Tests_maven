Feature:
Scenario: validate google search is working

Given brower is open
And user in on google search page
When user enters a text in search box
Then user is navigated to search results
