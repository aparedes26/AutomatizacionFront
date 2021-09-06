package com.selenium.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base {
	
	protected WebDriver driver;
	

	public Base(WebDriver driver) {
		this.driver = driver;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        /*System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.wong.pe/");*/
		
		
	}

	public WebDriver chromeDriverConnection() {
	System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
	
	/*ChromeOptions options = new ChromeOptions();*/
	
	 driver = new ChromeDriver();
	
	//driver.get("https://www.wong.pe/");
	
	
	return driver;
	}
	
	
	
	public void type(WebElement element, String text) {
		element.sendKeys(text);
		}

		public void type(By locator, String text) {
		find(locator).sendKeys(text);
		}


		public void maximize() {
		driver.manage().window().maximize();
		}


		public void visit(String url) {
		driver.get(url);
		}

				
		public void closeAll() {
		driver.quit();
		}

		public WebElement find(By locator) {
		return driver.findElement(locator);
		}


		public WebElement find(By locator, Integer timeout) {
		WebElement element = new WebDriverWait(driver, timeout)
		.until(ExpectedConditions.presenceOfElementLocated(locator));
		return element;
		}


		public List<WebElement> findElements(By locator) {
		return driver.findElements(locator);
		}


		public void click(By locator) {
		find(locator).click();
		}


		public void click(WebElement element) {
		element.click();
		}


		public void click(By locator, Integer timeout) {
		waitUntilClickable(locator, timeout);
		find(locator).click();
		}


		public void click(WebElement element, Integer timeout) {
		waitUntilClickable(element, timeout);
		element.click();
		}


		public void clickThroughJavaScript(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
		}


		public String getText(WebElement element) {
		return element.getText();
		}


		public String getText(By locator) {
		return find(locator).getText();
		}

		public String getTitle() {
		return driver.getTitle();
		}

		/* Wait methods */


		public WebElement waitUntilPresent(By locator, int timeout) {
		return new WebDriverWait(driver, timeout).until(ExpectedConditions.presenceOfElementLocated(locator));
		}



		public WebElement waitUntilPresent(WebElement element, int timeout) {
		return new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		}



		public WebElement waitUntilClickable(By locator, int timeout) {
		return new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(locator));
		}



		public WebElement waitUntilClickable(WebElement element, int timeout) {
		return new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		}



		public WebDriverWait waitForAlert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.alertIsPresent());
		return wait;
		}



		public void submit(WebElement element) {
		element.submit();
		}



		public void submit(By locator) {
		find(locator).submit();
		}


		}

	

