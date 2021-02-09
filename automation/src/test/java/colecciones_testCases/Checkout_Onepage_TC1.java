package colecciones_testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import colecciones_pages.Checkout_Cart;
import colecciones_pages.Checkout_Onepage;
import colecciones_pages.Lookbook;

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
		 checkout_onepage.registrarInformacionFacturacion("Abril", "del Burgo", "pruebas1234@gmail.com", "pruebas123", "pruebas123", "Cajaravilla", "4115", "534", "3040", "1407", "46712163", "41567876", "01", "01", "2000", "2");
		 checkout_onepage.clickContinuar();
		 //checkout_onepage.elegirMetodoEnvio("AndreaniDomicilio", "3177");
		 //checkout_onepage.elegirMetodoEnvio("AndreaniSucursal", "317");
		 checkout_onepage.elegirMetodoEnvio("LaNacionHOP", "317");
		 checkout_onepage.continuarAConfirmacion();
		 
		 
	 } 
}
