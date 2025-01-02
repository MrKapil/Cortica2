package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.model.Product;
import com.demo.service.CartService;
import com.demo.service.ProductService;

@Controller
public class HomeController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CartService cartService;

    @GetMapping("/")
    public String home(Model model) 
    {
        model.addAttribute("products", productService.getAllProducts());
        return "home";
    }

    @PostMapping("/add-to-cart/{id}")
    public String addToCart(@PathVariable int id) 
    {
        Product product = productService.getProductById(id);
        cartService.addToCart(product);	
        return "redirect:/cart";
    }

}

