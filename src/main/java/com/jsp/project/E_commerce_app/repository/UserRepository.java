package com.jsp.project.E_commerce_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.project.E_commerce_app.entity.User;

public interface UserRepository  extends JpaRepository<User, Integer>{
 boolean existByEmail(String adminEmail);
 
}
