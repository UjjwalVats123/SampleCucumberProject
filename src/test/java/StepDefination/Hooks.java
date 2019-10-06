package StepDefination;

import cucumber.api.java.Before;

public class Hooks {
	//This is before annotation from cucumber.api.java
	//Piece of code under this tag will be executed before each test case
	//I know you might be confused between Background annotation and this @Before annotation
	//There is a small difference between the two
	//Difference becomes more clear when the scenario is like
	//If you have some prerequisites specific to tags then background is not useful
	//because every time the tag changes the prerequisites change
	//So in this case we can go for @Before annotataion
	
	@Before("@PameterizedTest")
	public void beforeValidation(){
		System.out.println("Prerequisites for @ParameterizedTest are being executed");
	}
	@Before("@SignupTest")
	public void beforeValidation1(){
		System.out.println("Prerequisites for @SignupTest are being executed");
	}
	
}
