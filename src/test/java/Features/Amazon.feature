Feature: Amazon.com

  Scenario: Amazon.com Adding Product

    Given User is on homepage
    When Click accept cookies
    When Click to search box
    When Write to product name
    When Click to search button
    When Filter for Shipped by Amazon
    When Filter for Apple
    When Click to first product
    When Add to Basket
    When Check at basket page
