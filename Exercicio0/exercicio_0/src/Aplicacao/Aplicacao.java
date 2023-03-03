//Prática 1 - POO - Exercício 0
//Aluna: Letícia Moreira Leonel

package Aplicacao;

import java.util.Scanner;

import Entidades.*;

public class Aplicacao 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Pessoa x; //variaveis x do tipo pessoa
		double aux;
		
		x = new Pessoa();
		
		System.out.println("Digite o nome da pessoa: ");
		x.nome = sc.nextLine();
		
		System.out.println("Digite o ano de nascimento da pessoa: ");
		x.ano_nasc = sc.nextDouble();
		
		System.out.println("Digite a altura da pessoa: ");
		x.h = sc.nextDouble();
		
		aux = x.calcularIdade();
		
		System.out.println("O João tem " + x.calcularIdade() + " anos e " + x.h + " cm de altura.");

	}

}
