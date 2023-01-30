package testEndToEnd;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//Implicit Wait – se utiliza para establecer el tiempo de espera predeterminado en todo el programa.
//Explicit Wait – se utiliza para establecer el tiempo de espera para solo una instancia en particular.

public class Waits {
	WebDriver navegador = new ChromeDriver();
	
	@Test
	public void implicitWait() {
		//implicityWait old version (del video y txt ↓)
		//navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//implicityWait (new version ↓)
		navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		
		//WebDriverWait espera = new WebDriverWait(navegador, 10);
				
		navegador.get("http://automationpractice.com/index.php");
		navegador.manage().window().maximize();
		Actions mouseActions = new Actions(navegador);
		WebElement elementoProducto = navegador.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img"));
		mouseActions.moveToElement(elementoProducto).perform();
		navegador.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]")).click();
		
		//WebElement ventanaProducto = espera.until(ExpectedConditions.visibilityOf(navegador.findElement(By.xpath("//*[@id=\\\"layer_cart\\\"]/div[1]/div[1]"))));
				
		System.out.println("Texto Header" + navegador.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")).getText());
		navegador.close();
	}
}