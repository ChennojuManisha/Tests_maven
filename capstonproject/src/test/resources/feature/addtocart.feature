Feature: Amazon laptop purchase
Scenario: search for laptops and add two to the cart 
Given the user is on the amazon home page 
And the user search for the laptop  
When the user adds the first two laptops to the cart one by one 
Then the cart badge should display two  

