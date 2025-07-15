package com.hotelmanagement.service;

import com.hotelmanagement.entity.Order;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class OrderService {
    private final EntityManagerFactory emf;

    public OrderService(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void placeOrder(String dishName, double price) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Order order = new Order(dishName, price);
        em.persist(order);
        em.getTransaction().commit();
        em.close();
        System.out.println("Order placed successfully: " + dishName + " - ₹" + price);
    }
}
