 Feature: Wishlist
  As a user of giftrete, I want to create a wishlist

  @Valid @smoke
  Scenario: Valid Wishlist
    Given I go to giftrete
    When I go to wishlist page
    And I enter a valid name
    And I enter valid occasion details
    And I enter valid event date
    And I select a valid product type
    And  I enter a valid product details
    And I upload a valid picture
    And I validate the captcha
    And I click on save
    Then My wishlist is created

