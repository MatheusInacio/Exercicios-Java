package javaIO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class TesteEscrita {
	
	public static void main(String[] args) throws IOException {
		
		OutputStream os = new FileOutputStream("lorem2.txt");
		Writer w = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(w);
		
		bw.write("Eiiitaaa Mainhaaa!! Esse Lorem ipsum é só na sacanageeem!! ");
		bw.newLine();
		bw.newLine();
		bw.write("E que abundância meu irmão viuu!! Assim você vai matar o papai. Só digo uma coisa, Domingo ela não vai! Danadaa!! ");
		bw.newLine();
		bw.write("Você usa o Lorem Ipsum tradicional? Sabe de nada inocente!! Conheça meu lorem que é Tchan, Tchan, Tchannn!!");
		
		bw.close();
	}

}
