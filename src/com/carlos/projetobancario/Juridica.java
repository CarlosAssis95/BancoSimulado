package com.carlos.projetobancario;
import java.util.Scanner;

public class Juridica extends Pessoa {
	
	private String dataDeAbertura;

	
	public Juridica() {
		
		this.dataDeAbertura = dataDeAbertura;
	}
	
	public String getDataDeAbertura() {
		return dataDeAbertura;
	}
	
	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
	
	@Override
	public void cadastrarPessoa() {
		super.cadastrarPessoa();
		System.out.println("Digite a data de abertura da empresa titular: ");
		Scanner scan = new Scanner(System.in);
		this.dataDeAbertura = scan.nextLine();
	}
	
	@Override
	public void mostrarPessoa() {
		super.mostrarPessoa();
		System.out.println("A data de abertura é " + this.dataDeAbertura );
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	}
	
}
