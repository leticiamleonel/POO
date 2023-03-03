package exercicio_1b;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String p1Nome, p2Nome, p3Nome; //variaveis para nome
		double p1Idade, p2Idade, p3Idade; //para idade
		double p1Alt, p2Alt, p3Alt; //para altura
		
		//---------------------------------------------------
		System.out.println("Digite o nome da primeira pessoa: ");
		p1Nome = sc.nextLine();
		
		System.out.println("Digite a idade da primeira pessoa: ");
		p1Idade = sc.nextDouble();
		
		System.out.println("Digite a altura da primeira pessoa: ");
		p1Alt = sc.nextDouble();
		//----------------------------------------------------
		System.out.println("Digite o nome da segunda pessoa: ");
		p2Nome = sc.nextLine();
		
		System.out.println("Digite a idade da segunda pessoa: ");
		p2Idade = sc.nextDouble();
		
		System.out.println("Digite a altura da segunda pessoa: ");
		p2Alt = sc.nextDouble();
		//----------------------------------------------------
		System.out.println("Digite o nome da terceira pessoa: ");
		p3Nome = sc.nextLine();
		
		System.out.println("Digite a idade da terceira pessoa: ");
		p3Idade = sc.nextDouble();
		
		System.out.println("Digite a altura da terceira pessoa: ");
		p3Alt = sc.nextDouble();
		//----------------------------------------------------
		
		//mostrando os valores
		System.out.println(p1Nome + " tem " + p1Idade + " anos e " + p1Alt + " cm de altura." );
		System.out.println(p2Nome + " tem " + p2Idade + " anos e " + p2Alt + " cm de altura." );
		System.out.println(p3Nome + " tem " + p3Idade + " anos e " + p3Alt + " cm de altura." );
		//--------------------------------------------------------------------------------------
		
		//comparando
		
		if (p1Idade > p2Idade)
		{
			System.out.println(p1Nome + " apresenta a maior idade");
		}
		else
		{
			if(p3Idade > p1Idade)
			{
				System.out.println(p3Idade + " apresenta a mior idade");
			}
			else
			{
				System.out.println(p2Idade + " apresenta a mior idade");
			}
		}
	}

}
