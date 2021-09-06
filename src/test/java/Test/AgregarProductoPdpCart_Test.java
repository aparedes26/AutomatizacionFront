package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Page.IniciarSesion;
import Page.ProductoPdpCart;

class AgregarProductoPdpCart_Test {
	
	private WebDriver driver;
	ProductoPdpCart addproduct;

	@BeforeEach
	public void setUp() throws Exception {
		
			addproduct = new ProductoPdpCart(driver);
			driver = addproduct.chromeDriverConnection();
			addproduct.visit("https://www.wong.pe/");
	}

	@AfterEach
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		IniciarSesion login = new IniciarSesion(driver);
        login.iniciosesion();
        
        ProductoPdpCart add = new ProductoPdpCart(driver);
        add.AgregarProductoPdp();
	}

}
