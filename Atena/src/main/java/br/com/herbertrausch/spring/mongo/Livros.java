package br.com.herbertrausch.spring.mongo;

import java.io.Serializable;
import java.lang.String;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document

public class Livros implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String nome;
	private String genero;
	private String autor;
	private String anoPublicacao;
	
	@DBRef
	private Usuario exemplar;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(String anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public Usuario getExemplar() {
		return exemplar;
	}
	public void setExemplar(Usuario exemplar) {
		this.exemplar = exemplar;
	}		
}
