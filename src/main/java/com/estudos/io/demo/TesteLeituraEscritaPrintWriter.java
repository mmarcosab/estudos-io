package com.estudos.io.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class TesteLeituraEscritaPrintWriter {

	public static void main(String[] args) throws IOException {

		//Socket s = new Socket().getInputStream();

		FileInputStream fileInputStream = new FileInputStream("testes.txt");
		//FileInputStream fileInputStream = System.in;
		//FileInputStream fileInputStream = s.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		PrintWriter printWriter = new PrintWriter("teste-escrita-pw.txt");

		String linha = bufferedReader.readLine();

		while(linha != null && !linha.isEmpty()) {
			printWriter.println(linha + " foi lido e escrito");
			linha = bufferedReader.readLine();
		}

		printWriter.close();
		bufferedReader.close();

	}

}
