package medio_pago;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import colecciones_pages.Utils;

public class MercadoPagoAllIn implements MedioPago {

	By MetodoPago_MercadoPagoAllIn = By.xpath("/html/body/main/div/div[1]/ol/li[5]/div[3]/form/fieldset/dl/dl/div/div[2]/dt/input");
	By NumeroTarjeta = By.id("cardNumber"); 
	By MesExpiracion = By.id("cardExpirationMonth");
	By AnioExpiracion = By.id("cardExpirationYear");
	By NombreTitular = By.id("cardholderName");
	By CodigoSeguridad = By.id("securityCode");
	By TipoDni = By.id("docType");
	By Documento = By.id("docNumber");
	By Bancos = By.id("issuer");
	By Cuotas = By.id("installments");
	
	public void seleccionarMedioPago(WebDriver driver, String numeroTarjeta, String mesExpiracion, String anioExpiracion, String nombreTitular, String codigoSeguridad, String tipoDni, String documento, String banco, String cuotas) {
		 Utils.click(MetodoPago_MercadoPagoAllIn, driver); 
		 Utils.sendKeys(NumeroTarjeta, numeroTarjeta, driver);
		 Utils.selectByValue(MesExpiracion, mesExpiracion, driver); 
		 Utils.selectByValue(AnioExpiracion, anioExpiracion, driver); 
		 Utils.sendKeys(NombreTitular, nombreTitular, driver);
		 Utils.sendKeys(CodigoSeguridad, codigoSeguridad, driver);
		 Utils.selectByValue(TipoDni, tipoDni, driver); 
		 Utils.sendKeys(Documento, documento, driver);
		 Utils.selectByValue(Bancos, banco, driver); 
		 Utils.selectByValue(Cuotas, cuotas, driver); 
	}
	
}
