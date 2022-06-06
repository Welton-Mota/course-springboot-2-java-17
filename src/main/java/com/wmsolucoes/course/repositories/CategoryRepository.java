package com.wmsolucoes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wmsolucoes.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
