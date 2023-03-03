package principal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import entidades.Funcionario;
import entidades.ChefeDeDepartamento;

public class Principal {

	public static void main(String[] args) throws ParseException
	{
		// TODO Auto-generated method stub
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");		
		
		Date dNascF = sdf.parse("30/04/1945");
		Date dAdmF = sdf.parse("08/07/2022");
		Date dNascC = sdf.parse("08/03/1972");
		Date dAdmC = sdf.parse("27/01/2015");
		Date prom = sdf.parse("15/07/2020");
		
		Funcionario funci = new Funcionario("Pedro", 16573218, dNascF, dAdmF, (float) 3978.50);
		System.out.println(funci);
		
		ChefeDeDepartamento chefe = new ChefeDeDepartamento("João", 13743192, dNascC, dAdmC, (float) 9872.65,
				"Engenharia", prom);
		System.out.println(chefe);

	}

}
