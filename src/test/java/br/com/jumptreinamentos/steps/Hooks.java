package br.com.jumptreinamentos.steps;

import br.com.jumptreinamentos.util.DriverFactory;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void beforeScenario(Scenario scenario) {
		System.out.println("Iniciando a execução do teste: " + scenario.getName());
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		System.out.println("Finalizando a execução do teste: " + scenario.getName());
		DriverFactory.quitDriver();
	}

}
