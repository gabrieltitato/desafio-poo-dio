package celular.produto;

import celular.servicos.AparelhoTelefonico;
import celular.servicos.NavegadorInternet;
import celular.servicos.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	public void adicionarNovaAba() {
		System.out.println("NOVA ABA ADICIONADA");
	}

	public void atualizarPagina() {
		System.out.println("PAGINA ATUALIZADA");
	}

	public void exibirPagina() {
		System.out.println("EXIBINDO PAGINA");
	}

	public void ligar() {
		System.out.println("LIGANDO PARA CONTATO");
	}

	public void atender() {
		System.out.println("ATENDENDO CHAMADA");
	}

	public void iniciarCorreioVoz() {
		System.out.println("CORREIO DE VOZ INICIADO");	
	}

	public void tocar() {
		System.out.println("REPRODUZINDO MUSICA");
	}

	public void pausar() {
		System.out.println("MUSICA PAUSADA");
	}
	public void selecionarMusica() {
		System.out.println("SELECIONANDO MUSICA");
	}

}
