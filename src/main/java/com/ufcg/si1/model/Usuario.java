package com.ufcg.si1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import exceptions.ObjetoInvalidoException;

@Entity
public class Usuario {

	@Id
	@GeneratedValue
	private long id;

	private String username;

	private String email;

	private String password;

	private int categoria;// usa variaveis estaticas abaixo
	/* situacoes do produto */
	public static final int ADMINISTRADOR = 1;
	public static final int CLIENTE = 2;

	public Usuario() {
		this.id = 0;
		this.username = "";
		this.email = "";
		this.password = "";
		this.categoria = 1;
	}

	public Usuario(long id, String nome, String email, String senha,
			int categoria) {
		this.id = id;
		this.username = nome;
		this.email = email;
		this.password = senha;
		this.categoria = categoria;
	}

	public String getNome() {
		return username;
	}
	
	public String setNome(String nome) {
		return username = nome;
	}
	
	public String getSenha() {
		return password;
	}

	public void setSenha(String senha) {
		this.password = senha;
	}

	public long getId() {
		return id;
	}

	public void mudaId(long codigo) {
		this.id = codigo;
	}

	public int getCategoria() {
		return this.categoria;
	}
		
	public void mudaCategoria(int situacao) throws ObjetoInvalidoException {
		switch (situacao) {
		case 1:
			this.categoria = Usuario.ADMINISTRADOR;
			break;
		case 2:
			this.categoria = Usuario.CLIENTE;
			break;
		default:
			throw new ObjetoInvalidoException("Categoria Invalida");
		}
	}
	public int getSituacao() throws ObjetoInvalidoException {
		return this.categoria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
}
