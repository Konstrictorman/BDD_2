package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ContextMenuPage {
    WebDriver driver;
    Actions actions;

    @FindBy(id = "hot-spot")
    private WebElement contextMenuBox;

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }

    public void openContextMenuPage() {
        driver.get("https://the-internet.herokuapp.com/context_menu");
    }

    public void rightClickOnBox() {
        actions.contextClick(contextMenuBox).perform();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
}
