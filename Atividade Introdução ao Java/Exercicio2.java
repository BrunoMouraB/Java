package PacoteJava;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main (String args[])
	
	{
		Scanner ler = new Scanner (System.in);
	
	int anos, meses, dias, totaldias;
	
	System.out.println("Informe a idade em anos: ");
	totaldias = ler.nextInt();
	
	anos = (totaldias/365);
	meses = (totaldias%365/30);
	dias = (totaldias%365%30);

	System.out.println("Você possui: " +anos+ " anos," +meses+ " meses," +dias+ " dias de vida.");

		}
}
