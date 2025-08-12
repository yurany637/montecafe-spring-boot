# API de Gestión para el Proyecto Monte Café (Evidencia GA7-220501096-AA5-EV03)

## Descripción
Este proyecto es una API REST (servicios web) construida en **Java con Spring Boot** para el proyecto formativo "Monte Café". El objetivo de esta fase es diseñar y desarrollar las funcionalidades básicas para los siguientes módulos:

-   **Clientes**: Gestión de la información de los clientes (crear, leer, actualizar, eliminar).
-   **Inventario**: Control de la cantidad de productos disponibles.
-   **Usuarios con Roles**: Registro y gestión de usuarios, con asignación de roles (ej. `ADMIN`, `CLIENTE`).
-   **Proveedores**: Gestión de la información de los proveedores.
-   **Ventas**: Registro de ventas y cálculo del valor total.

## Tecnologías Utilizadas
* **Lenguaje**: Java 17+
* **Framework**: Spring Boot 3.5.4
* **Gestor de Dependencias**: Maven
* **Base de Datos**: MySQL
* **ORM**: JPA / Hibernate
* **Control de Versiones**: Git & GitHub

## Endpoints (Rutas de la API)
La API expone múltiples rutas (endpoints) para interactuar con los datos. A continuación, se listan las rutas principales diseñadas y codificadas en este proyecto:

* **Clientes**: `/api/clientes` (GET, POST, PUT, DELETE)
* **Inventario**: `/api/inventario` (GET)
* **Usuarios**: `/api/usuarios` (POST, GET)
* **Proveedores**: `/api/proveedores` (GET, POST)
* **Ventas**: `/api/ventas` (POST, GET)

## Documentación de Código
Cada método en los controladores de la API (`ClienteController`, `VentaController`, etc.) incluye comentarios detallados sobre su función, los parámetros que recibe y el tipo de respuesta que devuelve.

## Link Repositorio GitHub:  https://github.com/yurany637/montecafe-spring-boot.git 
---Autor: Dirley Yurany Córdoba Díaz
   Programa: Análisis y desarrollo de Software-
   Ficha 2977429