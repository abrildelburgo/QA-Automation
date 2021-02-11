package metodo_envio;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import colecciones_pages.Utils;

public class LaNacionHOP implements MetodoEnvio {
	
	By MetodoEnvio_LaNacionHOP = By.id("s_method_LaNacionHop_LaNacionHop");
	By SucursalHOP = By.cssSelector("#shipping_form_LaNacionHop_LaNacionHop > li > span > select");

	public void seleccionarMetodoEnvio(WebDriver driver, String sucursal) {
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 Utils.click(MetodoEnvio_LaNacionHOP, driver);
		 Utils.selectByValue(SucursalHOP, sucursal, driver);
	}

}
