package AtividadeVetoresMatrizes;

import java.util.Scanner;

public class Exercicio3 {
	 public static void main(String[] args) {
		 
/* 3- Leia uma matriz 3 x 3, conte e escreva quantos
  valores maiores que 10 ela possui.*/

		    Scanner ver = new Scanner (System.in);

	        int [][] m1 = new int [3][3];
	        int cont = 0;

	        for(int i = 0; i < 3; i++) // i= linha ---> ler linha
	        {
	        for(int j = 0; j < 3; j++) // j= coluna ---> ler coluna
	        {
	        System.out.println("Digite um valor para matriz na posição " +(i+1)+ " : " + (j+1) + "  ");
	                m1[i][j] = ver.nextInt();

	         if (m1[i][j]>10);
	          {
	              cont++;
	          }

	           } //fim do loop
	        }

	        System.out.println("Os valores maiores que 10 são: " + cont);

	    }

	}

