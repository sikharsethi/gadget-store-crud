package com.boostmytool.Gadget.Store.controllers;

import java.util.List;

import com.boostmytool.Gadget.Store.models.Product;
import com.boostmytool.Gadget.Store.services.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repo;

@GetMapping({"" , "/"})
    public String showProductList (Model model) {
        List<Product> products = repo.findAll() ;
        model.addAttribute ("products" , products);
        return "products/index";
    }


}
