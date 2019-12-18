package br.com.jumptreinamentos.pageobjects;

import org.openqa.selenium.By;

public class NacionalidadePage extends BasePage {
	
	private By  menuAdmin = By.id("menu_admin_viewAdminModule");
	private By linkNacionalidade = By.id("menu_admin_nationality");
	private By btnAddNacionalidade = By.id("btnAdd");
	private By inputNacionalidade = By.id("nationality_name");
	private By btnSaveNacionalidade = By.id("btnSave");
	private String nacionalidade = "";
	private By tableNacionalidade = By.xpath("//table[@id='resultTable']//tbody//a[contains(text(),':TEXTO:')]");
	
	public void toLogin() {
		getDriver().navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	public void adicionaNacionalidade(String nacionalidade) {
		getDriver().findElement(menuAdmin).click();
		getDriver().findElement(linkNacionalidade).click();
		getDriver().findElement(btnAddNacionalidade).click();
		getDriver().findElement(inputNacionalidade).sendKeys(nacionalidade);
		getDriver().findElement(btnSaveNacionalidade).click();
	}
	
	public void validadaInclusaoNacionalidade(String nacionalidadeAdicionada) {
		//getDriver().findElement(tableNacionalidade.toString().replace(":TEXTO:", "nacionalidadeAdicionada"));
		
	}

}
