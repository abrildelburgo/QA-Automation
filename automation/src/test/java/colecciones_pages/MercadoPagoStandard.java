package colecciones_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MercadoPagoStandard implements MedioPago {

	By MetodoPago_MercadoPagoStandard = By.xpath("/html/body/main/div/div[1]/ol/li[5]/div[3]/form/fieldset/dl/dl/div/div[1]/dt/input");
	 
	public void seleccionarMedioPago(WebDriver driver) {
		 Utils.click(MetodoPago_MercadoPagoStandard, driver); 
	}
	
}
