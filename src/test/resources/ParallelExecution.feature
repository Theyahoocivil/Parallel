Feature: User loging with differnt Browser

  Scenario Outline: User Loging with Chrome 
    Given User in Hompage without login "<chrome>"
    When Signup Page Popup and User Clicking Already member Button
   	And  User Entering HomePage and Clicking Signup Icon
    And User Starts to Enter the Details "<Username>" and "<Password>" and Clicking Login Button
    Then User SuccessFully Enter into HomePage   

       Examples: 
      | chrome | Username               | Password              |
      | chrome | theyahoo1210@gmail.com | Bigroundofapplause100 | 
      
      Scenario Outline: User Selecting Product
      Given User mouseover to Mens
    When user clicking AllClothing and clicking
   	And clicking Activewear
    And User selecting first product
    Then user add product to basket and view basket   
      