package com.example.application.products;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Products {
    @Id 
    @GeneratedValue
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String origin;
    @NotBlank
    private Long price;
    @NotBlank
    private String stock;

}
