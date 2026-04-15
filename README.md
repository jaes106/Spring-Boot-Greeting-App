# Greeting App (Spring Boot)

## Overview
This project demonstrates a layered Spring Boot application using Controller, Service, and Repository. It supports CRUD operations for Greeting messages.

## Tech Stack
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database

## Architecture
Controller → Service → Repository → Database

## Use Cases

### UC1: Basic Greeting Controller
- Return JSON response

### UC2: Service Layer Integration
- Controller calls Service

### UC3: Dynamic Greeting Message
- Based on user input (first/last name)

### UC4: Save Greeting
- Store greeting in DB

### UC5: Get Greeting by ID

### UC6: Get All Greetings

### UC7: Update Greeting

### UC8: Delete Greeting

## Endpoints

| Method | Endpoint |
|--------|--------|
| GET | /greeting |
| POST | /greeting |
| GET | /greeting/{id} |
| GET | /greetings |
| PUT | /greeting/{id} |
| DELETE | /greeting/{id} |

## Author
Jason Abraham
