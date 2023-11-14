package com.example.Datos.dto;

public class DireccionDto {
	
	private String calle;
	private int numero;
	private String estado;
	private String colonia;
	private Pasatiempos Hobbies;
	
	
	public Pasatiempos getHobbies() {
		return Hobbies;
	}
	public void setHobbies(Pasatiempos hobbies) {
		Hobbies = hobbies;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	
	

}
