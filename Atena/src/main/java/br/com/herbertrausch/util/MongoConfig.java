package br.com.herbertrausch.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.WriteConcern;


@Configuration
public class MongoConfig {

	public @Bean
	MongoDbFactory mongoDbFactory() throws Exception {

		MongoClient mongo = new MongoClient(new MongoClientURI("mongodb://grupodamorte:galinha007@ds015403.mlab.com:15403/athenateste"));
		SimpleMongoDbFactory simpleMongoDbFactory = new SimpleMongoDbFactory(mongo, "athenateste");
		return simpleMongoDbFactory;

	}
	
	public @Bean
	MongoTemplate mongoTemplate() throws Exception {
		
		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
		mongoTemplate.setWriteConcern(WriteConcern.SAFE);

		return mongoTemplate;

	}

}
