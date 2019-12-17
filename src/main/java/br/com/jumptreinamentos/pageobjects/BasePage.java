package br.com.jumptreinamentos.pageobjects;

import org.openqa.selenium.WebDriver;

import br.com.jumptreinamentos.util.Navegacao;

public abstract class BasePage {
	
	public static WebDriver driver = Navegacao.getChromeDriver();
	
	public static WebDriver getDriver() {
		return driver;
	}
	

}
