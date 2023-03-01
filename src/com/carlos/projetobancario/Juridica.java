package com.carlos.projetobancario;


public class Juridica extends Pessoa {
	
	private String dataDeAbertura;

	public Juridica() {}
	
	public Juridica(String nome, String documentoDeIdentificacao, String dataDeAbertura, String endereco) {
		super(nome, documentoDeIdentificacao, endereco);
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
