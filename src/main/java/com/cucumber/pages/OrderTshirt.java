package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class OrderTshirt {


WebDriver driver;

public OrderTshirt(WebDriver driver) {
	this.driver = driver;
}
	


@FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[1]/a")
WebElement Tshirts_Button;
@FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")WebElement Product_Image;
@FindBy(how = How.XPATH, using = "//a[@class='button ajax_add_to_cart_button btn btn-default']")WebElement Add_To_Cart;
@FindBy(how = How.XPATH, using = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a")
WebElement ProceedToCheckout_Button;
@FindBy(how = How.XPATH, using = "//div[@id='center_column']/p[2]/a[1]")WebElement ProceedToCheckout_Button_Summary;
@FindBy(how = How.XPATH, using = "//div[@id='center_column']/form/p/button")WebElement ProceedToCheckout_Button_Address_Page;
@FindBy(how = How.XPATH, using = "//form[@id='form']/p/button")WebElement ProceedToCheckout_Button_Shipping_Page;
@FindBy(how = How.XPATH, using = "//input[@id='cgv']")WebElement CheckBox_AgreeToTerms_Shipping_Page;
@FindBy(how = How.XPATH, using = "//a[@class='bankwire']")WebElement PayByBankWire_Payment_Page;
@FindBy(how = How.XPATH, using = "//span[contains(text(),'I confirm my order')]")WebElement IConfirmMyOrder_Payment_Page;
@FindBy(how = How.XPATH, using = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")WebElement MyAccount_Button;
@FindBy(how = How.XPATH, using = "//p[@class='cheque-indent']/strong[@class='dark']")WebElement Order_Confirmation;

public void Click_Tshirts_Button() throws InterruptedException {
	Thread.sleep(2000); 
	WebElement element = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[1]/a"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", element);
	
}

public void Click_Image_Button() throws InterruptedException {
	Thread.sleep(2000); 
	WebElement element = driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", element);
}

public void Click_AddToCart_Button() throws InterruptedException {
	Thread.sleep(2000); 
	WebElement element = driver.findElement(By.xpath("//p[@id='add_to_cart']/button"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", element);
}
public void Click_ProceedToCheckout() {
	ProceedToCheckout_Button.click();
}

public void Click_ProceedToCheckout_Summary() {
	ProceedToCheckout_Button_Summary.click();
}

public void Click_ProceedToCheckout_Address_Page() {
	ProceedToCheckout_Button_Address_Page.click();
}

public void Click_ProceedToCheckout_Shipping_Page() {
	ProceedToCheckout_Button_Shipping_Page.click();
}

public void Click_CheckBox_AgreeToTerms_Shipping_Page() throws InterruptedException {
	Thread.sleep(2000);
	CheckBox_AgreeToTerms_Shipping_Page.click();
}

public void Click_PayByBankWire_Payment_Page() {
	PayByBankWire_Payment_Page.click();
}

public void Click_IConfirmMyOrder_Page() {
	IConfirmMyOrder_Payment_Page.click();
}

public void Click_MyAccount_Button() {
	MyAccount_Button.click();
}


public void Assert_Order_Confirmation() {
	
	if(Order_Confirmation.getText().contains("complete")) {
		System.out.println("Order Verified");
	}else {
		System.out.println("Order not completed");
	}
	
}

	
}
