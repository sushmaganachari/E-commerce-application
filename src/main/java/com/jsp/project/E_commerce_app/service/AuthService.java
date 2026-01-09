package com.jsp.project.E_commerce_app.service;

import java.util.Map;

import com.jsp.project.E_commerce_app.dto.LoginDto;
import com.jsp.project.E_commerce_app.dto.MerchantDto;
import com.jsp.project.E_commerce_app.dto.OtpDto;

public interface AuthService {
	Map<String, Object> login(String email, String password);

	Map<String, Object> viewUser(String email);

	Map<String, Object> updatePassword(String email, String oldPassword, String newPassword);

	Map<String, Object> registerMerchant(MerchantDto merchantDto);

	Map<String, Object> verifyOtp(OtpDto dto);

	Map<String, Object> resendOtp(String email);

}