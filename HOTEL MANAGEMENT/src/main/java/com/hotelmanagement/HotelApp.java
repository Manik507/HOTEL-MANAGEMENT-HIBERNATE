package com.hotelmanagement;

import com.hotelmanagement.service.OrderService;
import jakarta.persistence.EntityManagerFactory;
import com.hotelmanagement.util.HibernateUtil;

import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {
        EntityManagerFactory emf = HibernateUtil.getEntityManagerFactory();
        OrderService orderService = new OrderService(emf);
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("************ Welcome to Manik's Hotel ************");
        System.out.println("--------------- Menu ---------------");
        System.out.println("1. Veg Thali - ₹150");
        System.out.println("2. Chicken Biryani - ₹250");
        System.out.println("3. Paneer Butter Masala - ₹200");
        System.out.println("4. Tandoori Roti - ₹20");
        System.out.println("5. Exit");

        while (true) {
            System.out.print("\nEnter your choice (1-5): ");
            choice = sc.nextInt();

            switch (choice) {
            case 1:
            orderService.placeOrder("Veg Thali", 150);
            break;
            case 2:
            orderService.placeOrder("Chicken Biryani", 250);
            break;
            case 3:
            orderService.placeOrder("Paneer Butter Masala", 200);
            break;
            case 4:
            orderService.placeOrder("Tandoori Roti", 20);
            break;
            case 5:
            System.out.println("Thank you for visiting Manik's Hotel!");
            emf.close();
            System.exit(0);
            break;
            default:
            System.out.println("Invalid choice. Please select 1-5.");
            break;
        }

        }
    }
}
