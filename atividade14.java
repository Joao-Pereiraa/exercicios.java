package atividades;

import java.util.Scanner;

//Crie um algoritmo que receba 3 valores que representar�o os lados de um tri�ngulo e
//classifique esse tri�ngulo como: 


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
			
			System.out.println(" equil�tero (3 lados iguais) ");		
		}
		
		else if ((number1 != number2 && number1 == number3 )||(number1 != number2 && number2 == number3 )||(number1 == number2 && number2 != number3 )){
			
			System.out.println(" is�sceles (2 lados iguais) ");
		}
		
		
		else if(number1 != number2 && number2 != number3) {
			
			System.out.println(" escaleno (3 lados diferentes)");
			

	}
}}
