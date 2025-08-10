package com.resturant.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Dish {
    @Id
    private Long id;
    private String name;
    private double price;
    private String category;
}
