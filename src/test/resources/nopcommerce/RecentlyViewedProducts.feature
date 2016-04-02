
Feature: Recently Viewed Products

  Scenario: Customer should be able to see recently viewed products
    Given Customer on a products page
    When  select a product for view
    And   press on Recently Viewed Products
    Then  Customer should be able to see viewed product on Recently Viewed Product Page