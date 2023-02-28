package com.carlos.projetobancario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa {
	
	private String endereco;
	private String nome;
	private String documentoDeIdentificacao;
	int tipoPessoa;
	
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
	
	List<Fisica> listaPessoaFisica = new ArrayList<>();
	List<Juridica> listaPessoaJuridica = new ArrayList<>();
	Scanner scan;
	
	public void cadastrarPessoa() {
		
		System.out.println("Qual o tipo de pessoa? \n[1]FISICA: \n[2]JURIDICA:");
		tipoPessoa = scan.nextInt();
		
		if (tipoPessoa == 1) {
		listaPessoaFisica.add(PersonReader.criarPessoaFisica());
		}
		else {
		listaPessoaJuridica.add(PersonReader.criarPessoaJuridica());
		}
	}
	
	public void listarPessoa() {
		
		System.out.println("Qual o tipo de pessoa deseja consultar? \n[1]FISICA: \n[2]JURIDICA:");
		tipoPessoa = scan.nextInt();
		
		if (tipoPessoa == 1) {
			System.out.println(listaPessoaFisica.toString());
		}else {
			System.out.println(listaPessoaJuridica.toString());
		}
	}
}
