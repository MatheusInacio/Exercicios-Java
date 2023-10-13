package javaIO;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPS {

	public static void main(String[] args) throws IOException {

		PrintStream ps = new PrintStream("lorem2.txt");

		ps.println("Eiiitaaa Mainhaaa!! Esse Lorem ipsum é só na sacanageeem!! ");
		ps.println(
				"E que abundância meu irmão viuu!! Assim você vai matar o papai. Só digo uma coisa, Domingo ela não vai! Danadaa!! ");
		ps.println(
				"Você usa o Lorem Ipsum tradicional? Sabe de nada inocente!! Conheça meu lorem que é Tchan, Tchan, Tchannn!!");
		ps.println("Eiiitaaa Mainhaaa!! Esse Lorem ipsum é só na sacanageeem!! ");

		ps.println();
		
		ps.close();
	}

}
