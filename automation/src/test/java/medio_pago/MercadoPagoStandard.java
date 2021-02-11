package medio_pago;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import colecciones_pages.Utils;

public class MercadoPagoStandard implements MedioPago {

	By MetodoPago_MercadoPagoStandard = By.xpath("/html/body/main/div/div[1]/ol/li[5]/div[3]/form/fieldset/dl/dl/div/div[1]/dt/input");
	 
	public void seleccionarMedioPago(WebDriver driver, String numeroTarjeta, String mesExpiracion, String anioExpiracion, String nombreTitular, String
			codigoSeguridad, String tipoDni, String documento, String banco, String cuotas) {
		 Utils.click(MetodoPago_MercadoPagoStandard, driver); 
	}
	
}
