DROP DATABASE IF EXISTS bdcinema;
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

INSERT INTO cliente VALUES(NULL,'111-1','nombre1','email1@gmail.com','+56912345');
INSERT INTO cliente VALUES(NULL,'222-2','nombre2','email2@gmail.com','+56978945');

CREATE TABLE director(
    id INT AUTO_INCREMENT,
    rut VARCHAR(30),
    nombre VARCHAR(50),
    nacionaidad VARCHAR(40),
	
    PRIMARY KEY(id),
    UNIQUE(rut)
);

INSERT INTO director VALUES(NULL,'333-3','directo1','Chile');
INSERT INTO director VALUES(NULL,'444-4','directo2','Argentina');

CREATE TABLE pelicula(
    id INT AUTO_INCREMENT,
    nombre VARCHAR(50),
    duracion VARCHAR(6),
    idioma VARCHAR(22),
    director VARCHAR(50),
    resumen VARCHAR(100),
    
    PRIMARY KEY(id)
);

INSERT INTO pelicula VALUES(NULL,'nombre1','1:20','Ingles','director1','resumen 1');
INSERT INTO pelicula VALUES(NULL,'nombre2','1:40','Latino','director2','resumen 2');

CREATE TABLE asiento(
    fila INT,
    numero INT,
    estado BOOLEAN,
    
    PRIMARY KEY(fila)
);

CREATE TABLE sala(
    id INT AUTO_INCREMENT,
    tipo_de_sala VARCHAR (5),
    asiento_fk_id INT,
    
    PRIMARY KEY (id),
    FOREIGN KEY (asiento_fk_id) REFERENCES asiento(fila)
);

CREATE TABLE proyeccion(
    id INT AUTO_INCREMENT,
    pelicula VARCHAR(50),
    horario VARCHAR(7),
    fecha VARCHAR(15),
    sala VARCHAR(45),
    localidad VARCHAR(66),
    precio int,
    
    PRIMARY KEY(id) 
);

CREATE TABLE tipo_venta(
    id INT AUTO_INCREMENT,
    tipo_venta VARCHAR(50),

    PRIMARY KEY(id),
    UNIQUE (tipo_venta)
);

INSERT INTO tipo_venta VALUES(NULL,'venta internet');
INSERT INTO tipo_venta VALUES(NULL,'venta telefónica');
INSERT INTO tipo_venta VALUES(NULL,'venta presencial');

CREATE TABLE venta(
    id INT AUTO_INCREMENT,
    cliente_id_fk INT,
    tipo_venta_id_fk INT,
    cantidad INT,

    PRIMARY KEY(id),
    FOREIGN KEY(cliente_id_fk) REFERENCES cliente(id),
    FOREIGN KEY(tipo_venta_id_fk) REFERENCES tipo_venta(id)
);