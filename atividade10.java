package atividades;

import java.util.Scanner;

public class atividade10 {
	
	public static void main(String[] args) {
		
		int number1;
		int number2;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println(" ---------------------- ");
		System.out.println("|código “1” : dinheiro |");
		System.out.println("|código “2” : débito  |");
		System.out.println("|código “3” : Crédito   |");
		System.out.println(" ---------------------- ");
		
		System.out.println("digite o código da forma de pagamento: ");
		number1=leitor.nextInt();
		
		switch(number1){
		
		case 1:
			System.out.println("Dinheiro: Desconto de 10%.");
			System.out.println();
			System.out.println("digite o valor da compra:");
			number2=leitor.nextInt();
			System.out.println("valor total: " + (number2 - (number2 *10 /100) + " reais"));
			System.out.println();
			System.out.println((number2 *10 /100) + " reais de desconto");
			
			break;
			
		case 2:
			System.out.println("Débito: Desconto de 5%.");
			System.out.println();
			System.out.println("digite o valor da compra:");
			number2=leitor.nextInt();
			System.out.println("valor total: " + (number2 - (number2 *5 /100) + " reais"));
			System.out.println();
			System.out.println((number2 *5 /100) + " reais de desconto");
			
			break;
			
		case 3:
			System.out.println("Crédito: Acréscimo de 3%.");
			System.out.println();
			System.out.println("digite o valor da compra:");
			number2=leitor.nextInt();
			System.out.println("valor total: " + (number2 + (number2 *3 /100) + " reais"));
			System.out.println();
			System.out.println((number2 *3 /100) + " reais de desconto");
			
			break;
			
		default:
			System.out.println("não existe esse código");
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
	}

}
