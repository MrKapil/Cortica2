package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.demo.service.CartService;

@Controller
public class CartController 
{
    @Autowired
    private CartService cartService;

    @GetMapping("/cart")
    public String cart(Model model) 
    {
        model.addAttribute("cartItems", cartService.getCartItems());
        return "cart";
    }
}
