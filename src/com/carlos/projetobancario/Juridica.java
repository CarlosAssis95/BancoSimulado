package com.carlos.projetobancario;
import java.util.Scanner;

public class Juridica extends Pessoa {
	
	private String dataDeAbertura;

	
	public Juridica() {}
	
	public String getDataDeAbertura() {
		return dataDeAbertura;
	}
	
	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
	
	@Override
	public boolean cadastrarPessoa () {
		
		System.out.println("Digite os dados solicitados");
		System.out.println("Digite a data de abertura da empresa titular: ");
		
		try (Scanner scan = new Scanner(System.in)){
		this.dataDeAbertura = scan.nextLine();
		super.cadastrarPessoa();
		
		return true;
		
		}catch(Exception e) {
			return false;
		}
	}
	
	@Override
	public void mostrarPessoa() {
		super.mostrarPessoa();
		System.out.println("A data de abertura é " + this.dataDeAbertura );
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	}
}

