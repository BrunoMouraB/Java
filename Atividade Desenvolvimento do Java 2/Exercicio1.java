package AtividadeJava3;

import java.util.Scanner;

public class Exercicio1 {
	
	public   static   void   main ( String   args [])
	{
		Scanner entrada =   new   Scanner ( System.in);
	/*Informar todos os números de 1000 a 1999 que quando divididos
	por 11 obtemos resto = 5. (FOR)*/
		
	int num;
			
	for(num = 1000; num <=1999; num++) 
	{

	 if(num%11 == 5) 
    {
	            	
   System.out.println("\nO numero " + num + " dividido por 11 tem o resto 5");
	
    }
	   }
	    }

		}


