package StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Youtube_search_Page;

public class youtubeSearch {
    private WebDriver driver;
    private Youtube_search_Page youTubePage;

    @Given("I am on the YouTube homepage")
    public void i_am_on_the_youtube_homepage() {
       
        driver = new ChromeDriver();
        youTubePage = new Youtube_search_Page(driver);
        youTubePage.openYouTube();
    }

    @When("I search for {string}")
    public void i_search_for(String searchTerm) {
        youTubePage.searchVideo(searchTerm);
    }

    @Then("I should see search results for {string}")
    public void i_should_see_search_results_for(String searchTerm) {
        // Assuming validation involves checking the page title
        String pageTitle = driver.getTitle();
        assert pageTitle.contains(searchTerm);
        
        // Close the browser after assertion
        driver.quit();
    }
}
