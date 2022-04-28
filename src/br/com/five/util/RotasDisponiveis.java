package br.com.five.util;

import br.com.five.entidades.Rota;

public class RotasDisponiveis {

	Rota rota1 = new Rota("Aeroporto Santos Dumont (RJ)", "Congonhas (SP)", 400.0);
	Rota rota2 = new Rota("Aeroporto de Guarulhos (SP)", "Recife (PE)", 500.0);
	Rota rota3 = new Rota("Aeroporto de Guarulhos (SP)", "Porto Alegre (RS):", 300.00);
	Rota rota4 = new Rota("Aeroporto de Confins (MG)", "Guarulhos  (SPF)", 600.00);
	Rota rota5 = new Rota("Aeroporto de Guarulhos (SP)", "Salvador (BA)", 400.00);
	public Rota[] listasDeRotas = new Rota[] { rota1, rota2, rota3, rota4, rota5 }; 

	public void carregarList() {
		for (int i = 0; i < listasDeRotas.length; i++) {
			System.out.println("Rota: " + i + " " + listasDeRotas[i]);
		}
	}

	public Rota escolherRota(int escolhida) {
		return listasDeRotas[escolhida];
	}

}
