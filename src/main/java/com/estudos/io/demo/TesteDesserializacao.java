package com.estudos.io.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class TesteDesserializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("cliente.bin"));

		Cliente cliente = (Cliente) inputStream.readObject();

		System.out.println(cliente.nome);
		System.out.println(cliente.cpf);
		System.out.println(cliente.idade);


		inputStream.close();

	}
}
