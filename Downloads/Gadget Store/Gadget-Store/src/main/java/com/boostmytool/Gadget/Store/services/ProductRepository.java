package com.boostmytool.Gadget.Store.services;

import org.springframework.data.jpa.repository.JpaRepository;
import com.boostmytool.Gadget.Store.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
