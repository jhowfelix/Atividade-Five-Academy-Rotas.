package br.com.five.util;

import java.util.Scanner;

import br.com.five.entidades.Usuario;

public class CadastraUsuario {
	Scanner sc = new Scanner(System.in);
	public Usuario cadastrarUsuario() {
		System.out.println("Bem vindo a criação de usuário, insira seu nome: ");
		String nome = sc.next();
		System.out.println("CPF: ");
		int cpf = sc.nextInt();
		System.out.println("Senha: ");
		int senha = sc.nextInt();
		Usuario user = new Usuario(nome, cpf, senha);
		return user;
	}
	
}
