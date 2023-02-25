package com.carlos.projetobancario;
import java.util.Scanner;

public class Leitor {
	
	Scanner scan;
	
	
	Leitor(){}

	
	public int lerInteiro() {
		
		
		int choice = 99;
		scan = new Scanner(System.in);
		
		if(!scan.hasNextInt()) 
		{
		   choice = scan.nextInt();
		}

		return choice;
	}
	
	public void fechar() {
		scan.close();
	}
	
	public String lerString() {
		
		String choice = "";
		scan = new Scanner(System.in);
		
		if(scan.hasNextLine()) 
		{
		   choice = scan.nextLine();
		}

		return choice;
		
	}
}
