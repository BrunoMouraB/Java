package PacoteJava;

import java.util.Scanner;

public class Exercicio7 {
	public static void main (String args[]) 
	{
		Scanner ver =new Scanner (System.in);
		double a, b, c, d, ee, f, x, y;
		
		System.out.println("Digite o valor de A: ");
		a = ver.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = ver.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = ver.nextDouble();
		System.out.println("Digite o valor de D: ");
		d = ver.nextDouble();
		System.out.println("Digite o valor de E: ");
		ee = ver.nextDouble();
		System.out.println("Digite o valor de F: ");
		f = ver.nextDouble();
		
		
		x = Math.round ((c*ee)-(b*f)) / ((a*ee)-(b*d));
		y = Math.round ((a*f)-(c*d)) / ((a*ee)-(b*d));

		System.out.printf("\n O valor de X foi de: \n" +x);
		System.out.printf("\n O valor de Y foi de: \n" +y);
					
		
		
	}

}
