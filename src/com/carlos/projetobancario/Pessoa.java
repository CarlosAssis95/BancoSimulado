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
	
	
	
	
	
	
	
	
	
	/*public static Pessoa cadastrarPessoa() {
        
		System.out.println("Digite os dados socilitados\n");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Você é Pessoa Fisica ou Juridica? ");
		String tipo1 = scan.nextLine();
		
		if (tipo1.equals("fisica")) {
            
			Fisica fisica = new Fisica();
            System.out.println("Qual seu nome? ");
            
            fisica.getNome();
            System.out.println("Qual seu CPF? ");
            
            String cpf = scan.nextLine();
            System.out.println("Qual sua data de nascimento? ");
            
            String data = scan.nextLine();
            System.out.println("Qual seu endereco? ");
            
            String endereco = scan.nextLine();
            return fisica;
        } 
        
        else if (tipo1.equals("juridica")) {
            
        	Juridica juridica = new Juridica();
            System.out.println("Qual a Razao Social? ");
            
            String razaoSocial = scan.nextLine();
            System.out.println("Qual seu CNPJ? ");
            
            String cnpj = scan.nextLine();
            System.out.println("Qual a data de abertura? ");
            
            String dataDeAbertura = scan.nextLine();
            System.out.println("Qual seu endereco? ");
            
            String endereco = scan.nextLine();
            return juridica;
        } 
        
        else {
            return null;
        }
	}
}*/
