package com.abetech.springboot_demo.repositories;

import com.abetech.springboot_demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
