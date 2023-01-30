package com.qaschool.automation.firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InicioFireFox {

	public static void main(String[] args) {
		//Inicializa e instancia el navegador Firefox
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\fernando.zalasar\\eclipse-workspace\\SeleniumFiles\\geckodriver-v0.32.0.exe");
		//carga la pagina en el navegador
		driver.get("https://www.google.com/");
		//maximiza la ventana
		driver.manage().window().maximize();
		driver.close();
	}

}