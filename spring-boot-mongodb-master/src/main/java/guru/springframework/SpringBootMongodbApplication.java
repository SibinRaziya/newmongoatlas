package guru.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import guru.springframework.repositories.ProductRepository;

@SpringBootApplication
public class SpringBootMongodbApplication {

	@Autowired
	ProductRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongodbApplication.class, args);

	}

	
}
