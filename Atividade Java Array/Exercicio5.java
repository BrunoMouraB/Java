package ExerciciosRevisão;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
	//Faça um programa que leia um vetor de 5 posições para números reais e, depois, 
	//um código inteiro. Se o código for zero, finalize o programa; se for 1, mostre 
 //o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa. 
//Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código inválido.
			
	Scanner ver = new Scanner(System.in);

     float [] vetor = new float[5];
     int lista;

     for(int i = 0; i < 5; i++) {
         System.out.println("Informe o valor do vetor" + (i+1)+ " : ");
         vetor[i] = ver.nextFloat();
     }

     System.out.println("Escolha uma opção \n1- Vetor na ordem direta \n2- Vetor na ordem inversa");
     lista=ver.nextInt();

     if (lista==1) 
     
     {
         System.out.printf("Vetor: ");
         for(int i = 0; i < 5; i++) 
         
         {
             System.out.printf(vetor[i] + "\n");
         }
         
     }
     
     else if(lista == 2)
     {
         System.out.printf("Vetor na ordem inversa: ");
         for (int i = 4; i >= 0 ; i--) 
         
         {
             System.out.printf(vetor[i]+ "\n");
         }
         
     } 
     else 
     {
         System.out.println("Código inválido");
     }
 }

}
		
		
