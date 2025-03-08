package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {
    WebDriver driver;

    @FindBy(xpath = "//form[@id='checkboxes']/input[1]")
    private WebElement firstCheckbox;

    @FindBy(xpath = "//form[@id='checkboxes']/input[2]")
    private WebElement secondCheckbox;

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openCheckBoxPage() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    public void checkFirstCheckbox() {
        if (!firstCheckbox.isSelected()) {
            firstCheckbox.click();
        }
    }

    public boolean isFirstCheckboxChecked() {
        return firstCheckbox.isSelected();
    }

    public void uncheckSecondCheckbox() {
        if (secondCheckbox.isSelected()) {
            secondCheckbox.click();
        }
    }

    public boolean isSecondCheckboxUnchecked() {
        return !secondCheckbox.isSelected();
    }
}
