package colecciones_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utils {

	public static void sendKeys (By locator, String key, WebDriver driver ) {
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(key);	
	}
	
	public static void click (By locator, WebDriver driver ) {
		driver.findElement(locator).click();
	}
}
