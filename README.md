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

## Módulo Cliente
* **Crear un cliente: POST /api/clientes
* **Obtener todos los clientes: GET /api/clientes
* **Obtener un cliente por ID: GET /api/clientes/{id}
* **Actualizar un cliente: PUT /api/clientes/{id}
* **Eliminar un cliente: DELETE /api/clientes/{id}

## Módulo Inventario
* **Crear un registro de inventario: POST /api/inventario
* **Obtener todos los registros: GET /api/inventario
* **Obtener un registro por ID: GET /api/inventario/{id}
* **Actualizar un registro: PUT /api/inventario/{id}
* **Eliminar un registro: DELETE /api/inventario/{id}

## Módulo Producto
* **Crear un producto: POST /api/productos
* **Obtener todos los productos: GET /api/productos
* **Obtener un producto por ID: GET /api/productos/{id}
* **Actualizar un producto: PUT /api/productos/{id}
* **Eliminar un producto: DELETE /api/productos/{id}

## Módulo Proveedor
* **Crear un proveedor: POST /api/proveedores
* **Obtener todos los proveedores: GET /api/proveedores
* **Obtener un proveedor por ID: GET /api/proveedores/{id}
* **Actualizar un proveedor: PUT /api/proveedores/{id}
* **Eliminar un proveedor: DELETE /api/proveedores/{id}

## Módulo Rol
* **Crear un rol: POST /api/roles
* **Obtener todos los roles: GET /api/roles
* **Obtener un rol por ID: GET /api/roles/{id}
* **Actualizar un rol: PUT /api/roles/{id}
* **Eliminar un rol: DELETE /api/roles/{id}

## Módulo Usuario
* **Crear un usuario: POST /api/usuarios
* **Obtener todos los usuarios: GET /api/usuarios
* **Obtener un usuario por ID: GET /api/usuarios/{id}
* **Actualizar un usuario: PUT /api/usuarios/{id}
* **Eliminar un usuario: DELETE /api/usuarios/{id}

## Módulo Venta
* **Crear una venta: POST /api/ventas
* **Obtener todas las ventas: GET /api/ventas
* **Obtener una venta por ID: GET /api/ventas/{id}
* **Actualizar una venta: PUT /api/ventas/{id}
* **Eliminar una venta: DELETE /api/ventas/{id}

## Documentación de Código
Cada método en los controladores de la API (`ClienteController`, `VentaController`, etc.) incluye comentarios detallados sobre su función, los parámetros que recibe y el tipo de respuesta que devuelve.

## Link Repositorio GitHub:  https://github.com/yurany637/montecafe-spring-boot.git 
---Autor: Dirley Yurany Córdoba Díaz
   Programa: Análisis y desarrollo de Software-
   Ficha 2977429