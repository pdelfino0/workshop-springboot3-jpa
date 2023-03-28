package com.pedrodelfino.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrodelfino.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	
}
