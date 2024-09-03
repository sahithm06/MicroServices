# Scalable and Reliable Microservices Architecture with Spring Boot
# Project Overview
This project demonstrates the development of a scalable and reliable application using Spring Boot's microservices architecture. The project is designed to efficiently manage employee and department data through separate microservices, all while ensuring robust communication, centralized configuration, and seamless routing.

# Key Components
# 1. Service Registry (Eureka Server)
Purpose: Central registry for managing service instances.
Services Registered:
employee-service
department-service
api-gateway
# 2. Employee Service
APIs:
GET /employee/all - Retrieve all employees.
POST /employee - Add a new employee.
GET /employee/{id} - Retrieve a specific employee by ID.
Port: 8082
# 3. Department Service
APIs:
GET /department/all - Retrieve all departments.
POST /department - Add a new department.
GET /department/{id} - Retrieve a specific department by ID.
Port: 8083
# 4. API Gateway
Purpose: Central entry point for routing requests to the appropriate service.
Routes:
http://localhost:8060/employee/** - Routes to employee-service.
http://localhost:8060/department/** - Routes to department-service.
Load Balancing: Utilizes Spring Cloud Load Balancer for efficient request distribution.
# 5. Config Server
Purpose: Centralized management of configuration properties for all microservices.
Services Configured: employee-service, department-service, api-gateway.
# 6. Distributed Tracing (Zipkin)
Purpose: Trace and monitor requests across microservices.
Access: Zipkin available at http://localhost:9411.
Deployment: Running via Docker.
Technologies Used
Spring Boot
Eureka Server
Spring Cloud Gateway
Spring Cloud Config
WebClient
Docker
Zipkin
Postman
Running the Project
Start Eureka Server: Run the service registry.
Start Config Server: Launch the centralized configuration service.
Deploy Microservices: Start employee-service and department-service.
Launch API Gateway: Start the API gateway to route requests.
Monitor with Zipkin: Use Zipkin for tracing microservice interactions.
# Project Aim
The primary goal of this project is to build a scalable and reliable application using microservices architecture, ensuring seamless integration and efficient management of services.

# Conclusion
This project showcases the power of Spring Boot in creating robust microservices with centralized configuration, seamless routing, and comprehensive monitoring. The architecture ensures that the application is both scalable and reliable, meeting modern enterprise requirements.
