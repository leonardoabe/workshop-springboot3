package com.abetech.springboot_demo.services;

import com.abetech.springboot_demo.entities.Order;
import com.abetech.springboot_demo.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> order = repository.findById(id);
        //TODO create exception for non order found
        return order.orElseThrow();
    }

}
