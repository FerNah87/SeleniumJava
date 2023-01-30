package com.qaschool.tipsautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.AssertJUnit;

public class Lista_Aleatoria {

	public static void main(String[] args) throws InterruptedException {
		//Elimina notificaciones y extensiones
		/*ChromeOptions notificaciones = new ChromeOptions();
		notificaciones.addArguments("--disable-notifications");
		notificaciones.addArguments("--disable-extensions");
		WebDriver navegar = new ChromeDriver(notificaciones);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fernando.zalasar\\eclipse-workspace\\AccesoriosSeleniumJava\\SeleniumLibrary\\chromedriver.exe");
		navegar.get("http://reddit.com");
		navegar.findElement(By.id("header-search-bar")).click();*/
		
		//Opciones de la lista
		ChromeOptions notificaciones = new ChromeOptions();
		notificaciones.addArguments("--disable-notifications");
		notificaciones.addArguments("--disable-extensions");
		WebDriver navegar = new ChromeDriver(notificaciones);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fernando.zalasar\\eclipse-workspace\\AccesoriosSeleniumJava\\SeleniumLibrary\\chromedriver.exe");
		navegar.get("https://www.amazon.com/");
		navegar.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		Thread.sleep(2000);
		List<WebElement> opciones = navegar.findElements(By.id("nav-flyout-searchAjax"));
		for (WebElement opcion: opciones) {
			System.out.println(opcion.getText());
			if (opcion.getText().contains("laptop stand for desk")) {
				opcion.click();
				break;
			}
			AssertJUnit.assertEquals(navegar.getTitle(), "Amazon.com");
		}
	}
}