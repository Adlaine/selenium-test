package br.com.jumptreinamentos.util;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

	public static WebDriver driver = null;
	private static WebDriverWait wait = null;
	private final static int TIME_ELEMENT = 30;

	public static WebDriver getChromeDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver","./src\\main\\resources\\drives\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(TIME_ELEMENT, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(TIME_ELEMENT, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	public static WebDriverWait getWebDriverWait() {
		wait = new WebDriverWait(getChromeDriver(), TIME_ELEMENT);
		return wait;
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
