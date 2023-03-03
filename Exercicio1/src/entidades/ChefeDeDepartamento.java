package entidades;
import java.util.Date;

public class ChefeDeDepartamento extends Funcionario 
	{
	private String departamento;
	private Date promocaoaChefe;
	
	public ChefeDeDepartamento(String nome, int id, Date nasc, Date adm, float sal, String dep, Date prom)
	{
		// TODO Auto-generated constructor stub
		super(nome, id, nasc, adm, sal);
		departamento = dep;
		promocaoaChefe = prom;
	}
	
	public String toString()
	{
		String resultado;
		resultado = super.toString() + "\n";
		resultado = resultado + "Departamento: " + departamento + "\n";
		resultado = resultado + "Data de promoção ao cargo: " + promocaoaChefe;
		return resultado;
	}
	
	public String qualDepartamento()
	{
		return departamento;
	}
}
