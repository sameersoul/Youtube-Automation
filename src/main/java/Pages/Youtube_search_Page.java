package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Youtube_search_Page {
    private WebDriver driver;

    public Youtube_search_Page(WebDriver driver) {
        this.driver = driver;
    }

    By searchInput = By.xpath("//input[@id='search']");
    By searchButton = By.id("search-icon-legacy");

    public void openYouTube() {
        driver.get("https://www.youtube.com/");
    }

    public void searchVideo(String searchTerm) {
        driver.findElement(searchInput).sendKeys(searchTerm);
        driver.findElement(searchButton).click();
    }

    // Add more methods for other YouTube functionalities as needed
}
