package com.dev.isaque.cardapio.controller;

import com.dev.isaque.cardapio.food.Food;
import com.dev.isaque.cardapio.food.FoodRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    
    @GetMapping
    public List<Food> getAll(){

        return repository.findAll();
    }
    
    
}
