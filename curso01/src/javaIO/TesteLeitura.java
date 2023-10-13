package javaIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		InputStream fis = new FileInputStream("lorem2.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String linha;

		// Leia cada linha do arquivo
		while ((linha = br.readLine()) != null) {
			System.out.println(linha);
		}

		br.close();
		fis.close();
	}

}
