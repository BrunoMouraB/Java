package ExerciciosRevisão;

import java.util.Scanner;

public class Exercicio1 {
	  public static void main(String[] args) {
		  		  
		  /*Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço 
		  normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a 
		  seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado. 
		  Código Condição de pagamento 
		  1 À vista em dinheiro ou cheque, recebe 20% de desconto 
		  2 À vista no cartão de crédito, recebe 15% de desconto 
		  3 Em duas vezes, preço normal de etiqueta sem juros 
		  4 Em três vezes, preço normal de etiqueta mais juros de 10%*/


	        Scanner ver = new Scanner(System.in);

	        int lista;
	        double pc, x;
	        

	        System.out.println("Digite o valor do produto");
	        pc=ver.nextFloat();

	        System.out.println("Qual opção você deseja? \n1- A vista em dinheiro/cheque \n 2- A vista no"
	                + " cartão de credito\n 3- Em duas vezes sem juros\n 4- Em tres vezes");
	        lista=ver.nextInt();

	        switch(lista) 
	        
	        {

	        case 1:

	            x = pc * 0.20;
	            x = pc - x;
	            System.out.println("Você vai pagar com 20% de desconto: "+ x);
	            break;
	            
	        case 2:
	            x = pc * 0.15;
	            x = pc - x;
	            System.out.println("Você vai pagar com 15% de desconto: " + x);
	            
	            break;
	        case 3:
	            System.out.println("Você vai pagar: " + (pc/2)+ " reais dividido em 2 vezes.");
	            break;
	            
	        case 4:
	            x = pc * 0.10;
	            x = pc + x;
	            System.out.println("Você vai pagar: "+(x/3)+" reais dividido em 3 vezes. ");
	            break;
	            
	            default:        	
	            System.out.println("Opção incorreta...");
	       
	                    }
	        
	    }

	}