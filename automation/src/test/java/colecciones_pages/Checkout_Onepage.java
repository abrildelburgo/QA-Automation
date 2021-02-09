package colecciones_pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
	 By MetodoEnvio_LaNacionHOP = By.id("s_method_LaNacionHop_LaNacionHop");
	 By MetodoEnvio_AndreaniDomicilio = By.id("s_method_andreaniestandar_andreaniestandar");
	 By MetodoEnvio_AndreaniSucursal = By.id("s_method_andreanisucursal_andreanisucursal");
	 By SucursalHOP = By.cssSelector("#shipping_form_LaNacionHop_LaNacionHop > li > span > select");
	 By SucursalAndreani = By.cssSelector("#shipping_form_andreanisucursal_andreanisucursal > li > span > select");
	 By Boton_ContinuarAConfirmacion = By.cssSelector("#shipping-method-buttons-container > button");
	 
	
	 // Methods
	 public void registrarCliente () {
		 driver.findElement(Boton_Registrarse).click();
	 }
	 
	 public void registrarInformacionFacturacion (String nombre, String apellido, String email, String contrasenia, String confirmacionContrasenia,
			 									  String calle, String altura, String provincia, String barrio, String codigoPostal, String telefono, String dni, String dia, String mes,
			 									  String anio, String genero) {
		 	
		 	driver.findElement(Nombre).sendKeys(nombre);
		 	driver.findElement(Apellido).sendKeys(apellido);
		 	driver.findElement(Email).sendKeys(email);
		 	driver.findElement(Contrasenia).sendKeys(contrasenia);
		 	driver.findElement(ConfirmacionContrasenia).sendKeys(confirmacionContrasenia);
		 	driver.findElement(Calle).sendKeys(calle);
		 	driver.findElement(Altura).sendKeys(altura);
		 		
			Select se = new Select(driver.findElement(Provincia));
			se.selectByValue(provincia);
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select select2 = new Select(driver.findElement(Barrio));
			select2.selectByValue(barrio);
			
			driver.findElement(CodigoPostal).sendKeys(codigoPostal);
		 	driver.findElement(Telefono).sendKeys(telefono);
		 	driver.findElement(Dni).sendKeys(dni);
		 	driver.findElement(DiaNacimiento).sendKeys(dia);	
		 	driver.findElement(MesNacimiento).sendKeys(mes);
		 	driver.findElement(AnioNacimiento).sendKeys(anio);		
			
			Select se3 = new Select(driver.findElement(Genero));
			se3.selectByValue(genero);
	 }
	 
	 public void clickContinuar () {
		 driver.findElement(Boton_Continuar).click();
	 }
	 
	 public void elegirMetodoEnvio (String metodoEnvio, String valueSucursal) {		 
		 if (metodoEnvio == "LaNacionHOP") {
			 driver.findElement(MetodoEnvio_LaNacionHOP).click();
			 Select se4 = new Select(driver.findElement(SucursalHOP));
			 se4.selectByValue(valueSucursal); 
		 } else {
			 if (metodoEnvio == "AndreaniDomicilio") {
				 driver.findElement(MetodoEnvio_AndreaniDomicilio).click();
			 } else {
				 if (metodoEnvio == "AndreaniSucursal") {
					 driver.findElement(MetodoEnvio_AndreaniDomicilio).click();
					 Select se4 = new Select(driver.findElement(SucursalAndreani));
					 se4.selectByValue(valueSucursal); 
				 } else {
					 // throws Exception ??
				 }
			 } 
		 }		
	 }
	 
	 public void continuarAConfirmacion () {
		 driver.findElement(Boton_ContinuarAConfirmacion).click();
	 }
	 
}
