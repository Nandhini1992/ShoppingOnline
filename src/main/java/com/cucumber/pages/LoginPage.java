package com.cucumber.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage{
	
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	

	@FindBy(how = How.XPATH, using = "//a[@class='login']") WebElement Sign_In_Link;
	@FindBy(how = How.XPATH, using = "//input[@id='email']") WebElement Username;
	@FindBy(how = How.XPATH, using = "//input[@id='passwd']") WebElement Password_Field;
	@FindBy(how = How.XPATH, using = "//button[@id='SubmitLogin']") WebElement SignIn_Button;

	
	
	public void Click_Signin_Link()
	{
		Sign_In_Link.click();
		System.out.println("Signin link clicked sucdessfully");
	}
	
	//InteractiveMethods
	public void Enter_EMail_Address(String email)  {
		Username.sendKeys(email);
		
	}
	
	public void Enter_Password(String password) {
		Password_Field.sendKeys(password);
		
	}
	
	public void Click_Signin_Button() {
		SignIn_Button.click();
	}
	

	
	
	

}
