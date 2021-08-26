package com.estudos.io.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class TesteLeituraEscrita {

	public static void main(String[] args) throws IOException {

		//Socket s = new Socket().getInputStream();

		FileInputStream fileInputStream = new FileInputStream("testes.txt");
		//FileInputStream fileInputStream = System.in;
		//FileInputStream fileInputStream = s.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		OutputStream fileOutPutStream = new FileOutputStream("teste-escrita.txt");
		//OutputStream fileOutPutStream = System.out;
		//OutputStream fileOutPutStream = s.getOutputStream();
		Writer writer = new OutputStreamWriter(fileOutPutStream);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);

		String linha = bufferedReader.readLine();

		while(linha != null && !linha.isEmpty()) {
			bufferedWriter.write(linha + " foi lido e escrito");
			bufferedWriter.newLine();
			linha = bufferedReader.readLine();
		}

		bufferedWriter.close();
		bufferedReader.close();

	}

}
