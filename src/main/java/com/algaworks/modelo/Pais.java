package com.algaworks.modelo;

public class Pais {

	private String nome;
	private int codigo;

	public Pais(int codigo, String nome) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}
	
}
