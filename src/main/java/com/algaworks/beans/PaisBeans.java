package com.algaworks.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.algaworks.modelo.Pais;

@ManagedBean
@SessionScoped
public class PaisBeans implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public static final List<Pais> PAISES = new ArrayList<>();
	private String nome;
	private Pais pais;
	
	static {
		PAISES.add(new Pais(1, "Alemanha"));      
		PAISES.add(new Pais(2, "Argélia"));       
		PAISES.add(new Pais(3, "Argentina"));     
		PAISES.add(new Pais(4, "Bolívia"));       
		PAISES.add(new Pais(5, "Brasil"));        
		PAISES.add(new Pais(6, "Bulgaria"));      
		PAISES.add(new Pais(7, "Espanha"));       
		PAISES.add(new Pais(8, "Estados Unidos"));
		PAISES.add(new Pais(9, "Butão do Sul"));                       
	}
	
	public List<Pais> sugerirPaises(String consulta) {
		List<Pais> paisesSugeridos = new ArrayList<>();
		
		for(Pais pais : PAISES) {
			if(pais.getNome().toLowerCase().startsWith(consulta.toLowerCase())) {
				paisesSugeridos.add(pais);
			}
		}
		
		return paisesSugeridos;
	}
	
	public void atualizar() {
		if(this.pais == null) {
			adicionarMensagem("Perfil atualizado sem pais.");			
		}else {
			adicionarMensagem("Perfil atualizado com o pais -> "+this.pais.getNome()  + " [ "+this.pais.getCodigo()+"].");			
		}
	}
	
	public void adicionarMensagem(String msg) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(msg));		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public static List<Pais> getPaises() {
		return PAISES;
	}
}
