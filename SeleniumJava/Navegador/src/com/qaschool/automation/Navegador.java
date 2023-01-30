package com.qaschool.automation;

import java.util.Calendar;
import java.util.Date;

public class Navegador {
	private String fabricante;
	private Date fechaFabricacion; 
	private String autor;
	private boolean obsoleto;
	
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Date getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(Date fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isObsoleto() {
		return obsoleto;
	}

	public void setObsoleto(boolean obsoleto) {
		this.obsoleto = obsoleto;
	}

	Navegador () {
		fabricante = "Desconocido";
		fechaFabricacion = new Date(Calendar.getInstance().getTimeInMillis());
		autor = "Desconocido";
		obsoleto = false;
	}
	
	public String compatibleSistema (String sistema) {
		String mensaje = "";
		if ((sistema.equals("windows"))||(sistema.equals("mac"))) {
			mensaje = "Es compatible";
		} else {
			mensaje = "No Compatible";
		}
		return mensaje;
	}

}