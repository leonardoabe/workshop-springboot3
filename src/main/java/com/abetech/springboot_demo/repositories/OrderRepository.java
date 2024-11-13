package com.abetech.springboot_demo.repositories;

import com.abetech.springboot_demo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
