drop schema if exists sql_java_3;
create schema sql_java_3;
use sql_java_3;

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
    nombre VARCHAR(100) NOT NULL
);

-- Tabla de Promociones
CREATE TABLE Promocion (
    idPromocion INT PRIMARY KEY AUTO_INCREMENT,
    descripcion VARCHAR(255),
    descuento DECIMAL(5,2) NOT NULL
);

-- Tabla de Productos
CREATE TABLE Producto (
    idProducto INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10,2) NOT NULL,
    cantidadDisponible INT NOT NULL,
    idCategoria INT,
    idPromocion INT,
    CONSTRAINT fk_producto_categoria FOREIGN KEY (idCategoria) REFERENCES Categoria(idCategoria),
    CONSTRAINT fk_producto_promocion FOREIGN KEY (idPromocion) REFERENCES Promocion(idPromocion)
);

-- Tabla de Clientes
CREATE TABLE Cliente (
    idCliente INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    telefono VARCHAR(20)
);

-- Tabla de Carritos
CREATE TABLE Carrito (
    idCarrito INT PRIMARY KEY AUTO_INCREMENT,
    idCliente INT,
    CONSTRAINT fk_carrito_cliente FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente)
);

-- Tabla de Métodos de Pago
CREATE TABLE MetodoPago (
    idMetodo INT PRIMARY KEY AUTO_INCREMENT,
    tipo ENUM('Tarjeta de Crédito', 'PayPal', 'Transferencia') NOT NULL
);

-- Tabla de Pedidos
CREATE TABLE Pedido (
    idPedido INT PRIMARY KEY AUTO_INCREMENT,
    fecha DATETIME NOT NULL,
    idCliente INT,
    metodoPago INT,
    estado ENUM('Pendiente', 'Enviado', 'Entregado', 'Cancelado'),
    CONSTRAINT fk_pedido_cliente FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente),
    CONSTRAINT fk_pedido_metodo FOREIGN KEY (metodoPago) REFERENCES MetodoPago(idMetodo)
);

-- Tabla de Reportes
CREATE TABLE Reporte (
    idReporte INT PRIMARY KEY AUTO_INCREMENT,
    tipoReporte ENUM('Ventas por Categoría', 'Ventas por Periodo', 'Productos Más Vendidos') NOT NULL,
    fechaGeneracion DATE NOT NULL
);
