package com.jsp.project.E_commerce_app.service;

import java.util.Map;

import com.jsp.project.E_commerce_app.dto.LoginDto;

public interface AuthService {
	Map<String, Object> login(String email, String password);

	Map<String, Object> viewUser(String email);

	Map<String, Object> updatePassword(String email, String oldPassword, String newPassword);

}