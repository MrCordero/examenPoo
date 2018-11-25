CREATE DATABASE bdcinema;
USE bdcinema;

CREATE TABLE cliente(
	id INT AUTO_INCREMENT,
	rut VARCHAR(20),
	nombre VARCHAR(30),
	mail VARCHAR(50),
	telefono VARCHAR(12),
	
	PRIMARY KEY(id),
	UNIQUE(rut)
);

CREATE TABLE director(
	id INT AUTO_INCREMENT,
	nombre VARCHAR(50),
	rut VARCHAR(30),
	nacionaidad VARCHAR(40),
	
	PRIMARY KEY(id),
	UNIQUE(rut)
);


CREATE TABLE pelicula(
    id INT AUTO_INCREMENT,
    duracion VARCHAR(6),
    idioma VARCHAR(22),
    director_fk_id INT,
    resumen VARCHAR(100),
    
    PRIMARY KEY(id),
    FOREIGN KEY (director_fk_id) REFERENCES director(id)
);

CREATE TABLE asiento(
    fila INT,
    numero INT,
    estado BOOLEAN,
    
    PRIMARY KEY(fila)
);



