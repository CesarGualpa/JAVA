package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo();
		r1.altura = 5;
		r1.base = 4;
		
		int resultadoArea;
		resultadoArea = r1.calcularArea();
		System.out.println("Resultado Area 1: " + resultadoArea);
		
		double resultadoPerimetro;
		resultadoPerimetro = r1.calcularPerimetro();
		System.out.println("Resultado Perimetro 1: " + resultadoPerimetro);
		
		Rectangulo r2 = new Rectangulo();
		int resultadoArea2;
		double resultadoPerimetro2;
		
		r2.altura = 8;
		r2.base = 2;
		
		resultadoArea2 = r2.calcularArea();
		resultadoPerimetro2 = r2.calcularPerimetro();
		
		System.out.println("Resultado Area 2: " + resultadoArea2);
		System.out.println("Resultado Perimetro 2: " + resultadoPerimetro2);

	}

}