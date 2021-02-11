package medio_pago;

import org.openqa.selenium.WebDriver;

public interface MedioPago {

	public void seleccionarMedioPago (WebDriver driver, String numeroTarjeta, String mesExpiracion, String anioExpiracion, String nombreTitular, String codigoSeguridad, String tipoDni, String documento, String banco, String cuotas);
	
}
