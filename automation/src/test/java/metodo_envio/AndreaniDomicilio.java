package metodo_envio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import colecciones_pages.Utils;

public class AndreaniDomicilio implements MetodoEnvio {
	
	By MetodoEnvio_AndreaniDomicilio = By.id("s_method_andreaniestandar_andreaniestandar");

	public void seleccionarMetodoEnvio(WebDriver driver, String sucursal) {
		 Utils.click(MetodoEnvio_AndreaniDomicilio, driver); 
	}
	
}

