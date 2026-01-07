package com.jsp.project.E_commerce_app.dao;

import org.springframework.stereotype.Repository;

import com.jsp.project.E_commerce_app.entity.User;
import com.jsp.project.E_commerce_app.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserDao {

	private final UserRepository userRepository;

	public User findByEmail(String email) {
		return userRepository.findByEmail(email).orElseThrow();
	}

	public void save(User user) {
		userRepository.save(user);
	}
}