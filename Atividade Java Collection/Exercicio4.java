package Atividade;

import java.util.Scanner;

public class Exercicio4 {
	
	public  static  void  main ( String  args [])
	{
		
/*Fa�a um programa em que permita a entrada de um n�mero qualquer e 
exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz 
quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/
		
	Scanner ver = new Scanner (System.in);
        int num;
        double pot=0, raiz=0;
        
   System.out.println("Informe um n�mero:");
   num=ver.nextInt();
   
   if (num%2==0)
	  
   {
	  raiz=Math.sqrt(num);
	  
	  
	  //System.out.printf("O n�mero " +num+ " � par com raiz quadrada " +raiz);
	  System.out.printf("O n�mero %d � par com raiz quadrada de %.2f", num, raiz);
   } 
	  else
	  {
		  pot = Math.pow(num, 2);
	
         // System.out.printf("Numemro " +num+ " � impar e elevado a dois �: " + pot);
          System.out.printf("Numemro %d � impar e elevado a dois �: %.2f", num, pot);
         
	  }
	  }


	}


