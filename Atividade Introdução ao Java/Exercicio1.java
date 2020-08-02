package PacoteJava;

import java.util.Scanner;

public class ClasseExercicio1 {

	public static void main (String args[])
	{
		Scanner leitura = new Scanner (System.in);
		
		//Faça um sistema que leia a idade de uma pessoa expressa em anos,
		//meses e dias e mostre-a expressa apenas em dias. 
		
		int ano, mes = 0, dias = 0, totalDias;
		System.out.println("Informe a idade em anos: ");
		ano = leitura.nextInt();
		System.out.println("Informe a idade em meses: ");
		ano = leitura.nextInt();
		System.out.println("Informe a idade em dias: ");
		ano = leitura.nextInt();
		totalDias = dias+(365*ano)+(mes*30);
		
		System.out.println("Total de dias vividos é " +totalDias+ " dias ");
		
		
		
	}
}
