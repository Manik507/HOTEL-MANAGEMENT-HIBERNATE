package com.hotelmanagement.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtil {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("hotelPU");

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}
