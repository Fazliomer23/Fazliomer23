package tek.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseSetup {
    private static WebDriver driver;

    public void setupBrowser() {
        driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public void quitBrowser() {
        // null check before quit
        if (driver != null) {
            driver.quit();
            driver = null; // reset driver to null after quitting


        }
    }

    // Giving read-only indirect access to driver.
    // restrict setting new driver instance
    public WebDriver getDriver() {
        return driver;
    }}