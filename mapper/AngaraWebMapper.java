package com.angara.mapper;

import java.util.List;
import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import com.angara.steps.AngaraWebStep;

import net.thucydides.core.annotations.Steps;

public class AngaraWebMapper {

	@Steps
	AngaraWebStep angaraWebStep=new AngaraWebStep();

	@When("select first displayed product")
	public void whenSelectFirstDisplayedProduct(){
		angaraWebStep.selectFirstDisplayedProduct();
	}
	@Then("verify subtotal price <subTotalPrice> of product")
	public void thenVerifySubtotalPricesubTotalPriceOfProduct(@Named("subTotalPrice") String subTotalPrice){
		angaraWebStep.verifySubtotalPrice(subTotalPrice);
	}
	@When("select blue sapphire filter")
	public void whenSelectBlueSapphireFilter(){
		angaraWebStep.selectBlueSapphireFilter();
	}
	@When("welcome pop up will displyed")
	public void whenWelcomePopUpWillDisplyed(){
		angaraWebStep.welcomePopUpShouldDisplayed(); 
	}
	@Then("chekout page should be displayed")
	public void thenChekoutPageShouldBeDisplayed(){
		angaraWebStep.checkOutPageShouldDisplayed();
	}
	@Then("error message should displayed <errorMessage>")
	public void thenErrorMessageShouldDisplayederrorMessage(@Named("errorMessage") String errorMessage){
		angaraWebStep.verifyErrorMessage(errorMessage);
	}
	@Then("verify page title")
	public void thenVerifyPageTitle(){
		angaraWebStep.verifyPageTitle();
	}
	@When("user select sapphire rings option")
	public void whenUserSelectSapphireRingsOption(){
		angaraWebStep.selectSapphireOption();
	}
	@When("add selected product in cart")
	public void whenAddSelectedProductInCart(){
		angaraWebStep.clickOnAddToCartButton();
	}
	@Then("verify product name <productName> and product price <productPrice>")
	public void thenVerifyProductNameproductNameAndProductPriceproductPrice(@Named("productName") String productName, @Named("productPrice") String productPrice ){
		angaraWebStep.verifyProductDetails(productName,productPrice);
	}
	@Then("verify product price <customizeProductPrice> after customization")
	public void thenVerifyProductPricecustomizeProductPriceAfterCustomization(@Named("customizeProductPrice") String customizeProductPrice){
		angaraWebStep.verifycustomizeProductPrice(customizeProductPrice);
	}
	@When("user select ring size <ringSize>")
	public void whenUserSelectRingSizeringSize(@Named("ringSize") String ringSize){
		angaraWebStep.selectRingSizerFromDropdown(ringSize);
	}


	@Given("user on home page")
	public void givenUserOnHomePage(){
		angaraWebStep.launchAngaraHomePage(); 
	}
	@Then("user should close the welcome popup")
	public void thenUserShouldCloseTheWelcomePopup(){
		angaraWebStep.clickOnCloseBotton();
	}
	@When("user select third option of select carat")
	public void whenUserSelectThirdOptionOfSelectCarat(){
		angaraWebStep.selectThirdOptionOfSelectCarat();
	}
	@When("user enter the address : $userAddressDetails")
	public void whenUserEnterTheAddress(ExamplesTable userAddressDetails){
		List<Map<String,String>> userD=userAddressDetails.getRows();

		angaraWebStep.enterUserDetails(userD);
	}
	@When("click on place order button")
	public void whenClickOnPlaceOrderButton(){
		angaraWebStep.clickOnPlaceOrderButton();
	}
	@When("user select gemstone filter")
	public void whenUserSelectGemstoneFilter(){
		angaraWebStep.selectGemstoneFilter();
	}
	@When("user hover on the Rings tab on top navigation")
	public void whenUserHoverOnTheRingsTabOnTopNavigation(){
		angaraWebStep.hoverOnRingTab();
	}
	@When("user click on proceed to secure checkout button")
	public void whenUserClickOnProceedToSecureCheckoutButton(){
		angaraWebStep.clickOnProceedToSecureCheckoutButton();
	}
	@When("user enter card details: $userCardDetails")
	public void whenUserEnterCardDetails(ExamplesTable userCardDetails){
		List<Map<String,String>> userCardDetail=userCardDetails.getRows();

		angaraWebStep.enterCardDetails(userCardDetail);

	}
	@When("click on continue to payment button")
	public void whenClickOnContinueToPaymentButton(){
		angaraWebStep.clickOnContinueToPaymentButton();
	}
	@When("click on review button")
	public void whenClickOnReviewButton(){
		angaraWebStep.clickOnReviewButton();
	}


}
