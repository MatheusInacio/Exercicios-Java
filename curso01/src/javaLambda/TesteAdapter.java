package javaLambda;

import polimorfismoContas.Conta;
import polimorfismoContas.ContaCorrente;

public class TesteAdapter {
	
	public static void main(String[] args) {
        ContasRepository guardador = new ContasRepository();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getNumero());

    }

}
