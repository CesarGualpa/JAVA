package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {

		Rectangulo r1;
		r1 = new Rectangulo(4, 5);
		
		int resultadoArea;
		resultadoArea = r1.calcularArea();
		
		double resultadoPerimetro;
		resultadoPerimetro = r1.calcularPerimetro();
		
		System.out.println("===== RECTANGULO 1 =====");
		System.out.println("Base: " + r1.getBase());
		System.out.println("Altura: " + r1.getAltura());
		System.out.println("Resultado Area 1: " + resultadoArea);
		System.out.println("Resultado Perimetro 1: " + resultadoPerimetro);
		
		System.out.println();
		
		Rectangulo r2;
		r2 = new Rectangulo(2, 8);
		
		int resultadoArea2;
		resultadoArea2 = r2.calcularArea();
		
		double resultadoPerimetro2;
		resultadoPerimetro2 = r2.calcularPerimetro();
		
		System.out.println("===== RECTANGULO 2 =====");
		System.out.println("Base: " + r2.getBase());
		System.out.println("Altura: " + r2.getAltura());
		System.out.println("Resultado Area 2: " + resultadoArea2);
		System.out.println("Resultado Perimetro 2: " + resultadoPerimetro2);

	}

}