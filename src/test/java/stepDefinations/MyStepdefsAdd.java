package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// JUnit används BARA för assertEquals
import static org.junit.Assert.assertEquals;

public class MyStepdefsAdd {

    private WebDriver driver;

    // Körs innan varje testfall startar
    @Before
    public void setUp() {

        System.out.println("Stet up is worked");
    }

    // Väljer webbläsare baserat på texten i testfallet (Edge, Firefox eller Chrome)
    @Given("I am using {string} as browser")
    public void iAmUsingAsBrowser(String browser) throws InterruptedException {

        if (browser.equals("edge")){
            driver = new EdgeDriver();
        } else if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new ChromeDriver();
        }

        // Öppnar kalkylatorns hemsida
        driver.get("https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php");

        // Väntar 2 sekunder så att sidan och popup-rutan hinner laddas
        Thread.sleep(2000);

        // Letar upp och klickar på godkänn-knappen (fungerar på både svenska och engelska)
        WebElement consentButton = driver.findElement(By.xpath("//*[contains(text(),'Jag samtycker') or contains(text(),'Consent')]"));
        consentButton.click();

    }

    // Hittar det första fältet och skriver in det första talet
    @Given("I have the frist number {int}")
    public void iHaveTheFristNumber(int frist) {
        WebElement field = driver.findElement(By.name("n01"));
        field.sendKeys(Integer.toString(frist));
    }

    // Hittar det andra fältet och skriver in det andra talet
    @And("I have the second number {int}")
    public void iHaveTheSecondNumber(int second) {
        WebElement field = driver.findElement(By.name("n02"));
        field.sendKeys(Integer.toString(second));
    }

    // Hittar knappen "Find Addition" och klickar på den
    @When("I perform add of the two numbers")
    public void iPerformAddOfTheTwoNumbers() {
        driver.findElement(By.cssSelector("[Value='Find Addition']")).click();
    }

    // Hämtar värdet från resultatfältet och jämför det med vad vi förväntar oss
    @Then("I receive the result {int}")
    public void iReceiveTheResult(int expected) {
        WebElement field = driver.findElement(By.name("answer"));
        String actual = field.getAttribute("value");
        assertEquals(Integer.toString(expected), actual);
    }

    // Körs automatiskt när testfallet är klart
    @After
    public void tearDown() {
        /*if (driver != null) {
            // Här ska vi skriva kommandot för att stänga ner

            System.out.println("Stänger webbläsaren...");
        }*/
        driver.quit();
    }
}
