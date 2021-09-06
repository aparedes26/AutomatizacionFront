



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Page.IniciarSesion;



public class IniciarSesion_Test  {
	
	

	private WebDriver driver;
	IniciarSesion iniciarSesion;

	@BeforeEach
	public void setUp() throws Exception {
		iniciarSesion = new IniciarSesion(driver);
		driver = iniciarSesion.chromeDriverConnection();
		iniciarSesion.visit("https://www.wong.pe/");
		
	}

	@AfterEach
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		IniciarSesion login = new IniciarSesion(driver);
        login.iniciosesion();
      
	}

}
