package ExerciciosRevis�o;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		/*O IMC � �ndice de Massa Corporal � um crit�rio da Organiza��o Mundial de 
		 Sa�de para dar uma indica��o sobre a condi��o de peso de uma pessoa adulta. 
		 A f�rmula � IMC = peso / ( altura )2 
		Elabore um programa que leia o peso e a altura de um adulto e mostre sua condi��o
		de acordo com a tabela abaixo. 
				IMC em adultos Condi��o 
				Abaixo de 18,5 Abaixo do peso 
				Entre 18,5 e 25 Peso normal 
				Entre 25 e 30 Acima do peso 
				Acima de 30 obeso*/

			  Scanner ver = new Scanner(System.in);
		  
		  double imc, altura, peso;
		 	  
		  System.out.println("Informe seu peso: ");
		  peso=ver.nextDouble();
		  
		  System.out.println("Informe seu altura: ");
		  altura=ver.nextDouble();
		  
		  imc= (peso/(altura*altura));
		  
		  if (imc<18.5)
		  {
			  System.out.println("Cuidado, voc� est� abaixo do peso! "); 
		  }
		  else if (imc<25)
			  //else if (imc>=18.5 && imc==25)
		  {
			  System.out.println("�timo, voc� est� no peso normal! ");
		  }
		  else if (imc<30)
			  //else if (imc>=25 && imc==30)
		  {
			  System.out.println("Cuidado, voc� est� acima do peso! "); 
		  }
		  else
		  {
			  System.out.println("Infelizmente voc� est� obeso! "); 
		  }
		  
		  }
			  
		  }




