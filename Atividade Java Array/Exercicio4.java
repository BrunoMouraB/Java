package ExerciciosRevis�o;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
	//Fa�a um programa que leia um vetor de 5 posi��es para n�meros reais e, depois, 
	//um c�digo inteiro. Se o c�digo for zero, finalize o programa; se for 1, mostre 
 //o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa. 
//Caso, o c�digo for diferente de 1 e 2, escreva uma mensagem informando que o c�digo inv�lido.
			
	Scanner ver = new Scanner(System.in);

    
     float soma=0;
     int x=1, y=1, a=1;
     while (a<=50)
    	 
     {
    	 soma=soma+(x/y);
    	 x+=2;
    	 y++;
    	 a++;
    	 
     }
      
         System.out.println("A somat�ria e: " +soma);
         
     }
 }


		
		
