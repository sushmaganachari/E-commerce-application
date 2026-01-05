package com.jsp.project.E_commerce_app.service;

import java.util.Map;

import com.jsp.project.E_commerce_app.dto.LoginDto;

public interface AuthService {

	Map<String, Object> login(LoginDto loginDto);

}