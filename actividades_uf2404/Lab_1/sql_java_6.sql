drop schema if exists sql_java_6;
create schema sql_java_6;
use sql_java_6;

-- Tabla de Clientes
CREATE TABLE Cliente (
    idCliente INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(200),
    correoElectronico VARCHAR(100) UNIQUE NOT NULL,
    telefono VARCHAR(15)
);

-- Tabla de Pólizas
CREATE TABLE Poliza (
    idPoliza INT PRIMARY KEY AUTO_INCREMENT,
    tipoSeguro ENUM('Vehículo', 'Hogar', 'Vida') NOT NULL,
    fechaInicio DATE NOT NULL,
    fechaExpiracion DATE NOT NULL,
    montoAsegurado DECIMAL(15, 2) NOT NULL,
    estadoPoliza ENUM('Activa', 'Expirada', 'Cancelada') NOT NULL,
    idCliente INT,
    CONSTRAINT fk_poliza_cliente FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente)
);

-- Tabla de Reclamaciones
CREATE TABLE Reclamacion (
    idReclamacion INT PRIMARY KEY AUTO_INCREMENT,
    fechaPresentacion DATE NOT NULL,
    montoReclamado DECIMAL(10, 2) NOT NULL,
    estadoReclamacion ENUM('Pendiente', 'En Revisión', 'Aprobada', 'Rechazada') NOT NULL,
    documentosAdjuntos TEXT,
    idPoliza INT,
    CONSTRAINT fk_reclamacion_poliza FOREIGN KEY (idPoliza) REFERENCES Poliza(idPoliza)
);

-- Tabla de Transacciones
CREATE TABLE Transaccion (
    idTransaccion INT PRIMARY KEY AUTO_INCREMENT,
    monto DECIMAL(10, 2) NOT NULL,
    fechaTransaccion DATE NOT NULL,
    idCliente INT,
    idPoliza INT,
    CONSTRAINT fk_transaccion_cliente FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente),
    CONSTRAINT fk_transaccion_poliza FOREIGN KEY (idPoliza) REFERENCES Poliza(idPoliza)
);

-- Tabla de Agentes
CREATE TABLE Agente (
    idAgente INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    idCliente INT,
    CONSTRAINT fk_agente_cliente FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente)
);

-- Tabla de Recordatorios
CREATE TABLE Recordatorio (
    idRecordatorio INT PRIMARY KEY AUTO_INCREMENT,
    fechaEnvio DATE NOT NULL,
    mensaje VARCHAR(255) NOT NULL,
    idPoliza INT,
    CONSTRAINT fk_recordatorio_poliza FOREIGN KEY (idPoliza) REFERENCES Poliza(idPoliza)
);

-- Tabla de Informes
CREATE TABLE Informe (
    idInforme INT PRIMARY KEY AUTO_INCREMENT,
    tipoInforme ENUM('Pólizas Activas', 'Reclamaciones Pendientes', 'Historial de Renovaciones') NOT NULL,
    fechaGeneracion DATE NOT NULL
);
