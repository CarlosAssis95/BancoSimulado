package com.carlos.projetobancario;
import java.util.Scanner;

public class Program {	
	
	//enum Menu { CADASTRAR_PESSOA_FISICA,CADASTRAR_PESSOA_JURIDICA , MOSTRAR_PESSOA, EFETUAR_DEPOSITO, EXIT }

    public static void main(String[] args) {
        
    	boolean exibirMenu = true;
    	Scanner scan = new Scanner(System.in);
    	int option;
    	//Menu choice;
        
    	Fisica fisica = new Fisica();
    	Juridica juridica = new Juridica();
    	Operacoes operacoes = new Operacoes();

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Bem vindo ao Easy Bank");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");

        while(exibirMenu) {
            System.out.println("[1]CADASTRAR PESSOA FISICA \n[2]CADASTRAR PESSOA JURIDICA \n[3]MOSTRAR PESSOA \n[4]EFETUAR DEPOSITO \n[5]EXIT");
            option = scan.nextInt();
            //choice = Menu.values()[option - 1];
            
            
            switch(option) {
                case 0:
                    fisica.cadastrarPessoa();
                    break;

                case 1:
                    juridica.cadastrarPessoa();
                    break;
                    
                case 2:
                	fisica.mostrarPessoa();
                	juridica.mostrarPessoa();
                	break;
                	
                case 3:
                	operacoes.efetuarDeposito();
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
}
