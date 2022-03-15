package org.cognizant.services.product.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import org.cognizant.services.product.repositories.ProductRepository;
import org.cognizant.services.product.models.Product;

@Service
public class ProductService {
	
	private ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	public ProductRepository getProductRepository() {
		return productRepository;
	}

	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	public Product add(Product product) {
		return productRepository.save(product);
	}
	
	public List<Product> findByCategoryID(long categoryID){
		return (List<Product>) productRepository.findByCategoryID(categoryID);
	}
	public Optional<Product> findByProductID(long productID){
		return productRepository.findById(productID);
	}
}
