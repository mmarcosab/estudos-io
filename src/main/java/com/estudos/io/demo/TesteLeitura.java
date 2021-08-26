package com.estudos.io.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		//Sobre a entrada
		//InputStream   ->   Reader


		//Se for trabalhar com texto usar Reader
		// pode lançar FileNotFoundException mas podemos usar a IOException
		FileInputStream fileInputStream = new FileInputStream("testes.txt");   //define a entrada
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); //transforma bytes em caracteres
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader); //devolve linha a linha, essa classe sabe fazer isso

		String linha = bufferedReader.readLine();

		while(linha != null) {
			System.out.println(linha);
			linha = bufferedReader.readLine();
		}

		bufferedReader.close();

		//Se for trabalhar com pdf usar Stream

	}

}
