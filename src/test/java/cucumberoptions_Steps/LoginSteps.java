package cucumberoptions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.cucumber.pages.LoginPage;

import org.openqa.selenium.support.PageFactory;

public class LoginSteps extends BaseSteps{
	
	LoginPage page = PageFactory.initElements(driver, LoginPage.class);
	
	
	@When("User clicks sign in Link")
	public void user_clicks_sign_in_link() {
		page.Click_Signin_Link();
		

	}
	@Then("User enters email address {string}")
	
	public void user_enters_email_address(String email)  {
		page.Enter_EMail_Address(email);
	    
	}
	
    @Then("User enters password {string}")
	
	public void user_enters_password(String password)  {
		page.Enter_Password(password);
		
	}


	@Then("User clicks signin button")
	public void user_clicks_signin_button() {
	    page.Click_Signin_Button();
	    
	}
	
	


}
