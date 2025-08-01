# 🍽️ HOTEL MANAGEMENT SYSTEM

A console-based **Hotel Management System** built using **Java 17**, **Hibernate ORM**, **JPA**, and **PostgreSQL**.  
This application allows hotel staff to place customer food orders, with each order automatically saved to a PostgreSQL database using Hibernate ORM.  

---

## 👥 TEAM MEMBERS

| Role       | Name              |
|:------------|:-----------------|
| 👑 Leader    | Manik Barad       |
| 👥 Member    | Prajwal Sanade    |

---

## ✨ FEATURES

- **Place Food Order:** Enter dish name and price to place an order for a customer.
- **Order Persistence:** All orders are saved directly into a PostgreSQL database via Hibernate ORM.
- **Console-based Interactive UI:** Simple, menu-driven interface for placing orders.
- **Hibernate JPA Integration:** Data management using Hibernate JPA with PostgreSQL.
- **Maven-based Project:** Clean modular Maven structure with dependency management.

---

## 🛠 TECHNOLOGIES USED

- ✅ Java 17+
- ✅ Hibernate ORM 6.5.2.Final
- ✅ Jakarta Persistence 3.1
- ✅ PostgreSQL 15+
- ✅ Apache Maven 3.8.6+
- ✅ Console Application (No GUI)

---

## 📦 DEPENDENCIES

This project uses the following Maven dependencies:

```xml
<dependency>
    <groupId>org.hibernate.orm</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>6.5.2.Final</version>
</dependency>

<dependency>
    <groupId>jakarta.persistence</groupId>
    <artifactId>jakarta.persistence-api</artifactId>
    <version>3.1.0</version>
</dependency>

<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.7.3</version>
</dependency>
```
---
## 📄JPA CONFIGURATION
persistent.xml
```xml
<persistence xmlns="https://jakarta.ee/xml/ns/persistence" version="3.1">
    <persistence-unit name="hotelPU" transaction-type="RESOURCE_LOCAL">
        <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
        <class>com.hotelmanagement.entity.Order</class>
        <properties>
            <property name="jakarta.persistence.jdbc.driver" value="org.postgresql.Driver"/>
            <property name="jakarta.persistence.jdbc.url" value="jdbc:postgresql://localhost:5432/hotel_db"/>
            <property name="jakarta.persistence.jdbc.user" value="postgres"/>
            <property name="jakarta.persistence.jdbc.password" value="your_password"/>
            <property name="hibernate.dialect" value="org.hibernate.dialect.PostgreSQLDialect"/>
            <property name="hibernate.hbm2ddl.auto" value="update"/>
            <property name="hibernate.show_sql" value="false"/>
        </properties>
    </persistence-unit>
</persistence>
```
---
## 📂 PROJECT STRUCTURE
```
📦 HOTEL MANAGEMENT
└── 📁 src
    └── 📁 main
        ├── 📁 java
        │   └── 📁 com
        │       └── 📁 hotelmanagement
        │           ├── 📄 HotelApp.java
        │           ├── 📁 entity
        │           │   └── 📄 Order.java
        │           ├── 📁 service
        │           │   └── 📄 OrderService.java
        │           └── 📁 util
        │               └── 📄 HibernateUtil.java
        └── 📁 resources
            └── 📁 META-INF
                └── 📄 persistence.xml
```
---
## OUTPUT :-
<img width="1920" height="1080" alt="HOTEL MANAGEMENT" src="https://github.com/user-attachments/assets/4fcb2964-9f2a-46d6-af7c-bf4b1aefa29e" />

---
## 📬 CONTACT

👑 Leader: Manik Barad

📧 Email: baradmanik@gmail.com

🐱 GitHub: https://github.com/Manik507


