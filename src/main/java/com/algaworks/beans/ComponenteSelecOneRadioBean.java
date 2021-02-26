package com.algaworks.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class ComponenteSelecOneRadioBean {
	
	private String nome;
	private String sexo;
	private String estadoCivil;
	
	public void atualizar() {
		System.out.println("Sexo: "+this.sexo);
		System.out.println("Estado Civil: "+this.estadoCivil);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil Atualizado."));
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	

}
