package zdtestpol51bdd.calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalculatorStepsDefinitions {
    //Calculator - klasa - czyli przepis, jak powinien wygladac obiekt
    //calculator - pole - PUSTE stworzone za pomoca przepisu z klasy Calculator
    Calculator calculator;
    Integer result;
    @Given("I have a calculator")
    public void i_have_a_calculator() {
        //utwórz nowy obiekt klasy Calculator
        //new Calculator - stworz nowy obiekt Calculator
        calculator = new Calculator();
    }
    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        result = calculator.addTwoNumbers(int1,int2);
    }
    @Then("I should get {int}")
    public void i_should_get(Integer int1) {
        Assert.assertEquals(result,int1);
    }
}