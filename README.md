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

```
java-spring-services/
├── Task1SpringMVC
├── Task2FirstRestAPI
├── screenshots
└── README.md
```

---

## Task 1 – Spring MVC Application

This application demonstrates the fundamentals of Spring MVC and server-side rendering.

### Features
- Plain text HTTP response
- Thymeleaf-based HTML rendering
- Static resource handling (image support)

### Endpoints
- GET /  
  Returns a plain text response.

- GET /greeting  
  Renders an HTML page using Thymeleaf.

### Screenshot

![Task 1 Greeting Page](screenshots/task1-greeting-page.png)

---

## Task 2 – Product REST API

A RESTful backend service for managing products.  
The application follows a layered architecture and exposes CRUD endpoints documented with Swagger.

### Technologies Used
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 In-Memory Database
- Swagger / OpenAPI
- Maven

---

## Swagger Documentation

Swagger UI is available after running the application:

```
http://localhost:8080/swagger-ui/index.html
```

![Swagger Overview](screenshots/swagger-overview.png)

---

## API Endpoints

### Create Product
POST /api/v1/products

Request body:
```json
{
  "name": "Laptop",
  "price": 1200
}
```

Response:
- 201 Created

![Create Product](screenshots/post-create-product.png)

---

### Get Product by ID
GET /api/v1/products/{id}

Response:
- 200 OK

![Get Product by ID](screenshots/get-product-by-id.png)

---

### Get All Products
GET /api/v1/products

Response:
- 200 OK

![Get All Products](screenshots/get-all-products.png)

---

### Update Product
PUT /api/v1/products/{id}

Request body:
```json
{
  "name": "Updated Laptop",
  "price": 1500
}
```

Response:
- 200 OK  
- Returns the previous state of the product

![Update Product](screenshots/put-update-product.png)

---

### Delete Product
DELETE /api/v1/products/{id}

Response:
- 204 No Content

![Delete Product](screenshots/delete-product.png)

---

## H2 Database Console

The H2 database console is available at:

```
http://localhost:8080/console
```

Connection details:
- JDBC URL: jdbc:h2:mem:testdb
- Username: sa
- Password: (empty)

Example SQL query:
```sql
SELECT * FROM PRODUCTS;
```

![H2 Console](screenshots/h2-console.png)

---

## How to Run the Applications

1. Open the project in IntelliJ IDEA
2. Ensure Java 17 is selected as the Project SDK
3. Run the main application classes:
   - Task1SpringMvcApplication for the Spring MVC app
   - FirstRestApiApplication for the REST API
4. Access the application via browser or Swagger UI

---


- All endpoints were tested using Swagger UI
- Database operations are managed using Spring Data JPA
- The repository is structured for clarity and future expansion
- Fully functional and ready for demonstration or portfolio use
