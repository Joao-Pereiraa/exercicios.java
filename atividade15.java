package atividades;

import java.util.Scanner;

//algoritmo que leia a matrícula, as quatro notas de um aluno na disciplina de
//Física, calcule a sua média anual e em seguida, diga qual foi o seu resultado,

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
			System.out.println( "Recuperação: " + (number1 + number2 + number3 + number4));	
			
		}
		
		else{
			System.out.println( "Reprovado: " + (number1 + number2 + number3 + number4));	
			
			
		}		
}}
