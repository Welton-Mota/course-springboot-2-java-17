package com.wmsolucoes.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wmsolucoes.course.entities.Product;
import com.wmsolucoes.course.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	// comando para injeção de auto dependencia do Spring
	@Autowired
	private ProductService service;
	
	//Controlador REST que responde no caminho /users
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
