package com.jsp.project.E_commerce_app.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.project.E_commerce_app.entity.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant, Long> {

}