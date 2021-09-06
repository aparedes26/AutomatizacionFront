package Page;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


import com.selenium.base.Base;

/**
 * Clase donde vamos a Iniciar Sesion en la web WONG
 * @author ARISTIDES
 *
 */

public class IniciarSesion extends Base {
	/**
	 * Definiremos los localizadores de la funcionalidad iniciar sesion
	 */
	
	By iniciasesionButton = By.cssSelector("span[class='user-menu__label-content']");
	
	By clickno = By.xpath("//button[@id='onesignal-slidedown-cancel-button']");
	
	By login = By.cssSelector("button[id='loginWithUserAndPasswordBtn']");
	
	By Email = By.cssSelector("input[id='inputEmail']");
	
	By Pass = By.cssSelector("input[id='inputPassword']");
	
	By buttoningresar = By.xpath("(//button[@id='classicLoginBtn'])[1]");
	
	
			
	public IniciarSesion(WebDriver driver) {
		super(driver);
	
      }

	public void iniciosesion() throws InterruptedException  {
	/**
	 * Método encargado de realizar las acciones sobre los elementos web en la funcionalidad iniciar sesion de la web WONG	
	 */
		Thread.sleep(2000);
	
		driver.findElement(clickno).click();
		
		driver.findElement(iniciasesionButton).click();
		
					
		if(driver.findElement(login).isDisplayed()){
			
			driver.findElement(login).click();
			
			Thread.sleep(2000);
			
			driver.findElement(Email).sendKeys("aspar17_14@hotmail.com");
			
			driver.findElement(Pass).sendKeys("Des//0467");
			
			driver.findElement(buttoningresar).click();	
			
			Thread.sleep(2000);
		}
		else {
			
			System.out.print("De usuario y/o contraseña incorrecta");
		}
		
		
	}
			
			
	
	
	
}

