package com.carlos.projetobancario;

public class Fisica extends Pessoa {
	
	private String dataDeNascimento;
	
	public Fisica() {}
	
	public Fisica(String dataDeNascimento, String nome, String endereco, String documentoDeIdentificacao) {
		super(nome, endereco, documentoDeIdentificacao);
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	@Override
	public String toString() {
		
		return "Nome: " + getNome() + "\nEndereco: " + getEndereco() + "\nDocumento de Identificacao: " + getDocumentoDeIdentificacao() + "\nData de nascimento: " + getDataDeNascimento();
		
	}
	
}
