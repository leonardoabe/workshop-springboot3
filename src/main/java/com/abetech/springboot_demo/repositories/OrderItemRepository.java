package com.abetech.springboot_demo.repositories;

import com.abetech.springboot_demo.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
