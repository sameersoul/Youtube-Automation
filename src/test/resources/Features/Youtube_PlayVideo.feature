Feature: Play and Control Video on YouTube

  Scenario: Play and Control a Video
    Given I am on the YouTube homepage
    When I search for "Tom and Jerry"
    And I click on the first video in the search results
    And I pause the video for 10 seconds
    And I play the video again
    And I skip the video forward by 20 seconds
    Then I should verify the video is playing
