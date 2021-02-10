package colecciones_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AndreaniDomicilio implements MetodoEnvio {
	
	By MetodoEnvio_AndreaniDomicilio = By.id("s_method_andreaniestandar_andreaniestandar");

	public void seleccionarMetodoEnvio(WebDriver driver, String sucursal) {
		 Utils.click(MetodoEnvio_AndreaniDomicilio, driver); 
	}
	
}

