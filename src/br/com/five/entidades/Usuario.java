package br.com.five.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.five.util.RotasDisponiveis;

public class Usuario {

	private String nome;
	private int cpf;
	private int senha;

	private List<Rota> rotasReservadas = new ArrayList<Rota>();
	private RotasDisponiveis rotas = new RotasDisponiveis();

	public Usuario(String nome, int cpf, int senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}
	public int getSenha() {
		return senha;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void reservaRota(int index, int ano, int mes, int dia) {
		Rota rota =  rotas.escolherRota(index);
		@SuppressWarnings("deprecation")
		Date dataRota = new Date(ano, mes, dia);
		rota.setData(dataRota);
		rotasReservadas.add(rotas.escolherRota(index));
		System.out.println("Rota reservada com sucesso, suas reservas são: " + rotasReservadas);

	}

	public void rotasReservadas() {
		if (rotasReservadas.size() <=0) {
			System.out.println("Sem rotas reservadas");
		} else {
			for (int i = 0; i < rotasReservadas.size(); i++) {
				System.out.println("*******Suas rotas reservadas são******* \n Rota:" + i + rotasReservadas.get(i));
			}

		}
	}
	public void cancelaRota(int rotaASerCancelada) {
		rotasReservadas();
		System.out.println("Rota a ser cancelada -> ");
		if (rotaASerCancelada < rotasReservadas.size() - 1 || rotaASerCancelada > rotasReservadas.size()) {
			System.out.println("Rota inválida.");
		} else {
			rotasReservadas.remove(rotaASerCancelada);
			System.out.println("Cancelada com sucesso!");
		}
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", cpf=" + cpf + ", rotasReservadas=" + rotasReservadas + ", rotas=" + rotas
				+ "]";
	}

}
