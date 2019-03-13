package com.angara.bdd;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;


public class App {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		/*driver.get("http://www.tinyupload.com/");
		driver.findElement(By.name("uploaded_file")).click();
		Runtime.getRuntime().exec("C:\\AutoITDEMO\\FileUpload.exe");*/
		
		
		
		ChromeOptions options=new ChromeOptions();
		
		Map<String, Object> per= new HashMap<String, Object>();
		per.put("profile.default_content_setting_popup", 0);
		per.put("download.default_directory", "C:\\AutoITDEMO");
		options.setExperimentalOption("prefs", per);
		
		WebDriver driver=new ChromeDriver(options);
		
		/*DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);*/
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.xpath("//input[@value='Download']")).click();
		Thread.sleep(3000);
		
		
		File f = new File("C:\\AutoITDEMO\\qav_test.zip");
		if(f.exists() /*&& !f.isDirectory()*/) { 
		    System.out.println("Exists");
		}else
		{
			System.out.println("Sorry, File didn't downloaded correctly");
		}
		
		/*
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='visitor_popup_script_selection']/span[2]")).click();
		Actions builder = new Actions(driver);
		Action mouseOverHome = builder
				.moveToElement(driver.findElement(By.xpath("//*[text()= 'Rings']")))
				.build();
		Thread.sleep(5000);
		mouseOverHome.perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(By.linkText("Sapphire")).click();
		driver.findElement(By.linkText("Sapphire")).click();
		System.out.println("Title"+driver.getTitle());
		driver.findElement(By.xpath("//div[@id='narrow-by-list']/div[2]/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Blue Sapphire')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("gemcolor_desc_8790")).click();
		System.out.println("Done");

		switchToWindowByTitle(driver, "Princess Diana Inspired Blue Sapphire Ring with Diamond Halo");
		System.out.println("Current Window==="+driver.getTitle());
		Thread.sleep(9000);
		//WebElement itemName=driver.findElement(By.xpath("//span[@id='category-page-name-seo' and @itemprop='name']"));
		WebElement itemName=driver.findElement(By.xpath("//span[@itemprop='name']"));
		Thread.sleep(5000);
		WebElement itemPrice=driver.findElement(By.id("product-price-8790"));
		System.out.println(itemName.getText()+" "+itemPrice.getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()=' Carat Weight ']/following::img[4]")).click();

		Select ringSize=new Select(driver.findElement(By.xpath("//select[starts-with(@name,'variation_asterisk_option')]")));
		ringSize.selectByVisibleText("7.5");

		//driver.findElement(By.xpath("//*[@id='product-addtocart-button']")).click();
		driver.findElement(By.id("product-addtocart-button")).click();

		Thread.sleep(5000);

		String itemNameValue=driver.findElement(By.xpath("//div[@class='product-item-name']/strong")).getText();
		String itemPriceValue=driver.findElement(By.xpath("//*[text()='Subtotal']/following::td[1]")).getText();
		System.out.println("Final Product"+itemNameValue+" "+itemPriceValue);
		driver.findElement(By.id("btn-gtm-proceedtocheckout")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@placeholder='Street Address']")).sendKeys("Testa Drive");
		driver.findElement(By.xpath("//input[@placeholder='City']")).sendKeys("Justice");
		driver.findElement(By.xpath("//select[@name='country_id']")).sendKeys("United States");
		driver.findElement(By.xpath("//select[@name='region_id']")).sendKeys("Illinios");
		driver.findElement(By.xpath("//input[@placeholder='Zip code']")).sendKeys("60458");



		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("acd@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("1122334455");

		driver.findElement(By.id("shipping-step1-continue-button")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(2);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='credit-card-number']")).sendKeys("5555555555554444");
		driver.switchTo().frame(3);
		driver.findElement(By.id("expiration-month")).sendKeys("10");
		driver.switchTo().frame(4);
		driver.findElement(By.id("expiration-year")).sendKeys("2020");
		driver.switchTo().frame(5);
		driver.findElement(By.id("cvv")).sendKeys("123");
		driver.findElement(By.id("gtm-payment-continue-button")).click();
		Thread.sleep(5000);



		driver.findElement(By.xpath("//span[@id='gtm1s-place-order-button']")).click();
		//driver.findElement(By.xpath("")).click();

	}
	public static void switchToWindowByTitle(WebDriver driver,String title){

		Set<String> titles=driver.getWindowHandles();
		for (String string : titles) {
			driver.switchTo().window(string);
			if(driver.getTitle().contains(title)){
				System.out.println("title "+driver.getTitle());
				System.out.println("Switched to next window");
				break;
			}

		}
*/
	}


}
