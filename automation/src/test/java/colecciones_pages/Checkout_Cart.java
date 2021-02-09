package colecciones_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		 driver.findElement(Boton_AgregarArticulo).click();
	 }
	 
	 public void completarCompra () {
		 driver.findElement(Boton_CompletarCompra).click();
	 }
	 
}
