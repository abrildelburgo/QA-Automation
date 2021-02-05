package clase1;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class probando {

	private WebDriver driver;
	@Before
	public void setup () {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	@Test
	public void buscadorGoogle () {
		WebElement searchbox;
		searchbox = driver.findElement(By.name("q"));
		searchbox.clear();
		searchbox.sendKeys("martin gilardoni");
		searchbox.submit();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		assertEquals("martin gilardoni - Buscar con Google", driver.getTitle());
	}
}

