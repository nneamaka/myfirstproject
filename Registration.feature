Feature:  Registration
As a user of giftrete,i want to register
so that i can use the site

Scenario: Valid registration
Given   I navigate to giftrete site
When    I go to registration page
And     I enter my first name
And     I enter my last name
And     I enter valid email address
And     I enter valid home address
And     I enter valid postcode
And     I enter password
And     I confirm password
And     I validate captcha
Then    I should be able to register

