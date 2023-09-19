/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.isaque.cardapio.food;

import jakarta.persistence.*;

/**
 *
 * @author ysaka
 */
@Table(name = "foods")
@Entity(name = "foods")
public class Food {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;
}
