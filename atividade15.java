package atividades;

import java.util.Scanner;

//algoritmo que leia a matr�cula, as quatro notas de um aluno na disciplina de
//F�sica, calcule a sua m�dia anual e em seguida, diga qual foi o seu resultado,

public class atividade15 {
	public static void main(String[] args) {
		
		double number1;
		double number2;
		double number3;
		double number4;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite as quatro notas de um aluno ");
		number1 = leitor.nextDouble();
		number2 = leitor.nextDouble();
		number3 = leitor.nextDouble();
		number4 = leitor.nextDouble();
		
		
		if(number1 + number2 + number3 + number4 >= 7){
			System.out.println( "aprovado: " + (number1 + number2 + number3 + number4));
			
		}
		
		else if (number1 + number2 + number3 + number4 >= 3.5 && number1 + number2 + number3 + number4 <= 7){
			System.out.println( "Recupera��o: " + (number1 + number2 + number3 + number4));	
			
		}
		
		else{
			System.out.println( "Reprovado: " + (number1 + number2 + number3 + number4));	
			
			
		}		
}}
