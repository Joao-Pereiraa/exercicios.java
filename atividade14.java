package atividades;

import java.util.Scanner;

//Crie um algoritmo que receba 3 valores que representarão os lados de um triângulo e
//classifique esse triângulo como: 


public class atividade14 {
	
	public static void main(String[] args) {
		
		
		int number1;
		int number2;
		int number3;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite as medidas de um triangulo: ");
		number1 = leitor.nextInt();
		number2 = leitor.nextInt();
		number3 = leitor.nextInt();
		
		
		if( number1 == number2 && number2 == number3 ){
			
			System.out.println(" equilátero (3 lados iguais) ");		
		}
		
		else if ((number1 != number2 && number1 == number3 )||(number1 != number2 && number2 == number3 )||(number1 == number2 && number2 != number3 )){
			
			System.out.println(" isósceles (2 lados iguais) ");
		}
		
		
		else if(number1 != number2 && number2 != number3) {
			
			System.out.println(" escaleno (3 lados diferentes)");
			

	}
}}
