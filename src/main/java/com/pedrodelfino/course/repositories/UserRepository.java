package com.pedrodelfino.course.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrodelfino.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
