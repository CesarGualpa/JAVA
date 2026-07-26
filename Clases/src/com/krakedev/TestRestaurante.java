package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		
		Restaurante rest1;
		rest1 = new Restaurante();
		
		Restaurante rest2;
		rest2 = new Restaurante();
		
		System.out.println("===== VALORES POR DEFECTO =====");
		
		System.out.println("Restaurante 1:");
		System.out.println("Nombre: " + rest1.nombre);
		System.out.println("Direccion: " + rest1.direccion);
		System.out.println("Calificacion: " + rest1.calificacion);
		
		System.out.println();
		
		System.out.println("Restaurante 2:");
		System.out.println("Nombre: " + rest2.nombre);
		System.out.println("Direccion: " + rest2.direccion);
		System.out.println("Calificacion: " + rest2.calificacion);
		
		System.out.println();
		System.out.println("===== VALORES MODIFICADOS =====");
		
		rest1.nombre = "La Parrilla del Chef";
		rest1.direccion = "Av. Amazonas y Naciones Unidas";
		rest1.calificacion = 4.5;
		
		rest2.nombre = "Sabor Manabita";
		rest2.direccion = "Calle Garcia Moreno y Bolivar";
		rest2.calificacion = 4.8;
		
		System.out.println("Restaurante 1:");
		System.out.println("Nombre: " + rest1.nombre);
		System.out.println("Direccion: " + rest1.direccion);
		System.out.println("Calificacion: " + rest1.calificacion);
		
		System.out.println();
		
		System.out.println("Restaurante 2:");
		System.out.println("Nombre: " + rest2.nombre);
		System.out.println("Direccion: " + rest2.direccion);
		System.out.println("Calificacion: " + rest2.calificacion);
		
	}

}