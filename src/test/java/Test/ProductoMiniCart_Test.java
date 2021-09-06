package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Page.IniciarSesion;
import Page.ProductoMiniCart;

class ProductoMiniCart_Test {
	
	private WebDriver driver;
	ProductoMiniCart addminicart;

	@BeforeEach
	void setUp() throws Exception {
		
			addminicart = new ProductoMiniCart(driver);
			driver = addminicart.chromeDriverConnection();
			addminicart.visit("https://www.wong.pe/");
	}

	@AfterEach
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException{
		IniciarSesion login = new IniciarSesion(driver);
        login.iniciosesion();
		ProductoMiniCart addminicart = new ProductoMiniCart(driver);
		addminicart.AgregarProductoMiniCart();
	}

}
