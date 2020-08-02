package Atividade;

import java.util.Scanner;

public class Exercicio4 {
	
	public  static  void  main ( String  args [])
	{
		
/*Faça um programa em que permita a entrada de um número qualquer e 
exiba se este número é par ou ímpar. Se for par exiba também a raiz 
quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/
		
	Scanner ver = new Scanner (System.in);
        int num;
        double pot=0, raiz=0;
        
   System.out.println("Informe um número:");
   num=ver.nextInt();
   
   if (num%2==0)
	  
   {
	  raiz=Math.sqrt(num);
	  
	  
	  //System.out.printf("O número " +num+ " é par com raiz quadrada " +raiz);
	  System.out.printf("O número %d é par com raiz quadrada de %.2f", num, raiz);
   } 
	  else
	  {
		  pot = Math.pow(num, 2);
	
         // System.out.printf("Numemro " +num+ " é impar e elevado a dois é: " + pot);
          System.out.printf("Numemro %d é impar e elevado a dois é: %.2f", num, pot);
         
	  }
	  }


	}


