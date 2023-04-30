package org.login;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.PublicKey;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {
	public static  WebDriver Driver ;
	public static WebElement findElement;
	
	public static void getDriver (String Browser) {
		if(Browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		Driver.manage().window().maximize();}
		else {
			if(Browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			Driver = new EdgeDriver();
			Driver.manage().window().maximize();
		}}
	}
	public static void launchurl(String url) {
		Driver.get(url);
	}
	public static WebElement locator(String locatorValue,String value) {
		if(locatorValue.equals("id")) {
			 findElement = Driver.findElement(By.id(value));
		return findElement;
	}else {
		if(locatorValue.equals("name")) {
			findElement = Driver.findElement(By.name(value));
			return findElement;
		}
		else {
			if(locatorValue.equals("className")) {
				findElement = Driver.findElement(By.className(value));
					return findElement;
				}else {
					if(locatorValue.equals("xpath")) {
						 findElement = Driver.findElement(By.xpath(value));
						 return findElement;
					}
					else{
						if(locatorValue.equals("tagName")) {
							Driver.findElement(By.tagName(value));
							return findElement;
							}}}
						}
					}
		return findElement;
					}
				public static  WebElement actions(String methods,WebElement locator) {
					Actions ac = new Actions(Driver);
					if(methods.equals("mouseOver")) {
					 	ac.moveToElement(findElement).perform();
				return findElement;
				}else
				{ if(methods.equals("rightClick")) {
					ac.contextClick().perform();;
				return findElement;
				}
				else { 
					if(methods.equals("doubleClick")) {
					ac.doubleClick().perform();
					return findElement;
					}else
					{
				return findElement;
			}}}}
public static  WebElement dragDrop(String drag,String drop) {
	Actions ac = new Actions(Driver);
	WebElement findElement2 = Driver.findElement(By.xpath(drag));
	WebElement findElement3 = Driver.findElement(By.xpath(drop));
	ac.dragAndDrop(findElement2, findElement3).perform();
	return findElement;
}
public static  WebElement javaScript(String methods , WebElement locator) {
	

	JavascriptExecutor js = (JavascriptExecutor) Driver;
	if(methods.equals("scrollUp")) {
	js.executeScript("arguments[0].scrollIntoView(true)", locator);
	}
	else {
		if(methods.equals("scrollDown")) {
			js.executeScript("arguments[0].scrollIntoView(false)", locator);
		}else {
			if(methods.equals("jsClick")) {
				js.executeScript("arguments[0].click()", locator);
			}else {
				return findElement;
				}
			}
		}
	return findElement;
	}
public static WebElement setAttribute(String text ,String locators) {
	JavascriptExecutor js = (JavascriptExecutor) Driver;
		js.executeScript("arguments[0].setAttribute('value',"+text+")", locators);
	return findElement;
}
public static void screenShot(String filepath) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) Driver;
	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	System.out.println(screenshotAs);
	File file = new File(filepath);
	FileUtils.copyFile(screenshotAs, file);
}
public static WebElement select(String type , WebElement string ,String selectBy) {
	Select s = new Select(string);
	if(type.equals("value")) {
		
		List<WebElement> options = s.getOptions();
		for(int i=0;i<options.size();i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			if(text.equals(selectBy))
			{
				s.selectByValue(text);
				webElement.click();
			}
			return findElement;
		}
	}else {
		if(type.equals("visibleText")) {
			List<WebElement> options = s.getOptions();
			for(int i=0;i<options.size();i++) {
				WebElement webElement = options.get(i);
				String text = webElement.getText();
				if(text.equals(selectBy))
				{
					s.selectByVisibleText(text);
					webElement.click();
				}
			
		}
	}}
	return findElement;
	
	
	
}
public static WebElement Selectbyindex(WebElement locator,int index) {
	Select s = new Select(locator);
	s.selectByIndex(index);
	return findElement;
}
public static WebElement getAttribute(WebElement findElement ,String text,String loType,String locators,String attributeType) {
	//findElement = Driver.findElement(By.xpath(locator));
	WebElement locator = locator(loType, locators);
	locator.sendKeys(text);
	String attribute = locator.getAttribute(attributeType);
	System.out.println(attribute);
	return findElement;
}
public static WebElement getText(WebElement findElement ,String type,String value) {
	WebElement locator = locator(type, value);
	String text = locator.getText();
	System.out.println(text);
	return findElement;
}
public static WebElement getTitle(WebElement findElement,String locatorType,String locator) {
	WebElement locator2 = locator(locatorType, locator);
	String tagName = locator2.getTagName();
	System.out.println(tagName);
	return findElement;
}
public WebElement getTagname(WebElement findElement, String locatorType ,String locator) {
	WebElement locator2 = locator(locatorType, locator);
	String tagName = locator2.getTagName();
	System.out.println(tagName);
	return findElement;
}
public void alerts(String locatorType,String locator,String alert,WebElement findElement) {
	Alert al =Driver.switchTo().alert();
	WebElement locator2 = locator(locatorType, locator);
	if(alert.equals("simple")) {
		al.accept();
	}else {
		if(alert.equals("confirm")) {
		al.dismiss();
		}else {
			if(alert.equals("prompt")) {
				al.sendKeys(null);
				al.accept();
			}
		}
	}
}
public static void waits() {
	Driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
}
public static void GetWindowsHandle() {

String windowHandle = Driver.getWindowHandle();
Set<String> windowHandles = Driver.getWindowHandles();
for(String win : windowHandles) {
	if(!win.equals(windowHandle)) {
		Driver.switchTo().window(win);
	}
}}
public static void WebTableToXl(String fileLocation,String getorSetSheet,String locator) throws IOException {
	WebElement findElement2 = Driver.findElement(By.xpath(locator));
	List<WebElement> rows = findElement2.findElements(By.tagName("tr"));
//
//File file = new File(fileLocation);
//FileInputStream fis = new FileInputStream(file);
//Workbook w = new XSSFWorkbook();
//Sheet createSheet = w.createSheet(getorSetSheet);
//for(int i=0;i<rows.size();i++) {
//WebElement row = rows.get(i);
//Row createRow = createSheet.createRow(i);
//List<WebElement> datas = row.findElements(By.tagName("td"));
//for(int j=0;j<datas.size();j++) {
//	WebElement webElement = datas.get(j);
//	String text = webElement.getText();
//	Cell createCell = createRow.createCell(j);
//	createCell.setCellValue(text);
//}
//FileOutputStream out = new FileOutputStream(file);
//w.write(out);
//}

}
}

				


				

				
				
				
				
				
				
				
				
				
				
				
				
			
	
		
	
	
