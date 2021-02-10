package colecciones_testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import colecciones_pages.Checkout_Cart;
import colecciones_pages.Checkout_Onepage;
import colecciones_pages.Genero;
import colecciones_pages.LaNacionHOP;
import colecciones_pages.Lookbook;
import colecciones_pages.MetodoEnvio;
import colecciones_pages.Mujer;

public class Checkout_Onepage_TC1 {

	 public static void main(String[] args) throws InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://colecciones.uat.glamit.com.ar/lookbook/17.html");
		 
		 // Creo un objeto de Lookbook
		 Lookbook lookbook = new Lookbook(driver);
		 
		 //Creo un objeto de Checkout_Cart
		 Checkout_Cart checkout_cart = new Checkout_Cart(driver);
		 
		//Creo un objeto de Checkout_Onepage
		 Checkout_Onepage checkout_onepage = new Checkout_Onepage(driver);
		 
		 lookbook.seleccionarArticulo(1);
		 lookbook.clickComprar();
		 lookbook.clickIrAlCarrito();
		 
		 checkout_cart.agregarArticulo();
		 checkout_cart.completarCompra();
		 
		 checkout_onepage.registrarCliente();
		 checkout_onepage.registrarInformacionFacturacion_DatosPersonales("Abril", "del Burgo", "pruebas1234@gmail.com", "pruebas123", "pruebas123");
		 checkout_onepage.registrarInformacionFacturacion_Direccion("Cajaravilla", "4115", "534", "3040", "1407");
		 Genero mujer = new Mujer();
		 checkout_onepage.registrarInformacionFacturacion_DatosAdicionales("46712163", "41567876", "01", "01", "2000", mujer);
		 
		 checkout_onepage.clickContinuar();
		 
		 // MetodoEnvio andreaniDomicilio = new AndreaniDomicilio();
		 // checkout_onepage.elegirMetodoEnvio(andreaniDomicilio, null);
		 
		 // MetodoEnvio andreaniSucursal = new AndreaniSucursal();
		 // checkout_onepage.elegirMetodoEnvio(andreaniSucursal, "200");
		 
		 MetodoEnvio laNacionHOP = new LaNacionHOP();
		 checkout_onepage.elegirMetodoEnvio(laNacionHOP, "317");
		 
		 checkout_onepage.continuarAConfirmacion();
		 
	 } 
}
