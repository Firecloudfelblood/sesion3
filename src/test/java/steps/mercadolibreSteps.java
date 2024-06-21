package steps;

import actions.actions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class mercadolibreSteps {

    actions Actions;
    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--remote-allow-origins=*");
        options.addArguments("window-size=1920,1200");
        System.setProperty("webdriver.chrome.whitelistedIps", "");
        driver = new ChromeDriver(options);
        Actions = new actions(driver);
    }

    @Given("I´m on mercado libre page")
    public void i_m_on_mercado_libre_page() {
        Actions.iramercadolibre(driver);
    }
    @And("I search for {string}")
    public void i_search_for(String string) {
        Actions.search(driver);
    }
    @When("I Select the first item")
    public void i_select_the_first_item() {
        Actions.select(driver);
    }
    @Then("I Validate the first Item price more than {double}")
    public void i_validate_the_first_item_price_more_than(Double double1) {
        Actions.validate(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

