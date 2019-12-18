package br.com.jumptreinamentos.pageobjects;

import org.openqa.selenium.By;

import junit.framework.Assert;

public class HomePage extends BasePage {

	private By painelDashboard = By.xpath("//h1[contains(text(),'Dashboard')]");
	private By mensagemCredencialInvalida = By.id("spanMessage");

	public void validaPainelDashboard() {
		String resposta = getDriver().findElement(painelDashboard).getText();
		Assert.assertEquals("Dashboard", resposta);
	}

	public void validaMensagem() {
		String mensagem = getDriver().findElement(mensagemCredencialInvalida).getText();
		Assert.assertEquals("Invalid credentials", mensagem);

	}

}
