package aplicacao;
import construtores.RoboSimples0;

public class main {

	public static void main(String[] args) 
	{
		// e)
				RoboSimples0 groucho = new RoboSimples0("Groucho",20,10,'S');
				RoboSimples0 chico = new RoboSimples0("Chico");
				RoboSimples0 semNome = new RoboSimples0();
				
		// f)
				groucho.moverPasso(10);
				chico.mudarDirecao('L');
				chico.moverPasso(5);
				semNome.mover();
				
		// g)
				System.out.println(groucho);
				System.out.println(chico);
				System.out.println(semNome);


	}

}
