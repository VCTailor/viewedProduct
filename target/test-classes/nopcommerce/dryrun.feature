Feature: Recently Viewed 

  Scenario: Customer should be able to see  products
    Given Customer on a products pages
    When  select a products for view
    And   press on Recently Viewed Product
    Then  Customer should be able to see viewed products on Recently Viewed Products Page