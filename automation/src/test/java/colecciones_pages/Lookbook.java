package colecciones_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lookbook {

	 WebDriver driver;
	 
	 // Constructor that will be automatically called as soon as the object of the class is created
	 public Lookbook (WebDriver driver) {
		 this.driver = driver;
	 }
	 
	 
	 // Locators
	 By Articulo_Seleccionado = By.className("checkmark");
	 By Boton_Comprar = By.id("addAllItemsToCart");
	 By Boton_IrAlCarrito = By.xpath("/html/body/div[1]/section[2]/div/a[2]");
	 
	 
	 // Methods
	 public void seleccionarArticulo (int index) {
		 driver.findElements(Articulo_Seleccionado).get(index).click();
		 // TO DO: VER TEMA LISTA DE PRODUCTOS
	 }
	 
	 public void clickComprar () {
	 	 driver.findElement(Boton_Comprar).click();
	 }
	 
	 public void clickIrAlCarrito () {
		// ES CORRECTO PONER EL WAIT ACA? COMO DEBERÍA SER SINO? 
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Boton_IrAlCarrito));
		wait.until(ExpectedConditions.elementToBeClickable(Boton_IrAlCarrito));
			
		driver.findElement(Boton_IrAlCarrito).click();
	 }
 
}
