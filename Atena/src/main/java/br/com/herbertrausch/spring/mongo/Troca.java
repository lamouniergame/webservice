package br.com.herbertrausch.spring.mongo;

import java.io.Serializable;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Troca implements Serializable {

	private static final long serialVersionUID = 1L;


	private String dataTroca;
	
	@DBRef
	private Usuario donor;
	
	@DBRef
	private Usuario receiver;
	
	@DBRef
	private Livros livro;
	
	
	public String getDataTroca() {
		return dataTroca;
	}
	public void setDataTroca(String dataTroca) {
		this.dataTroca = dataTroca;
	}
	public Livros getLivro() {
		return livro;
	}
	public void setLivro(Livros livro) {
		this.livro = livro;
	}
	public Usuario getDonor() {
		return donor;
	}
	public void setDonor(Usuario donor) {
		this.donor = donor;
	}
	public Usuario getReceiver() {
		return receiver;
	}
	public void setReceiver(Usuario receiver) {
		this.receiver = receiver;
	}
}
