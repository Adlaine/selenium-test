package br.com.jumptreinamentos.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import br.com.jumptreinamentos.util.DriverFactory;

public abstract class BasePage {
	
	
	public static WebDriver getDriver() {
		return DriverFactory.getChromeDriver();
	}
	
	/**Metodo para esperar um elemento.
	 * @param by
	 * @return
	 */
	public WebElement getElementAndWait(By by) {
		return DriverFactory.getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(by));
		
	}
	

}
