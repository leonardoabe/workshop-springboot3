package com.abetech.springboot_demo.services;

import com.abetech.springboot_demo.entities.Category;
import com.abetech.springboot_demo.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> category = repository.findById(id);
        //TODO create exception for non order found
        return category.orElseThrow();
    }

}
