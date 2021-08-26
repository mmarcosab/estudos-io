package com.estudos.io.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class TesteLeituraEscritaPrintStream {

	public static void main(String[] args) throws IOException {

		//Socket s = new Socket().getInputStream();

		FileInputStream fileInputStream = new FileInputStream("testes.txt");
		//FileInputStream fileInputStream = System.in;
		//FileInputStream fileInputStream = s.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		PrintStream printStream = new PrintStream("teste-escrita-ps.txt");
		//Pode usar um file no construtor tbm:
		//PrintStream printStream = new PrintStream(new File("teste-escrita-ps.txt"));


		String linha = bufferedReader.readLine();

		while(linha != null && !linha.isEmpty()) {
			printStream.println(linha + " foi lido e escrito");
			linha = bufferedReader.readLine();
		}

		printStream.close();
		bufferedReader.close();

	}

}
