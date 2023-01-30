package com.qaschool.tipsautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertas {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fernando.zalasar\\eclipse-workspace\\AccesoriosSeleniumJava\\SeleniumLibrary\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		navegador.get("http://winstoncastillo.com/ejercicios/atoc.html");
		navegador.findElement(By.cssSelector("#testCasesAtoC > p:nth-child(2) > button")).click();
		String mensaje = navegador.switchTo().alert().getText().toString();
		System.out.println(mensaje);
		navegador.switchTo().alert().accept();
		navegador.close();
	}
}
