package Atividade;

import java.util.Scanner;

public class Exercicio1 {

	public  static  void  main ( String  args [])
	
	{
		

//Faça um programa que receba três inteiros e diga qual deles é o maior.

	
	Scanner entrada =  new  Scanner ( System.in);
	
	int n1, n2, n3, maior;
	
	System.out.println("Informe o primeiro número: ");
	n1=entrada.nextInt ();
	System.out.println("Informe o segundo número: ");
	n2=entrada.nextInt ();
	System.out.println("Informe o terceiro número: ");
	n3=entrada.nextInt ();
	
	if (n1>n2) 
	{
		maior=n1;
	}
	
	else 
		
	{
		maior=n2;
				
		if(n3>maior)
	{
			maior=3;
	}
			
		System.out.println("O número maior é: " +maior);
		
		
	}
	
	
	
	}
	
}
