package atividades;

import java.util.Scanner;

//algoritmo que dada a idade de um nadador classifica-o em uma das seguintes categorias:

public class atividade12 {
	
	
	public static void main(String[] args) {
	
	int number;
	
	Scanner leitor = new Scanner(System.in);
	
	System.out.println(" -----------------------------" );
	System.out.println("|infantil =   5 - 10 anos     |");
	System.out.println("|juvenil  =   11 - 17 anos    |");
	System.out.println("|adulto   = maiores de 18 anos|");
	System.out.println(" ----------------------------- ");
	
	System.out.println("digite a idade do nadador: ");
	number = leitor.nextInt();
	
	if( number >= 5 && number <= 10 ){
		
		System.out.println(" infantil, " + number + " anos. " );		
		
	}
	else if( number >= 11 && number <= 17 ){
		
		System.out.println(" juvenil, " + number + " anos. " );		
	}
	
	
	else {
		System.out.println(" adulto, " + number + " anos. ");
		
		
		
		
		
		
		
	}	}	}


