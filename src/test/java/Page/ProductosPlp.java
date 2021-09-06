package Page;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import com.selenium.base.Base;
/**
 * Clase donde vamos a agregar prouctos al PLP
 * @author ARISTIDES
 *
 */
public class ProductosPlp extends Base {
	
	By ingresarproducto = By.cssSelector("input[id='search-autocomplete-input']");
	
	By clickplp = By.xpath("(//span[contains(text(),'Ver todos los resultados')])[1]");
	
	By clickno = By.xpath("//button[@id='onesignal-slidedown-cancel-button']");
	
	By category = By.cssSelector("span[class='category-name']");
	
	
	
	
	
	public ProductosPlp(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	public void AgregarProductoPlp() throws InterruptedException  {
		/**
		 * Método encargado de realizar las acciones sobre los elementos web en la funcionalidad agregar productos a la PLP de la web WONG	
		 */
		Thread.sleep(2000);
		
		driver.findElement(clickno).click();
		
		driver.findElement(ingresarproducto).sendKeys("Samsung");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(clickplp).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		assertEquals("Samsung", driver.findElement(By.cssSelector("span[class='category-name']")).getText());
		
		
				
	}
	
	
}
