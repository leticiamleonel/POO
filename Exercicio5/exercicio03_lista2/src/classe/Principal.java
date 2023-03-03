package classe;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nome = "Ana";
		String cidade = "Arcos";
		String estado = "Minas Gerais";
		String cep = "00000-000";
		String telefone = "00000-0000";
		String endereco = "rua Tal";
		
		Empresa e = new Empresa(nome, cidade, estado, cep, telefone, endereco);
		System.out.println("Os dados são: " + e.toString());
	}

}
