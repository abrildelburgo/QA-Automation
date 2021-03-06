package colecciones_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import genero.Genero;
import medio_pago.MedioPago;
import metodo_envio.MetodoEnvio;

public class Checkout_Onepage {

	WebDriver driver;
	 
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public Checkout_Onepage (WebDriver driver) {
	      this.driver = driver;
	 }
	 
	 
	 // Locators
	 By Boton_Registrarse = By.cssSelector("#checkout-step-login > div > div.col-1 > div > button");
	 By Nombre = By.name("billing[firstname]");
	 By Apellido = By.name("billing[lastname]");
	 By Email = By.name("billing[email]");
	 By Contrasenia = By.name("billing[customer_password]");
	 By ConfirmacionContrasenia = By.name("billing[confirm_password]");
	 By Calle = By.name("dire");
	 By Altura = By.name("altura");
	 By Provincia = By.name("billing[region_id]");
	 By Barrio = By.name("billing[city_id]");
	 By CodigoPostal = By.name("billing[postcode]");
	 By Telefono = By.name("billing[telephone]");
	 By Dni = By.name("billing[vat_id]");
	 By DiaNacimiento = By.name("billing[day]");
	 By MesNacimiento = By.name("billing[month]");
	 By AnioNacimiento = By.name("billing[year]");
	 By Genero = By.name("billing[gender]");
	 By Boton_Continuar = By.cssSelector("#billing-buttons-container > button");
	 By Boton_ContinuarAConfirmacion = By.cssSelector("#shipping-method-buttons-container > button");
	 By Boton_PasarARevision = By.cssSelector("#payment-buttons-container > button");
	 By Boton_ConfirmacionFinal = By.cssSelector("#review-buttons-container > button");
	 
	
	 // Methods
	 public void registrarCliente () {
		Utils.click(Boton_Registrarse, driver);
	 }
	 
	 public void registrarInformacionFacturacion_DatosPersonales (String nombre, String apellido, String email, String contrasenia, String confirmacionContrasenia) {
		 	Utils.sendKeys(Nombre, nombre, driver);	
		 	Utils.sendKeys(Apellido, apellido, driver);	
		 	Utils.sendKeys(Email, email, driver);
		 	Utils.sendKeys(Contrasenia, contrasenia, driver);
		 	Utils.sendKeys(ConfirmacionContrasenia, confirmacionContrasenia, driver);
	 }
	 
	 public void registrarInformacionFacturacion_Direccion (String calle, String altura, String provincia, String barrio, String codigoPostal) {
		 	Utils.sendKeys(Calle, calle, driver);
		 	Utils.sendKeys(Altura, altura, driver);
			Utils.selectByValue(Provincia, provincia, driver);
			// Utils.wait(Barrio, 30, driver);
			Utils.selectByValue(Barrio, barrio, driver);
			Utils.sendKeys(CodigoPostal, codigoPostal, driver);	
	 }
		 	
	 public void registrarInformacionFacturacion_DatosAdicionales (String telefono, String dni, String dia, String mes, String anio, Genero genero) {
			Utils.sendKeys(Telefono, telefono, driver);
			Utils.sendKeys(Dni, dni, driver);
			Utils.sendKeys(DiaNacimiento, dia, driver);
			Utils.sendKeys(MesNacimiento, mes, driver);
			Utils.sendKeys(AnioNacimiento, anio, driver);	
			Utils.selectByValue(Genero, genero.value(), driver);
	 }	
				 
	 public void clickContinuar () {
		 Utils.click(Boton_Continuar, driver);
	 }
	 
	 public void elegirMetodoEnvio (MetodoEnvio metodoEnvio, String valueSucursal) {		 
		 metodoEnvio.seleccionarMetodoEnvio(driver, valueSucursal);
	 }
	 
	 public void continuarAConfirmacion () {
		 Utils.click(Boton_ContinuarAConfirmacion, driver);
	 }
	 
	 public void elegirMedioPago (MedioPago medioPago, String numeroTarjeta, String mesExpiracion, String anioExpiracion, String nombreTitular, String codigoSeguridad, String tipoDni, String documento, String banco, String cuotas) {
		 medioPago.seleccionarMedioPago(driver, numeroTarjeta, mesExpiracion, anioExpiracion, nombreTitular, codigoSeguridad, tipoDni, documento, banco, cuotas);
	 }
	 
	 public void pasarARevision () {
		 Utils.click(Boton_PasarARevision, driver);
	 }
	 
	 public void confirmacionFinal() {
		 Utils.click(Boton_ConfirmacionFinal, driver);
	 }
	 
}
