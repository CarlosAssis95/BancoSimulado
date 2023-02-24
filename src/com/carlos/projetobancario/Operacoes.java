package com.carlos.projetobancario;
import java.util.Scanner;

public class Operacoes extends Conta {
	
	private double deposito;
	private double saque;
	private double saldo;
	

	public Operacoes() {}
	
	public double getDeposito() {
		return deposito;
	}
	
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	
	public double getSaque() {
		return saque;
	}
	
	public void setSaque(double saque) {
		this.saque = saque;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void getSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean efetuarDeposito() {
		System.out.println("Qual valor gostaria de depositar? ");
		
		try (Scanner scan = new Scanner(System.in)){
			
			deposito = scan.nextDouble();
			System.out.println("O valor depositado foi de R$ " + deposito + " Reais");
			
			return true;
			
		}catch (Exception e) {
			
			return false;
		}
	}
	
}
