package com.carlos.projetobancario;
import java.util.Scanner;

public class LeitorDeDados {
	
	private final static Scanner scan = new Scanner(System.in);
	
	public static Juridica criarPessoaJuridica() {
		
		System.out.println("Digite o nome do titular: ");
		String nome = scan.next();
		
		System.out.println("Digite o numero do CNPJ: ");
		String documentoDeIdentificacao = scan.next();
		
		System.out.println("Digite a data de abertura da empresa: ");
		String dataDeAbertura = scan.next();
		
		System.out.println("Digite o endereço: ");
		String endereco = scan.next();
		
		return new Juridica(nome ,documentoDeIdentificacao, dataDeAbertura, endereco);
	}
	
	public static Fisica criarPessoaFisica() {
		
		System.out.println("Digite o nome do titular: ");
		String nome = scan.next();
		
		System.out.println("Digite o numero do CPF: ");
		String documentoDeIdentificacao = scan.next();
		
		System.out.println("Digite a data de nascimento: ");
		String dataDeNascimento = scan.next();
			
		System.out.println("Digite o endereço: ");
		String endereco = scan.next();
		
		return new Fisica(nome, documentoDeIdentificacao, dataDeNascimento, endereco);
	}
	
	private final static Scanner scanDouble = new Scanner(System.in);
	
	public static Operacoes efetuarDeposito() {
		
		System.out.println("Qual valor gostaria de depositar? ");
		double deposito = scanDouble.nextDouble();
		
		System.out.println("O valor depositado foi de R$ " + deposito + " Reais");
		
		return new Operacoes(deposito);
	}
	
}
