package atividades;

import java.util.Scanner;

public class atividade8 {
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
			
			System.out.println(" o trinagulo é equilátero. ");		
		}
		else if (number1 != number2 && number2 != number3 ){
			
			System.out.println(" o trinagulo é escaleno.  ");
		}
		
		else {
			System.out.println(" o trinagulo é isósceles. ");
			
		}
		
		
		
	}}