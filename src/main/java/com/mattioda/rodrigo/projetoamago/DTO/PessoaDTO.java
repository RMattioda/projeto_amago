package com.mattioda.rodrigo.projetoamago.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;


public class PessoaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	

	private Integer id;
	
	@NotEmpty(message="Você deve preencher o nome e o sobrenome!")
	@Pattern(regexp = "^[^-\\s][a-zA-ZÀ-ú ]*", message = "bla bla bla")
	private String nome;
	
	@NotEmpty(message="Você deve preencher o nome e o sobrenome!")
	private String sobrenome;	
	
	@NotEmpty(message="Preenchimento obrigatório!")
	@Length(min=5, message="O tamanho deve ser de no mínimo 5 caracteres")
	private String senha;
	
	@Column(unique=true)
	@Length(min=5, message="O tamanho deve ser de no mínimo 5 caracteres")
	private String nomeUsuario;
	
	
	@Email(message="mensagem email")
	@Column(unique=true)
	private String email;
	
	@Pattern(regexp = "(^$|[0-9]{10})", message = "Número de telefone deve ter somente 10 dígitos")
	@NotEmpty(message="mensagem telefone!")
	private String telefone;
	

	public PessoaDTO() {
	}


	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		PessoaDTO other = (PessoaDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
