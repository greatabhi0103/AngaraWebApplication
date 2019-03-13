package com.angara.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;


public class CommonUtility extends PageObject {

	private CommonUtility() {
		//Empty Construtor So that no class will create construtor of Common Utility
	}

	public static void waitUntilWebElementVisible(WebDriver driver,WebElement webElement,int timeOut)
	{
		WebDriverWait wait=new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOf(webElement));
	}

	public static void waitForElementOnWebPage(int timeOut)
	{
		try {
			Thread.sleep(timeOut);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void waitUntilWebElementclickable(WebDriver driver,WebElement webElement,int timeOut)
	{
		WebDriverWait wait=new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
	}

	public static void waitForLoad(WebDriver driver) {
		ExpectedCondition<Boolean> pageLoadCondition = new
				ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
			}
		};
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(pageLoadCondition);
	}

	public static WebDriver switchToWindowByTitle(WebDriver driver,String title){
		Set<String> titles=driver.getWindowHandles();
		for (String string : titles) {
			driver.switchTo().window(string);
			if(driver.getTitle().contains(title)){
				break;
			}
		}
		return driver;
	}

	public static void selectDropDownByVisibleText(WebElement webElement, String value)
	{
		Select selectDropDown=new Select(webElement);
		selectDropDown.selectByVisibleText(value);
	}

	public static void swithToFrameByName(WebDriver driver,WebElement element) {
		driver.switchTo().defaultContent();
		waitUntilWebElementVisible(driver,element,10);
		driver.switchTo().frame(element);

	}


}
