package Atividade;

import java.util.Scanner;

public class Exercicio1 {

	public  static  void  main ( String  args [])
	
	{
		

//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

	
	Scanner entrada =  new  Scanner ( System.in);
	
	int n1, n2, n3, maior;
	
	System.out.println("Informe o primeiro n�mero: ");
	n1=entrada.nextInt ();
	System.out.println("Informe o segundo n�mero: ");
	n2=entrada.nextInt ();
	System.out.println("Informe o terceiro n�mero: ");
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
			
		System.out.println("O n�mero maior �: " +maior);
		
		
	}
	
	
	
	}
	
}
