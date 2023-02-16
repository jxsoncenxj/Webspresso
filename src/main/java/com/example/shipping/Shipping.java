package com.example.shipping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Shipping {
    @Id 
    @GeneratedValue
    private Long id;
    @NotBlank
    private String fullName;
    @NotBlank
    private String email;
    @NotBlank
    private Long phoneNumber;
    @NotBlank
    private String address;
    
}
