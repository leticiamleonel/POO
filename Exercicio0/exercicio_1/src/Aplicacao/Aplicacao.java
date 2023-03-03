package Aplicacao;

import java.util.Scanner;

import Entidades.*;

public class Aplicacao {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Pessoas x, y, z; //variaveis x do tipo pessoa
		double aux, aux1, aux2;
		
		x = new Pessoas();
		y = new Pessoas();
		z = new Pessoas();
		//---------------------------------------------------
		System.out.println("Digite o nome da primeira pessoa: ");
		x.nome = sc.nextLine();
		System.out.println("Digite a idade da primeira pessoa: ");
		x.idade = sc.nextDouble();
		System.out.println("Digite a altura da primeira pessoa: ");
		x.idade = sc.nextDouble();
		//----------------------------------------------------
		System.out.println("Digite o nome da segunda pessoa: ");
		y.nome = sc.nextLine();
		System.out.println("Digite a idade da segunda pessoa: ");
		y.idade = sc.nextDouble();
		System.out.println("Digite a altura da segunda pessoa: ");
		y.idade = sc.nextDouble();
		//----------------------------------------------------
		System.out.println("Digite o nome da terceira pessoa: ");
		z.nome = sc.nextLine();
		System.out.println("Digite a idade da terceira pessoa: ");
		z.idade = sc.nextDouble();
		System.out.println("Digite a altura da terceira pessoa: ");
		z.idade = sc.nextDouble();
		//----------------------------------------------------
		
		aux = x.exibirDados();
		aux1 = y.exibirDados();
		aux2 = z.exibirDados();
		
		
	}

}
