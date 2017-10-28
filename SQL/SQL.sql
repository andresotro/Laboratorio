CREATE DATABASE laboratorio;
USE laboratorio;

CREATE TABLE ciudad(IDCiudad INTEGER(11) NOT NULL AUTO_INCREMENT, Nombre VARCHAR(100) NOT NULL, PRIMARY KEY(IDCiudad));

CREATE TABLE paciente(IDPaciente INTEGER(11) NOT NULL AUTO_INCREMENT, Nombre VARCHAR(100) NOT NULL, Apellido VARCHAR(100) NOT NULL, 
					  Identificacion BIGINT(10) NOT NULL UNIQUE, Edad INT(11) NOT NULL, Direccion_casa VARCHAR(100) NOT NULL, IDCiudad INTEGER(11), 
					  Usuario VARCHAR(50) NOT NULL UNIQUE, Password VARCHAR(100) NOT NULL, IDGenero INTEGER(11) NOT NULL, PRIMARY KEY(IDPaciente));
					  
CREATE TABLE remision(IDRemision INTEGER(11) NOT NULL AUTO_INCREMENT, IDPaciente INTEGER(11) NOT NULL, Fecha DATE NOT NULL, 
                      IDMedico INTEGER(11) NOT NULL, PRIMARY KEY(IDRemision));
					  
CREATE TABLE medico(IDMedico INTEGER(11) NOT NULL AUTO_INCREMENT, Nombre VARCHAR(100) NOT NULL, Apellido VARCHAR(100) NOT NULL,
                    Telefono BIGINT(11) NOT NULL, Nro_Registros INTEGER(11) DEFAULT 0, Usuario VARCHAR(50) NOT NULL UNIQUE, 
					Password VARCHAR(100) NOT NULL, Identificacion BIGINT(10) NOT NULL UNIQUE, PRIMARY KEY(IDMedico));
					
CREATE TABLE examen(IDExamen INTEGER(11) NOT NULL AUTO_INCREMENT, Nombre VARCHAR(100) NOT NULL, Descripcion VARCHAR(255) NOT NULL,
					PRIMARY KEY(IDExamen));
					
CREATE TABLE remision_examen(IDRemision INTEGER(11) NOT NULL AUTO_INCREMENT, IDExamen INTEGER(11) NOT NULL, 
							 PRIMARY KEY(IDRemision, IDExamen));

CREATE TABLE bacteriologa(IDBacteriologa INTEGER(11) NOT NULL AUTO_INCREMENT, Nombre VARCHAR(100) NOT NULL, Apellido VARCHAR(100) NOT NULL,
						  Usuario VARCHAR(50) NOT NULL UNIQUE, Password VARCHAR(100) NOT NULL, Identificacion BIGINT(10) NOT NULL UNIQUE,
						  PRIMARY KEY(IDBacteriologa));
						  
CREATE TABLE laboratorio(IDLaboratorio INTEGER(11) NOT NULL, NIT VARCHAR(20) NOT NULL, Nombre VARCHAR(100) NOT NULL,
						PRIMARY KEY(IDLaboratorio));
						
CREATE TABLE parametro(IDParametro INTEGER(11) NOT NULL AUTO_INCREMENT, IDExamen INTEGER(11), ValorMinimo INT(11) NOT NULL, 
					   ValorMaximo INT(11) NOT NULL, Nombre VARCHAR(100) NOT NULL, Descripcion VARCHAR(255) NOT NULL, 
					   PRIMARY KEY(IDParametro));
					   
CREATE TABLE resultado(IDResultado INTEGER(11) NOT NULL AUTO_INCREMENT, IDParametro INTEGER(11) NOT NULL, IDPaciente INTEGER(11) NOT NULL,
					   Valor INT(11) NOT NULL, IDBacteriologa INTEGER(11) NOT NULL, Fecha_Realizacion DATE NOT NULL, PRIMARY KEY(IDResultado));
					   
CREATE TABLE genero(IDGenero INTEGER(11) NOT NULL AUTO_INCREMENT, Genero VARCHAR(100) NOT NULL, PRIMARY KEY(IDGenero));
					   
ALTER TABLE paciente ADD CONSTRAINT paciente_ciudad FOREIGN KEY(IDCiudad) REFERENCES ciudad(IDCiudad) ON DELETE CASCADE;
ALTER TABLE paciente ADD CONSTRAINT paciente_genero FOREIGN KEY(IDGenero) REFERENCES genero(IDGenero) ON DELETE CASCADE;
ALTER TABLE remision ADD CONSTRAINT paciente_remision FOREIGN KEY(IDPaciente) REFERENCES paciente(IDPaciente) ON DELETE CASCADE;
ALTER TABLE remision ADD CONSTRAINT medico_remision FOREIGN KEY(IDMedico) REFERENCES medico(IDMedico) ON DELETE CASCADE;
ALTER TABLE remision_examen ADD CONSTRAINT remision_examen FOREIGN KEY(IDRemision) REFERENCES remision(IDRemision) ON DELETE CASCADE;
ALTER TABLE remision_examen ADD CONSTRAINT examen_remision FOREIGN KEY(IDExamen) REFERENCES examen(IDExamen) ON DELETE CASCADE;
ALTER TABLE parametro ADD CONSTRAINT examen_parametro FOREIGN KEY(IDExamen) REFERENCES examen(IDExamen) ON DELETE CASCADE;
ALTER TABLE resultado ADD CONSTRAINT resultado_paciente FOREIGN KEY(IDPaciente) REFERENCES paciente(IDPaciente) ON DELETE CASCADE;
ALTER TABLE resultado ADD CONSTRAINT resultado_parametro FOREIGN KEY(IDParametro) REFERENCES parametro(IDParametro) ON DELETE CASCADE;
ALTER TABLE resultado ADD CONSTRAINT resultado_bacteriologa FOREIGN KEY(IDBacteriologa) REFERENCES bacteriologa(IDBacteriologa) ON DELETE CASCADE;

INSERT INTO ciudad(Nombre) VALUES
	("Bogotá"), ("Zipaquirá"), ("Chia"), ("Cajicá"), ("Sopó"), ("Tocancipá");
	
INSERT INTO genero(Genero) VALUES
	("Masculino"), ("Femenino");

INSERT INTO paciente(Nombre, Apellido, Identificacion, Edad, Direccion_casa, IDCiudad, Usuario, Password, IDGenero) VALUES
	("James", "Rodríguez", 1075939211, 22, "Carrera 7 # 84-72", 1, "JaMe", "SoyJames", 1),
	("Jose", "Gomez", 1015435278, 35, "Calle 12 # 34-30", 1, "JoGo", "JuegoenBrasileiro", 1),
	("Rosa", "Elvira", 845939933, 68, "Carrera 4 # 4-36", 5, "RoEl", "Elnoyo", 2),
	("Alejandra", "Ortiz", 775954901, 34, "Calle 3 # 4-89", 5, "AleOr", "Yeseusuarioque", 2),
	("Alejandro", "Cano", 1055745198, 45, "Calle 1 # 10-8", 2, "AlCano", "ProfesorProfeta", 1),
	("Manuel", "Castellanos", 1001748999, 58, "Calle 5 # 7-51", 2, "ManuCastel", "DonManu1", 1),
	("Maria", "Jiménez", 955712568, 25, "Carrera 2 Este # 21-92", 3, "MarJim", "Nomegustaelmar", 2),
	("Carlos", "Cisneros", 555776654, 58, "Carrera 4 # 2-72", 3, "Carsis", "Carroconsis", 1),
	("Manuela", "Ballen", 405745205, 88, "Carrera 6 # 7-53", 4, "ManuBalle", "Bilobedvalle",2),
	("Karol", "Ballesteros", 823009345, 39, "Carrera 6 # 41-05", 4, "KarolBal", "Pelotacalorada", 2),
	("David", "Silva", 1001235120, 31, "Calle 10 # 5-76", 6, "ElcalvoSilva", "MagodelCity21", 1),
	("Carolina", "Galvis", 705679390, 63, "Calle 7 # 11-02", 6, "CaroGal", "PrimeraGal",2);
	
INSERT INTO medico(Nombre, Apellido, Telefono, Usuario, Password, Identificacion) VALUES
	("Juan", "Ospina", 3145679304, "JuanEs", "CantanteFalso", 705679399),
	("Felipe", "García", 3152390567, "FelipGarcia", "Comoelchiqui", 605109391),
	("Andres", "Perdigón", 3110568490, "Andresper", "EnseñenmeBDplz", 1066791901),
	("Alex", "Rozo", 3120009879, "Alzorro", "Midocomo190", 902616459),
	("Jenny", "Perez", 3157390405, "Jenpe", "HailNintendo", 456971432),
	("Natalia", "Rivera", 3170988890, "Nariver", "JodeteBoca", 376669666),
	("Diego", "Sandoval", 3167829983, "DieSan", "Diegosensei", 895673426),
	("Fran", "Luque", 3133334333, "FLuqueño", "BolivianosSA", 1078673109);
	
INSERT INTO bacteriologa(Nombre, Apellido, Usuario, Password, Identificacion) VALUES
	("Laura", "Soto", "LauraSo", "Iosequesabesquienesjpg", 1045630975),
	("Karen", "Correa", "KarCor", "Khalesieasteregg", 897304591);

INSERT INTO remision(IDPaciente, Fecha, IDMedico) VALUES
	(1, "2015-06-07", 3),
	(2, "2017-01-29", 8),
	(3, "2011-09-09", 8),
	(3, "2015-02-12", 1),
	(4, "2017-07-19", 2),
	(5, "2010-03-10", 4),
	(6, "2014-07-09", 6),
	(6, "2015-01-03", 7),
	(6, "2011-09-12", 5),
	(8, "2012-12-22", 1),
	(8, "2016-11-05", 4),
	(9, "2013-06-29", 3),
	(10, "2017-10-28", 5),
	(11, "2009-08-22", 7),
	(12, "2010-10-10", 8),
	(12, "2011-08-01", 1);










