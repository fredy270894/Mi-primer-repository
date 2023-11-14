package com.example.Datos.dto;

public class DtosDto {

	private String nombre;
	private String apellido;
	private String sexo;
	private String comunidad;
	private DireccionDto direccion;
	
	
	
	public DireccionDto getDiereccion() {
		return direccion;
	}
	public void setDireccion(DireccionDto direccion) {
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getComunidad() {
		return comunidad;
	}
	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}
	
	
}
