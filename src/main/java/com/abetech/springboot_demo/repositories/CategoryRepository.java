package com.abetech.springboot_demo.repositories;

import com.abetech.springboot_demo.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
