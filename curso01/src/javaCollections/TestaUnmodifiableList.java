package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaUnmodifiableList {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Pensamento Computacional", "Matheus");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		// Collections.sort(aulasImutaveis);
		// java.lang.UnsupportedOperationException
		System.out.println(aulasImutaveis);

		List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulasMutaveis);

		System.out.println(aulasMutaveis);

		System.out.println(javaColecoes);

	}
}