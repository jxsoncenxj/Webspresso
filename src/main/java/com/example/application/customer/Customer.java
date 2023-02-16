package com.example.application.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.checkerframework.checker.signature.qual.Identifier;



@Entity
public class Customer {
    @Id 
    @GeneratedValue
    private Long id;
    @NotBlank
    private String username;
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
