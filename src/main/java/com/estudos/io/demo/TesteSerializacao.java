package com.estudos.io.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.Scanner;

@SpringBootApplication
public class TesteSerializacao {

	public static void main(String[] args) throws IOException {

		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("cliente.bin"));

		Cliente cliente = new Cliente();
		cliente.cpf = "12345678911";
		cliente.nome = "teste";
		cliente.idade = 27;

		outputStream.writeObject(cliente);

		outputStream.close();

	}
}
