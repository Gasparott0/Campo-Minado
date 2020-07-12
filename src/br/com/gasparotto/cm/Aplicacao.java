package br.com.gasparotto.cm;

import br.com.gasparotto.cm.modelo.Tabuleiro;
import br.com.gasparotto.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);	
	}
}
