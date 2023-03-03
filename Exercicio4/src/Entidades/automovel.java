package Entidades;

public class automovel 
{
	public static final byte MOVIDOAGASOLINA = 1;
	public static final byte MOVIDOAALCOOL = 2;
	public static final byte MOVIDOADIESEL = 3;
	public static final byte MOVIDOAGAS = 4;
	private static final byte NUMEROMAXIMODEPRESTACOES = 24;
	
	private String modelo;
	private String cor; 
	private byte combustivel;

	public automovel(String m,String c,byte comb) 
	{
		// TODO Auto-generated constructor stub
		modelo = m;
		cor = c;
		combustivel = comb;
	}
	
	public float quantoCusta()
	{
		float preco = 0;
		switch(combustivel)
		{
		case MOVIDOAGASOLINA: preco = 12000.0f; break;
		case MOVIDOAALCOOL: preco = 10500.0f; break;
		case MOVIDOADIESEL: preco = 11000.0f; break;
		case MOVIDOAGAS: preco = 13000.0f; break;
		}
		return preco;
	}
	
	public byte quantasPrestações()
	{
		return NUMEROMAXIMODEPRESTACOES;
	}
	
	public String toString()
	{
		String resultado;
		resultado = modelo+" "+cor+"\n";
		switch(combustivel)
		{
		case MOVIDOAGASOLINA: resultado += "Movido a Gasolina\n"; break;
		case MOVIDOAALCOOL: resultado += "Movido a Álcool\n"; break;
		case MOVIDOADIESEL: resultado += "Movido a Diesel\n"; break;
		case MOVIDOAGAS: resultado += "Movido a Gás\n"; break;
		}
		return resultado;
	}
}
