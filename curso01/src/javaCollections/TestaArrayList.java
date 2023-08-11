package javaCollections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaArrayList {

	public static void main(String[] args) {

		String cidade1 = "Jacarezinho";
		String cidade2 = "Cambara";
		String cidade3 = "Andirá";

		ArrayList<String> cidades = new ArrayList<>();
		cidades.add(cidade1);
		cidades.add(cidade2);
		cidades.add(cidade3);
		
        //cursos.remove(1);
		
		Collections.sort(cidades);

		for (int i = 0; i < cidades.size(); i++) {
			System.out.println("Cidade : " + cidades.get(i));
		}
	}

}
