package colecciones_pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	 public void seleccionarArticulo (ArrayList<Integer> listaProductos) {
		 for (Integer producto : listaProductos) {
			 driver.findElements(Articulo_Seleccionado).get(producto).click();
		 }		 
	 }
	 
	 public void clickComprar () {
	 	 Utils.click(Boton_Comprar, driver);
	 }
	 
	 public void clickIrAlCarrito () {
		Utils.wait(Boton_IrAlCarrito, 30, driver);
		Utils.click(Boton_IrAlCarrito, driver);
	 }
 
}
