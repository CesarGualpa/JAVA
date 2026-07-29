package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		
		Plato platoA;
		platoA = new Plato();
		
		Plato platoB;
		platoB = new Plato();
		
		Plato platoC;
		platoC = new Plato();
		
		System.out.println("===== PLATOS: VALORES POR DEFECTO =====");
		
		System.out.println("Plato A:");
		System.out.println("Nombre: " + platoA.getNombre());
		System.out.println("Tipo: " + platoA.getTipo());
		System.out.println("Precio: " + platoA.getPrecio());
		System.out.println("Disponible: " + platoA.getDisponible());
		
		System.out.println();
		
		System.out.println("Plato B:");
		System.out.println("Nombre: " + platoB.getNombre());
		System.out.println("Tipo: " + platoB.getTipo());
		System.out.println("Precio: " + platoB.getPrecio());
		System.out.println("Disponible: " + platoB.getDisponible());
		
		System.out.println();
		
		System.out.println("Plato C:");
		System.out.println("Nombre: " + platoC.getNombre());
		System.out.println("Tipo: " + platoC.getTipo());
		System.out.println("Precio: " + platoC.getPrecio());
		System.out.println("Disponible: " + platoC.getDisponible());
		
		System.out.println();
		System.out.println("===== PLATOS: VALORES MODIFICADOS =====");
		
		platoA.setNombre("Empanadas de verde");
		platoA.setTipo("Entrada");
		platoA.setPrecio(2.50);
		platoA.setDisponible(true);
		
		platoB.setNombre("Seco de pollo");
		platoB.setTipo("Plato fuerte");
		platoB.setPrecio(4.75);
		platoB.setDisponible(true);
		
		platoC.setNombre("Tres leches");
		platoC.setTipo("Postre");
		platoC.setPrecio(3.00);
		platoC.setDisponible(false);
		
		System.out.println("Plato A:");
		System.out.println("Nombre: " + platoA.getNombre());
		System.out.println("Tipo: " + platoA.getTipo());
		System.out.println("Precio: " + platoA.getPrecio());
		System.out.println("Disponible: " + platoA.getDisponible());
		
		System.out.println();
		
		System.out.println("Plato B:");
		System.out.println("Nombre: " + platoB.getNombre());
		System.out.println("Tipo: " + platoB.getTipo());
		System.out.println("Precio: " + platoB.getPrecio());
		System.out.println("Disponible: " + platoB.getDisponible());
		
		System.out.println();
		
		System.out.println("Plato C:");
		System.out.println("Nombre: " + platoC.getNombre());
		System.out.println("Tipo: " + platoC.getTipo());
		System.out.println("Precio: " + platoC.getPrecio());
		System.out.println("Disponible: " + platoC.getDisponible());
		
	}

}