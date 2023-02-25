package com.carlos.projetobancario;

public class Fisica extends Pessoa {
	
	private String dataDeNascimento;
	
	public Fisica() {}
	
	public Fisica(String dataDeNascimento, String nome, String endereco, String documentoDeIdentificacao) {
		super(endereco, nome, documentoDeIdentificacao);
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	@Override
	public void mostrarPessoa() {
		super.mostrarPessoa();
		System.out.println("A data de nascimento é " + this.dataDeNascimento );
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	}
	
}
