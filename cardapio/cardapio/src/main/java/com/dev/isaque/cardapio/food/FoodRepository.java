/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dev.isaque.cardapio.food;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ysaka
 */
public interface FoodRepository extends JpaRepository<Food, Long> {
    
}
