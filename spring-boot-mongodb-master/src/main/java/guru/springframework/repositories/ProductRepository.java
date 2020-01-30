package guru.springframework.repositories;

import guru.springframework.domain.Product;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductRepository extends CrudRepository<Product, String> {

	@Query(value = "{ 'description' : { $regex: ?0 } }", fields = "{'description' : 0}")
	Product findProductByDescription(String description);

}
