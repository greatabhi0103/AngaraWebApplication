package com.angara.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.angara.pages.AngaraWebPage;
import com.angara.pages.CommonUtility;
import com.angara.utility.Session;

import net.thucydides.core.annotations.Step;

public class AngaraWebStep  {


	AngaraWebPage angaraWebPage;


	@Step
	public void launchAngaraHomePage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.angara.com/");
		driver.manage().window().maximize();
		System.out.println("Done");
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		Session.webDriver=driver;
	}

	@Step
	public void welcomePopUpShouldDisplayed() {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.welcomePopUpShouldDisplayed();

	}

	@Step
	public void clickOnCloseBotton() {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.clickOnCloseBotton();

	}

	@Step
	public void hoverOnRingTab() {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.hoverOnRingTab();

	}

	@Step
	public void selectSapphireOption() {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.selectSapphireOption();

	}

	@Step
	public void verifyPageTitle() {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.verifyPageTitle();

	}

	@Step
	public void selectGemstoneFilter() {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.selectGemstoneFilter();


	}

	@Step
	public void selectBlueSapphireFilter() {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.selectBlueSapphireFilter();

	}

	@Step
	public void selectFirstDisplayedProduct() {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.selectFirstDisplayedProduct();

	}

	@Step
	public void verifyProductDetails(String productName, String productPrice) {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.verifyProductDetails(productName, productPrice);

	}

	@Step
	public void selectThirdOptionOfSelectCarat() {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.selectThirdOptionOfSelectCarat();
	}

	@Step
	public void verifycustomizeProductPrice(String customizeProductPrice) {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.verifycustomizeProductPrice(customizeProductPrice);

	}

	@Step
	public void selectRingSizerFromDropdown(String ringSize) {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.selectRingSizerFromDropdown(ringSize);

	}

	@Step
	public void clickOnAddToCartButton() {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.clickOnAddToCartButton();

	}

	@Step
	public void verifySubtotalPrice(String subTotalPrice) {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.verifySubTotalPrice(subTotalPrice);

	}

	@Step
	public void clickOnProceedToSecureCheckoutButton() {

		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.clickOnProccedToCheckoutButton();

	}

	@Step
	public void checkOutPageShouldDisplayed() {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.checkOutPageShouldDisplayed();

	}

	@Step
	public void clickOnContinueToPaymentButton() {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.clickOnContinueToPaymentButton();

	}

	@Step
	public void clickOnPlaceOrderButton() {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.clickOnPlaceOrderButton();

	}

	@Step
	public void clickOnReviewButton() {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.clickOnReviewButton();

	}

	@Step
	public void verifyErrorMessage(String errorMessage) {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.verifyErrorMessage(errorMessage);
	}

	@Step
	public void enterUserDetails(List<Map<String, String>> userDetails) {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.enterUserDetails(userDetails);
	}

	@Step
	public void enterCardDetails(List<Map<String, String>> userCardDetail) {
		angaraWebPage=new AngaraWebPage(Session.webDriver);
		angaraWebPage.enterCardDetails(userCardDetail);
	}

}
