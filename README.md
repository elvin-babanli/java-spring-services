# Java Spring Services

A collection of Spring Boot applications demonstrating modern backend development using Spring MVC, RESTful APIs, Swagger documentation, and database integration with JPA.

This repository is designed to showcase clean architecture, REST principles, and practical backend patterns suitable for real-world applications and portfolio usage.

---

## Overview

This repository contains two independent Spring Boot applications:

- Task 1 – A Spring MVC application using Thymeleaf for server-side rendering
- Task 2 – A RESTful Product API with full CRUD functionality, Swagger documentation, and an H2 in-memory database

Both applications are fully functional and ready for demonstration.

---

## Project Structure

java-spring-services/
├── Task1SpringMVC
├── Task2FirstRestAPI
├── screenshots
└── README.md

---

## Task 1 – Spring MVC Application

This application demonstrates the fundamentals of Spring MVC and server-side rendering.

Features:
- Plain text HTTP response
- Thymeleaf-based HTML rendering
- Static resource handling (image support)

Endpoints:
- GET /  -> Plain text response
- GET /greeting -> Thymeleaf rendered HTML page

Screenshot:
screenshots/task1-greeting-page.png

---

## Task 2 – Product REST API

A RESTful backend service for managing products.

Technologies:
- Java 17
- Spring Boot
- Spring Data JPA
- H2 In-Memory Database
- Swagger / OpenAPI
- Maven

Swagger URL:
http://localhost:8080/swagger-ui/index.html

---

API Endpoints:

POST /api/v1/products
Request:
{
  "name": "Laptop",
  "price": 1200
}

GET /api/v1/products/{id}
GET /api/v1/products
PUT /api/v1/products/{id}
DELETE /api/v1/products/{id}

---

H2 Console:
http://localhost:8080/console

JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: (empty)

Example SQL:
SELECT * FROM PRODUCTS;

---

How to Run:
1. Open in IntelliJ IDEA
2. Select Java 17
3. Run Task1SpringMvcApplication or FirstRestApiApplication

---

Final Notes:
- All endpoints tested with Swagger
- Clean and extendable project structure
- Ready for portfolio and demonstration
