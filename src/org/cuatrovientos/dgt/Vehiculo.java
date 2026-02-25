package org.cuatrovientos.dgt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Vehiculo {
	
	//region PROPIEDADES
	private String matricula;
	private String marca;
	private float km;
	private Date fechaFabricacion;
	private Propietario propietario;
	//endregion
	
	public Vehiculo(String matricula, String marca) {
		this.matricula = matricula;
		this.marca = marca;
		this.km = 0;
		this.fechaFabricacion = new Date();			
	}

	//region MÉTODOS
	public String getMatricula() {
		return matricula;
	}
	public String getMarca() {
		return marca;
	}
	public int calcularEdad() throws ParseException {
		// Transformar a valor numérico
		int intFechaFabricacion = (int) (fechaFabricacion.getTime()/1000);
		int intFechaActual = (int) (new Date().getTime()/1000);
		// Calculo de diferencia de fecha
		int intDiffFecha = intFechaActual - intFechaFabricacion;
		// Transformar a fecha
		SimpleDateFormat originalFormat = new SimpleDateFormat("yyyyMMdd");
		Date date = originalFormat.parse(Integer.toString(intDiffFecha));
		// Date to compare to Gregorian calendar
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int year = cal.get(Calendar.YEAR);
		
		return year;
	}
	public void asignarPropietario(Propietario propietario) {
		this.propietario = propietario;
	}	
	//endregion

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", km=" + km + ", fechaFabricacion="
				+ fechaFabricacion + ", propietario=" + propietario + "]";
	}
	
}

