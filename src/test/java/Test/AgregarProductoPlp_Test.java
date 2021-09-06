package Test;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


import Page.ProductosPlp;

class AgregarProductoPlp_Test {

	private WebDriver driver;
	ProductosPlp agregarplp;
	
	@BeforeEach
	public void setUp() throws Exception {
			agregarplp = new ProductosPlp(driver);
			driver = agregarplp.chromeDriverConnection();
			agregarplp.visit("https://www.wong.pe/");
			
		}
	

	@AfterEach
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
        ProductosPlp ingresarPlp = new ProductosPlp(driver);
        ingresarPlp.AgregarProductoPlp();
        
      
	}

}
