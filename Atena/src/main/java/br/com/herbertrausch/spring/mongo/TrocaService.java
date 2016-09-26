package br.com.herbertrausch.spring.mongo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import br.com.herbertrausch.util.SpringUtil;

public class TrocaService {

	private TrocaRepository db;
	
	public TrocaService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(TrocaRepository.class);
		
	}

	public List<Troca> getTrocas() {
		try {
			
			List<Troca> trocas = (List<Troca>) db.findAll();
			return trocas;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Troca>();

		}
	}

	
	
	public Troca getTroca(String id) {
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

	public boolean save(Troca troca) {
		try {
			db.save(troca);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
