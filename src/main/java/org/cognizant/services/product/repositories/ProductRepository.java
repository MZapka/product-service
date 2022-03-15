package org.cognizant.services.product.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.cognizant.services.product.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	List<Product> findByCategoryID(long categoryID);
	//getProductByCategory(long categoryID)
	//getProductById(long productID)

}
