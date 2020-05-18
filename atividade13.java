package atividades;

import java.util.Scanner;

//algoritmo que leia o salário atual de um funcionário e escreva o percentual
//de seu aumento e o valor do salário corrigido a partir desse aumento.

public class atividade13 {
	public static void main(String[] args) {
		
	float number;
	
	Scanner leitor = new Scanner(System.in);
	
	
	System.out.println("digite seu salário: ");
	number = leitor.nextFloat();
	
	
	if( number > 0 && number <= 1000 ){
		
		System.out.println( number  + ", salário atual. " );		
		System.out.println( " aumento de 15%. " );	
		System.out.println( number + (number * 15 / 100 ) + " sálario corrigido ");	
	}
		
	  else if( number > 1000 && number <=  2500 ){
			
			System.out.println( number  + ", salário atual. " );		
			System.out.println( " aumento de 7%. " );	
			System.out.println( number + (number * 7 / 100 ) + " sálario corrigido ");   	}
		

	else  {
		System.out.println( number  + ", salário atual. " );		
		System.out.println( " sem aumento. " );	
		System.out.println( number  + " sálario corrigido ");	
		}
	
				
	}	}	





