package hellocucumber;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	static {
//		 System.setProperty("java.library.path","/home/ubuntu/hellocucumber");
//	     System.load("C:\\calculator2-exe");
	}

	static native void calculator(Integer number1, Integer number2, String operacion);
	
	public Integer number1;
	public Integer number2;
	public String operacion;
	
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
	    
		ProcessBuilder p = new ProcessBuilder();
        System.out.println("Started EXE");
        p.command("/home/ubuntu/hellocucumber/calculator2-exe 12 12 \"a\"  ");   
        try {
			p.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		calculator(number1, number2, operacion);
		System.out.println("TERMINO LLAMADA UTILIZANDO LOAD ... ");
//		Runtime runTime = Runtime.getRuntime();
//		try {
//			Process p = runTime.exec("/home/ubuntu/hellocucumber/./calculator2-exe");
//			System.out.println("TERMINO LLAMADA A CALCULADORA ... ");
//			BufferedReader reader = new BufferedReader(
//                    new InputStreamReader(p.getInputStream()));
//			String line = null;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//            reader.close();
//
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
