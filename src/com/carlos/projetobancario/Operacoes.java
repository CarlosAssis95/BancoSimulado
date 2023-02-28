package com.carlos.projetobancario;

public class Operacoes extends Conta {
	
	private double deposito;
	private double saque;
	private double saldo;
	

	public Operacoes() {}
	
	public Operacoes(double deposito) {
		this.deposito = deposito;
	}
	
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
	
	
}
