package com.shadow.springBootAngular.services.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shadow.springBootAngular.Repository.CategoryRepo;
import com.shadow.springBootAngular.Repository.ProductRepo;
import com.shadow.springBootAngular.model.Category;
import com.shadow.springBootAngular.model.Products;

@Service
public class ProductService {

	@Autowired
	ProductRepo productRepo;
	@Autowired
	CategoryRepo cateRepo;
	
	public List<Products>getAllProducts(){
		return productRepo.findAll();
	}
	public List<Products>getProductsByCategory(String product_id){
		return productRepo.getByCategoryId(product_id);
	}
	
	public List<Category>getAllCategory(){
		return cateRepo.findAll();
	}
	
	public Products getProductsById(long productId) throws Exception {
		return productRepo.findById(productId).orElseThrow(() ->new Exception("Product is not found"));
	}
}