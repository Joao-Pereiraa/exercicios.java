package atividades;

import java.util.Scanner;

//indique se um n�mero digitado est� compreendido entre 20 e  90, ou n�o.

public class atividade11 {
		
	public static void main(String[] args) {
		
	int number;
	
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("digite o numero: ");
	number = leitor.nextInt();
	
	if( number >= 20 && number <= 90 ){
		
		System.out.println(" true, " + number);		
	}
	
	else {
		System.out.println("false ");
		
	}
	
	}}