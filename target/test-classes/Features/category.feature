Feature: category navigation

    @hover
    Scenario: User should able to hover over main category and should able to click on subcategory successfully

      Given User is on home page
      When User hover over "Electronics" and click on subcategory "Camera & photo"
      Then User should able to see subcategory "Camera & photo" products



