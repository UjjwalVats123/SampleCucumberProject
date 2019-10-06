package StepDefination;

import java.util.Iterator;
import java.util.List;

import org.junit.runner.RunWith;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {
	public static int tcId=0;
	Iterator it;
	@Given("^User is on Netbanking landing page$")
	public void user_is_on_Netbanking_landing_page() {
		tcId++;
		System.out.println("********Test Case - "+tcId+" ********************");
	    System.out.println("User is on Netbanking page");
	}

	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() {
		 System.out.println("User is logging into the application");
	}

	@Then("^Homepage is populated$")
	public void homepage_is_populated() {
		 System.out.println("Homepage is populated");
	}

	
	@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_into_application_with_and(String arg1, String arg2) {
	    System.out.println("User is logging into the application using following credentials:");
	    System.out.println("Username : "+arg1+", Password : "+arg2 );
	}
	
	@Then("^Cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are(String arg1){
	    if(arg1.equals("True"))
	    	System.out.println("Cards are displayed");
	    else
	    	System.out.println("Cards are not displayed");
	    
	    System.out.println("*******************************************");
	}
	@When("^User login into application with Username(\\d+) and Password(\\d+)$")
	public void user_login_into_application_with_Username_and_Password(int arg1, int arg2){
		 System.out.println("User is logging into the application using following credentials:");
		    System.out.println("Username : "+arg1+", Password : "+arg2 );
	}
	@When("^User signup with the following details$")
	public void user_signup_with_the_following_details(DataTable arg1)  {
	   List<String> lst = arg1.asList(String.class);
	   System.out.println("User is signing up with the following details : ");
	   it = lst.iterator();
	   while(it.hasNext())
	    System.out.println(it.next());
	}
	@Given("^Driver is present$")
	public void driver_is_present() throws Throwable {
	    System.out.println("Driver is present");
	}

	@When("^Browser is triggered$")
	public void browser_is_triggered() throws Throwable {
	    System.out.println("Browser is triggered");
	}

	@Then("^Check if browser is started$")
	public void check_if_browser_is_started() throws Throwable {
	  System.out.println("Browser is started");
	}
}
