package atividades;

import java.util.Scanner;

//algoritmo que leia o sal�rio atual de um funcion�rio e escreva o percentual
//de seu aumento e o valor do sal�rio corrigido a partir desse aumento.

public class atividade13 {
	public static void main(String[] args) {
		
	float number;
	
	Scanner leitor = new Scanner(System.in);
	
	
	System.out.println("digite seu sal�rio: ");
	number = leitor.nextFloat();
	
	
	if( number > 0 && number <= 1000 ){
		
		System.out.println( number  + ", sal�rio atual. " );		
		System.out.println( " aumento de 15%. " );	
		System.out.println( number + (number * 15 / 100 ) + " s�lario corrigido ");	
	}
		
	  else if( number > 1000 && number <=  2500 ){
			
			System.out.println( number  + ", sal�rio atual. " );		
			System.out.println( " aumento de 7%. " );	
			System.out.println( number + (number * 7 / 100 ) + " s�lario corrigido ");   	}
		

	else  {
		System.out.println( number  + ", sal�rio atual. " );		
		System.out.println( " sem aumento. " );	
		System.out.println( number  + " s�lario corrigido ");	
		}
	
				
	}	}	





