package com.carlos.projetobancario;
import java.util.Scanner;

public class PersonReader {
	
	private final static Scanner scan = new Scanner(System.in);
	
	public static Juridica criarPessoaJuridica() {
		
		System.out.println("Digite a data de abertura da empresa: ");
		String dataDeAbertura = scan.next();
		
		System.out.println("Digite o endereço: ");
		String endereco = scan.next();
		
		System.out.println("Digite o nome do titular: ");
		String nome = scan.next();
		
		System.out.println("Digite o numero do CNPJ: ");
		String documentoDeIdentificacao = scan.next();
		
		return new Juridica(dataDeAbertura, endereco, nome, documentoDeIdentificacao);
	}
	
	public static Fisica criarPessoaFisica() {
		
			System.out.println("Digite a data de nascimento: ");
			String dataDeNascimento = scan.next();
			
			System.out.println("Digite o endereço: ");
			String endereco = scan.next();
			
			System.out.println("Digite o nome do titular: ");
			String nome = scan.next();
			
			System.out.println("Digite o numero do CNPJ: ");
			String documentoDeIdentificacao = scan.next();
		
		return new Fisica(dataDeNascimento, endereco, nome, documentoDeIdentificacao);
	}

}
