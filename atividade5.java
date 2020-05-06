package atividades;

import java.util.Scanner;

public class atividade5 {
	
	public static void main(String[] args) {
		
		int number1;
		int number2;
		
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("digite o primeiro numero");
		number1 = leitor.nextInt();
		
		System.out.println("digite o segundo numero");
		number2 = leitor.nextInt();
		
		if (number2 == 0){
			System.out.println("impossivel");
			
		}
		
	     else if(number2 > number1){
	    	 System.out.println("impossivel");
				
		}
				
		else{ System.out.println(number1 + number2);
			
		}		
		
	}

}
