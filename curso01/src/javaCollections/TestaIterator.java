package javaCollections;

import java.util.Iterator;

public class TestaIterator {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Pensamento Computacional", "Matheus");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		
		Aluno a1 = new Aluno("Aluno 1", 873813);
		Aluno a2 = new Aluno("Aluno 2", 873814);
		Aluno a3 = new Aluno("Aluno 3", 873815);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		Iterator<Aluno> iterator = javaColecoes.getAlunos().iterator();
		while(iterator.hasNext()) {
			Aluno proximo = iterator.next();
			System.out.println(proximo);
		}

	}
}