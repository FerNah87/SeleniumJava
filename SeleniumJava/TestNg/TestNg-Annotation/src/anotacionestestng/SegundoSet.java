package anotacionestestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SegundoSet {
	@Test
	public void pruebaTres() {
		System.out.println("Prueba Tres del segundo Set");
	}
	//parametrizacion (cambia el orden) DependOnMethods = no se puede ejecutar hasta que el otro lop haga
	@Test(dependsOnMethods = {"pruebaTres"})
	public void pruebaCuatro() {
		System.out.println("Prueba Cuatro del segundo Set");
	}
	//para que no se haga la prueba (enable)
	@Test(enabled = true)
	public void pruebaCinco() {
		System.out.println("Prueba Cinco del segundo Set");
	}
	@Test
	public void clickAlHomePage() {
		System.out.println("Click al home");
	}
	@Test(groups = {"funcional"}, dataProvider = "getData")
	public void clickAlCarrito(String producto, String precio) {
		System.out.println("Click al carrito y funcional con el producto: " + producto + ", Precio: " + precio);
	}
	//Pasa los parametros
	//interpreta los datos del usuario / pass
	@Parameters({"userName", "password"})
	@Test
	public void clickAlUsuario(String methodUserName, String methodPassword) {
		System.out.println("Click al usuario: " + methodUserName + ", con el password " + methodPassword);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] productos = new Object[3][2];
		
		//Primer Articulo
		productos[0][0] = "Camisa";
		productos[0][1] = "$10,00";
		
		//Segundo Articulo
		productos[1][0] = "Pantalon";
		productos[1][1] = "$12,00";

		//Tercer Articulo
		productos[2][0] = "Falda";
		productos[2][1] = "$14,00";

		return productos;
	}
}
