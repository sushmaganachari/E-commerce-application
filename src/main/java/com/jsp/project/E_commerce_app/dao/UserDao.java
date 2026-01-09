package com.jsp.project.E_commerce_app.dao;

import org.springframework.stereotype.Repository;

import com.jsp.project.E_commerce_app.entity.Customer;
import com.jsp.project.E_commerce_app.entity.Merchant;
import com.jsp.project.E_commerce_app.entity.User;
import com.jsp.project.E_commerce_app.repository.CustomerRepository;
import com.jsp.project.E_commerce_app.repository.MerchantRepository;
import com.jsp.project.E_commerce_app.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserDao {

	private final UserRepository userRepository;
	private final MerchantRepository merchantRepository;
	private final CustomerRepository customerRepository;

	public boolean checkEmailAndMobieDuplicate(String email, Long mobile) {
		return userRepository.existsByEmailOrMobile(email, mobile);
	}

	public User findByEmail(String email) {
		return userRepository.findByEmail(email).orElseThrow();
	}

	public void save(User user) {
		userRepository.save(user);
	}

	public void save(Merchant merchant) {
		merchantRepository.save(merchant);
	}

	public void save(Customer customer) {
		customerRepository.save(customer);
	}
}