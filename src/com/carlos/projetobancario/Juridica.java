package com.carlos.projetobancario;

public class Juridica extends Pessoa {
	
	private String dataDeAbertura;

	
	public Juridica() {}
	
	public Juridica(String dataDeAbertura, String endereco, String nome, String documentoDeIdentificacao) {
		super(endereco, nome, documentoDeIdentificacao);
		this.dataDeAbertura = dataDeAbertura;
	}
	
	public String getDataDeAbertura() {
		return dataDeAbertura;
	}
	
	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
	
	@Override
	public void mostrarPessoa() {
		super.mostrarPessoa();
		System.out.println("A data de abertura é " + this.dataDeAbertura );
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	}
}

