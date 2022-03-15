package org.cognizant.services.product.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.cognizant.services.product.models.Product;
import org.cognizant.services.product.services.ProductService;

@RestController
@RequestMapping("products")	//localhost:8088/products
public class ProductController {

	private ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/allProducts")	// localhost:8088/categories/allProducts
	public List<Product> getAllProducts(){
		return productService.findAll();
	}

	@PostMapping("/addProduct") // localhost:8088/categories/addProduct
	public Product addProduct(@RequestBody Product product) {
		return productService.add(product);
	}
	
	// Get product by category ID
	@GetMapping("/findProductsByCategory/{categoryID}")
	public List<Product> findByCategoryID(@PathVariable("categoryID") long categoryID){
		return productService.findByCategoryID(categoryID);
	}

	// Get product by ID
	@GetMapping("/findProductByID/{productID}")
	public Optional<Product> findByProductID(@PathVariable("productID") long productID){
		return productService.findByProductID(productID);
	}	
}
