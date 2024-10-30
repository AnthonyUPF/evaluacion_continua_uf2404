DROP SCHEMA IF EXISTS sql_java_7;
CREATE SCHEMA sql_java_7;
USE sql_java_7;

-- Tabla de Empleados
CREATE TABLE Empleado (
    idEmpleado INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    rol VARCHAR(50) NOT NULL,
    certificaciones VARCHAR(255),
    asignacionActual VARCHAR(100),
    turnoTrabajo VARCHAR(50)
);

-- Tabla de Hoteles Espaciales
CREATE TABLE HotelEspacial (
    idHotel INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    ubicacion VARCHAR(100) NOT NULL,
    numeroHabitaciones INT NOT NULL,
    sistemaGravedadArtificial BOOLEAN NOT NULL,
    soporteVital BOOLEAN NOT NULL
);

-- Tabla de Habitaciones
CREATE TABLE Habitacion (
    idHabitacion INT PRIMARY KEY AUTO_INCREMENT,
    tipoHabitacion VARCHAR(50) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    estado VARCHAR(50),
    idHotel INT,
    CONSTRAINT fk_habitacion_hotel FOREIGN KEY (idHotel) REFERENCES HotelEspacial(idHotel)
);

-- Tabla de Huéspedes
CREATE TABLE Huesped (
    idHuesped INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    telefono VARCHAR(15),
    direccion VARCHAR(255),
    nacionalidad VARCHAR(50)
);

-- Tabla de Inventario de Suministros
CREATE TABLE InventarioSuministros (
    idSuministro INT PRIMARY KEY AUTO_INCREMENT,
    tipoSuministro VARCHAR(50) NOT NULL,
    cantidadDisponible INT NOT NULL,
    ubicacionActual VARCHAR(100)
);

-- Tabla de Vehículos Espaciales
CREATE TABLE VehiculoEspacial (
    idVehiculo INT PRIMARY KEY AUTO_INCREMENT,
    tipoVehiculo VARCHAR(50) NOT NULL,
    capacidadCarga INT NOT NULL,
    estadoVehiculo VARCHAR(50),
    idMision INT
);

-- Tabla de Naves Espaciales
CREATE TABLE NaveEspacial (
    idNave INT PRIMARY KEY AUTO_INCREMENT,
    capacidadPasajeros INT NOT NULL,
    capacidadCarga INT NOT NULL,
    velocidadMaxima DECIMAL(10, 2) NOT NULL,
    rangoVuelo DECIMAL(10, 2) NOT NULL,
    tipoCombustible VARCHAR(50)
);

-- Tabla de Misiones
CREATE TABLE Mision (
    idMision INT PRIMARY KEY AUTO_INCREMENT,
    descripcion VARCHAR(255),
    estadoMision VARCHAR(50),
    idVehiculo INT,
    idNave INT,
    CONSTRAINT fk_mision_vehiculo FOREIGN KEY (idVehiculo) REFERENCES VehiculoEspacial(idVehiculo),
    CONSTRAINT fk_mision_nave FOREIGN KEY (idNave) REFERENCES NaveEspacial(idNave)
);

-- Tabla de Reservas
CREATE TABLE Reserva (
    idReserva INT PRIMARY KEY AUTO_INCREMENT,
    fechaReserva DATE NOT NULL,
    serviciosAdicionales VARCHAR(255),
    idHabitacion INT,
    idHuesped INT,
    estadoReserva VARCHAR(50),
    CONSTRAINT fk_reserva_habitacion FOREIGN KEY (idHabitacion) REFERENCES Habitacion(idHabitacion),
    CONSTRAINT fk_reserva_huesped FOREIGN KEY (idHuesped) REFERENCES Huesped(idHuesped)
);

-- Tabla de Rutas Interplanetarias
CREATE TABLE RutaInterplanetaria (
    idRuta INT PRIMARY KEY AUTO_INCREMENT,
    planetaOrigen VARCHAR(50) NOT NULL,
    planetaDestino VARCHAR(50) NOT NULL,
    distancia DECIMAL(10, 2) NOT NULL,
    normativaLocal VARCHAR(255)
);

-- Tabla de Telemetría de Naves
CREATE TABLE TelemetriaNave (
    idTelemetria INT PRIMARY KEY AUTO_INCREMENT,
    idNave INT,
    velocidadActual DECIMAL(10, 2),
    estadoSistemasVitales VARCHAR(255),
    CONSTRAINT fk_telemetria_nave FOREIGN KEY (idNave) REFERENCES NaveEspacial(idNave)
);

-- Tabla de Viajes Espaciales
CREATE TABLE ViajeEspacial (
    idViaje INT PRIMARY KEY AUTO_INCREMENT,
    origen VARCHAR(100) NOT NULL,
    destino VARCHAR(100) NOT NULL,
    ruta VARCHAR(255),
    tiempoEstimadoVuelo DECIMAL(10, 2) NOT NULL,
    estadoViaje VARCHAR(50),
    idNave INT,
    CONSTRAINT fk_viaje_nave FOREIGN KEY (idNave) REFERENCES NaveEspacial(idNave)
);
