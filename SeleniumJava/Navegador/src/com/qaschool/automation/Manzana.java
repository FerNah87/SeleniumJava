package com.qaschool.automation;

public class Manzana {
	private int tamano;
	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFresca() {
		return fresca;
	}

	public void setFresca(boolean fresca) {
		this.fresca = fresca;
	}

	private String color;
	private boolean fresca;
	
	Manzana () {
		tamano = 0;
		color = "rojo";
		fresca = true;
	}
	
	public String aptaParaConsumo () {
		boolean buenEstado = this.fresca;
		if (buenEstado) {
		return "Es apta para consumo";
		} else {
		return "No es apta para consumo";
		}
	}
}
