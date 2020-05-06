package atividades;

import java.util.Scanner;

public class atividade7 {
	public static void main(String[] args) {
		
		String nome;
		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite o nome do aluno");
		nome = leitor.next();
		
		System.out.println("digite a primeira nota");
		number1 = leitor.nextInt();
		
		System.out.println("digite a segunda nota");
		number2 = leitor.nextInt();
		
		System.out.println("digite a terceira nota");
		number3 = leitor.nextInt();
		
		System.out.println("digite a quarta nota");
		number4 = leitor.nextInt();
		
		
		if(number1 + number2 + number3 + number4 >= 7) {
		System.out.println(number1 + number2 + number3 + number4 +" :aprovado ");
		}
		
		else if(number1 + number2 + number3 + number4 < 7){
			System.out.println("digite a nota da prova de recuperação");
			number5 = leitor.nextInt();
			
			if(number5 > 7){
				System.out.println(" aprovado: "  + number5);
				
			}
			
			else {
				System.out.println("reprovado");
			}
			
		
		}	} }
