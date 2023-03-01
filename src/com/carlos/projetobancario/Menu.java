package com.carlos.projetobancario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	
	private final static Scanner scan = new Scanner(System.in);
	
	List<Fisica> listaPessoaFisica = new ArrayList<>();
	List<Juridica> listaPessoaJuridica = new ArrayList<>();
	
	boolean exibirMenu = true;
	
	public void executarMenu() {
		
		while(exibirMenu) {
		    
			System.out.println("[1]CADASTRAR PESSOA \n[2]LISTAR PESSOA \n[3]EFETUAR DEPOSITO \n[4]EXIT");
		    int option = scan.nextInt();
		     
		    switch(option) {
	        
			    case 1:
		            cadastrarPessoa();
		            break;
	
		        case 2:
		        	listarPessoa();
		            break;
		            
		        case 3:
		        	OperationsReader.efetuarDeposito();
		        	break;	
		        	
		        case 4:
		        	exibirMenu = false;
		            System.out.println("Obrigado por visitar nosso banco");
		            System.out.println("Nos vemos na proxima");
		            break;
		            
		        default:
		        	System.out.println("Opção invalida");
		        	break;
		        		
		    }
		}
	}
	
	public void cadastrarPessoa() {
		
		System.out.println("Qual o tipo de pessoa? \n[1]FISICA: \n[2]JURIDICA:");
		int tipoPessoa = scan.nextInt();
		
		if (tipoPessoa == 1) {
		listaPessoaFisica.add(PersonReader.criarPessoaFisica());
		}
		else {
		listaPessoaJuridica.add(PersonReader.criarPessoaJuridica());
		}
	}
	
	public void listarPessoa() {
			
		System.out.println("Qual o tipo de pessoa deseja consultar? \n[1]FISICA: \n[2]JURIDICA:");
		int tipoPessoa = scan.nextInt();
			
		if (tipoPessoa == 1) {
			System.out.println(listaPessoaFisica.toString());
		}else {
			System.out.println(listaPessoaJuridica.toString());
		}
	}
	
}