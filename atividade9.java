package atividades;

import java.util.Scanner;

public class atividade9 {
	
	public static void main(String[] args) {
		
		int number1;
		
		Scanner leitor = new Scanner(System.in);

		System.out.println(" ---------------------------- ");
		System.out.println("|código “001” : Sul          |");
		System.out.println("|código “002” : Sudeste      |");
		System.out.println("|código “003” : Centro-Oeste |");
		System.out.println("|código “004” : Nordeste     |");
		System.out.println("|código “005” : Norte        |");
		System.out.println(" ---------------------------- ");
		
		
		System.out.println(" digite o código do produto: ");
		number1 = leitor.nextInt();
		
		switch(number1){
		
		case 001:
			System.out.println("Sul");
		break;
		
		case 002:
			System.out.println("Sudeste");
		break;
		
		case 003:
			System.out.println("Centro-Oeste");
		break;
		
		case 004:
			System.out.println("Nordeste");
		break;
		
		case 005:
			System.out.println("Norte");
		break;
		
		default:
			System.out.println("Produto Importado");
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
	
		
		
		
		
		
	}
}
