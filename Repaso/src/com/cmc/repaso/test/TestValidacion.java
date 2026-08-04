package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		
		Validacion v1 = new Validacion();
		
		boolean resultado1;
		resultado1 = v1.validarMonto(100);
		
		System.out.println("Monto 100 valido: " + resultado1);
		
		boolean resultado2;
		resultado2 = v1.validarMonto(0);
		
		System.out.println("Monto 0 valido: " + resultado2);
		
		boolean resultado3;
		resultado3 = v1.validarMonto(-50);
		
		System.out.println("Monto -50 valido: " + resultado3);

	}

}