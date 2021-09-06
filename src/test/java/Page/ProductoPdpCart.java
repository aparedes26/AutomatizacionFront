package Page;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.base.Base;
/**
 * Clase donde vamos a agregar prouctos al PDP
 * @author ARISTIDES
 *
 */
public class ProductoPdpCart extends Base{
	
	By ingresarproducto = By.cssSelector("input[id='search-autocomplete-input']");
	
	By pdp = By.xpath("(//a[@class='product-item__name'])[1]");
	
	By agregarcart = By.xpath("(//button[@class='product-add-to-cart product-add-to-cart--product-view btn red add-to-cart'])[2]");
	
	By confirm = By.xpath("(//span[@itemprop='name'])[3]");
	
	By ingresardireccion = By.xpath("//button[@class='type-selector__button button-delivery']//span[text()='Envío a Domicilio']");
	
	By selecciondireccion = By.xpath("(//div[@class='address__radio'])[2]");
	
	By tienda = By.xpath("//div[@aria-activedescendant='react-select-3--option--0']");
	
	By buttonenviar = By.cssSelector("button[class='address-selector__submit shipping-preference__submit']");
	
	By addcart = By.xpath("(//a[@class=\"btn primary minicart__action minicart__action--buy\"]/span[text()='Ver carrito'])[3]");
	
	By cartconfirm = By.xpath("//*[@id=\"cart-page\"]/div[8]/div/div[1]/h1");
	
	
	
	
	public ProductoPdpCart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	public void AgregarProductoPdp() throws InterruptedException {
		/**
		 * Método encargado de realizar las acciones sobre los elementos web en la funcionalidad agregar productos a la PDP de la web WONG	
		 */
		driver.findElement(ingresarproducto).sendKeys("Arroz");
		Thread.sleep(2000);
		driver.findElement(pdp).click();
		
		assertEquals("Arroz", driver.findElement(By.xpath("(//span[@itemprop='name'])[3]")).getText());
		
		driver.findElement(agregarcart).click();
		Thread.sleep(2000);
		driver.findElement(ingresardireccion).click();
		
		driver.findElement(selecciondireccion).click();
		Thread.sleep(2000);
		
		
		driver.findElement(buttonenviar).click();
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		 
	}



	private FluentWait<WebDriver> WebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
