package PacoteJava;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main (String args[]) 
	{
		Scanner ver =new Scanner (System.in);
		double x1, x2, y1, y2, potx, poty, d, res;
		
		
		System.out.println("Digite o valor de x1: ");
		x1 = ver.nextDouble();
		System.out.println("Digite o valor de x2: ");
		x2 = ver.nextDouble();
		System.out.println("Digite o valor de y1: ");
		y1 = ver.nextDouble();
		System.out.println("Digite o valor de y2: ");
		y2 = ver.nextDouble();
		
		potx= Math.pow((x2-x1),2);
		poty= Math.pow((y2-y1),2);
		d=Math.sqrt(potx+poty);
		res=Math.round(d);
		
		System.out.println("O resultado de D é " +res);
		
		
		
		
	}

}
