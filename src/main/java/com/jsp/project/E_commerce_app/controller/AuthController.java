package com.jsp.project.E_commerce_app.controller;



import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.project.E_commerce_app.dto.LoginDto;
import com.jsp.project.E_commerce_app.service.AuthServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

	private final AuthServiceImpl authService;

	@PostMapping("/login")
	public Map<String, Object> login(@RequestBody LoginDto loginDto) {
		return authService.login(loginDto);
	}

}