package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta("03476");
		cuenta1.setSaldo(675);
		
		Cuenta cuenta2 = new Cuenta("03476", "C", 98);
		
		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("C");
		
		System.out.println("-------- Valores Iniciales ---------");
		
		cuenta1.imprimir();
		System.out.println();
		
		cuenta2.imprimir();
		System.out.println();
		
		cuenta3.imprimir();
		System.out.println();
		
		System.out.println("-------- Valores Modificados ---------");
		
		cuenta1.setTipo("B");
		cuenta1.setSaldo(800);
		
		cuenta2.setTipo("A");
		cuenta2.setSaldo(150);
		
		cuenta3.setSaldo(1200);
		
		cuenta1.imprimirConMiEstilo();
		System.out.println();
		
		cuenta2.imprimirConMiEstilo();
		System.out.println();
		
		cuenta3.imprimirConMiEstilo();
		System.out.println();
		
		System.out.println("-------- Cuentas Adicionales ---------");
		
		Cuenta cuenta4 = new Cuenta("10001");
		cuenta4.setSaldo(300);
		
		Cuenta cuenta5 = new Cuenta("10002", "B", 450);
		
		Cuenta cuenta6 = new Cuenta("10003", "C", 900);
		
		cuenta4.imprimir();
		System.out.println();
		
		cuenta5.imprimir();
		System.out.println();
		
		cuenta6.imprimir();
		System.out.println();

	}

}