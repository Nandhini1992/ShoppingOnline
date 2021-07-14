package com.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PersonalInfo {

	@FindBy(how = How.XPATH, using = "//*[@class='col-xs-12 col-sm-6 col-lg-4']/ul/li[4]/a/i")
	WebElement Personal_Info_Link;
	@FindBy(how = How.XPATH, using = "//input[@id='firstname']")
	WebElement Firstname;
	@FindBy(how = How.XPATH, using = "//input[@id='old_passwd']")
	WebElement Old_Password;
	@FindBy(how = How.XPATH, using = "//button[@name='submitIdentity']")
	WebElement Save;
	@FindBy(how = How.XPATH, using = "//p[@class='alert alert-success']")
	WebElement Update_Confirmation;


public void Personal_Information_Link()
{
	Personal_Info_Link.click();
	System.out.println("Personal information link is clicked");
	
	
}

public void First_Name(String firstname) throws InterruptedException
{
	Firstname.clear();
	Thread.sleep(2000);
	Firstname.sendKeys(firstname);
	System.out.println("first name enetered successfully");
}

public void Provide_Old_Password(String password)
{
	Old_Password.sendKeys(password);
}

public void Click_Save_Button()
{
	Save.click();
	System.out.println("save button is clicked");
}

public void Verify_Update_Status()
{
	if(Update_Confirmation.getText().contains("successfully") )
	{
		System.out.println("first name updated successfully");
	}else {
		System.out.println("first name not updated successfully");
	}
}
}