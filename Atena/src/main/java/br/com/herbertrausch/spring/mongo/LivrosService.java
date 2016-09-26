package br.com.herbertrausch.spring.mongo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class LivrosService {

	private LivrosRepository db;
	
	public LivrosService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(LivrosRepository.class);
		
	}

	public List<Livros> getLivros() {
		try {
			
			List<Livros> livros = (List<Livros>) db.findAll();
			return livros;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Livros>();

		}
	}

	public List<Livros>getByExemplar(String a){
		return db.findByExemplar(a);
	}
	
	public List<Livros>getByGenero(String a){
		return db.findByGenero(a);
	}
	
	public List<Livros> getByNome(String a){
		return db.findByNome(a);
	}
	
	public List<Livros> getByAutor(String a){
		return db.findByAutor(a);
	}
	
	public Livros getLivros(String id) {
		try {
			
			return db.findOne(id);
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}
	
	public boolean delete(String id) {
		try {
			db.delete(id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean save(Livros livros) {
		try {
			db.save(livros);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
