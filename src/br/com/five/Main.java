package br.com.five;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.five.entidades.Usuario;
import br.com.five.util.CadastraUsuario;
import br.com.five.util.Menus;
import br.com.five.util.RotasDisponiveis;
import br.com.five.util.loginUser;

public class Main {

	public static void main(String[] args) {

		Usuario userJaLogadoPadrao = new Usuario("Jonathan", 12, 12);
		Scanner sc = new Scanner(System.in);
		Menus menu = new Menus();
		List<Usuario> listUsers = new ArrayList<Usuario>();
		listUsers.add(userJaLogadoPadrao);
		RotasDisponiveis rotas = new RotasDisponiveis();
		loginUser login = new loginUser();
		CadastraUsuario cadastro = new CadastraUsuario();
		short op;
		do {
			menu.menuPrincipal();
			op = sc.nextShort();
			switch (op) {
			case 1:
				Usuario cadastrarUsuario = cadastro.cadastrarUsuario();
				listUsers.add(cadastrarUsuario);
				menu.menuUser();
				short op1 = sc.nextShort();
				menuzao(op1, cadastrarUsuario);
			case 2:
				rotas.carregarList();
				menu.menuPrincipal();
				op = sc.nextShort();
				break;
			case 3:
				System.out.println("Digite sua seu cpf: ");
				int cpfUserLogin = sc.nextInt();
				System.out.println("Digite sua senha: ");
				int senhaUser = sc.nextInt();
				Usuario logado = login.logar(listUsers, senhaUser, cpfUserLogin);
				if(logado == null) {
					break;
				}
				menu.menuUser();
				op1 = (short) sc.nextInt();
				menuzao(op1, logado);
			}
		} while (op != 0);
		sc.close();
	}

	public static void menuzao(int op1, Usuario user) {
		Scanner sc = new Scanner(System.in);
		Menus menu = new Menus();
	
		RotasDisponiveis rotas = new RotasDisponiveis();
		while (op1 != 0) {
			if (op1 == 1) {
				rotas.carregarList();
				menu.menuUser();
				op1 = sc.nextShort();
			} else if (op1 == 2) {
				rotas.carregarList();
				System.out.println("Rota escolhida: ");
				int rotaEscolhida = sc.nextInt();
				System.out.println("ano: ");
				int ano = sc.nextInt();
				System.out.println("Mes: ");
				int mes = sc.nextInt();
				System.out.println("Dia: ");
				int dia = sc.nextInt();
				user.reservaRota(rotaEscolhida, ano, mes, dia);
				menu.menuUser();
				op1 = sc.nextShort();
			} else if (op1 == 3) {
				user.rotasReservadas();
				System.out.println("Deseja cancelar qual rota?");
				user.cancelaRota(sc.nextInt());
				menu.menuUser();
				op1 = sc.nextShort();
			} else if (op1 == 4) {
				user.rotasReservadas();
				menu.menuUser();
				op1 = sc.nextShort();
			}
		sc.close();
		}
	}
}
