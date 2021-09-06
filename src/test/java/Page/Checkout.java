package Page;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.base.Base;
/**
 * Clase donde vamos a llegar hasta el checkout en la web WONG
 * @author ARISTIDES
 *
 */
public class Checkout extends Base {
	
	By checkcart = By.xpath("//span[@class='terms-text']");
	
	By finalizarcompra = By.cssSelector("button[id='bolsas-on-48h']");
	
	By diaentrega = By.xpath("(//div[@class='picker__day picker__day--infocus'])[14]");
	
	By metododepago = By.xpath("//p[@class='submit btn-submit-wrapper btn-go-to-payment-wrapper']//button[@class='submit btn btn-large btn-success btn-go-to-payment']");
	
	By añadirbolsa = By.cssSelector("span[class='icono-mas']");
	
	By agregarbolsa = By.cssSelector("button[class='bolsa-plastica-element-button-2']");
	

	public Checkout(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void checkout() throws InterruptedException {
		/**
		 * Método encargado de realizar las acciones sobre los elementos web en la funcionalidad checkout de la web WONG	
		 */
		Thread.sleep(2000);
		driver.findElement(checkcart).click();
		
		Thread.sleep(8000);
		driver.findElement(finalizarcompra).click();
		
		Thread.sleep(4000);
		By xpath = By.xpath("//a[@href='/checkout/#/orderform']");
		WebElement element = driver.findElement(xpath);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();" , element);
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		assertEquals("Dirección de envío", driver.findElement(By.cssSelector("span[data-i18n='shipping.title']")).getText());
		Thread.sleep(2000);
		
		
		
	}

}
