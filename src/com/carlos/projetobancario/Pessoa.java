package com.carlos.projetobancario;
import java.util.Scanner;

public class Pessoa {
	
	private String endereco;
	private String nome;
	private String documentoDeIdentificacao;
	
	public Pessoa() {}
	
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
	
	public String getdocumentoDeIdentificacao() {
		return documentoDeIdentificacao;
	}
	
	public void setDocumentoDeIdentificacao(String documentoDeIdentificacao) {
		this.documentoDeIdentificacao = documentoDeIdentificacao;
	}
	
	public boolean cadastrarPessoa() {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o nome do titular: ");
			this.nome = scan.nextLine();
			
			System.out.println("Digite o endereco do titular: ");
			this.endereco = scan.nextLine();
			
			System.out.println("Digite o Documento de Identificacao: ");
			this.documentoDeIdentificacao = scan.nextLine();
			
			
		}catch(Exception e) {
			return false;
		}
		return true;
	}
	
	public void mostrarPessoa() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("A Pessoa cadastrada é " + this.nome);
		System.out.println("A endereco cadastrado é " + this.endereco);
		System.out.println("O documento cadastrado é "+ this.documentoDeIdentificacao);
	}
}
