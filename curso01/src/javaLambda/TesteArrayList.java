package javaLambda;

import java.util.ArrayList;
import java.util.List;

import polimorfismoContas.Conta;
import polimorfismoContas.ContaCorrente;
import polimorfismoContas.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<>();
		ContaCorrente cc1 = new ContaCorrente(0426, 238082);
		contas.add(cc1);
		ContaPoupanca cc2 = new ContaPoupanca(0426, 237313);
		contas.add(cc2);

		contas.set(1, new ContaPoupanca(0426, 127313));

//		Conta conta = contas[0];
		ContaPoupanca conta = (ContaPoupanca) contas.get(1);
		System.out.println(conta.toString());
		
		
		
	}

}
