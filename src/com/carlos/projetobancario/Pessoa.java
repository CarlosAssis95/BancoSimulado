package com.carlos.projetobancario;

public class Pessoa {
	
	private String endereco;
	private String nome;
	private String documentoDeIdentificacao;
	
	public Pessoa() {}
	
	public Pessoa(String endereco, String nome, String documentoDeIdentificacao) {
		super();
		this.endereco = endereco;
		this.nome = nome;
		this.documentoDeIdentificacao = documentoDeIdentificacao;
	}
	
	public String getEndereco(){
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDocumentoDeIdentificacao() {
		return documentoDeIdentificacao;
	}
	
	public void setDocumentoDeIdentificacao(String documentoDeIdentificacao) {
		this.documentoDeIdentificacao = documentoDeIdentificacao;
	}
}
