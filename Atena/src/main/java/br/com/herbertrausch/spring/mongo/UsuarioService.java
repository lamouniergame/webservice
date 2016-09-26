package br.com.herbertrausch.spring.mongo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import br.com.herbertrausch.util.SpringUtil;

public class UsuarioService {

	
	private UsuarioRepository db;
	
	public UsuarioService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(UsuarioRepository.class);
		
	}

	// Lista todos os clinetes do banco de dados
	public List<Usuario> getUsuarios() {
		try {
			
			List<Usuario> usuarios = (List<Usuario>) db.findAll();
					
			return usuarios;
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Usuario>();

		}
	}
	
	public List<Usuario> getByEmail(String a){
		return db.findByEmail(a);
	}
	
	public List<Usuario> getByNome(String a){
		return db.findByNome(a);
	}
	
	public List<Usuario> getBySenha(String a){
		return db.findBySenha(a);
	}

	public Usuario getUsuario(String id) {
		try {
			
			
			return db.findOne(id);
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	public boolean delete(String id) {
		try{
			db.delete(id);
			return true;
		} 
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean save(Usuario usuario) {
		try {
			
				db.save(usuario);
			
			return true;
		}  catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



}
