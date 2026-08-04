package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		
		Item item1 = new Item();
		item1.setNombre("Arroz");
		item1.setProductosActuales(20);
		
		System.out.println("===== ITEM 1: VALORES INICIALES =====");
		item1.imprimir();
		
		System.out.println();
		
		item1.vender(5);
		
		System.out.println("===== ITEM 1: DESPUES DE VENDER 5 =====");
		item1.imprimir();
		
		System.out.println();
		
		item1.devolver(2);
		
		System.out.println("===== ITEM 1: DESPUES DE DEVOLVER 2 =====");
		item1.imprimir();
		
		System.out.println();
		
		Item item2 = new Item();
		item2.setNombre("Azucar");
		item2.setProductosActuales(20);
		
		System.out.println("===== ITEM 2: VALORES INICIALES =====");
		item2.imprimir();
		
		System.out.println();
		
		item2.vender(8);
		
		System.out.println("===== ITEM 2: DESPUES DE VENDER 8 =====");
		item2.imprimir();
		
		System.out.println();
		
		item2.devolver(3);
		
		System.out.println("===== ITEM 2: DESPUES DE DEVOLVER 3 =====");
		item2.imprimir();

	}

}