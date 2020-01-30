package guru.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import guru.springframework.repositories.ProductRepository;

@SpringBootApplication
@Configuration
public class SpringBootMongodbApplication {

	@Autowired
	ProductRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongodbApplication.class, args);

	}

	@Bean
	public MongoDatabase mongoDatabase() {

		MongoClientURI uri = new MongoClientURI(
				"mongodb+srv://sibin:Boat786#@cluster0-vgzxw.mongodb.net/test?retryWrites=true&w=majority");

		MongoClient mongoClient = new MongoClient(uri);
		MongoDatabase database = mongoClient.getDatabase("test");
		return database;

	}
}
