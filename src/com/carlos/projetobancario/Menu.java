package com.carlos.projetobancario;
import java.util.Scanner;

public class Menu {
	
	private final static Scanner scan = new Scanner(System.in);
	
	boolean exibirMenu = true;
	
	public void executarMenu() {
		
		while(exibirMenu) {
		    
			System.out.println("[1]CADASTRAR PESSOA \n[2]LISTAR PESSOA \n[3]EFETUAR DEPOSITO \n[4]EXIT");
		    int option = scan.nextInt();
		    
		    Pessoa pessoa = new Pessoa();
		     
		    switch(option) {
	        
			    case 1:
		            pessoa.cadastrarPessoa();
		            break;
	
		        case 2:
		        	pessoa.listarPessoa();
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
	
	Operacoes operacoes = new Operacoes();
	
	public void efetuarDeposito() {
		operacoes.efetuarDeposito();
	}
}