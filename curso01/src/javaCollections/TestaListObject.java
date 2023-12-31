package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaListObject {

	public static void main(String[] args) {

		Aula a1 = new Aula("Revistando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

		List<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);

		System.out.println("sem ordena��o");
		System.out.println(aulas);
		System.out.println();

		System.out.println("ordenado");
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println();

		System.out.println("ordenado por menor tempo");
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		System.out.println();
		
		System.out.println("ordenado por maior tempo");
		aulas.sort(Comparator.comparing(Aula::getTempo).reversed());
		System.out.println(aulas);
		System.out.println();
	}

}
