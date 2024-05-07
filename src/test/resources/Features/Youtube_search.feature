Feature: YouTube Search
  As a user
  I want to search for videos on YouTube
  So that I can find relevant content

  Scenario: Search for a video
    Given I am on the YouTube homepage
    When I search for "Selenium testing"
    Then I should see search results for "Selenium testing"
