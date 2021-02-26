package com.algaworks.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.algaworks.modelo.Interesse;

@ManagedBean
@ViewScoped
public class SelectOneListboxBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String profissao;
	private Interesse interesse;
	
	public static final List<Interesse> INTERESSES = new ArrayList<>();	
	static {
		INTERESSES.add(new Interesse("Esportes", "esportes"));
		INTERESSES.add(new Interesse("Computação", "computacao"));
		INTERESSES.add(new Interesse("Cinema", "cinema"));
		INTERESSES.add(new Interesse("Leitura", "leitura"));
	}
	
	public List<Interesse> getInteresses() {
		return INTERESSES;
	}

	public void atualizar() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Profissão: "+this.profissao);
		System.out.println("Interesse: "+this.interesse.getDescricao());
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado com sucesso."));
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Interesse getInteresse() {
		return interesse;
	}

	public void setInteresse(Interesse interesse) {
		this.interesse = interesse;
	}
}
