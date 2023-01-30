package com.qaschool.automation;

public class Inicio {

	public static void main(String[] args) {
		Manzana manzanaUno = new Manzana();
		Manzana manzanaDos = new Manzana();
		
		manzanaDos.setFresca(false);
		
		System.out.println(manzanaUno.aptaParaConsumo());
		System.out.println(manzanaDos.aptaParaConsumo());
		
		Navegador navegadorWeb = new Navegador();
		
		navegadorWeb.setObsoleto(true);
		navegadorWeb.setAutor("Google");
		
		System.out.println(navegadorWeb.compatibleSistema("windows"));
		System.out.println(navegadorWeb.getAutor());
		System.out.println(navegadorWeb.isObsoleto());
	}
}