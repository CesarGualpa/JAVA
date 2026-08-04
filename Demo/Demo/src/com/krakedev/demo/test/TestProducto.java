package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto producto1;
		producto1 = new Producto(1001, "Laptop Lenovo");
		
		producto1.setDescripcion("Laptop para estudiantes de programación");
		producto1.setPeso(2.5);
		
		System.out.println("===== DATOS DEL PRODUCTO =====");
		System.out.println("Código: " + producto1.getCodigo());
		System.out.println("Nombre: " + producto1.getNombre());
		System.out.println("Descripción: " + producto1.getDescripcion());
		System.out.println("Peso: " + producto1.getPeso());
		
	}

}