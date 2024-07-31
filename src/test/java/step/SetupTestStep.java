package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import utility.SeleniumUtility;

public class SetupTestStep extends SeleniumUtility {
    @Given("Open browser and navigate to retail app")
    public void openBrowserAndNavigate() {
        setupBrowser();
    }

    @Then("validate top left corner is TEKSCHOOL")
    public void validateTopLeftLogo() {
        String text = getElementText(By.className("top-nav__logo"));

        System.out.println(text);
    }

    @Then("Close the browser")
    public void closeBrowser() {
        quitBrowser();
}}
