//package _01_04.test.TestSample;
// a package can not start with a number

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class TestSample  {
    public static void main(String[] args) {

        // Set the property for webdriver.chrome.driver to be the location to your local download of chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/marco/IdeaProjects.colab/01_04_20210210/src/chromedriver");

        // Create new instance of ChromeDriver
        // org.openqa.selenium.chrome.ChromeDriver
        WebDriver driver = new ChromeDriver();

        // And now use this to visit Google
        // org.openqa.selenium.WebDriver
        driver.get("http://www.google.com");

        // Find the text input element by its name
        // org.openqa.selenium.By and org.openqa.selenium.WebElement
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form
        element.submit();

        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Close the browser
        driver.quit();
    }
}
