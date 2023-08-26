package javaCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestaSet {

	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<>();
//		Set<String> alunos = new HashSet<>();
		alunos.add("Matheus");
		alunos.add("Gomes");
		alunos.add("Inacio");
		alunos.add("Matheus");
		
		System.out.println(alunos.size());
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(alunos.size());
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

		System.out.println(alunos.contains("Matheus"));
		
		List<String> alunosLista = new ArrayList<>(alunos);
		Collections.sort(alunosLista);
		System.out.println(alunosLista);

	}

}
