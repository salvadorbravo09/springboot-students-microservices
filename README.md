# Aplicación para Manejo de Estudiantes con Spring Boot

Esta aplicación está compuesta por varios microservicios desarrollados en Spring Boot. A continuación, se detallan los microservicios incluidos y su configuración:

## Microservicios

### microservice-config
- **Descripción**: Servicio de configuración centralizado usando Spring Cloud Config Server.

### microservice-course
- **Descripción**: Microservicio encargado de gestionar cursos.

### microservice-eureka
- **Descripción**: Servicio de descubrimiento de servicios utilizando Eureka Server.

### microservice-gateway
- **Descripción**: Gateway API que enruta las solicitudes a los microservicios correspondientes.

### microservice-student
- **Descripción**: Microservicio para la gestión de estudiantes.

## Configuración

1. **Config Server**: Centraliza la configuración de todos los microservicios.
2. **Eureka Server**: Permite el registro y descubrimiento de microservicios.
3. **Gateway API**: Maneja el enrutamiento de solicitudes a los microservicios.
4. **Microservicios**: Cada microservicio realiza funciones específicas y se registra en Eureka Server.
