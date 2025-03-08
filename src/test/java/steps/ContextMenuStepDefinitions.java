package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.ContextMenuPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class ContextMenuStepDefinitions {
    WebDriver driver;
    ContextMenuPage contextMenuPage;

    @Given("I open the context menu page")
    public void iOpenTheContextMenuPage() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);                
        contextMenuPage = new ContextMenuPage(driver);
        contextMenuPage.openContextMenuPage();
    }

    @When("I right-click on the context menu box")
    public void iRightClickOnTheContextMenuBox() {
        contextMenuPage.rightClickOnBox();
    }

    @Then("An alert should appear with text {string}")
    public void anAlertShouldAppearWithText(String expectedAlertText) {
        String actualAlertText = contextMenuPage.getAlertText();
        Assert.assertEquals("Alert text does not match!", expectedAlertText, actualAlertText);
    }

    @When("I accept the alert")
    public void iAcceptTheAlert() {
        contextMenuPage.acceptAlert();
    }
}
