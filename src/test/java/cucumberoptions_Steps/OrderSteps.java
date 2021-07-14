package cucumberoptions;

import org.openqa.selenium.support.PageFactory;


import com.cucumber.pages.OrderTshirt;

import io.cucumber.java.en.Then;

public class OrderSteps extends BaseSteps {

	OrderTshirt order = PageFactory.initElements(driver, OrderTshirt.class);
	
	@Then("user click T-Shirt link")
	public void user_click_t_shirt_link() throws InterruptedException {
	   order.Click_Tshirts_Button();
	}
	@Then("user click product image")
	public void user_click_product_image() throws InterruptedException {
		 order.Click_Image_Button();
	}
	@Then("user click add to cart button")
	public void user_click_add_to_cart_button() throws InterruptedException {
	    order.Click_AddToCart_Button();
	}
	@Then("user click ProceedToCheckout")
	public void user_click_proceed_to_checkout() {
	    order.Click_ProceedToCheckout();
	}

     @Then("user click ProceedToCheckout in summary page")
     public void user_click_proceed_to_checkout_in_summary_page() {
	    order.Click_ProceedToCheckout_Summary();
	}
	@Then("user click ProceedToCheckout in address page")
	public void user_click_proceed_to_checkout_in_address_page() {
	   order.Click_ProceedToCheckout_Address_Page();
	}
	
	@Then("user click CheckBox Agree To Terms in Shipping Page")
	public void user_click_check_box_agree_to_terms_in_shipping_page() throws InterruptedException {
	    order.Click_CheckBox_AgreeToTerms_Shipping_Page();
	}
	
	@Then("user click ProceedToCheckout in shipping page")
	public void user_click_proceed_to_checkout_in_shipping_page() {
	   order.Click_ProceedToCheckout_Shipping_Page();
	}
	
	@Then("user click PayByBankWire Payment Page")
	public void user_click_pay_by_bank_wire_payment_page() {
	    order.Click_PayByBankWire_Payment_Page() ;
	}
	@Then("user click I Confirm My Order Page")
	public void user_click_i_confirm_my_order_page() {
	    order.Click_IConfirmMyOrder_Page();
	}
	
	@Then("user verify the order is completed")
	public void user_verify_the_order_is_completed() {
	    order.Assert_Order_Confirmation();
	}
}
