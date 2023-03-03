package entidades;
import java.util.Date;

public class Pessoa 
{

	private String nome;
	private int identidade;
	private Date nascimento;
	
	public Pessoa(String n, int i, Date d) 
	{
		// TODO Auto-generated constructor stub
		nome = n; 
		identidade = i;
		nascimento = d;
	}
	
	public String toString()
	{
		return "Nome: " + nome + "\nIdentidade: " + identidade + "\nData de nascimento: "+ nascimento;
	}

}
