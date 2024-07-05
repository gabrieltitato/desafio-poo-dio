package celular;

import celular.produto.Iphone;

public class AparelhoCelular {
	public static void main(String[] args) {
		Iphone celular = new Iphone();
		
		celular.atender();
		celular.pausar();
		celular.exibirPagina();
	}
}
