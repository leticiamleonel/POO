package Entidades;

public class Carro 
{
	//atributos da classe Carro
	public double km;
	public double esc;
	
	//metodos da classe Carro
	public double calcularGastoCombustivel()
	{
		//cálculo de gasto de gasolina 
		double total; 
		total = km * 7.50;
		return total;
	}
	
	public double acaoCarro()
	{
		//operações de escolha
		double escolha;
		escolha = esc;
		return escolha;
	}
}
