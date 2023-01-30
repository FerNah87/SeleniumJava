package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CasosCarrito extends Base {
	
	@BeforeSuite
	public void abrirNavegador() {
		navegador.get("http://automationpractice.com/index.php");
	}
	
	@Test
	public void elegirArticulosAzarCarritoCompras() {
		//11.79
		Assert.assertEquals(navegador.getTitle(), "My Store");
		WebElement contenedorDeProductos = navegador.findElement(By.id("homefeatured"));
		listaDeProductos = contenedorDeProductos.findElements(By.tagName("li"));
		//System.out.println(listaDeProductos.size());
		
		//10.80 Seleccionar 3 productos
		if (listaDeProductos.size()<4) {
			cantidadLista = listaDeProductos.size();
		} else {
			cantidadLista = 3;
		}
		//Agregar numero al Azar
		for (int i = 0; i<cantidadLista; i++) {
			numeroAlAzar = (int) (Math.random() * listaDeProductos.size() +1);
			if (productosAlAzar.contains(numeroAlAzar)) {
				i--;
			}else {
				productosAlAzar.add(numeroAlAzar);
			}
		}	
		productosAlAzar.forEach(System.out::println);
	}
	
	@AfterSuite
	public void cerrarNavegador() {
		navegador.close();
	}
}