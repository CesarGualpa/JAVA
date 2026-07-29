package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();
		
		System.out.println("===== CUADRADOS: VALORES POR DEFECTO =====");
		
		System.out.println("Cuadrado 1:");
		System.out.println("Lado: " + c1.getLado());
		System.out.println("Area: " + c1.calcularArea());
		System.out.println("Perimetro: " + c1.calcularPerimetro());
		
		System.out.println();
		
		System.out.println("Cuadrado 2:");
		System.out.println("Lado: " + c2.getLado());
		System.out.println("Area: " + c2.calcularArea());
		System.out.println("Perimetro: " + c2.calcularPerimetro());
		
		System.out.println();
		
		System.out.println("Cuadrado 3:");
		System.out.println("Lado: " + c3.getLado());
		System.out.println("Area: " + c3.calcularArea());
		System.out.println("Perimetro: " + c3.calcularPerimetro());
		
		System.out.println();
		System.out.println("===== CUADRADOS: VALORES MODIFICADOS =====");
		
		c1.setLado(4);
		
		double resultadoArea1;
		resultadoArea1 = c1.calcularArea();
		
		double resultadoPerimetro1;
		resultadoPerimetro1 = c1.calcularPerimetro();
		
		System.out.println("Cuadrado 1:");
		System.out.println("Lado: " + c1.getLado());
		System.out.println("Area: " + resultadoArea1);
		System.out.println("Perimetro: " + resultadoPerimetro1);
		
		System.out.println();
		
		c2.setLado(3);
		
		double resultadoArea2;
		resultadoArea2 = c2.calcularArea();
		
		double resultadoPerimetro2;
		resultadoPerimetro2 = c2.calcularPerimetro();
		
		System.out.println("Cuadrado 2:");
		System.out.println("Lado: " + c2.getLado());
		System.out.println("Area: " + resultadoArea2);
		System.out.println("Perimetro: " + resultadoPerimetro2);
		
		System.out.println();
		
		c3.setLado(5);
		
		double resultadoArea3;
		resultadoArea3 = c3.calcularArea();
		
		double resultadoPerimetro3;
		resultadoPerimetro3 = c3.calcularPerimetro();
		
		System.out.println("Cuadrado 3:");
		System.out.println("Lado: " + c3.getLado());
		System.out.println("Area: " + resultadoArea3);
		System.out.println("Perimetro: " + resultadoPerimetro3);

	}

}