package com.algaworks.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;



@ManagedBean
@SessionScoped
public class PerfilUsuarioBeanEstadoCidade implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String estado;
	private String cidade;
	private String bairro;
	private List<String> estados = new ArrayList<>();
	private List<String> cidades = new ArrayList<>();
	private List<String> bairros = new ArrayList<>();
	
	
	
	public PerfilUsuarioBeanEstadoCidade() {
		estados.add("MG");
		estados.add("SP");
		estados.add("RJ");
		estados.add("TO");
	}
	
	public void carregarCidades() {
		cidades.clear();
		if("MG".equals(estado)) {
			cidades.add("Uberlândia");
			cidades.add("Uberaba");
			cidades.add("Belo Horizonte");
		}else if("SP".equals(estado)) {
			cidades.add("São Paulo");
			cidades.add("Franca");
			cidades.add("São José do Rio Preto");
		}else if("RJ".equals(estado)) {
			cidades.add("Rio de Janeiro");
			cidades.add("Niteroi");			
		}else if("TO".equals(estado)) {
			cidades.add("Palmas");
			cidades.add("Paraíso");
			cidades.add("Dianópolis");
		}
	}
	
	public void carregarBairros() {
		bairros.clear();
		if("Uberlândia".equals(cidade)) {
			bairros.add("Uberlândia centro");
			bairros.add("Uberlândia Pariferia");
		}else if("Uberaba".equals(cidade)) {
			bairros.add("Uberaba centro");
		}
	}

	public void atualizar() {
		System.out.println("Estado:"+this.estado);
		System.out.println("Cidade:"+this.cidade);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil Atualizado!"));		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public List<String> getEstados() {
		return estados;
	}

	public List<String> getCidades() {
		return cidades;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public List<String> getBairros() {
		return bairros;
	}
}
