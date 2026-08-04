package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto producto1 = new Producto("Mouse", 25);
		
		System.out.println("===== PRODUCTO 1 =====");
		System.out.println("Nombre: " + producto1.getNombre());
		System.out.println("Precio inicial: " + producto1.getPrecio());
		
		producto1.setPrecio(-30);
		
		System.out.println("Precio corregido: " + producto1.getPrecio());
		
		double precioPromo1;
		precioPromo1 = producto1.calcularPrecioPromo(10);
		
		System.out.println("Precio con 10% de descuento: " + precioPromo1);
		
		System.out.println();
		
		Producto producto2 = new Producto("Teclado", -80);
		
		System.out.println("===== PRODUCTO 2 =====");
		System.out.println("Nombre: " + producto2.getNombre());
		System.out.println("Precio inicial corregido: " + producto2.getPrecio());
		
		double precioPromo2;
		precioPromo2 = producto2.calcularPrecioPromo(25);
		
		System.out.println("Precio con 25% de descuento: " + precioPromo2);

	}

}