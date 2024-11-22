package com.abetech.springboot_demo.repositories;

import com.abetech.springboot_demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
