package com.carlos.projetobancario;

public class Banco {
	
	private double valorGuardado;
	private double limiteDeCredito;
	private double limiteEmprestimoPessoal;
	
	public Banco() {
	}
	
	public double getValorGuardado() {
		return valorGuardado;
	}
	
	public void setValorGuardado(double valorGuardado) {
		this.valorGuardado = valorGuardado;
	}
	
	public double getLimiteDeCredito() {
		return limiteDeCredito;
	}
	
	public void setLimiteDeCredito(double limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
	}
	
	public double getLimiteEmprestimoPessoal() {
		return limiteEmprestimoPessoal;
	}

	public void setLimiteEmprestimoPessoal(double limiteEmprestimoPessoal) {
		this.limiteEmprestimoPessoal = limiteEmprestimoPessoal;
		
	}
}
