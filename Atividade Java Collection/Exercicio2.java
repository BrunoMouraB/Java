package Atividade;

import java.util.Scanner;

public class Exercicio2 {
	
public  static  void  main ( String  args [])
{
	//Faça um programa que entre com três números e coloque em ordem crescente.
	
	Scanner ver =  new  Scanner ( System.in);
	
     int n1, n2, n3, primeiro=0, segundo=0, terceiro=0;

     System.out.printf("Entre com o primeiro numero: ");
     n1 = ver.nextInt();
     System.out.printf("Entre com o segundo numero: ");
     n2 = ver.nextInt();
     System.out.printf("Entre com o terceiro numero: ");
     n3 = ver.nextInt();

     if(n1>n2 && n1>n3)
     {
         if(n2>n3)
         {
             primeiro = n1;
             segundo = n2;
             terceiro = n3;
         }
         else
         {
             terceiro = n1;
             segundo = n3;
             primeiro = n2;
         }

     }
     else if(n2>n1 && n2>n3)
     {
         if(n1>n3)
         {
             terceiro = n2;
             segundo= n1;
             primeiro = n3;
         }
         else
         {
             terceiro = n2;
             segundo = n3;
             primeiro = n1;
         }
     }
     else if(n3>n1 && n3>n2)
     {
         if(n1>n2)
         {
             terceiro = n3;
             segundo = n1;
             primeiro = n2;
         }
         else
         {
            primeiro=n1;
            segundo=n2;
            terceiro=n3;
            
         }
     }

     System.out.println("A ordem crescente dos número é: ");
     System.out.println("Primeiro "+primeiro);
     System.out.println("Segundo " +segundo);
     System.out.println("Terceiro "+terceiro);

 }
	
	
}


