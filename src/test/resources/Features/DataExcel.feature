Feature: Datatable Demo

  Scenario: print data from the datatable
    Given There is data
      | abc |
      | bcd |
    Then Print the data
      | name      | email               |
      | dhananjai | dhananjai@gmail.com |
      | anand     | anad@gmail.com      |
