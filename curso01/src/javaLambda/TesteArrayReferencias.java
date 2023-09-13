package javaLambda;

import polimorfismoContas.ContaCorrente;
import polimorfismoContas.ContaPoupanca;
import polimorfismoContas.Conta;


public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		Conta[] contas = new Conta[3];
		ContaCorrente cc1 = new ContaCorrente(0426, 238082);
		contas[0] = cc1;
		ContaPoupanca cc2 = new ContaPoupanca(0426, 237313);
		contas[1] = cc2;
		
		
//		Conta conta = contas[0];
		ContaCorrente conta = (ContaCorrente) contas[0];
        System.out.println(contas[0].getNumero());

	}

}
