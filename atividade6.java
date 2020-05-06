package atividades;

import java.util.Scanner;

public class atividade6 {
	
	public static void main(String[] args) {
		
		String nome1;
		int number1;
		String nome2;
		int number2;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite seu nome sua idade");

		nome1 = leitor.next();
		number1 = leitor.nextInt();
		
		
		System.out.println("digite o segundo nome sua idade");

		nome2 = leitor.next();
		number2 = leitor.nextInt();
		
		if(number1 > number2){
			System.out.println(nome1 + " é mais velho, tem:" + number1);
			System.out.println(nome2 + " é mais novo, tem:" + number2);
			
		}
		
		
		else {
			System.out.println( nome2 + " é mais velho, tem:" + number2 );
			System.out.println(nome1 + " é mais novo, tem:" + number1);
			
			
		}
		
	}

}
