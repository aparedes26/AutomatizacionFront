package Page;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.base.Base;
/**
 * Clase donde vamos a agregar prouctos al MiniCart
 * @author ARISTIDES
 *
 */

public class ProductoMiniCart extends Base {
	
	
	By clickno = By.xpath("//button[@id='onesignal-slidedown-cancel-button']");
	
	By ingresarproducto = By.cssSelector("input[id='search-autocomplete-input']");
	
	By agregarmincart = By.xpath("(//button[@class='product-item__add-to-cart product-add-to-cart btn red add-to-cart '])[1]");
	
	By minicart = By.xpath("(//span[@class='wicon--xxs wicon--blanco wicon-down'])[3]");
	
	By addcart = By.xpath("(//a[@class=\"btn primary minicart__action minicart__action--buy\"]//span[text()='Ver carrito'])[1]");
	
    By ingresardireccion = By.xpath("//button[@class='type-selector__button button-delivery']//span[text()='Envío a Domicilio']");
    	
	By selecciondireccion = By.xpath("(//div[@class='address__radio'])[2]");
	
	By buttonenviar = By.cssSelector("button[class='address-selector__submit shipping-preference__submit']");
	
	
	public ProductoMiniCart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void AgregarProductoMiniCart() throws InterruptedException {
		/**
		 * Método encargado de realizar las acciones sobre los elementos web en la funcionalidad MiniCart de la web WONG	
		 */
			
		driver.findElement(ingresarproducto).sendKeys("Arroz");
		
		Thread.sleep(2000);
		driver.findElement(agregarmincart).click();
		
		Thread.sleep(2000);
		driver.findElement(ingresardireccion).click();
		
		driver.findElement(selecciondireccion).click();
		
		Thread.sleep(2000);
		driver.findElement(buttonenviar).click();
		
		Thread.sleep(8000);
		driver.findElement(minicart).click();
		
		By xpath = By.xpath("(//a[@href='/cart'])[2]");
		WebElement element = driver.findElement(xpath);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();" , element);
		Thread.sleep(2000);
		
		assertEquals("Mi Carrito", driver.findElement(By.cssSelector("div[class='title pull-left']")).getText());
		Thread.sleep(2000);
		
		
	}

}
