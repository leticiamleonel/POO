package entidades;
import java.util.Date;

public class Funcionario extends Pessoa
{
	private Date admissao;
	private float salario;
	
	public Funcionario(String nome, int id, Date nasc, Date adm, float sal) 
	{
		// TODO Auto-generated constructor stub
		super(nome, id, nasc);
		admissao = adm;
		salario = sal;
	}
	
	public String toString()
	{
		String resultado;
		resultado = super.toString() + "\n";
		resultado = resultado + "Data de admissão: " + admissao + "\n";
		resultado = resultado + "Salário: " + salario;
		return resultado;
	}
	
	final public float qualSalario()
	{
		return salario;
	}
	
}
