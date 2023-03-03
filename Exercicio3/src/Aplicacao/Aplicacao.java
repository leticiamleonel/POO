//Exercício 1 - slide aula 2
//Aluna: Letícia Moreira Leonel

package Aplicacao;
import java.util.Scanner;

import Entidades.*; //importando as entidades do projeto


//programa principal
public class Aplicacao 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Carro x, y; //variaveis x do tipo carro
		double kmX, aux;
		
		x = new Carro();
		y = new Carro();
		
		System.out.println("Entre com os quilometros rodados:");
		x.km = sc.nextDouble();
		
		kmX = x.calcularGastoCombustivel();
		
		System.out.println("O gasto foi de: R$" + x.calcularGastoCombustivel() + " reais.");
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Escolha a opção que o carro irá executar: ");
		System.out.println("1 = Frear.");
		System.out.println("2 = Acelerar.");
		System.out.println("3 = Parar.");
		System.out.println("4 = Trocar marcha.");
		
		y.esc = sc.nextDouble();
		aux = y.acaoCarro();
		
		if(aux == 1)
		{
			System.out.println("O carro esta Freando.");
		}
		else
		{
			if (aux == 2) 
			{
				System.out.println("O carro esta acelerando.");
			}
			else
			{
				if (aux == 3)
				{
					System.out.println("O carro esta parando.");
				}
				else
				{
					System.out.println("O carro esta trocando de marcha.");
				}
			}
				
		}
		
		sc.close();
	}

}
