package colecciones_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LaNacionHOP implements MetodoEnvio {
	
	By MetodoEnvio_LaNacionHOP = By.id("s_method_LaNacionHop_LaNacionHop");
	By SucursalHOP = By.cssSelector("#shipping_form_LaNacionHop_LaNacionHop > li > span > select");

	public void seleccionarMetodoEnvio(WebDriver driver, String sucursal) {
		 Utils.click(MetodoEnvio_LaNacionHOP, driver);
		 Select se4 = new Select(driver.findElement(SucursalHOP));
		 se4.selectByValue(sucursal); 
	}

}
