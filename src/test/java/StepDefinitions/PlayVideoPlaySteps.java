package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.junit.Assert;
//import Pages.Youtube_search_Page;
import Pages.YoutubeVideoPlay;

public class PlayVideoPlaySteps {
    private WebDriver driver;
    private YoutubeVideoPlay searchResultsPage;

    @Given("I am on the YouTube homepage")
    public void openYouTubeHomepage() {
        driver = new EdgeDriver();
        searchResultsPage = new YoutubeVideoPlay(driver);
        searchResultsPage.openYouTube();
    }

    @When("I search for {string}")
    public void searchForVideo(String searchTerm) {
        searchResultsPage.searchVideo(searchTerm);
    }

    @When("I click on the first video in the search results")
    public void clickFirstVideoInSearchResults() {
        searchResultsPage.clickFirstVideo();
    }

    @When("I pause the video for {int} seconds")
    public void pauseVideoForSeconds(int seconds) throws InterruptedException {
        searchResultsPage.pauseVideo(seconds);
    }

    @When("I play the video again")
    public void playVideoAgain() {
        searchResultsPage.playVideo();
    }

    @When("I skip the video forward by {int} seconds")
    public void skipVideoForward(int seconds) {
        searchResultsPage.skipVideoForward(seconds);
    }

    @Then("I should verify the video is playing")
    public void verifyVideoIsPlaying() {
        boolean isPlaying = searchResultsPage.isVideoPlaying();
        Assert.assertTrue(isPlaying);
        driver.quit();
    }
} 
