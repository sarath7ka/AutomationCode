Feature: check the functionality of the Amazon

  @US001
  Scenario:Check the SignIn function of Amazon application
    Given User navigate the home page
    When User enter the username and password in SignIn page
    Then To navigate product search page
  @US002
  Scenario:Check the SighOut function of Amazon application
    Given User in Amazon page
    When User click the SignOut button
    Then To navigate SignIn page


  Scenario: Check the product add cart function of Amazon application
    Given User search And finalize the product
    When User product to be add using add to cart click button
    Then User product to be added

  Scenario: Check the remove cart function of Amazon application
    Given User in remove cart page of amazon application
    When User click the delete button of remove cart page
    Then User product to be removed
   @US004
   Scenario: Check the function of filter function of Amazon application
     Given User searchh the product
     When user click sort button for their criteria
     Then Navigate sorting order based on criteria
   @US003
   Scenario:  Check the function of sort function of Amazon application
     Given User search the product
     When User choose criteria in filter column using click and checkbox
     Then Navigate the page based on their requirement

   Scenario:page jump for different data
     Given User navigate the page
     When User open different data using click button
     Then open the different page in new window