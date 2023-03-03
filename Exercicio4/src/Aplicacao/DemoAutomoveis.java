package Aplicacao;

import Entidades.automovel;
import Entidades.automovelBasico;
import Entidades.automoveldeLuxo;

public class DemoAutomoveis {

	public static void main(String[] args) {

		//Automovél
		automovel auto = new automovel("Fusca","vermelho",automovel.MOVIDOAALCOOL);
		
		System.out.println(auto);
		System.out.println(auto.quantoCusta());
		System.out.println(auto.quantasPrestações());

		//AutomovelBáscico
		automovelBasico autoBasico = new automovelBasico("Corsa","cinza",automovel.MOVIDOAGASOLINA, true,true,false);

		System.out.println(autoBasico);
		System.out.println(autoBasico.quantoCusta());
		System.out.println(autoBasico.quantasPrestações());

		//AutomovelDeLuxo
		automoveldeLuxo autoLuxo = new automoveldeLuxo("Classe A","azul",automovel.MOVIDOAGASOLINA);
		
		System.out.println(autoLuxo);
		System.out.println(autoLuxo.quantoCusta());
		System.out.println(autoLuxo.quantasPrestações());

	}
}
