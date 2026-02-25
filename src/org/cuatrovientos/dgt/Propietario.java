package org.cuatrovientos.dgt;

public class Propietario {
	
	private String dni;
	private String nombre;
	private String apellidos;
	
	public Propietario(String dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	public String getDni() {
		return this.dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Propietario [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

}
