package Entidades;

public class automovelBasico extends automovel
{
	private boolean retrovisorDoLadoDoPassageiro;
	private boolean limpadorDoVidroTraseiro;
	private boolean radioAMFM;
	
	public automovelBasico(String m, String c, byte comb, boolean retro, boolean limpa, boolean radio)
	{
		// TODO Auto-generated constructor stub
		
		super(m,c,comb);
		retrovisorDoLadoDoPassageiro = retro;
		limpadorDoVidroTraseiro = limpa;
		radioAMFM = radio;
	}
	
	automovelBasico(String m,String c,byte comb)
	{
		super(m, c,comb);
		retrovisorDoLadoDoPassageiro = true;
		limpadorDoVidroTraseiro = true;
		radioAMFM = true;
	}
	
	public float quantoCusta()
	{
		float preco = super.quantoCusta();
		if (retrovisorDoLadoDoPassageiro) preco += 280;
		if (limpadorDoVidroTraseiro) preco += 650;
		if (radioAMFM) preco += 190;
		return preco;
	}
	
	public String toString()
	{
		String resultado = super.toString();
		if (retrovisorDoLadoDoPassageiro)
			resultado += "Com retrovisor do lado do passageiro\n";
		if (limpadorDoVidroTraseiro)
			resultado += "Com limpador do vidro traseiro\n";
		if (radioAMFM)
			resultado += "Com rádio AM/FM\n";
		return resultado;
	}
	
}
