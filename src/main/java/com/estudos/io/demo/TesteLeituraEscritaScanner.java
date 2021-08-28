package com.estudos.io.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class TesteLeituraEscritaScanner {

	public static void main(String[] args) throws IOException {

		//O especialista de leitura é o Scanner
		//aqui não se usa string para definir o nome do arquivo
		// usamos a classe File
		Scanner scanner = new Scanner(new File("testes.csv"));
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
			System.out.println(valor1);
			//tambem eh possivel usar metodos como o nextInt() ao inves do next()
			//mas e se estamos lendo um numero em dinheiro por exemplo e estsamos usando regras americanas?
			//podemos usar essa linha abaixo:
			//linhaScanner.useLocale(Locale.US);


			linha = scanner.nextLine();
		}

		printWriter.close();
		scanner.close();

	}

}
