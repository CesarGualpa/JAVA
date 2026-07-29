package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		
		Restaurante rest1;
		rest1 = new Restaurante();
		
		Restaurante rest2;
		rest2 = new Restaurante();
		
		System.out.println("===== RESTAURANTES: VALORES POR DEFECTO =====");
		
		System.out.println("Restaurante 1:");
		System.out.println("Nombre: " + rest1.getNombre());
		System.out.println("Direccion: " + rest1.getDireccion());
		System.out.println("Calificacion: " + rest1.getCalificacion());
		
		System.out.println();
		
		System.out.println("Restaurante 2:");
		System.out.println("Nombre: " + rest2.getNombre());
		System.out.println("Direccion: " + rest2.getDireccion());
		System.out.println("Calificacion: " + rest2.getCalificacion());
		
		System.out.println();
		System.out.println("===== RESTAURANTES: VALORES MODIFICADOS =====");
		
		rest1.setNombre("La Parrilla del Chef");
		rest1.setDireccion("Av. Amazonas y Naciones Unidas");
		rest1.setCalificacion(4.5);
		
		rest2.setNombre("Sabor Manabita");
		rest2.setDireccion("Calle Garcia Moreno y Bolivar");
		rest2.setCalificacion(4.8);
		
		System.out.println("Restaurante 1:");
		System.out.println("Nombre: " + rest1.getNombre());
		System.out.println("Direccion: " + rest1.getDireccion());
		System.out.println("Calificacion: " + rest1.getCalificacion());
		
		System.out.println();
		
		System.out.println("Restaurante 2:");
		System.out.println("Nombre: " + rest2.getNombre());
		System.out.println("Direccion: " + rest2.getDireccion());
		System.out.println("Calificacion: " + rest2.getCalificacion());
		
	}

}