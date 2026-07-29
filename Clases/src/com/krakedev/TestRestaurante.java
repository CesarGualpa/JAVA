package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		
		Restaurante rest1;
		rest1 = new Restaurante("La Parrilla del Chef", "Av. Amazonas y Naciones Unidas", 4.5);
		
		Restaurante rest2;
		rest2 = new Restaurante("Sabor Manabita", "Calle Garcia Moreno y Bolivar", 4.8);
		
		System.out.println("===== RESTAURANTE 1 =====");
		System.out.println("Nombre: " + rest1.getNombre());
		System.out.println("Direccion: " + rest1.getDireccion());
		System.out.println("Calificacion: " + rest1.getCalificacion());
		
		System.out.println();
		
		System.out.println("===== RESTAURANTE 2 =====");
		System.out.println("Nombre: " + rest2.getNombre());
		System.out.println("Direccion: " + rest2.getDireccion());
		System.out.println("Calificacion: " + rest2.getCalificacion());
		
	}

}