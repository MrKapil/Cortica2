package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.CartItem;
import com.demo.model.Product;
import com.demo.repository.CartRepository;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public List<CartItem> getCartItems() 
    {
        return cartRepository.findAll();
    }

    public void addToCart(Product product) 
    {
        CartItem item = new CartItem();
        item.setProduct(product);
        item.setQuantity(1);
        cartRepository.save(item);
    }
}

