package Entidades;

public class automoveldeLuxo extends automovelBasico
{
	private static final byte NUMEROMAXIMODEPRESTACOES = 36;
	
	private boolean direcaoHidraulica;
	private boolean cambioAutomatico;
	private boolean vidrosETravasEletricos;
	
	public automoveldeLuxo(String m, String c, byte comb, boolean retro, boolean limpa, boolean radio, boolean dir, boolean camb, boolean vidro ) 
	{
		// TODO Auto-generated constructor stub
		super(m,c,comb,retro,limpa,radio);
		direcaoHidraulica = dir;
		cambioAutomatico = camb;
		vidrosETravasEletricos = vidro;
	}

	public automoveldeLuxo(String m, String c, byte comb)
	{
		super(m,c,comb);
		direcaoHidraulica = true;
		cambioAutomatico = true;
		vidrosETravasEletricos = true;
	}
	
	public float quantoCusta()
	{
		float preco = super.quantoCusta();
		if (direcaoHidraulica) preco += 5340;
		if (cambioAutomatico) preco += 7500;
		if (vidrosETravasEletricos) preco += 2320;
		return preco;
	}
	
	public byte quantasPrestações()
	{
		return NUMEROMAXIMODEPRESTACOES;
	}
	
	public String toString()
	{
		String resultado = super.toString();
		
		if (direcaoHidraulica)
			resultado += "Com direção hidráulica\n";
		if (cambioAutomatico)
			resultado += "Com câmbio automático\n";
		if (vidrosETravasEletricos)
			resultado += "Com vidros e travas elétricas\n";
		return resultado;
	}
	
	
}
