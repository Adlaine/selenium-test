package br.com.jumptreinamentos.pageobjects;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

	private By inputUsername = By.id("txtUsername");
	private By inputPassword = By.id("txtPassword");
	private By btnLogin = By.id("btnLogin");
	
	public void toLogin() {
		getDriver().navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	public void realizaLogin(String usuario, String senha) {
		getDriver().findElement(inputUsername).sendKeys(usuario);
		getDriver().findElement(inputPassword).sendKeys(senha);
		getDriver().findElement(btnLogin).click();
	}
	


}
