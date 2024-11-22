package com.abetech.springboot_demo.services;

import com.abetech.springboot_demo.entities.OrderItem;
import com.abetech.springboot_demo.repositories.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository repository;

    public List<OrderItem> findAll() {
        return repository.findAll();
    }

    public OrderItem findById(Long id) {
        Optional<OrderItem> orderItem = repository.findById(id);
        //TODO create exception for non order found
        return orderItem.orElseThrow();
    }

}
