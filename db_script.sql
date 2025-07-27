-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS montecafe;

-- Crear el usuario (opcional si ya existe)
CREATE USER IF NOT EXISTS 'monteuser'@'%' IDENTIFIED BY 'montepass';

-- Asignar permisos al usuario
GRANT ALL PRIVILEGES ON montecafe.* TO 'monteuser'@'%';

-- Actualizar permisos
FLUSH PRIVILEGES;

-- Seleccionar la base de datos
USE montecafe;

-- Tabla ejemplo de clientes
CREATE TABLE IF NOT EXISTS cliente (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(100) NOT NULL,
    telefono VARCHAR(20)
);
