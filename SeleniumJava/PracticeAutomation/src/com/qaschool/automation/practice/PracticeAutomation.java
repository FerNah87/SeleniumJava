package com.qaschool.automation.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeAutomation {

	public static void main(String[] args) {
		
		// Clase para identificar elementos
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\fernando.zalasar\\eclipse-workspace\\SeleniumFiles\\chromedriver.exe");
						
		WebDriver driver = new ChromeDriver();
		// object of Actions class to scroll up and down
		Actions at = new Actions(driver);
		at.sendKeys(Keys.PAGE_UP).build().perform();
		at.sendKeys(Keys.PAGE_DOWN).build().perform();
			    
		driver.get("https://demo.seleniumeasy.com/");
		driver.manage().window().maximize();
		String titulo = driver.getTitle();
		System.out.println(titulo);
		//el logo
		driver.findElement(By.className("logo"));
		driver.findElement(By.id("site-name"));
		//dropdown
		driver.findElement(By.className("dropdown")).click();
		//ingreso al formulario
		driver.findElement(By.linkText("Simple Form Demo")).click();
		//formulario email
		driver.findElement(By.id("user-message")).sendKeys("coso de siempre");
		at.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.className("btn-default")).click();
		//Suma
		driver.findElement(By.id("sum1")).sendKeys("5");
		driver.findElement(By.id("sum2")).sendKeys("8");
		driver.findElement(By.linkText("Get Total")).click();
		
		driver.close();
	}
}