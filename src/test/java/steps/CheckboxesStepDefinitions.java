package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.CheckBoxPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckboxesStepDefinitions {
    WebDriver driver;
    CheckBoxPage checkBoxPage;

    @Given("I open the checkboxes page")
    public void iOpenTheCheckboxesPage() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);        
        //driver.get("https://the-internet.herokuapp.com/checkboxes");
        checkBoxPage = new CheckBoxPage(driver);
        checkBoxPage.openCheckBoxPage();
    }


    @When("I check the first checkbox")
    public void iCheckTheFirstCheckbox() {
        checkBoxPage.checkFirstCheckbox();
    }

    @Then("The first checkbox should be checked")
    public void theFirstCheckboxShouldBeChecked() {
        Assert.assertTrue("First checkbox is not checked!", checkBoxPage.isFirstCheckboxChecked());
    }

    @When("I uncheck the second checkbox")
    public void iUncheckTheSecondCheckbox() {
        checkBoxPage.uncheckSecondCheckbox();
    }

    @Then("The second checkbox should be unchecked")
    public void theSecondCheckboxShouldBeUnchecked() {
        Assert.assertTrue("Second checkbox is still checked!", checkBoxPage.isSecondCheckboxUnchecked());
    }
}
