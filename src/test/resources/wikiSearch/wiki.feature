Feature: Wiki Search

Acceptance Criteria:
1) While in wiki page, when i search for certain item,
   i should be naviaged to specific page

@tag111
Scenario: Search item in wiki page
Given i have naviaged to wikiPage
When i enter 'apple' in search box
And i click on the search button
Then i should see the title with 'Apple' 
	
