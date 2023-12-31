package com.dev.isaque.cardapio.controller;

import com.dev.isaque.cardapio.food.Food;
import com.dev.isaque.cardapio.food.FoodRepository;
import java.util.List;

import com.dev.isaque.cardapio.food.FoodRequestDTO;
import com.dev.isaque.cardapio.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ysaka
 */
@RestController
@RequestMapping("food")
public class FoodController {
    
    @Autowired
    private FoodRepository repository;    

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll(){

        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);

        repository.save(foodData);
        return;
    }


    
    
}
