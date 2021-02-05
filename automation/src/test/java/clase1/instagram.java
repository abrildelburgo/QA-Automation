package clase1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


public class instagram {
	private WebDriver driver;
	@Before
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window();
		driver.get("https://www.instagram.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement searchbox;
		searchbox = driver.findElement(By.name("username"));
		searchbox.clear();
		searchbox.sendKeys("abrildelburgo");
		searchbox = driver.findElement(By.name("password"));
		searchbox.clear();
		searchbox.sendKeys("contraseña");
		searchbox.submit();		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String newWindow = "window.open(\"https://www.instagram.com/bonjovi\",'_blank');";  // replace link with your desired link
		((JavascriptExecutor)driver).executeScript(newWindow);
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1)); //switches to new tab
	}
	
	@Test
	public void bonjoviSeguidores () {

		WebElement searchbox;
		searchbox = driver.findElements(By.className("g47SY")).get(1);
		assertEquals("1,4mm", searchbox.getText());
	}
}

