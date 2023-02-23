package com.carlos.projetobancario;
import java.util.Scanner;

public class Fisica extends Pessoa {
	
	private String dataDeNascimento;
	
	public Fisica() {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	@Override
	public void cadastrarPessoa() {
		super.cadastrarPessoa();
		System.out.println("Digite a data de nascimento do titular: ");
		Scanner scan = new Scanner(System.in);
		this.dataDeNascimento = scan.nextLine();
	}
	
	@Override
	public void mostrarPessoa() {
		super.mostrarPessoa();
		System.out.println("A data de nascimento é " + this.dataDeNascimento );
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	}
	
}
