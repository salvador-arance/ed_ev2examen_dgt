package org.cuatrovientos.dgt;

public class Moto extends Vehiculo {
	private int cvPotencia;
	
	public Moto(String matricula, String marca, int cvPotencia) {
		super(matricula, marca);
		this.cvPotencia = cvPotencia;
	}

	public int getCvPotencia() {
		return cvPotencia;
	}

	public void setCvPotencia(int cvPotencia) {
		this.cvPotencia = cvPotencia;
	}

	@Override
	public String toString() {
		return "Moto [cvPotencia=" + cvPotencia + ", toString()=" + super.toString() + "]";
	}

	
	
}
