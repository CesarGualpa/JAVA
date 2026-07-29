package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		
		System.out.println("===== RECTANGULOS: VALORES POR DEFECTO =====");
		
		System.out.println("Rectangulo 1:");
		System.out.println("Base: " + r1.getBase());
		System.out.println("Altura: " + r1.getAltura());
		System.out.println("Area: " + r1.calcularArea());
		System.out.println("Perimetro: " + r1.calcularPerimetro());
		
		System.out.println();
		
		System.out.println("Rectangulo 2:");
		System.out.println("Base: " + r2.getBase());
		System.out.println("Altura: " + r2.getAltura());
		System.out.println("Area: " + r2.calcularArea());
		System.out.println("Perimetro: " + r2.calcularPerimetro());
		
		System.out.println();
		System.out.println("===== RECTANGULOS: VALORES MODIFICADOS =====");
		
		r1.setAltura(5);
		r1.setBase(4);
		
		int resultadoArea;
		resultadoArea = r1.calcularArea();
		
		double resultadoPerimetro;
		resultadoPerimetro = r1.calcularPerimetro();
		
		System.out.println("Rectangulo 1:");
		System.out.println("Base: " + r1.getBase());
		System.out.println("Altura: " + r1.getAltura());
		System.out.println("Resultado Area 1: " + resultadoArea);
		System.out.println("Resultado Perimetro 1: " + resultadoPerimetro);
		
		System.out.println();
		
		r2.setAltura(8);
		r2.setBase(2);
		
		int resultadoArea2;
		resultadoArea2 = r2.calcularArea();
		
		double resultadoPerimetro2;
		resultadoPerimetro2 = r2.calcularPerimetro();
		
		System.out.println("Rectangulo 2:");
		System.out.println("Base: " + r2.getBase());
		System.out.println("Altura: " + r2.getAltura());
		System.out.println("Resultado Area 2: " + resultadoArea2);
		System.out.println("Resultado Perimetro 2: " + resultadoPerimetro2);

	}

}