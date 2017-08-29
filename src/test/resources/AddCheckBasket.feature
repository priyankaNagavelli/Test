Feature:Check shopping basket
  As a customer
  I want to add computer kit bundle and check shopping basket
  So that I can checkout

  #Background:
  #Given am on Kano_site

  Scenario: Add computer bundle and check shopping basket
    Given am on Kano_site
    And I click on shop tab on menu
    When I click on 'computer kit bundle'
    And click on 'buy now'
    Then I should see 'computer kit bundle' in 'your kano order'


  #Scenario: Add computer bundle and check shopping basket from different country
     # And change country to US
      #And I click on shop tab on menu
     # When I click on 'computer kit bundle'
     # And click on 'buy now'
     # Then I should see 'computer kit bundle' in 'your kano order'
