package ExerciciosRevis�o;

import java.util.Scanner;

public class Exercicio1 {
	  public static void main(String[] args) {
		  		  
		  /*Elabore um programa que calcule o que deve ser pago por um produto, considerando o pre�o 
		  normal de etiqueta e a escolha da condi��o de pagamento. Utilize os c�digos da tabela a 
		  seguir para ler qual a condi��o de pagamento escolhida e efetuar o c�lculo adequado. 
		  C�digo Condi��o de pagamento 
		  1 � vista em dinheiro ou cheque, recebe 20% de desconto 
		  2 � vista no cart�o de cr�dito, recebe 15% de desconto 
		  3 Em duas vezes, pre�o normal de etiqueta sem juros 
		  4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%*/


	        Scanner ver = new Scanner(System.in);

	        int lista;
	        double pc, x;
	        

	        System.out.println("Digite o valor do produto");
	        pc=ver.nextFloat();

	        System.out.println("Qual op��o voc� deseja? \n1- A vista em dinheiro/cheque \n 2- A vista no"
	                + " cart�o de credito\n 3- Em duas vezes sem juros\n 4- Em tres vezes");
	        lista=ver.nextInt();

	        switch(lista) 
	        
	        {

	        case 1:

	            x = pc * 0.20;
	            x = pc - x;
	            System.out.println("Voc� vai pagar com 20% de desconto: "+ x);
	            break;
	            
	        case 2:
	            x = pc * 0.15;
	            x = pc - x;
	            System.out.println("Voc� vai pagar com 15% de desconto: " + x);
	            
	            break;
	        case 3:
	            System.out.println("Voc� vai pagar: " + (pc/2)+ " reais dividido em 2 vezes.");
	            break;
	            
	        case 4:
	            x = pc * 0.10;
	            x = pc + x;
	            System.out.println("Voc� vai pagar: "+(x/3)+" reais dividido em 3 vezes. ");
	            break;
	            
	            default:        	
	            System.out.println("Op��o incorreta...");
	       
	                    }
	        
	    }

	}