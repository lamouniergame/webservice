package br.com.herbertrausch.spring.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrocaRepository extends MongoRepository<Troca, String> {
	
}
