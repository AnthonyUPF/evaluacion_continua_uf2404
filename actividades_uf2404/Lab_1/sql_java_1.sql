drop schema if exists sql_java_1;
create schema sql_java_1;
use sql_java_1;

-- Tabla de Roles
CREATE TABLE Rol (
    idRol INT PRIMARY KEY AUTO_INCREMENT,
    nombreRol VARCHAR(50) NOT NULL
);

-- Tabla de Usuarios
CREATE TABLE Usuario (
    idUsuario INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    idRol INT,
    CONSTRAINT fk_usuario_rol FOREIGN KEY (idRol) REFERENCES Rol(idRol)
);

-- Tabla de Categorías
CREATE TABLE Categoria (
    idCategoria INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255)
);

-- Tabla de Proveedores
CREATE TABLE Proveedor (
    idProveedor INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(255),
    contacto VARCHAR(50)
);

-- Tabla de Productos
CREATE TABLE Producto (
    idProducto INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precioUnitario DECIMAL(10, 2) NOT NULL,
    cantidadEnStock INT NOT NULL,
    fechaAdquisicion DATE NOT NULL,
    fechaCaducidad DATE,
    idCategoria INT,
    idProveedor INT,
    CONSTRAINT fk_producto_categoria FOREIGN KEY (idCategoria) REFERENCES Categoria(idCategoria),
    CONSTRAINT fk_producto_proveedor FOREIGN KEY (idProveedor) REFERENCES Proveedor(idProveedor)
);

-- Tabla de Notificaciones
CREATE TABLE Notificacion (
    idNotificacion INT PRIMARY KEY AUTO_INCREMENT,
    tipoNotificacion ENUM('Caducidad', 'BajaCantidad') NOT NULL,
    fecha DATE NOT NULL,
    idProducto INT,
    CONSTRAINT fk_notificacion_producto FOREIGN KEY (idProducto) REFERENCES Producto(idProducto)
);

-- Tabla de Reportes
CREATE TABLE Reporte (
    idReporte INT PRIMARY KEY AUTO_INCREMENT,
    tipoReporte ENUM('BajaCantidad', 'ProximoCaducar', 'ValorTotalInventario') NOT NULL,
    fechaGeneracion DATE NOT NULL,
    idUsuario INT,
    CONSTRAINT fk_reporte_usuario FOREIGN KEY (idUsuario) REFERENCES Usuario(idUsuario)
);
