package com.qaschool.automation.endtoend;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AddMoreItems {

	public static void main(String[] args) throws InterruptedException {
		//Agregar Items
		WebDriver navegador = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fernando.zalasar\\eclipse-workspace\\SeleniumFiles\\chromedriver.exe");
		navegador.get("https://winstoncastillo.com/robot-selenium/");
		navegador.manage().window().maximize();
		
		//Agregar + items
		List<WebElement> objetoComparar = navegador.findElements(By.cssSelector("#common-home > div.alert.alert-success.alert-dismissible"));
		Assert.assertTrue(objetoComparar.isEmpty());
		navegador.findElement(By.cssSelector("#content > div.row > div:nth-child(1) > div > div.button-group > button:nth-child(2)")).click();
		Thread.sleep(2000);
		// VER TIRA ERROR String textoLogueoHome = navegador.findElement(By.cssSelector("#common-home > div.alert.alert-success.alert-dismissible")).getText();
		List<String> nombresProducto = new ArrayList<String>();
		for (int i= 1; i<4; i++) {
		navegador.findElement(By.cssSelector("#content > div.row > div:nth-child("+i+") > div > div.button-group > button:nth-child(1) > span")).click();
		nombresProducto.add(navegador.findElement(By.cssSelector("#content > div.row > div:nth-child("+i+") > div > div.caption > h4 > a")).getText());
		Thread.sleep(3000);
		}
		System.out.println(nombresProducto);
		String textoCompletoCarrito = navegador.findElement(By.cssSelector("#cart-total")).getText();
		String [] precios = textoCompletoCarrito.split("- ", 2);
		System.out.println(precios[1]);
		navegador.findElement(By.cssSelector("#cart-total")).click();		
		Thread.sleep(3000);
		navegador.findElement(By.cssSelector("#cart > ul > li:nth-child(2) > div > p > a:nth-child(1) > strong")).click();
		Thread.sleep(3000);
		String verificacion = "";
		for (int i=1; i<=nombresProducto.size(); i++) {
			if (nombresProducto.contains(navegador.findElement(By.cssSelector("#content > form > div > table > tbody > tr:nth-child("+i+") > td:nth-child(2) > a")).getText())) {
				if (verificacion != "No Encontrado") {
				verificacion = "Encontrado";
				}
			} else {
				verificacion = "No Encontrado";				
			}
		}
		Assert.assertEquals(verificacion, "Encontrado");
		String precioTotalCarrito = navegador.findElement(By.cssSelector("#content > div.row > div > table > tbody > tr:nth-child(4) > td:nth-child(2)")).getText();
		Assert.assertEquals(precios[1].replaceAll("\\s+", ""), precioTotalCarrito.replaceAll("\\s+", ""));
		navegador.close();		
	}
}