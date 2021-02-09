package pruebas;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class compra {
	private WebDriver driver;
	
	@Before
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://colecciones.uat.glamit.com.ar/lookbook/17.html");
		
	}
	
	@Test
	public void checkout () {
		
		// elijo un producto y lo agrego al carrito
		driver.findElements(By.className("checkmark")).get(1).click();
		driver.findElement(By.id("addAllItemsToCart")).click();
		
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section[2]/div/a[2]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section[2]/div/a[2]")));
		
		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/a[2]")).click();
		
		// acepta un producto agregado
		driver.findElement(By.id("aceptar")).click();
		
		// completar compra 
		driver.findElement(By.cssSelector("#carrito > div.datos-compra > div.totals > ul > li > button")).click();

		// es nuevo cliente, por lo tanto, se registra
		driver.findElement(By.cssSelector("#checkout-step-login > div > div.col-1 > div > button")).click();
		
		
		//INFORMACION FACTURACION
		WebElement searchbox;
		searchbox = driver.findElement(By.name("billing[firstname]"));
		searchbox.clear();
		searchbox.sendKeys("Abril");
		
		searchbox = driver.findElement(By.name("billing[lastname]"));
		searchbox.clear();
		searchbox.sendKeys("del Burgo");
		
		searchbox = driver.findElement(By.name("billing[email]"));
		searchbox.clear();
		searchbox.sendKeys("pruebas12345@gmail.com");
		
		searchbox = driver.findElement(By.name("billing[customer_password]"));
		searchbox.clear();
		searchbox.sendKeys("pruebaQA");
		
		searchbox = driver.findElement(By.name("billing[confirm_password]"));
		searchbox.clear();
		searchbox.sendKeys("pruebaQA");
		
		searchbox = driver.findElement(By.name("dire"));
		searchbox.clear();
		searchbox.sendKeys("Cajaravilla");
		
		searchbox = driver.findElement(By.name("altura"));
		searchbox.clear();
		searchbox.sendKeys("4115");
	
		Select se = new Select(driver.findElement(By.name("billing[region_id]")));
		se.selectByValue("534");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select select2 = new Select(driver.findElement(By.name("billing[city_id]")));
		select2.selectByValue("3040");
				
		searchbox = driver.findElement(By.name("billing[postcode]"));
		searchbox.clear();
		searchbox.sendKeys("1407");

		searchbox = driver.findElement(By.name("billing[telephone]"));
		searchbox.clear();
		searchbox.sendKeys("46712163");
		
		searchbox = driver.findElement(By.name("billing[vat_id]"));
		searchbox.clear();
		searchbox.sendKeys("41586983");
		
		searchbox = driver.findElement(By.name("billing[day]"));
		searchbox.clear();
		searchbox.sendKeys("09");
		
		searchbox = driver.findElement(By.name("billing[month]"));
		searchbox.clear();
		searchbox.sendKeys("10");
		
		searchbox = driver.findElement(By.name("billing[year]"));
		searchbox.clear();
		searchbox.sendKeys("1998");
		
		Select se3 = new Select(driver.findElement(By.name("billing[gender]")));
		se3.selectByValue("2");
		
		driver.findElement(By.cssSelector("#billing-buttons-container > button")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// elijo un metodo de envio
		driver.findElement(By.id("s_method_LaNacionHop_LaNacionHop")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Select se4 = new Select(driver.findElement(By.cssSelector("#shipping_form_LaNacionHop_LaNacionHop > li > span > select")));
		se4.selectByValue("317");
		
		// continuar al siguiente paso
		driver.findElement(By.cssSelector("#shipping-method-buttons-container > button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// elijo metodo de pago
		driver.findElement(By.xpath("/html/body/main/div/div[1]/ol/li[5]/div[3]/form/fieldset/dl/dl/div/div[1]/dt/input")).click();
		
		// continuar al siguiente paso
		driver.findElement(By.cssSelector("#payment-buttons-container > button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// finalizo la compra
		driver.findElement(By.cssSelector("#review-buttons-container > button")).click();
	}
}