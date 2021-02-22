package com.algaworks.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class CadastroUsuarioBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String login;
	private String nome;
	private String senha;
	
	public void cadastrar() {
		System.out.println("Login: " + this.login);
		System.out.println("Nome: " + this.nome);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastro efetuado."));
	}
	
	public void verificarDisponibilidadeLogin() {
		//Simular uma demora no carregamento
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}
		
		FacesMessage msn = null;
		System.out.println("Verificando disponibilidade." + this.login);
		
		if("joao".equalsIgnoreCase(this.login)) {
			msn = new FacesMessage("Login já está em uso.");
			msn.setSeverity(FacesMessage.SEVERITY_WARN);
		}else {
			msn = new FacesMessage("Login disponivel.");
		}
		
		FacesContext.getCurrentInstance().addMessage(null, msn);
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
