package AtividadeJava3;

import java.util.Scanner;

public class Exercicio2 {
	public   static   void   main ( String   args [])
	{
//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		Scanner ver =   new   Scanner ( System.in);
		int num, contPar=0, contImp=0;
		
		for (num=1; num<=10; num++)
		{
		System.out.println("Informe um número");
		num=ver.nextInt();
		
		if (num%2 ==0)
		{
			contPar++;
		}
		else 
		{
			contImp++;
						
		}
		
		}
		
			System.out.println(contPar+ " são par(es).." );
			
			System.out.println(contImp+ " são impar(es).." );
	}

}
