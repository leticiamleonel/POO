package construtores;

public class RoboSimples0 
{
	String nomeDoRobo;
	int posicaoX, posicaoY;
	char direcao;
	
	// a)
		RoboSimples0(String n, int posX, int posY, char dir)
		{
			nomeDoRobo = n;
			posicaoX = posX;
			posicaoY = posY;
			direcao = dir;
		}
		
		RoboSimples0(String n)
		{
			nomeDoRobo = "robo";
			posicaoX = 0;
			posicaoY = 0;
			direcao = 'N';
			
		}
		
		RoboSimples0()
		{
			nomeDoRobo = "";
			posicaoX = 0;
			posicaoY = 0;
			direcao = 'N';
		}
		
		// b)
		public void mover() 
		{
			if(direcao == 'N') 
			{
				posicaoX = posicaoX + 1;
			}
			if(direcao == 'S') 
			{
				posicaoX = posicaoX - 1;
			}
			if(direcao == 'O') 
			{
				posicaoY = posicaoY + 1;
			}
			if(direcao == 'L') 
			{
				posicaoY = posicaoY - 1;
			}
		}
		
		public void moverPasso(int passos) 
		{
			if(direcao == 'N') 
			{
				posicaoX = posicaoX + passos;
			}
			if(direcao == 'S') 
			{
				posicaoX = posicaoX - passos;
			}
			if(direcao == 'O') 
			{
				posicaoY = posicaoY + passos;
			}
			if(direcao == 'L') 
			{
				posicaoY = posicaoY - passos;
			}
		}
		
		// c)
		public void mudarDirecao(char direcaoF) 
		{
			direcao = direcaoF;
		}
		
		// d)
		public String toString() {
			String posicao = "Nome do robô:" + nomeDoRobo + "\n";
			posicao = posicao + "Posição do robô:("+ posicaoX +","+ posicaoY +")"+"\n";
			posicao = posicao + "Direção de robô:" + direcao;
			posicao = posicao + "\n";
			return posicao;
			}
}
