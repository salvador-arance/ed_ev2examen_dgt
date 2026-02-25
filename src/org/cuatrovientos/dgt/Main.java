package org.cuatrovientos.dgt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// variables 
		Scanner reader = new Scanner(System.in);
		String matricula;
		Vehiculo v;
		String option = "";
		
		DGT dgt = new DGT();
		
		do {
			System.out.println("[o===o] Bienvenido al gestor de DGT [o===o]");
			System.out.println("Seleciona una opción:\n");
			System.out.println("1. Añade un vehiculo");
			System.out.println("2. Borra un vehiculo");
			System.out.println("3. Muestra los vehiculos");
			System.out.println("4. Da de alta un propietario");
			System.out.println("5. Exit");
			option = reader.nextLine();
			
			switch (option) {
				case "1":
				{
					System.out.println("Introduce matrícula");
					matricula = reader.nextLine();
					System.out.println("Introduce modelo");
					String marca = reader.nextLine();
					reader = new Scanner(System.in);
					System.out.println("Tipo de vehiculo \n\t Introduce C para coche, M para moto");
					boolean esCoche = reader.nextLine().equals("C") ? true : false;

					if(esCoche) {
						System.out.println("Introduce número de asientos");
						int numAsientos = reader.nextInt();
						reader = new Scanner(System.in);
						System.out.println("¿Tiene airbags?[Y/N]");
						boolean airbags = reader.nextLine().equals("Y") ? true : false;				
						v = new Coche(matricula, marca, numAsientos, airbags);
					} else {
						System.out.println("Introduce CV potencia");
						int cvPotencia = reader.nextInt();
						v = new Moto(matricula, marca, cvPotencia);
					}						
					dgt.registroVehiculos.add(v);		
					
					System.out.println("Vehiculo registrado");
				}
					break;
				case "2":
				{
					System.out.println("Introduce matrícula:");
					matricula = reader.nextLine();
					boolean encontrado = false;
					v =  dgt.buscarVehiculo(matricula);
					if(v != null) {
						dgt.registroVehiculos.remove(v);
					}
					System.out.println("Vehiculo eliminado");	
				}
					break;					
				case "3":
					dgt.listarVehiculos();
					break;
				case "4":
					System.out.println("Introduce DNI");
					String dni = reader.nextLine();
					System.out.println("Introduce nombre");
					String nombre = reader.nextLine();
					System.out.println("Introduce apellido");
					String apellido = reader.nextLine();
					System.out.println("Introduce matricula");
					matricula = reader.nextLine();
					Propietario p = new Propietario(dni, nombre, apellido);
					boolean vAsignado = false;
					for (Vehiculo v1 : dgt.registroVehiculos) {
						if(v1.getMatricula().equals(matricula)) {
							v1.asignarPropietario(p);
							vAsignado = true;
						}
					}
					if(!vAsignado) 
					{
						System.out.println("No hay vehiculo registrado con esa matrícula");
					}
					
					break;
				case "5": // Salir
					break;
				default:
					System.out.println("opción incorrecta");
					break;
			}
			} while (!option.equals("5"));
		
	}

}
