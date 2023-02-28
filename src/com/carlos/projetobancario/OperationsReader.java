package com.carlos.projetobancario;

import java.util.Scanner;

public class OperationsReader {
	
	private final static Scanner scan = new Scanner(System.in);
	
	public static Operacoes efetuarDeposito() {
		
		System.out.println("Qual valor gostaria de depositar? ");
		double deposito = scan.nextDouble();
		
		System.out.println("O valor depositado foi de R$ " + deposito + " Reais");
		
		return new Operacoes(deposito);
	}

}
