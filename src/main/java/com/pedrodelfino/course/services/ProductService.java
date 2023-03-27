package com.pedrodelfino.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrodelfino.course.entities.Product;
import com.pedrodelfino.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findById(Long Id) {
		Optional<Product> obj = repository.findById(Id);

		return obj.get();
	}
}
