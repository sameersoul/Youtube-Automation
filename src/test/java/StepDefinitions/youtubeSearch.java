/*package StepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Pages.Youtube_search_Page;

public class youtubeSearch {

    private WebDriver driver;
    private Youtube_search_Page youtubePage;
    
    @Before
    public void setupWebDriver() {
        
        // Initialize EdgeDriver with configured options
    	driver = new EdgeDriver();
    	driver.manage().window().maximize();

       
    }

    @Given("I am on the YouTube homepage")
    public void openYouTubeHomepage() {
       

        // Initialize page object
        youtubePage = new Youtube_search_Page(driver);

        // Open YouTube homepage
        youtubePage.openYouTube();
    }

    @When("I search for {string}")
    public void searchForVideo(String searchTerm) {
        // Search for the specified video
        youtubePage.searchVideo(searchTerm);
    }

    @Then("I should see search results for {string}")
    public void verifySearchResults(String expectedSearchTerm) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // Wait for search results to load (you can add more specific conditions if needed)
        wait.until(ExpectedConditions.titleContains(expectedSearchTerm + " - YouTube"));
        // Assert or perform further verification as needed
        String pageTitle = driver.getTitle();
        assert pageTitle.contains(expectedSearchTerm);

        // Quit the WebDriver after scenario execution
        
    }
    @After
    public void teardownWebDriver() {
        // Quit the WebDriver after each scenario
        if (driver != null) {
            driver.quit();
        }
    }
    }
*/