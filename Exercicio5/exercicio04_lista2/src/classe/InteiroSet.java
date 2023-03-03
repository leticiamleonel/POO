package classe;
import java.util.Arrays;

public class InteiroSet {
	
	private static final int minimo = 0;
	private static final int maximo = 100;
	private boolean [] t;
	

	public InteiroSet() 
	{
		// TODO Auto-generated constructor stub
		t = new boolean[maximo + 1];
	}

	public static InteiroSet union (InteiroSet c1, InteiroSet c2)
	{
		InteiroSet u = new InteiroSet();
		for (int i = 0; i <= maximo; i++)
		{
			u.t[i] = c1.t[i] | c2.t[i];
		}
		
		return u;
	}
	
	public static InteiroSet intersecao (InteiroSet c1, InteiroSet c2)
	{
		InteiroSet u = new InteiroSet();
		for(int i = 0; i <= maximo; i++)
		{
			u.t[i] = c1.t[i] & c2.t[i];
		}
		
		return u;
	}
	
	public void insereElemento(int i)
	{
		t[i] = true;
	}
	
	public void deleteElemento(int i)
	{
		t[i] = false;
	}
	
	public String toSetString()
	{
		StringBuffer sb = new StringBuffer();
		for (int i  = 0; i <= maximo; i++)
		{
			if (t[i])
				sb.append(i).append(",");
			else 
				sb.append("-").append(",");
		}
		
		return sb.toString();
	}
	
	public static boolean ehIgualTo (InteiroSet c1, InteiroSet c2)
	{
		return Arrays.equals(c1.t, c2.t);
	}
	
}

