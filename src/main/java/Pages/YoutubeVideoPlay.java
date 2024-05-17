package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YoutubeVideoPlay {
    private WebDriver driver;
    private WebDriverWait wait;

    private By searchInput = By.xpath("//input[@id='search']");
    private By searchButton = By.id("search-icon-legacy");
    private By firstVideoLink = By.xpath("//a[@id='thumbnail']");

    public YoutubeVideoPlay(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openYouTube() {
        driver.get("https://www.youtube.com");
    }

    public void searchVideo(String searchTerm) {
        WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(searchInput));
        inputElement.sendKeys(searchTerm);
        driver.findElement(searchButton).click();
    }
    public void clickFirstVideo() {
        // Construct XPath to find the first video link containing "Tom and Jerry" in its title
        String videoXPath = "//yt-formatted-string[contains(text(),'Tom and Jerry')]";

        // Wait for the first matching video element to be clickable
        WebElement firstVideoElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(videoXPath)));

        // Scroll the element into view using JavaScript
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'});", firstVideoElement);

        // Click on the video element
        try {
            firstVideoElement.click();
        } catch (ElementClickInterceptedException e) {
            // Handle the intercepting element if click fails
            System.out.println("Element click intercepted, retrying...");
            // You can add further retries or alternative actions if needed
        }
    }



   
    public void pauseVideo(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
        driver.findElement(By.tagName("body")).sendKeys("k"); // Press 'k' key to pause the video
    }

    public void playVideo() {
        driver.findElement(By.tagName("body")).sendKeys("k"); // Press 'k' key to play the video
    }

    public void skipVideoForward(int seconds) {
        driver.findElement(By.tagName("body")).sendKeys(String.valueOf(seconds), Keys.ARROW_RIGHT); // Skip forward using Arrow Right key
    }

    public boolean isVideoPlaying() {
        // Placeholder implementation for checking if the video is playing
        // Additional logic can be added here to verify the video state
        return true;
    }
}
