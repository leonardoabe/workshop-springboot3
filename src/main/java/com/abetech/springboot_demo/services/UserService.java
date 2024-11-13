package com.abetech.springboot_demo.services;

import com.abetech.springboot_demo.entities.User;
import com.abetech.springboot_demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        //TODO create exception for non user found
        return user.orElseThrow();
    }
}
