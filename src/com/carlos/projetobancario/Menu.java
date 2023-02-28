package com.carlos.projetobancario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	
	private final static Scanner scan = new Scanner(System.in);
	
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
		        	efetuarDeposito();
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
	
	List<Fisica> listaPessoaFisica = new ArrayList<>();
	List<Juridica> listaPessoaJuridica = new ArrayList<>();
	
	public void cadastrarPessoa() {
		listaPessoaFisica.add(PersonReader.criarPessoaFisica());
		listaPessoaJuridica.add(PersonReader.criarPessoaJuridica());
	}
	
	public void listarPessoa() {
		System.out.println(listaPessoaFisica.toString());
		System.out.println(listaPessoaJuridica.toString());
	}
	
	Operacoes operacoes = new Operacoes();
	
	public void efetuarDeposito() {
		operacoes.efetuarDeposito();
	}
}