package br.com.herbertrausch.spring.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;

@Component
public interface LivrosRepository extends MongoRepository<Livros, String> {

	List<Livros> findByNome(String a);
	
	List<Livros> findByAutor(String a);
	
	List<Livros> findByGenero(String a);
	
	//Procura exemplar por Usuario
	@Query("{'exemplar' :{'$ref' : 'usuario' , '$id' : ?0}}")
	List<Livros> findByExemplar(String idUsuario);

}
