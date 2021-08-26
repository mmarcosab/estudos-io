package com.estudos.io.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		//Sobre a saída
		//OutPutStream   ->   Writer

		//Fluxo de entrada com arquivo
		OutputStream fileOutPutStream = new FileOutputStream("teste-escrita.txt");
		Writer writer = new OutputStreamWriter(fileOutPutStream);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);

		bufferedWriter.write("testando a escrita desse arquivo");
		bufferedWriter.newLine();
		bufferedWriter.write("segunda linha");

		bufferedWriter.close();

	}

}
