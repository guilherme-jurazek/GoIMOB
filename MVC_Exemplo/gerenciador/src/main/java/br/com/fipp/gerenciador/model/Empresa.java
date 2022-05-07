package br.com.fipp.gerenciador.model;

import java.util.Date;

public class Empresa {

	private Integer id;
	private String nome;
	private String satisfacao;
	private Date dataAbertura = new Date();
	
	
	
	public String getSatisfacao() {
		return satisfacao;
	}
	public void setSatisfacao(String satisfacao) {
		this.satisfacao = satisfacao;
	}
	
	public Empresa() {
	}
	public Empresa(Integer id, String nome, String satisfacao) {
		this.id = id;
		this.nome = nome;
		this.satisfacao = satisfacao;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public Date getDataAbertura() {
		return dataAbertura;
	}
}
