Feature:  Login
  As a user of giftrete, I want to login
  so that I can use the site

  Background:
    Given I go to dev.giftrete.com
    When I go to login page

  @Valid @smoke
  Scenario:Valid Login
   And I enter valid username
   And I enter valid password
   Then I will be able to login in

  @Invalid @regression
 Scenario:Login with invalid password
  And I enter valid username
  And I enter invalid password
  Then I will not be able to login in

  @Invalid
 Scenario:Login with invalid username
  And I enter invalid username
  And I enter valid password
  Then I will not be able to login in

  @Valid
  Scenario:Valid Login with parameter
    And I enter valid username "nellyuser"
    And I enter valid password "nellypassword"
    Then I will be able to login in

  @Invalid
  Scenario:Invalid Login with parameter
    And I enter valid username "nellyuser01"
    And I enter valid password "nellypassword01"
    Then I will not be able to login in

  @Valid
    Scenario Outline:Login with multiple users
      And I enter valid username "<username>"
      And I enter valid password "<password>"
      Then I will be able to login in
      And I log out

      Examples:
     |username|password|
     |nellyuser|nellypassword|
     |nellyuser1|nellypassword1|
