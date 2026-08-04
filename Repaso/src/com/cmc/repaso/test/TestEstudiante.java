package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		
		Estudiante estudiante1 = new Estudiante("Carlos");
		estudiante1.calificar(7.5);
		
		System.out.println("===== ESTUDIANTE 1 =====");
		System.out.println("Nombre: " + estudiante1.getNombre());
		System.out.println("Nota: " + estudiante1.getNota());
		System.out.println("Resultado: " + estudiante1.getResultado());
		
		System.out.println();
		
		Estudiante estudiante2 = new Estudiante("Ana");
		estudiante2.calificar(8);
		
		System.out.println("===== ESTUDIANTE 2 =====");
		System.out.println("Nombre: " + estudiante2.getNombre());
		System.out.println("Nota: " + estudiante2.getNota());
		System.out.println("Resultado: " + estudiante2.getResultado());
		
		System.out.println();
		
		Estudiante estudiante3 = new Estudiante("Luis");
		estudiante3.calificar(9.5);
		
		System.out.println("===== ESTUDIANTE 3 =====");
		System.out.println("Nombre: " + estudiante3.getNombre());
		System.out.println("Nota: " + estudiante3.getNota());
		System.out.println("Resultado: " + estudiante3.getResultado());

	}

}