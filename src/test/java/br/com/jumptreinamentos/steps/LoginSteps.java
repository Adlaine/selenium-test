package br.com.jumptreinamentos.steps;

import java.util.Map;

import br.com.jumptreinamentos.pageobjects.HomePage;
import br.com.jumptreinamentos.pageobjects.LoginPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.cucumber.datatable.DataTable;


public class LoginSteps {
	
	LoginPage login = new LoginPage();
	HomePage home = new HomePage();
	
	@Dado("^que o usuario esteja na pagina de login Orange HRM$")
	public void queOUsuarioEstejaNaPaginaDeLoginOrangeHRM() throws Throwable {
		login.toLogin();
	}
		
	@Quando("o usuario preerncher o painel de login")
	public void oUsuarioPreerncherOPainelDeLogin(DataTable data) {
		for(Map<Object, Object> map : data.asMaps(String.class, String.class)) {
			login.realizaLogin(map.get("username").toString(), map.get("password").toString());
		}
	}

	@Então("o usuario estará logado")
	public void oUsuarioEstaráLogado() {
	    home.validaPainelDashboard();
	}

	@Então("o usuario receberá uma mensagem de credenciais invalidas")
	public void oUsuarioReceberáUmaMensagemDeCredenciaisInvalidas() {
	    home.validaMensagem();
	}

}
