package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaClasseAnonima {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Pensamento Computacional", "Matheus");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

		Aluno a2 = new Aluno("Aluno 2", 873814);
		Aluno a3 = new Aluno("Aluno 3", 873815);
		Aluno a1 = new Aluno("Aluno 1", 873813);
		Aluno a4 = new Aluno("Aluno 4", 853811);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println(javaColecoes.buscaMatriculado(873814));
//		System.out.println(javaColecoes.buscaMatriculado(8738514));

		List<Aluno> l = new ArrayList<>();
		l.add(a1);
		l.add(a2);
		l.add(a3);
		l.add(a4);

		// Com classe anonima
		l.sort(new Comparator<Aluno>() {
			@Override
			public int compare(Aluno a1, Aluno a2) {
				return a1.getNome().compareTo(a2.getNome());
			}
		});
		System.out.println("Ordenado por nome: " + l.toString());

		// Com função lambda
//		l.sort((Aluno aluno1, Aluno aluno2) -> {
//			return Integer.compare(aluno1.getNumeroMatricula(), aluno2.getNumeroMatricula());
//		});
		// Com auto return e em uma linha
		l.sort((aluno1, aluno2) -> Integer.compare(aluno1.getNumeroMatricula(), aluno2.getNumeroMatricula()));
		System.out.println("Ordenado por matrícula: ");
		l.forEach((aluno) -> System.out.println(aluno));
	}

}
