package br.com.jumptreinamentos.pageobjects;

import org.openqa.selenium.By;

import junit.framework.Assert;

public class NacionalidadePage extends BasePage {
	
	private By  menuAdmin = By.id("menu_admin_viewAdminModule");
	private By linkNacionalidade = By.id("menu_admin_nationality");
	private By btnAddNacionalidade = By.id("btnAdd");
	private By inputNacionalidade = By.id("nationality_name");
	private By btnSaveNacionalidade = By.id("btnSave");
	private By btnDelete = By.id("btnDelete");
	private By btnOKDelete = By.id("dialogDeleteBtn");

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
		String nacionalidade = getDriver().findElement(By.xpath("//table[@id='resultTable']//tbody//a[contains(text(),'" + nacionalidadeAdicionada +"')]")).getText();
		Assert.assertEquals(nacionalidadeAdicionada, nacionalidade);
	}
	
	public void excluirNacionalidade(String excluirNacionalidade) {
		getDriver().findElement(By.xpath("//table[@id='resultTable']//a[contains(text(),'"+ excluirNacionalidade + "')]/../..//input[@type='checkbox']")).click();
		getDriver().findElement(btnDelete).click();
		getDriver().findElement(btnOKDelete).click();
	}
	
	public void validaExclusaoNacionalidade(String nac) {
		Boolean verifica = getDriver().findElement(By.xpath("//table[@id='resultTable']//tbody//a[contains(text(),'" + nac +"')]")).isDisplayed();
		 Assert.assertFalse(verifica);
	}

}
