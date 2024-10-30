drop schema if exists sql_java_5;
create schema sql_java_5;
use sql_java_5;

-- Tabla de Ciudadanos
CREATE TABLE Ciudadano (
    idUsuario INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(200),
    correoElectronico VARCHAR(100) UNIQUE NOT NULL,
    documentos TEXT
);

-- Tabla de Departamentos
CREATE TABLE Departamento (
    idDepartamento INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT
);

-- Tabla de Solicitudes
CREATE TABLE Solicitud (
    idSolicitud INT PRIMARY KEY AUTO_INCREMENT,
    tipoPermiso VARCHAR(100) NOT NULL,
    fechaSolicitud DATE NOT NULL,
    estado ENUM('Pendiente', 'En Revisión', 'Aprobada', 'Rechazada') NOT NULL,
    documentosAdjuntos TEXT,
    idUsuario INT,
    CONSTRAINT fk_solicitud_ciudadano FOREIGN KEY (idUsuario) REFERENCES Ciudadano(idUsuario)
);

-- Tabla de Pagos
CREATE TABLE Pago (
    idPago INT PRIMARY KEY AUTO_INCREMENT,
    monto DECIMAL(10,2) NOT NULL,
    fechaPago DATE NOT NULL,
    idSolicitud INT,
    idUsuario INT,
    CONSTRAINT fk_pago_solicitud FOREIGN KEY (idSolicitud) REFERENCES Solicitud(idSolicitud),
    CONSTRAINT fk_pago_ciudadano FOREIGN KEY (idUsuario) REFERENCES Ciudadano(idUsuario)
);

-- Tabla de Citas
CREATE TABLE Cita (
    idCita INT PRIMARY KEY AUTO_INCREMENT,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    motivo VARCHAR(200),
    idDepartamento INT,
    idUsuario INT,
    CONSTRAINT fk_cita_departamento FOREIGN KEY (idDepartamento) REFERENCES Departamento(idDepartamento),
    CONSTRAINT fk_cita_ciudadano FOREIGN KEY (idUsuario) REFERENCES Ciudadano(idUsuario)
);

-- Tabla de Empleados
CREATE TABLE Empleado (
    idEmpleado INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    idDepartamento INT,
    CONSTRAINT fk_empleado_departamento FOREIGN KEY (idDepartamento) REFERENCES Departamento(idDepartamento)
);

-- Tabla de Reportes
CREATE TABLE Reporte (
    idReporte INT PRIMARY KEY AUTO_INCREMENT,
    tipoReporte ENUM('Solicitudes Procesadas', 'Tiempo Promedio de Aprobación', 'Recaudación por Tasas') NOT NULL,
    fechaGeneracion DATE NOT NULL
);
