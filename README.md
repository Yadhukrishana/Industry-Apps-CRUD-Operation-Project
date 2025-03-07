# Industry-Apps-CRUD-Operation-Project
# Spring Boot CRUD API

## Overview
This project is a simple **CRUD (Create, Read, Update, Delete) API** built using **Spring Boot** with **Spring Data JPA** and an **H2 in-memory database**.

## Features
- Create a Product
- Retrieve all Products
- Retrieve a Product by ID
- Update a Product
- Delete a Product
- Uses **Spring Boot, JPA, H2 Database**
- RESTful API design
- Exception handling included

## Technologies Used
- **Java 17+**
- **Spring Boot 3+**
- **Spring Web** (for REST API)
- **Spring Data JPA** (for database operations)
- **H2 Database** (for in-memory storage)
- **Maven** (for dependency management)

## Prerequisites
- **Java 17+** installed
- **Maven** installed
- **Postman** or **cURL** for testing API requests

## Setup & Run Instructions

### 1. Clone the Repository
```sh
https://github.com/Yadhukrishana/Industry-Apps-CRUD-Operation-Project.git

```

### 2. Build the Project
```sh
mvn clean install
```

### 3. Run the Application
```sh
mvn spring-boot:run
```

The application will start on **`http://localhost:8080`**.

## API Endpoints

### 1. Create a Product
**Endpoint:** `POST /products`
**Request Body:**
```json
{
  "name": "Laptop",
  "description": "Gaming laptop",
  "price": 1200.0
}

```

---
### 2. Retrieve All Products
**Endpoint:** `GET /products`

```

### 3. Retrieve a Product by ID
**Endpoint:** `GET /products/{id}`

```

---
### 4. Update a Product
**Endpoint:** `PUT /products/{id}`

```

```
### 5. Delete a Product
**Endpoint:** `DELETE /products/{id}`
```


```
## Author
YADHU KRISHNAN KP
