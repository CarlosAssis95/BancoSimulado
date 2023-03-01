package com.carlos.projetobancario;


public class Juridica extends Pessoa {
	
	private String dataDeAbertura;

	public Juridica() {}
	
	public Juridica(String dataDeAbertura, String endereco, String nome, String documentoDeIdentificacao) {
		super(nome, endereco, documentoDeIdentificacao);
		this.dataDeAbertura = dataDeAbertura;
	}
	
	public String getDataDeAbertura() {
		return dataDeAbertura;
	}
	
	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
	
	@Override
	public String toString() {
		
		return "Nome: " + getNome() + "\nEndereco: " + getEndereco() + "\nDocumento de Identificacao: " + getDocumentoDeIdentificacao() + "\nData de abertura: " + getDataDeAbertura();
		
	}
}
