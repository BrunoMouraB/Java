package AtividadeJava3;

import java.util.Scanner;

public class Exercicio2 {
	public   static   void   main ( String   args [])
	{
//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		Scanner ver =   new   Scanner ( System.in);
		int num, contPar=0, contImp=0;
		
		for (num=1; num<=10; num++)
		{
		System.out.println("Informe um n�mero");
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
		
			System.out.println(contPar+ " s�o par(es).." );
			
			System.out.println(contImp+ " s�o impar(es).." );
	}

}
