package org.cuatrovientos.dgt;

import java.util.ArrayList;
import java.util.Iterator;

public class DGT {
	
	ArrayList<Vehiculo> registroVehiculos;
	ArrayList<Propietario> registroPropietarios;
	
	public DGT() {
		registroVehiculos = new ArrayList<Vehiculo>();
		registroPropietarios = new ArrayList<Propietario>();
	}
	
	public void listarVehiculos() {
		for (Vehiculo v : registroVehiculos) {
			System.out.println(v.toString());
		}
	}
	
	public Vehiculo buscarVehiculo(String matricula) {
		for (Vehiculo v : registroVehiculos) {
			if(v.getMatricula().equals(matricula))
			{
				return v;
			}
		}
		return null;
	}
	
	public void altaPropietario(String dni, String nombre, String apellidos) {
		registroPropietarios.add(new Propietario(dni, nombre, apellidos));
	}
}
