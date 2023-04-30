package org.login;

import org.openqa.selenium.WebElement;

public class Demo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		getDriver("chrome");
		launchurl("https://www.brandalley.co.uk/");
		Thread.sleep(3000);
		WebElement locator = locator("xpath", "(//span[text()='Men'])[1]");
		actions("mouseOver", locator);
		Thread.sleep(3000);
		WebElement locator2 = locator("xpath", "//a[text()=' Activewear']");
		locator2.click();
		//actions("mouseOver", locator2).click();	
	}	
}
