package AtividadeJava3;

import java.util.Scanner;

public class Exercicio5 {
	public   static   void   main ( String   args [])
	{
		//Crie um programa que leia um n�mero do teclado at� que 
		//encontre um n�mero igual a zero. No final, mostre a 
		//soma dos n�meros digitados.(DO...WHILE)

		
		Scanner ver =   new   Scanner ( System.in);
		
		int num, x=0, soma=0;

		
		System.out.println("Digite um n�mero: ");
		num=ver.nextInt();
		
	     do 
	     {
	    	 if (num!=0)
	     {
	    	 soma=soma+num;
	    	 num++;
	     }
	    	 System.out.println("Digite um n�mero: ");
		    	num=ver.nextInt();
	      } 
	     while (num!=0);
	     
	     System.out.printf("A soma dos n�meros �: %d ", soma);
	    	 
	     }
	    	 
	}
