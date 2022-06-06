package com.wmsolucoes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wmsolucoes.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
