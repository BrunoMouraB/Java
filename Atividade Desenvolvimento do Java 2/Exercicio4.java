package AtividadeJava3;

import java.util.Scanner;

public class Exercicio4 {
	public   static   void   main ( String   args [])
	{
		/*Uma empresa desenvolveu uma pesquisa para saber as 
		 características psicológicas dos indivíduos de uma região. 
		 Para tanto, a cada uma das pessoas era perguntado: idade,
		  sexo (1-feminino / 2-masculino), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		o número de pessoas calmas; 
		o número de mulheres nervosas; 
		o número de homens agressivos; 
		o número de pessoas nervosas com mais de 40 anos; 
		o número de pessoas calmas com menos de 18 anos.*/

		Scanner ver =   new   Scanner ( System.in);
		int sexo, idade, estado, qtd = 0, Mnervo = 0,calmo = 0,Hagre = 0,Pnervo = 0,Pcalma = 0;

        while(qtd <= 6) 
        {
            System.out.println("Informe sua idade: ");
            idade = ver.nextInt();
            System.out.println("Informe seu sexo se Feminino = 1 e Masculino = 2 ");
            sexo = ver.nextInt();
            System.out.println("Informe 1 se você for calma , 2 se for nervosa e 3 se for agressiva ");
            estado = ver.nextInt();
            qtd++;

            if(estado == 1) 
            
            {

                calmo++;
            }
            else if(sexo == 1 && estado == 2) 
            {

                Mnervo++;
            }
            else if (sexo == 2 && estado == 3) 
            {

                Hagre++;
            }
            else if(idade > 40 && estado == 2) 
            {

                Pnervo++;
            }
            else if(idade < 18 && estado == 1) 
            {

                Pcalma++;
            }

    }
        System.out.println("O número de pessoas calmas é:" +calmo);
        System.out.println("O número de mulheres nervosas é:" +Mnervo);
        System.out.println("O número de homens agressivos é:" +Hagre);
        System.out.println("O número de pessoas nervosas com mais de 40 anos:" +Pnervo);
        System.out.println("O número de pessoas calmas com menos de 18 anos:" +Pcalma);

       
	}

}
