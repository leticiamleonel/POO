package Entidades;

public class Pessoa {
		//atributos da classe pessoa
		public String nome;
		public double ano_nasc;
		public double h;
		
		//metodos da classe pessoa
		public double calcularIdade()
		{
			//calculo da idade da pessoa
			double idade; 
			idade = 2022 - ano_nasc;
			return idade;
		}
		
}
