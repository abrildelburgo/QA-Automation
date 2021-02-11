package colecciones_pages;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import genero.Genero;
import genero.Mujer;
import medio_pago.MedioPago;
import medio_pago.MercadoPagoStandard;
import metodo_envio.LaNacionHOP;
import metodo_envio.MetodoEnvio;

public class Checkout_Onepage_TC1 {

	 public static void main(String[] args) throws InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://colecciones.uat.glamit.com.ar/lookbook/17.html");
		 
		 Lookbook lookbook = new Lookbook(driver);
		 Checkout_Cart checkout_cart = new Checkout_Cart(driver);
		 Checkout_Onepage checkout_onepage = new Checkout_Onepage(driver);
		 
		 int[] indicesProductos = {1,2,5};
		 ArrayList<Integer> listaProductos = Utils.crearListaInteger(indicesProductos);
	     
		 lookbook.seleccionarArticulo(listaProductos);
		 lookbook.clickComprar();
		 lookbook.clickIrAlCarrito();
		 
		 checkout_cart.agregarArticulo();
		 checkout_cart.completarCompra();
		 
		 checkout_onepage.registrarCliente();
		 checkout_onepage.registrarInformacionFacturacion_DatosPersonales("Abril", "del Burgo", "pruebasQA123@gmail.com", "pruebas123", "pruebas123");
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
		 
		 MedioPago mercadoPagoStandard = new MercadoPagoStandard();
		 checkout_onepage.elegirMedioPago(mercadoPagoStandard);	 
		 
		 checkout_onepage.pasarARevision();
		 checkout_onepage.confirmacionFinal();
	 } 
}
