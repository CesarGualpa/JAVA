package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo();
		r1.altura = 5;
		r1.base = 4;
		
		int resultadoArea;
		resultadoArea = r1.calcularArea();
		System.out.println("Resultado 1: " + resultadoArea);
		
		Rectangulo r2 = new Rectangulo();
		int resultadoArea2;
		r2.altura = 8;
		r2.base = 2;
		
		resultadoArea2 = r2.calcularArea();
		
		System.out.println("Resultado 2: " + resultadoArea2);

	}

}
