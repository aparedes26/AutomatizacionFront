package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Page.Checkout;
import Page.IniciarSesion;
import Page.ProductoMiniCart;

class Checkout_Test {

	
	private WebDriver driver;
	Checkout checkoutcom;
	
	@BeforeEach
	public void setUp() throws Exception {
		checkoutcom = new Checkout(driver);
		driver = checkoutcom.chromeDriverConnection();
		checkoutcom.visit("https://www.wong.pe/");
	}

	@AfterEach
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		IniciarSesion login = new IniciarSesion(driver);
        login.iniciosesion();
		ProductoMiniCart addminicart = new ProductoMiniCart(driver);
		addminicart.AgregarProductoMiniCart();
		Checkout checkcompra = new Checkout(driver);
		checkcompra.checkout();
		
	}

}
