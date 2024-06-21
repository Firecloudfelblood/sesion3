package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class actions {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy (id = "cb1-edit")
    WebElement searchTab;
    @FindBy (css = "#\\:R4l5e6\\: > div.ui-search-result__content > div > div.ui-search-item__group.ui-search-item__group--title > a")
    WebElement product;
    @FindBy (xpath = "//*[@id=\"ui-pdp-main-container\"]/div[1]/div/div[1]/div[2]/div[2]/div[1]/div[1]/span/span/span[2]")
    WebElement price;

    public actions(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void iramercadolibre(WebDriver driver) {
        this.driver.get("https://www.mercadolibre.com.mx/");
    }

    public void search(WebDriver driver) {
        searchTab.sendKeys("vinyl");
        searchTab.submit();
    }

    public void select(WebDriver driver) {
        product.click();

    }

    public void validate(WebDriver driver) {
        Assert.assertTrue(Integer.parseInt(price.getText())>0);
    }
}



