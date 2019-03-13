package com.angara.pages;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.angara.utility.Session;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class AngaraWebPage extends PageObject {

	WebDriver driver;

	public AngaraWebPage(WebDriver driver){
		super(driver);
		this.driver=driver;
	}
	@FindBy(xpath="//div[@id='popup-visitor']/p/img")
	public static WebElement welcomePopup;

	@FindBy(xpath="//*[@id='visitor_popup_script_selection']/span[2]")
	public static WebElement closeButtonOfWelcomePopup;

	@FindBy(xpath="//*[text()= 'Rings']")
	public static WebElement ringTab;


	@FindBy(linkText="Sapphire")
	public static WebElement sapphireOption;

	@FindBy(xpath="//div[@id='narrow-by-list']/div[2]/div")
	public static WebElement gemstoneFilter;

	@FindBy(xpath="//span[contains(text(),'Blue Sapphire')]")
	public static WebElement blueSapphireFilter;

	@FindBy(id="gemcolor_desc_8790")
	public static WebElement firstDisplayedProduct;

	@FindBy(xpath="//h1[@itemprop='name']")
	public static WebElement actualProductName;

	@FindBy(xpath="//div[@class='active-price']")
	public static WebElement actualProductPrice;

	@FindBy(xpath="//span[text()=' Carat Weight ']/following::img[4]")
	public static WebElement thirdOptionOfSelectCarat;

	@FindBy(xpath="//select[starts-with(@name,'variation_asterisk_option')]")
	public static WebElement ringSizeDropDown;

	@FindBy(id="product-addtocart-button")
	public static WebElement addToCartButton;

	@FindBy(id="btn-gtm-proceedtocheckout")

	public static WebElement proccedToCheckoutButton;


	@FindBy(xpath="//*[text()='Subtotal']/following::td[1]")
	public static WebElement subtotalPrice;


	@FindBy(css="span#gtm-shipping-step1-continue-button")
	public static WebElement continueToPaymentButton;

	@FindBy(id="gtm1-place-order-button")
	public static WebElement placeOrderButton;


	@FindBy(xpath="//span[@id='gtm1s-place-order-button']")
	public static WebElement actualErrorMessage;


	@FindBy(id="payment-continue-button")
	public static WebElement reviewButton;


	@FindBy(xpath="//input[@placeholder='First Name']")
	public static WebElement firstName;


	@FindBy(xpath="//input[@placeholder='Last Name']")
	public static WebElement lastName;


	@FindBy(xpath="//input[@placeholder='Street Address']")
	public static WebElement streetName;


	@FindBy(xpath="//input[@placeholder='City']")
	public static WebElement city;


	@FindBy(xpath="//select[@name='country_id']")
	public static WebElement countryName;


	@FindBy(xpath="//select[@name='region_id']")
	public static WebElement regionName;

	@FindBy(xpath="//input[@placeholder='Zip code']")
	public static WebElement zipCode;

	@FindBy(xpath="//input[@placeholder='Email Address']")
	public static WebElement emailID;

	@FindBy(xpath="//input[@placeholder='Phone']")
	public static WebElement phone;

	@FindBy(id="braintree-hosted-field-number")
	public static WebElement frameOfCardNumber;

	@FindBy(id="credit-card-number")
	public static WebElement cardNumber;


	@FindBy(id="braintree-hosted-field-expirationMonth")
	public static WebElement frameOfExirationMonth;


	@FindBy(id="expiration-month")
	public static WebElement expirationMonth;


	@FindBy(id="braintree-hosted-field-expirationYear")
	public static WebElement frameOfExpirationYear;


	@FindBy(id="expiration-year")
	public static WebElement expirationYear;


	@FindBy(id="braintree-hosted-field-cvv")
	public static WebElement frameOfCVV;

	@FindBy(id="cvv")
	public static WebElement cvv;


	public void welcomePopUpShouldDisplayed() {		
		CommonUtility.waitForLoad(Session.webDriver);
		CommonUtility.waitUntilWebElementVisible(Session.webDriver, welcomePopup, 10);
		Assert.assertTrue("Welcome Popup Not Displayed",welcomePopup.isDisplayed());	
	}



	public void clickOnCloseBotton() {
		closeButtonOfWelcomePopup.click();		
	}

	public void hoverOnRingTab() {
		Actions builder = new Actions(Session.webDriver);
		Action mouseOverHome = builder.moveToElement(ringTab).build();
		mouseOverHome.perform();		
	}



	public void selectSapphireOption() {
		CommonUtility.waitUntilWebElementclickable(Session.webDriver, sapphireOption, 5);
		sapphireOption.click();	
	}



	public void verifyPageTitle() {
		Assert.assertEquals("Sapphire Rings: Buy Natural Sapphire Rings at Angara",Session.webDriver.getTitle());	
	}

	public void selectGemstoneFilter() {
		CommonUtility.waitForLoad(Session.webDriver);
		gemstoneFilter.click();		
	}

	public void selectBlueSapphireFilter() {
		blueSapphireFilter.click();
	}

	public void selectFirstDisplayedProduct() {
		firstDisplayedProduct.click();
	}

	public void verifyProductDetails(String productName, String productPrice) {
		CommonUtility.waitForLoad(Session.webDriver);
		CommonUtility.switchToWindowByTitle(Session.webDriver, "Princess Diana Inspired Blue Sapphire Ring with Diamond Halo");
		CommonUtility.waitUntilWebElementVisible(Session.webDriver, actualProductName, 10);
		CommonUtility.waitUntilWebElementVisible(Session.webDriver, actualProductPrice, 10);
		Assert.assertEquals(productName,actualProductName.getText());
		Assert.assertEquals(productPrice,actualProductPrice.getText());
		System.out.println("Complted");
	}

	public void selectThirdOptionOfSelectCarat() {
		CommonUtility.waitForLoad(Session.webDriver);
		CommonUtility.waitUntilWebElementclickable(Session.webDriver, thirdOptionOfSelectCarat, 10);
		thirdOptionOfSelectCarat.click();	
	}

	public void verifycustomizeProductPrice(String customizeProductPrice) {
		Assert.assertEquals(customizeProductPrice,actualProductPrice.getText());
	}

	public void selectRingSizerFromDropdown(String ringSize) {
		CommonUtility.selectDropDownByVisibleText(ringSizeDropDown, ringSize);
	}

	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}

	public void verifySubTotalPrice(String subTotal) {
		CommonUtility.waitForLoad(Session.webDriver);
		CommonUtility.switchToWindowByTitle(Session.webDriver, "Angara Secure Shopping Cart");
		CommonUtility.waitUntilWebElementVisible(Session.webDriver, subtotalPrice, 5);
		Assert.assertEquals(subTotal,subtotalPrice.getText());
	}

	public void clickOnProccedToCheckoutButton() {
		proccedToCheckoutButton.click();
	}

	public void checkOutPageShouldDisplayed() {
		Assert.assertEquals("Angara Secure Shopping Cart",Session.webDriver.getTitle());
	}

	public void clickOnContinueToPaymentButton() {
		CommonUtility.waitUntilWebElementclickable(Session.webDriver, continueToPaymentButton, 5);
		continueToPaymentButton.click();

	}

	public void clickOnPlaceOrderButton() {
		CommonUtility.waitUntilWebElementclickable(Session.webDriver, placeOrderButton, 5);
		placeOrderButton.click();
	}

	public void verifyErrorMessage(String errorMessage) {
		CommonUtility.waitForElementOnWebPage(10000);		
		String errorMsg=Session.webDriver.switchTo().alert().getText();
		Assert.assertEquals(errorMessage,errorMsg);
		System.out.println("Your card is invalid");
		driver.switchTo().alert().accept();
	}

	public void clickOnReviewButton() {
		CommonUtility.waitForElementOnWebPage(5000);
		Session.webDriver.switchTo().defaultContent();
		reviewButton.click();
	}

	public void enterUserDetails(List<Map<String, String>> userDetails) {
		CommonUtility.waitForLoad(Session.webDriver);
		CommonUtility.waitForElementOnWebPage(10000);
		for (Map<String, String> details : userDetails) {
			firstName.sendKeys(details.get("firstName"));
			lastName.sendKeys(details.get("lastName"));
			streetName.sendKeys(details.get("streetName"));
			city.sendKeys(details.get("city"));
			countryName.sendKeys(details.get("country"));
			regionName.sendKeys(details.get("state"));
			zipCode.sendKeys(details.get("zipCode"));
			emailID.sendKeys(details.get("emailID"));
			phone.sendKeys(details.get("phone"));
		}
	}

	public void enterCardDetails(List<Map<String, String>> userCardDetail) {
		CommonUtility.waitForLoad(Session.webDriver);		
		for (Map<String, String> details : userCardDetail) {
			CommonUtility.swithToFrameByName(Session.webDriver,frameOfCardNumber);
			cardNumber.sendKeys(details.get("cardNumber"));
			CommonUtility.swithToFrameByName(Session.webDriver,frameOfExirationMonth);
			expirationMonth.sendKeys(details.get("expiryMonth"));
			CommonUtility.swithToFrameByName(Session.webDriver,frameOfExpirationYear);
			expirationYear.sendKeys(details.get("expiryYear"));
			CommonUtility.swithToFrameByName(Session.webDriver,frameOfCVV);
			cvv.sendKeys(details.get("CVV"));		
		}

	}



}
