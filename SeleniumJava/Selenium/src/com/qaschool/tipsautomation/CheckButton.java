package com.qaschool.tipsautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fernando.zalasar\\eclipse-workspace\\AccesoriosSeleniumJava\\SeleniumLibrary\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		navegador.get("https://winstoncastillo.com/robot-selenium/index.php?route=account/register");
		navegador.findElement(By.cssSelector("#content > form > fieldset:nth-child(3) > div > div > label:nth-child(1) > input[type=radio]")).click();
		Assert.assertFalse(navegador.findElement(By.cssSelector("#content > form > fieldset:nth-child(3) > div > div > label:nth-child(2) > input[type=radio]")).isSelected());
		Assert.assertFalse(navegador.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)")).isSelected());
		navegador.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)")).click();
		Assert.assertTrue(navegador.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)")).isSelected());
		navegador.close();
	}

}
