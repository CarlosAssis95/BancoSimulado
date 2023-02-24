package com.carlos.projetobancario;
import java.util.Scanner;

public class Fisica extends Pessoa {
	
	private String dataDeNascimento;
	
	public Fisica() {}
	
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	@Override
	public boolean cadastrarPessoa() {
		super.cadastrarPessoa();
		System.out.println("Digite a data de nascimento do titular: ");
		
		try (Scanner scan = new Scanner(System.in)){
		this.dataDeNascimento = scan.nextLine();
		
		return true;
		
		}catch(Exception e) {
			return false;
		}
	}
	
	@Override
	public void mostrarPessoa() {
		super.mostrarPessoa();
		System.out.println("A data de nascimento é " + this.dataDeNascimento );
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	}
	
}
