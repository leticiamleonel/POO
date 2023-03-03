package classe;
import java.util.Scanner;

public class Empresa {
	private String nome;
	private String endereco;
	private String cidade;
	private String estado;
	private String cep;
	private String telefone;

	public Empresa(String nome, String endereco, String cidade, String estado, String cep, String telefone) 
	{
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getTelefone() 
	{
		return telefone;
	}
	
	public void setTelefone(String telefone) 
	{
		this.telefone = telefone;
	}
	
	public String getCep() 
	{
		return cep;
	}
	
	public void setCep(String cep) 
	{
		this.cep = cep;
	}
	
	public String getCidade() 
	{
		return cidade;
	}
	
	public void setCidade(String cidade) 
	{
		this.cidade = cidade;
	}
	
	public String getEndereco() 
	{
		return endereco;
	}
	
	public void setEndereco(String endereco) 
	{
		this.endereco = endereco;
	}
	
	public String getEstado()
	{
		return estado;
	}
	
	public void setEstado(String estado)
	{
		this.estado = estado;
	}
	
	public String toString()
	{
		return "Nome: " + this.nome + ", " + "Endereço: " + this.endereco + ", " + "Cidade: " + this.cidade + ", " + "Estado: " + this.estado + ", " + "Cep: " + this.cep + ", " + "Telefone: " + this.telefone + ".";	
	}
	
	
}

