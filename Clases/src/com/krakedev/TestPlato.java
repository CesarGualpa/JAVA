package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		
		Plato platoA;
		platoA = new Plato();
		
		Plato platoB;
		platoB = new Plato();
		
		Plato platoC;
		platoC = new Plato();
		
		System.out.println("===== VALORES POR DEFECTO =====");
		
		System.out.println("Plato A:");
		System.out.println("Nombre: " + platoA.nombre);
		System.out.println("Tipo: " + platoA.tipo);
		System.out.println("Precio: " + platoA.precio);
		System.out.println("Disponible: " + platoA.disponible);
		
		System.out.println();
		
		System.out.println("Plato B:");
		System.out.println("Nombre: " + platoB.nombre);
		System.out.println("Tipo: " + platoB.tipo);
		System.out.println("Precio: " + platoB.precio);
		System.out.println("Disponible: " + platoB.disponible);
		
		System.out.println();
		
		System.out.println("Plato C:");
		System.out.println("Nombre: " + platoC.nombre);
		System.out.println("Tipo: " + platoC.tipo);
		System.out.println("Precio: " + platoC.precio);
		System.out.println("Disponible: " + platoC.disponible);
		
		System.out.println();
		System.out.println("===== VALORES MODIFICADOS =====");
		
		platoA.nombre = "Empanadas de verde";
		platoA.tipo = "Entrada";
		platoA.precio = (float) 2.50;
		platoA.disponible = true;
		
		platoB.nombre = "Seco de pollo";
		platoB.tipo = "Plato fuerte";
		platoB.precio = (float) 4.75;
		platoB.disponible = true;
		
		platoC.nombre = "Tres leches";
		platoC.tipo = "Postre";
		platoC.precio = (float) 3.00;
		platoC.disponible = false;
		
		System.out.println("Plato A:");
		System.out.println("Nombre: " + platoA.nombre);
		System.out.println("Tipo: " + platoA.tipo);
		System.out.println("Precio: " + platoA.precio);
		System.out.println("Disponible: " + platoA.disponible);
		
		System.out.println();
		
		System.out.println("Plato B:");
		System.out.println("Nombre: " + platoB.nombre);
		System.out.println("Tipo: " + platoB.tipo);
		System.out.println("Precio: " + platoB.precio);
		System.out.println("Disponible: " + platoB.disponible);
		
		System.out.println();
		
		System.out.println("Plato C:");
		System.out.println("Nombre: " + platoC.nombre);
		System.out.println("Tipo: " + platoC.tipo);
		System.out.println("Precio: " + platoC.precio);
		System.out.println("Disponible: " + platoC.disponible);
		
	}

}