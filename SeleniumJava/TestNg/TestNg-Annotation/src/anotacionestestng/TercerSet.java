package anotacionestestng;

import org.testng.annotations.Test;

public class TercerSet {
	@Test
	public void tercerSetPruebaUno() {
		System.out.println("Primera Prueba Tercer Set");
	}
	@Test(groups = {"smoke"})
	public void tercerSetPruebaDos() {
		System.out.println("Segunda Prueba Tercer Set y smoke");
	}
	@Test(groups = {"funcional", "smoke"})
	public void tercerSetPruebaTres() {
		System.out.println("Tercera Prueba Tercer Set y funcional y smoke");
	}
	@Test
	public void tercerSetPruebaCuatro() {
		System.out.println("Cuarta Prueba Tercer Set");
	}
}
