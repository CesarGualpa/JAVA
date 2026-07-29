package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		
		Plato platoA;
		platoA = new Plato("Empanadas de verde", "Entrada", 2.50, true);
		
		Plato platoB;
		platoB = new Plato("Seco de pollo", "Plato fuerte", 4.75, true);
		
		Plato platoC;
		platoC = new Plato("Tres leches", "Postre", 3.00, false);
		
		System.out.println("===== PLATO A =====");
		System.out.println("Nombre: " + platoA.getNombre());
		System.out.println("Tipo: " + platoA.getTipo());
		System.out.println("Precio: " + platoA.getPrecio());
		System.out.println("Disponible: " + platoA.getDisponible());
		
		System.out.println();
		
		System.out.println("===== PLATO B =====");
		System.out.println("Nombre: " + platoB.getNombre());
		System.out.println("Tipo: " + platoB.getTipo());
		System.out.println("Precio: " + platoB.getPrecio());
		System.out.println("Disponible: " + platoB.getDisponible());
		
		System.out.println();
		
		System.out.println("===== PLATO C =====");
		System.out.println("Nombre: " + platoC.getNombre());
		System.out.println("Tipo: " + platoC.getTipo());
		System.out.println("Precio: " + platoC.getPrecio());
		System.out.println("Disponible: " + platoC.getDisponible());
		
	}

}