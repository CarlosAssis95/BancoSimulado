package com.carlos.projetobancario;
import java.util.Scanner;
import java.util.Date;

public class Pessoa {
	
	private String endereco;
	private String nome;
	private String documentoDeIdentificacao;
	
	public Pessoa() {
		this.endereco = endereco;
		this.nome = nome;
		this.documentoDeIdentificacao = documentoDeIdentificacao;
	}
	
	public String getEndereco(){
		return endereco;
	}
	
	public void setEndereco() {
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome() {
		this.nome = nome;
	}
	
	public String getdocumentoDeIdentificacao() {
		return documentoDeIdentificacao;
	}
	
	public void setDocumentoDeIdentificacao() {
		this.documentoDeIdentificacao = documentoDeIdentificacao;
	}
	
	public void cadastrarPessoa() {
		System.out.println("Digite os dados solicitados?");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do titular: ");
		this.nome = scan.nextLine();
		
		System.out.println("Digite o endereco do titular: ");
		this.endereco = scan.nextLine();
		
		System.out.println("Digite o Documento de Identificacao: ");
		this.documentoDeIdentificacao = scan.nextLine();
		
	}
	public void mostrarPessoa() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("A Pessoa cadastrada é " + this.nome);
		System.out.println("A endereco cadastrado é " + this.endereco);
		System.out.println("O documento cadastrado é "+ this.documentoDeIdentificacao);
	}
}
