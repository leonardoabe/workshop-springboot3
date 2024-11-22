package com.abetech.springboot_demo.services;

import com.abetech.springboot_demo.entities.Product;
import com.abetech.springboot_demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> product = repository.findById(id);
        //TODO create exception for non product found
        return product.orElseThrow();
    }
}
