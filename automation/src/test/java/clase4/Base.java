package clase4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	private WebDriver driver;
	public Base (WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement findElement (By locator){
		return driver.findElement(locator);
	}
	
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public String getText (WebElement Element) {
		return Element.getText();
	}
	
	public void click (By locator) {
		driver.findElement(locator).click();	
	}
	
	public void Visit (String url) {
		driver.get(url);
	}
	
	//Input Text Action Method
	public void type(String inputText, By locator) {
		  driver.findElement(locator).sendKeys(inputText);
	}
	//Is Diplayed Method
	
	public Boolean isDisplayed(By locator) {
		try {
			  return driver.findElement(locator).isDisplayed();
		} 
		catch (org.openqa.selenium.NoSuchElementException e) {
			  return false;
		}
	}
	
}