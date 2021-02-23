package com.algaworks.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class ComponenteTextAreaBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String sobre;
	
	public void atualizar() {
		System.out.println("Sobre Atualizado: "+this.sobre);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Sobre atuliazado."));
	}
	
	public List<String> completarTexto(String consulta){
		List<String> resultados = new ArrayList<String>();
		if(consulta.startsWith("Pal")) {
			resultados.add("Palmas");
			resultados.add("Palmeiras");
			resultados.add("Palmeirantes");
			resultados.add("Palminha");
		}else if(consulta.startsWith("Rodr")) {
			resultados.add("Rodrigo");
			resultados.add("Rodrigo Oliveira");
			resultados.add("Rodrigo Oliveira Porto");
		}
		return resultados;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobre() {
		return sobre;
	}
	public void setSobre(String sobre) {
		this.sobre = sobre;
	}
	
	

}
