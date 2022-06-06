package com.wmsolucoes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wmsolucoes.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
