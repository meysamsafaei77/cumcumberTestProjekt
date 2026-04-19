package stepDefinations;

import common.Calculator;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class MyStepdefs {

    private Calculator calculator;

    // Körs innan varje testfall startar
    @Before
    public void setUp() {
        System.out.println("Stet up is worked");
    }

    // Tar emot två decimaltal och skapar ett kalkylator-objekt
    @Given("I have two numbers {double} and {double}")
    public void iHaveTwoNumbersAnd(double frist, double second) {
        calculator = new Calculator(frist, second);
    }

    // Ber kalkylatorn att addera talen
    @When("I add the two numbers")
    public void iAddTheTwoNumbers() {
        calculator.add();
    }

    // Kontrollerar att resultatet stämmer med en liten felmarginal (0.001)
    @Then("I get the result {double}")
    public void iGetTheResult(double expected) {
        double actual = calculator.getResult();
        assertEquals(expected, actual, 0.001);
    }

    // Ber kalkylatorn att subtrahera talen
    @When("I subtract the two numbers")
    public void iSubtractTheTwoNumbers() {
        calculator.subtract();
    }

    // Ber kalkylatorn att multiplicera talen
    @When("I multiply the two numbers")
    public void iMultiplyTheTwoNumbers() {
        calculator.multiply();
    }

    // Ber kalkylatorn att dividera talen
    @When("I divide the two numbers")
    public void iDivideTheTwoNumbers() {
        calculator.divide();
    }

    // Skriver ut att testet har börjat
    @Given("the test case start with this")
    public void theTestCaseStartWithThis() {
        System.out.println("Test case starts");
    }

    // Skriver ut att något annat händer i testet
    @And("then something else happens")
    public void thenSomethingElseHappens() {
        System.out.println("Somethings else happens");
    }

    // Körs automatiskt när testfallet är klart
    @After
    public void tearDown() {
        System.out.println("Test case ends");
    }
}
