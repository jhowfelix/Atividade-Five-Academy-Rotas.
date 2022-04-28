package br.com.five.entidades;

import java.util.Date;

public class Rota {
	private String origem;
	private String destino;
	private Date data;
	private Double Valor;

	public Rota(String origem, String destino, Double valor) {
		super();
		this.origem = origem;
		this.destino = destino;
		Valor = valor;
	}

	public Rota(String origem, String destino, Date data, Double valor) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.data = data;
		Valor = valor;
	}

	public Rota() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "origem: " + origem + ", destino: " + destino + ", Valor: " + Valor + "Data: " + data;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Double getValor() {
		return Valor;
	}

	public void setValor(Double valor) {
		Valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
