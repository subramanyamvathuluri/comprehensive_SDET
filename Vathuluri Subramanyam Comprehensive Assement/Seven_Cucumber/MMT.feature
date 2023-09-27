Feature: MMT Page working

  Scenario: Book the flight tickets
    Given I launch edge browser
    When I open the homepage
    Then I choose Destinations
    Then I choose the dates
    Then I press on search
    Then I verify the page loading
    And I close the browser
