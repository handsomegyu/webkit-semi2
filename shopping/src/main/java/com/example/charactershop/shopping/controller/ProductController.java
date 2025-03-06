package com.example.charactershop.shopping.controller;


import com.example.charactershop.shopping.domain.Product;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping(@"/getProducts")
    public List<Product> getProducts() {
        return Collections.emptyList();
    }
}
