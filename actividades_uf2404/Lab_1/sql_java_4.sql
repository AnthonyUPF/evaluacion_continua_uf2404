drop schema if exists sql_java_4;
create schema sql_java_4;
use sql_java_4;

-- Tabla de Usuarios
CREATE TABLE Usuario (
    idUsuario INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

-- Tabla de Salas
CREATE TABLE Sala (
    idSala INT PRIMARY KEY AUTO_INCREMENT,
    ubicacion VARCHAR(100) NOT NULL,
    capacidadMaxima INT NOT NULL
);

-- Tabla de Equipamientos
CREATE TABLE Equipamiento (
    idEquipamiento INT PRIMARY KEY AUTO_INCREMENT,
    tipo VARCHAR(100) NOT NULL,
    descripcion TEXT,
    idSala INT,
    CONSTRAINT fk_equipamiento_sala FOREIGN KEY (idSala) REFERENCES Sala(idSala)
);

-- Tabla de Reservas
CREATE TABLE Reserva (
    idReserva INT PRIMARY KEY AUTO_INCREMENT,
    fecha DATE NOT NULL,
    horaInicio TIME NOT NULL,
    horaFin TIME NOT NULL,
    idUsuario INT,
    CONSTRAINT fk_reserva_usuario FOREIGN KEY (idUsuario) REFERENCES Usuario(idUsuario)
);

-- Tabla de Recordatorios
CREATE TABLE Recordatorio (
    idRecordatorio INT PRIMARY KEY AUTO_INCREMENT,
    idReserva INT,
    tipoRecordatorio ENUM('Email', 'SMS') NOT NULL,
    CONSTRAINT fk_recordatorio_reserva FOREIGN KEY (idReserva) REFERENCES Reserva(idReserva)
);

-- Tabla de Reportes
CREATE TABLE Reporte (
    idReporte INT PRIMARY KEY AUTO_INCREMENT,
    tipoReporte ENUM('Tasa de Ocupación', 'Frecuencia de Uso', 'Problemas Reportados') NOT NULL,
    fechaGeneracion DATE NOT NULL
);
