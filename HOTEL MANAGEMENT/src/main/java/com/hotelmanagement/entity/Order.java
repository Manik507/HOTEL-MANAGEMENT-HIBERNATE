package com.hotelmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String dishName;
    private double price;

    public Order() {}

    public Order(String dishName, double price) {
        this.dishName = dishName;
        this.price = price;
    }

    public int getId() { return id; }
    public String getDishName() { return dishName; }
    public void setDishName(String dishName) { this.dishName = dishName; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
