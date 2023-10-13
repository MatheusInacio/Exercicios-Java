package javaIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class TesteEscritaFW {
	
	public static void main(String[] args) throws IOException {
		
		BufferedWriter fw =new BufferedWriter(new FileWriter("lorem2.txt"));
//		Writer w = new OutputStreamWriter(os);
//		BufferedWriter bw = new BufferedWriter(w);
		
		fw.write("Eiiitaaa Mainhaaa!! Esse Lorem ipsum é só na sacanageeem!! ");
		fw.write(System.lineSeparator());
		fw.write(System.lineSeparator());
		fw.write("E que abundância meu irmão viuu!! Assim você vai matar o papai. Só digo uma coisa, Domingo ela não vai! Danadaa!! ");
		fw.write(System.lineSeparator());
		fw.write("Você usa o Lorem Ipsum tradicional? Sabe de nada inocente!! Conheça meu lorem que é Tchan, Tchan, Tchannn!!");
		
		fw.write(System.lineSeparator());
		fw.write("Você usa o Lorem Ipsum tradicional? Sabe de nada inocente!! Conheça meu lorem que é Tchan, Tchan, Tchannn!!");
		
		fw.close();
	}

}
