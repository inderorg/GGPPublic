package com.resturant.repository;

import com.resturant.model.Dish;
import com.resturant.repository.DishRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dishes")
public class DishRepository {
    private final DishRepository repository;
    public DishController(DishRepository repository){
        this.repository= repository;
    }
    @GetMapping
    public List<Dish> getAllDishes() {
        return repository.findAll();
    }
}
