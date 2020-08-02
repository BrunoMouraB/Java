package PacoteJava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main (String args[])
	{
	Scanner ler = new Scanner (System.in);
	
		
		int horas, min, seg, tempoTotal;
		
		System.out.printf("Informe o tempo de duração da fabrica em horas: ");
		tempoTotal = ler.nextInt();
		horas = tempoTotal/3600;
		min = (tempoTotal-(horas*3600))/60;
		seg = (horas*3600)-(min*60);
		
		System.out.printf("O tempo de duração da fabrica é de: %d horas, %d minutos e %d segunos," , horas, min, seg);
		
		
	}	
}
