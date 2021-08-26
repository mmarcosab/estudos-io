package com.estudos.io.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class TesteLeituraEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		//Socket s = new Socket().getInputStream();

		FileInputStream fileInputStream = new FileInputStream("testes.txt");
		//FileInputStream fileInputStream = System.in;
		//FileInputStream fileInputStream = s.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		FileWriter fileWriter = new FileWriter("teste-escrita-fw.txt");

		String linha = bufferedReader.readLine();

		while(linha != null && !linha.isEmpty()) {
			fileWriter.write(linha + " foi lido e escrito");
			fileWriter.write(System.lineSeparator());
			linha = bufferedReader.readLine();
		}

		fileWriter.close();
		bufferedReader.close();

	}

}
