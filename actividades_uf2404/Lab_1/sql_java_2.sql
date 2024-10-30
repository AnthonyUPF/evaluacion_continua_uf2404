drop schema if exists sql_java_2;
create schema sql_java_2;
use sql_java_2;

-- Tabla de Profesores
CREATE TABLE Profesor (
    idProfesor INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

-- Tabla de Estudiantes
CREATE TABLE Estudiante (
    idEstudiante INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

-- Tabla de Cursos
CREATE TABLE Curso (
    idCurso INT PRIMARY KEY AUTO_INCREMENT,
    nombreCurso VARCHAR(100) NOT NULL,
    descripcion TEXT,
    fechaInicio DATE,
    fechaFin DATE,
    idProfesor INT,
    cantidadMaxEstudiantes INT,
    CONSTRAINT fk_curso_profesor FOREIGN KEY (idProfesor) REFERENCES Profesor(idProfesor)
);

-- Tabla de Materiales
CREATE TABLE Material (
    idMaterial INT PRIMARY KEY AUTO_INCREMENT,
    tipo ENUM('Documento', 'Video', 'Enlace'),
    descripcion TEXT,
    idCurso INT,
    CONSTRAINT fk_material_curso FOREIGN KEY (idCurso) REFERENCES Curso(idCurso)
);

-- Tabla de Tareas
CREATE TABLE Tarea (
    idTarea INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    descripcion TEXT,
    fechaEntrega DATE,
    estado ENUM('Pendiente', 'Revisada', 'Aprobada'),
    idCurso INT,
    CONSTRAINT fk_tarea_curso FOREIGN KEY (idCurso) REFERENCES Curso(idCurso)
);

-- Tabla de Calificaciones
CREATE TABLE Calificacion (
    idEstudiante INT,
    idTarea INT,
    nota DECIMAL(5,2),
    PRIMARY KEY (idEstudiante, idTarea),
    CONSTRAINT fk_calif_estudiante FOREIGN KEY (idEstudiante) REFERENCES Estudiante(idEstudiante),
    CONSTRAINT fk_calif_tarea FOREIGN KEY (idTarea) REFERENCES Tarea(idTarea)
);

-- Tabla de Foros
CREATE TABLE Foro (
    idForo INT PRIMARY KEY AUTO_INCREMENT,
    idCurso INT,
    CONSTRAINT fk_foro_curso FOREIGN KEY (idCurso) REFERENCES Curso(idCurso)
);

-- Tabla de Mensajes
CREATE TABLE Mensaje (
    idMensaje INT PRIMARY KEY AUTO_INCREMENT,
    texto TEXT NOT NULL,
    fecha DATETIME NOT NULL,
    autor ENUM('Estudiante', 'Profesor'),
    idForo INT,
    CONSTRAINT fk_mensaje_foro FOREIGN KEY (idForo) REFERENCES Foro(idForo)
);
