package ExerciciosRevisão;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
	//Faça um programa que leia um vetor de 5 posições para números reais e, depois, 
	//um código inteiro. Se o código for zero, finalize o programa; se for 1, mostre 
 //o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa. 
//Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código inválido.
			
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
      
         System.out.println("A somatória e: " +soma);
         
     }
 }


		
		
