package anotacionestestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnotacionesBasicas {
	@BeforeClass
	public void codigoAntesClase() {
		System.out.println("Este codigo se ejecuta antes de la clase");
	}
	@AfterClass
	public void codigoDespuesClase() {
		System.out.println("Este codigo se ejecuta despues de la clase");
	}
	
	@BeforeSuite
	public void codigoAntesSuite() {
		System.out.println("Este codigo se ejecuta antes de toda la suite");
	}
	@AfterSuite
	public void codigoDespuesSuite() {
		System.out.println("Este codigo se ejecuta despues de toda la suite");
	}
	
	@BeforeMethod
	public void codigoAntesMetodo() {
		//Este codigo se ejecuta antes de cada metodo (metodo = prueba)
		System.out.println("Este codigo se ejecuta antes de cada test");
	}
	@AfterMethod
	public void codigoDespuesMetodo() {
		//Este codigo se ejecuta despues de cada metodo (metodo = prueba)
		System.out.println("Este codigo se ejecuta despues de cada test");
	}
	
	@BeforeTest
	public void codigoAntesSetTest() {
		//Este codigo se ejecuta antes en cada SET de pruebas segun el archivo
		System.out.println("Este codigo se ejecuta antes de todos los archivo incluido en el set de pruebas del XML");
	}
	@AfterTest
	public void codigoDespuesSetTest() {
		//Este codigo se ejecuta despues en cada SET de pruebas segun el archivo
		System.out.println("Este codigo se ejecuta despues de todos los archivo incluido en el set de pruebas del XML");
	}

	//para no ejecutar la prueba
	//PARA AGRUPAR Group
	@Test(groups = {"funcional"})
	public void pruebaUno() {
		System.out.println("Esta es la prueba uno y funcional");
	}
	//parametrizacion (cambia el orden) DependOnMethods = no se puede ejecutar hasta que el otro lop haga
	@Test(dependsOnMethods = {"pruebaUno"})
	public void pruebaDos() {
		System.out.println("Esta es la prueba dos");
	}
	
	//con INCLUDE se incluye al metodos (testng XML)
	//con EXCLUDE se excluye al metodos (testng XML)
}
