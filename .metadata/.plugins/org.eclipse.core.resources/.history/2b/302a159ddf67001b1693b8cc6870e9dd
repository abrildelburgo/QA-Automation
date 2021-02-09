package clase4;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestClase4 {
	private WebDriver driver;
	Levis_Page levis;

	@Before
	public void setUp() throws Exception {
		levis=new Levis_Page(driver);
		driver = levis.chromeDriverConnection();
		levis.Visit("https://www.levi.com.ar/e-shop/hombres/categorias.html");		
	}
	

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test () throws Exception {
		levis.click_on_category();
		System.out.println("Test completed");
	}

}