package com.estudos.io.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

@SpringBootApplication
public class TesteEncoding {

	public static void main(String[] args) throws IOException {

		//O especialista de leitura é o Scanner
		//aqui não se usa string para definir o nome do arquivo
		// usamos a classe File
		Scanner scanner = new Scanner(new File("testes.csv"), "UTF-8"); //muito legal setar o encoding aqui já
		//o scanner possui muitos metodos de auto nivel, o nextLine() por exemplo é bem util

		PrintWriter printWriter = new PrintWriter("teste-escrita-lido-scanner.txt");

		String linha = scanner.nextLine();
		//o hasNext() ajuda a verificar se ha uma proxima linha
		while(scanner.hasNext()) {
			printWriter.println(linha + " foi lido e escrito");

			//usando split para separar trechos de texto com regex
			//String[] valores = linha.split(",");
			//System.out.println(valores[2]);

			//usando scanner para separar por virgulas
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(",");
			String valor1 = linhaScanner.next();
			String valor2 = linhaScanner.next();
			String valor3 = linhaScanner.next();

			String valorFormatado = String.format("%s - %s, %s:", valor1, valor2, valor3);
			//vale salientar que %s - String, %f - float e há vários outros na documentação  (https://docs.oracle.com/javase/tutorial/java/data/numberformat.html)
			System.out.println(valorFormatado);

			linha = scanner.nextLine();
		}

		printWriter.close();
		scanner.close();

	}

}
