create database bdt3castillo;
use bdt3castillo;

CREATE TABLE Domicilio
(
 IdDomicilio 		INT NOT NULL AUTO_INCREMENT,
 DescDomicilio		VARCHAR(50) NOT NULL,
 NroDomicilio 		INT NOT NULL,
 RefDomicilio 		VARCHAR(50) NOT NULL,
 PRIMARY KEY (IdDomicilio)
);

CREATE TABLE Empleado
(
 IdEmpleado 		INT NOT NULL AUTO_INCREMENT,
 Nombre 			VARCHAR(50) NOT NULL,
 Apellido 			VARCHAR(50) NOT NULL,
 FechaContrat 		DATE NOT NULL,
 IdDomicilio 		INT NOT NULL,
 PRIMARY KEY (IdEmpleado),
 FOREIGN KEY (IdDomicilio) REFERENCES DOMICILIO(IdDomicilio)
);

CREATE TABLE Autor
(
 IdAutor 		INT NOT NULL AUTO_INCREMENT,
 NomAutor		VARCHAR(50) NOT NULL,
 ApeAutor 		VARCHAR(50) NOT NULL,
 FechNacAutor	DATE NOT NULL,
 PRIMARY KEY (IdAutor)
);

CREATE TABLE Publicacion
(
 IdPublicacion 		INT NOT NULL AUTO_INCREMENT,
 Titulo 			VARCHAR(250) NOT NULL,
 Resumen 			VARCHAR(250) NOT NULL,
 FechPublicacion	DATE NOT NULL,
 IdAutor 			INT NOT NULL,
 PRIMARY KEY (IdPublicacion),
 FOREIGN KEY (IdAutor) REFERENCES Autor(IdAutor)
 );


insert into Domicilio(DescDomicilio, NroDomicilio, RefDomicilio) VALUES('Av. Guardia Civil', 1134, 'Cerca al grifo Repsol');
insert into Domicilio(DescDomicilio, NroDomicilio, RefDomicilio) VALUES('Av. La Marina', 799, 'Esquina con Sucre');
insert into Domicilio(DescDomicilio, NroDomicilio, RefDomicilio) VALUES('Jr. Huallaga', 134, 'Cercado de Lima');
insert into Domicilio(DescDomicilio, NroDomicilio, RefDomicilio) VALUES('Psje. Las Nubes', 230, 'Urb. La Florida');
insert into Domicilio(DescDomicilio, NroDomicilio, RefDomicilio) VALUES('Av. Canada', 940, 'Paradero farmacia');

INSERT INTO Empleado(Nombre,Apellido,FechaContrat,IdDomicilio) VALUES ('José Manuel','Hermanez Palacios',CURRENT_TIMESTAMP,1);
INSERT INTO Empleado(Nombre,Apellido,FechaContrat,IdDomicilio) VALUES ('Jimena','Artica Martinez',CURRENT_TIMESTAMP,2);
INSERT INTO Empleado(Nombre,Apellido,FechaContrat,IdDomicilio) VALUES ('Juan','Lazo Palacios',CURRENT_TIMESTAMP,3);
INSERT INTO Empleado(Nombre,Apellido,FechaContrat,IdDomicilio) VALUES ('Marcelo','Perez Arancibia',CURRENT_TIMESTAMP,4);

INSERT INTO Autor(NomAutor,ApeAutor,FechNacAutor) VALUES ('Luis Raul','Tolentino Palacios','1990-4-12');
INSERT INTO Autor(NomAutor,ApeAutor,FechNacAutor) VALUES ('Henry','Ramos Cordova','1988-12-17');
INSERT INTO Autor(NomAutor,ApeAutor,FechNacAutor) VALUES ('Jhairo','Crisostomo Cristobal','1970-1-15');
INSERT INTO Autor(NomAutor,ApeAutor,FechNacAutor) VALUES ('Piero','Santos Chavez','1985-5-10');
INSERT INTO Autor(NomAutor,ApeAutor,FechNacAutor) VALUES ('William','Lopez Palacios','1991-4-12');
INSERT INTO Autor(NomAutor,ApeAutor,FechNacAutor) VALUES ('Daniela','Ramos Colqui','1989-12-17');
INSERT INTO Autor(NomAutor,ApeAutor,FechNacAutor) VALUES ('Velgica','Honores Cristobal','1979-1-7');
INSERT INTO Autor(NomAutor,ApeAutor,FechNacAutor) VALUES ('Juliana','Hiriarte Huarcayo','1995-5-10');


INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Comprobación experimental',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2015-5-10',1);
INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Efectos psicológicos',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2016-3-10',1);
INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Experimento de los efectos traumáticos',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2017-7-10',1);
INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Hipotesis del significado de sueños',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2018-5-6',1);
INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Las orejas crecen toda la vida',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2019-8-24',1);
INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Apuestas y cocodrilos',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2020-12-10',1);
INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Gato sólido o líquido',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2019-5-10',1);
INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Murciélagos que beben sangre humana',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2020-5-10',1);

INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Desarrollo del mercado del piñón',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2016-5-10',2);
INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Manejo de la conectividad biológica.',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2017-3-10',2);
INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Aumento de calidad de la madera',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2018-1-10',2);
INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Producción comercial de hojas de Boldo ',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2019-4-10',2);
INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Mejoramiento de la productividad ganadera',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2020-12-10',2);

INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Desarrollo de bases técnicas y normativas para prototipos de vivienda modular,',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2017-2-10',3);
INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Fabricación de HPB para la industria de celulosa de fibra corta',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2015-5-21',3);
INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Incorporación de los bosques de Coihue de Magallanes',
'Diversos estudios en el área de la toxicología apuntan a este problema.','2020-5-2',3);


INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Factibilidad de biopulpaje  Kraft aplicado a especies del género Eucalyptus',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2019-5-11',4);
INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Producción y aplicación de hongos de pudrición blanca',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2020-5-6',4);
INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Desarrollo de un reactor molecular para la generación de energía',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2021-1-14',4);


INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Indicadores de sustentabilidad para el apoyo de negocios de turismo.',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2017-5-24',5);
INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Polo de desarrollo, innovación, tecnología y marketting',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2017-9-22',5);

INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Propuestas de modelos de gestión y conservación de la biodiversidad en bosques',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2019-5-12',6);

INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Predicción de biomasa forestal aérea',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2018-10-21',7);
INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Desarrollo de tecnologías para la producción sustentable de biomasa',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2020-5-18',7);

INSERT INTO Publicacion(Titulo,Resumen,FechPublicacion,IdAutor) VALUES ('Optimización del  proceso de tratamiento de lignocelulosas',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit.','2018-5-19',8);


CREATE TABLE usuario (
	idusuario INT auto_increment NOT NULL,
	nomusuario varchar(100) NULL,
	email varchar(200) NULL,
	password varchar(300) NULL,
	nombres varchar(100) NULL,
	apellidos varchar(100) NULL,
	activo BOOL NULL,
	CONSTRAINT users_pk PRIMARY KEY (idusuario)
);


CREATE TABLE rol (
	idrol INT auto_increment NOT NULL,
	nomrol varchar(300) NULL,
	CONSTRAINT roles_pk PRIMARY KEY (idrol)
);
insert into rol Values(null,"Coordinador");
insert into rol Values(null,"Gestor");



CREATE TABLE usuario_rol (
	idusuario INT NOT NULL,
	idrol INT NOT NULL,
	CONSTRAINT user_role_pk PRIMARY KEY (idusuario, idrol),
	CONSTRAINT user_role_FK FOREIGN KEY (idusuario) REFERENCES usuario(idusuario),
	CONSTRAINT user_role_FK_1 FOREIGN KEY (idrol) REFERENCES rol(idrol)
);