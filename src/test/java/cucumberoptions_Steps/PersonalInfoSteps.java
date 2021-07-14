package cucumberoptions;
import org.openqa.selenium.support.PageFactory;


import com.cucumber.pages.OrderTshirt;
import com.cucumber.pages.PersonalInfo;

import io.cucumber.java.en.Then;

public class PersonalInfoSteps extends BaseSteps {

	PersonalInfo pi = PageFactory.initElements(driver, PersonalInfo.class);
	
	@Then("user click  Personal Information Link")
	public void user_click_personal_information_link() {
	    pi.Personal_Information_Link();
	 
	}
	
	@Then("user update firstname {string}")
	public void user_update_firstname(String firstname) throws InterruptedException {
	    pi.First_Name(firstname);
	 
	}
	
	@Then("user provide old password {string}")
	public void user_provide_old_password(String password) {
	    pi.Provide_Old_Password(password);
	 
	}
	
	@Then("user click save button")
	public void user_click_save_button() {
	    pi.Click_Save_Button();
	 
	}
	
	@Then("user verify whether the update is successful")
	public void user_verify_whether_the_update_is_successful() {
	    pi.Verify_Update_Status();
	 
	}
	
	
	
	
	
		
}	