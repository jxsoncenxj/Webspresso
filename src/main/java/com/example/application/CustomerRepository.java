package com.example.application;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.application.customer.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
