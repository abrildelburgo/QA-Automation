package colecciones_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

	public static void sendKeys (By locator, String key, WebDriver driver ) {
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(key);	
	}
	
	public static void click (By locator, WebDriver driver ) {
		driver.findElement(locator).click();
	}
	
	public static void wait (By locator, long timeOutInSeconds, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
}
