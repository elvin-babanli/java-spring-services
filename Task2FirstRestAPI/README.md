# Task 2 - FirstRestAPI (REST + Swagger + H2)

## How to run

```bash
mvn spring-boot:run
```

## Swagger

- Swagger UI: `http://localhost:8080/swagger-ui/index.html`
- OpenAPI JSON: `http://localhost:8080/v3/api-docs`

## H2 Console

- H2 Console: `http://localhost:8080/console`
- JDBC URL: `jdbc:h2:mem:testdb`

## Endpoints

Base URL: `/api/v1/products`

### Create
- `POST /api/v1/products`
- Body:

```json
{ "name": "Milk" }
```
- Response: `201 Created`

### Get by id
- `GET /api/v1/products/{id}`
- Response: `200 OK`

### Get all
- `GET /api/v1/products`
- Response: `200 OK`

### Update (returns previous state)
- `PUT /api/v1/products/{id}`
- Body:

```json
{ "name": "New name" }
```
- Response: `200 OK`

### Delete
- `DELETE /api/v1/products/{id}`
- Response: `204 No Content`

## Screenshots (add later)

- Swagger UI with all endpoints
- Postman create/get/update/delete
- H2 console showing table and data
