package com.senati.ejercicio1;

public class AppPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n Dni \t Nombre Apellido Sexo Edad");
		System.out.println("\n --------------------------------");
		
		Persona p = new Persona ("25782211","Jorge","Luque",'M',44);
		Persona p1 = new Persona ("25782211","Freddy","Morgan",'M',22);
		Persona p2 = new Persona(p);
		Persona p3 = new Persona();
		
		System.out.println(" " + p.toString());
		System.out.println(" " + p1.toString());
		System.out.println(" " + p2.toString());
		System.out.println(" " + p3.toString());

		
	}

}
