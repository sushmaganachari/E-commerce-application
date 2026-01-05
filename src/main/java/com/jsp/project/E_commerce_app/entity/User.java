package com.jsp.project.E_commerce_app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
   @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Integer id;
   @Column(nullable = false)
	private  String username;
   @Column(nullable = false,unique = true)
	private  String email;
   @Column(nullable = false,unique = true)
	private  Integer mobile;
   @Column(nullable = false)
	private  String password;
	private  boolean isActive;
}
