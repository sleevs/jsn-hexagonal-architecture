package br.com.jsn.adapter.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "cliente")
public class ClientEntity implements Serializable{
	 private static final long serialVersionUID = 1L;
	 

	
	@Id
	@Column(name = "cliente_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id ;
	@Column(name = "cliente_nome")
	private String nome ;
	@Column(name = "cliente_email")
	private String email ;
	@Column(name = "cliente_senha")
	private String senha ;
	@Column(name = "cliente_tipo")
	private String tipo ;
	@Column(name = "cliente_endereco")
	private String endereco ;
	
	
	public ClientEntity() {
		
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	

}
