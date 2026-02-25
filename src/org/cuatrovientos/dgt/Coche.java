package org.cuatrovientos.dgt;

public class Coche extends Vehiculo{
	
	private  int numAsientos;
	private  boolean airbags;
		
	public Coche(String matricula, String marca, int numAsientos, boolean airbags) {
		super(matricula, marca);
		this.numAsientos = numAsientos;
		this.airbags = airbags;
	}

	public void setNumAsientos(int num) {
		this.numAsientos = num;
	}

	@Override
	public String toString() {
		return "Coche [numAsientos=" + numAsientos + ", airbags=" + airbags + ", toString()=" + super.toString() + "]";
	}


	
}
