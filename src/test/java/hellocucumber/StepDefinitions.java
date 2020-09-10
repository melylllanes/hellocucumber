package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	static {
		 System.setProperty("java.library.path","/home/ubuntu/hellocucumber");
	     System.loadLibrary("calculator2-exe");
	}

	static native int calculadora(Integer number1, Integer number2, String operacion);
	
	public Integer number1;
	public Integer number2;
	public String operacion;
	public String path = ";/home/ubuntu/hellocucumber";
	
	@Given("I have entered number1 into calculator")
	public void i_have_entered_number1_into_calculator() {
	    // Write code here that turns the phrase above into concrete actions
		number1 = 12;
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("I have entered number2 into calculator")
	public void i_have_entered_number2_into_calculator() {
	    // Write code here that turns the phrase above into concrete actions
		number2=23;
	    //throw new io.cucumber.java.PendingException();
	}
	@When("I add number1 and number2")
	public void i_add_number1_and_number2() {
	    // Write code here that turns the phrase above into concrete actions
		operacion = "a";
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("I should obtain this result")
	public void i_should_obtain_this_result() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		calculadora(number1, number2, operacion);
		System.out.println("TERMINO LLAMADA A CALCULADORA ... ");
	}

}
