package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.CartItem;

public interface CartRepository extends JpaRepository<CartItem, Integer> {

}
