package com.wmsolucoes.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wmsolucoes.course.entities.Order;
import com.wmsolucoes.course.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	// comando para injeção de auto dependencia do Spring
	@Autowired
	private OrderService service;
	
	//Controlador REST que responde no caminho /users
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
