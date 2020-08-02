package PacoteJava;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main (String args[]) 
	{ 
		Scanner ver = new Scanner (System.in);
		double custoFab, pcDoDist, pcDoImp, custoConsumidor;
		
		System.out.println("Escreva o custo de fábrica: ");
		custoFab= ver.nextDouble();
		
		pcDoDist = (custoFab*28)/100;
		pcDoImp = (custoFab*45)/100;
		
		custoConsumidor=custoFab+pcDoDist+pcDoImp;
		
		System.out.println("O custo para o consumidor é de: " +custoConsumidor);
		
		
		
		
		
		
		
	}

}
