import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;



public class Teste {
	
	
		@Test
		public void preencherFormulario() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver","./src\\main\\resources\\drives\\chromedriver.exe");
		driver.navigate().to("https://jumptreinamentos.com.br");
		driver.manage().window().maximize();
		// acessar menu contatos
		driver.findElement(By.xpath("//span[contains(text(),'CONTATO')]")).click();
		//preencher o formulario
		driver.findElement(By.xpath("//input[@placeholder='Seu nome']")).sendKeys("Teofilo");
		driver.findElement(By.xpath("//input[@placeholder='Seu e-mail']")).sendKeys("teste@test.com.br");
		driver.findElement(By.xpath("//input[@placeholder='Assunto']")).sendKeys("Ola tudo bem?");
		driver.findElement(By.xpath("//textarea[@placeholder='Mensagem']")).sendKeys("Deu certo!!!!!!!!!!!!!!!!!!!!!");
	
		//enviar
		driver.findElement(By.xpath("//input[@class='wpcf7-form-control wpcf7-submit']")).click();
		Thread.sleep(6000);		
		// validar mensagem 
		String msn = driver.findElement(By.xpath("//div[@role='form']//form//div[@role='alert']")).getText();
		
		Assert.assertEquals("Mensagem enviada com sucesso!", msn);
		
		driver.quit();
		
		
		
		
	}

}
