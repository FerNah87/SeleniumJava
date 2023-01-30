package com.qaschool.automation.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InicioChrome {

	public static void main(String[] args) {
		//Inicializa e instancia el navegador Chrome
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fernando.zalasar\\eclipse-workspace\\SeleniumFiles\\chromedriver.exe");
		//carga la pagina en el navegador
		driver.get("https://www.google.com/");
		//maximiza la ventana
		driver.manage().window().maximize();
		driver.close();
	}

}
