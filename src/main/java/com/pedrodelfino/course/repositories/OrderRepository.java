package com.pedrodelfino.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrodelfino.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
