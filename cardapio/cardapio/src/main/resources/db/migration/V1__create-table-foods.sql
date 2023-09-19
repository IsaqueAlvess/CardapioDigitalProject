/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  ysaka
 * Created: 18 de set. de 2023
 */

CREATE SCHEMA IF NOT EXISTS my_schema;
SET search_path TO my_schema;

CREATE TABLE IF NOT EXISTS foods(
    id SERIAL PRIMARY KEY,
    title TEXT NOT NULL,
    price INTEGER NOT NULL,
    image TEXT
);
