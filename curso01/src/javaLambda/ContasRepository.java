package javaLambda;

import polimorfismoContas.Conta;

public class ContasRepository {

	private Conta[] referencias;
	private int posicaoLivre;

	public ContasRepository() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}

	public void adiciona(Conta ref) {
		referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}

}
