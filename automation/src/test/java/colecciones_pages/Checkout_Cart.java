package colecciones_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout_Cart {

	 WebDriver driver;
	 
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public Checkout_Cart (WebDriver driver) {
	      this.driver = driver;
	 }
	 
	 
	 // Locators
	 By Boton_AgregarArticulo = By.id("aceptar");
	 By Boton_CompletarCompra = By.cssSelector("#carrito > div.datos-compra > div.totals > ul > li > button");
	 
	 
	 // Methods
	 public void agregarArticulo () {
		 Utils.click(Boton_AgregarArticulo, driver);
	 }
	 
	 public void completarCompra () {
		 Utils.click(Boton_CompletarCompra, driver);
	 }
	 
}
