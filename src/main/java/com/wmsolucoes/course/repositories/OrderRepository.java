package com.wmsolucoes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wmsolucoes.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
