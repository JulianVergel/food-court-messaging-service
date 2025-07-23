# Microservicio de Usuarios (food-court-messaging-service)

## Descripción General

Microservicio encargado de enviar mensajes a los clientes dependiendo del estado de sus pedidos, para el sistema de Plazoleta de Comidas.

## Arquitectura

Este microservicio está diseñado siguiendo los principios de la Arquitectura Hexagonal (Puertos y Adaptadores). Esto asegura una clara separación de la lógica de negocio del dominio de los detalles de infraestructura (bases de datos, frameworks web, etc.), haciendo el código más modular, testable y adaptable a cambios futuros.

### Componentes Principales

* **Núcleo (Dominio y Servicios de Aplicación):** Contiene la lógica de negocio fundamental del servicio del envio de notificaciones (SMS) para informar sobre el estado del pedido.
* **Puertos:** Interfaces que definen cómo el núcleo interactúa con el mundo exterior (APIs de entrada y repositorios de salida).
* **Adaptadores de Entrada (Driving Adapters):** Implementaciones de las APIs REST que exponen las funcionalidades del servicio.
* **Adaptadores de Salida (Driven Adapters):** Implementaciones que conectan el núcleo con la base de datos y otras infraestructuras.

## Tecnologías Utilizadas

* **Lenguaje de Programación:** Java
* **Framework:** Spring Boot
* **Mensajeria:** Twilio
* **Gestión de Dependencias:** Gradle
* **Seguridad:** Spring Security (para autenticación/autorización), JWT (para tokens).

## Cómo Empezar

### Prerequisitos

* Java Amazon Corretto 17
* Gradle
