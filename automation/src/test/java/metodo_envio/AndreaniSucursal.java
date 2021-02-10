package metodo_envio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import colecciones_pages.Utils;

public class AndreaniSucursal implements MetodoEnvio {
	
	By MetodoEnvio_AndreaniSucursal = By.id("s_method_andreanisucursal_andreanisucursal");
	By SucursalAndreani = By.cssSelector("#shipping_form_andreanisucursal_andreanisucursal > li > span > select");
	 

	public void seleccionarMetodoEnvio(WebDriver driver, String sucursal) {
		 Utils.click(MetodoEnvio_AndreaniSucursal, driver); 
		 Select se4 = new Select(driver.findElement(SucursalAndreani));
		 se4.selectByValue(sucursal); 
	}
	
}
