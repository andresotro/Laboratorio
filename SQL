CREATE DATABASE laboratorio;
USE laboratorio;

CREATE TABLE ciudad(IDCiudad INTEGER(11) NOT NULL AUTO_INCREMENT, Nombre VARCHAR(100) NOT NULL, PRIMARY KEY(IDCiudad));

CREATE TABLE paciente(IDPaciente INTEGER(11) NOT NULL AUTO_INCREMENT, Nombre VARCHAR(100) NOT NULL, Apellido VARCHAR(100) NOT NULL, Edad INT(11) NOT NULL,
					  Direccion_casa VARCHAR(100) NOT NULL, IDCiudad INTEGER(11), IDGenero INTEGER(11) NOT NULL, PRIMARY KEY(IDPaciente));
					  
CREATE TABLE remision(IDRemision INTEGER(11) NOT NULL AUTO_INCREMENT, IDPaciente INTEGER(11) NOT NULL, Fecha DATE NOT NULL, 
                      IDMedico INTEGER(11) NOT NULL, PRIMARY KEY(IDRemision));
					  
CREATE TABLE medico(IDMedico INTEGER(11) NOT NULL AUTO_INCREMENT, Nombre VARCHAR(100) NOT NULL, Apellido VARCHAR(100) NOT NULL,
                    Telefono INTEGER(10) NOT NULL, Nro_Registros INTEGER(11) DEFAULT 0, PRIMARY KEY(IDMedico));
					
CREATE TABLE examen(IDExamen INTEGER(11) NOT NULL AUTO_INCREMENT, Nombre VARCHAR(100) NOT NULL, Descripcion VARCHAR(255) NOT NULL,
					PRIMARY KEY(IDExamen));
					
CREATE TABLE remision_examen(IDRemision INTEGER(11) NOT NULL AUTO_INCREMENT, IDExamen INTEGER(11) NOT NULL, 
							 PRIMARY KEY(IDRemision, IDExamen));

CREATE TABLE bacteriologa(IDBacteriologa INTEGER(11) NOT NULL AUTO_INCREMENT, Nombre VARCHAR(100) NOT NULL, Apellido VARCHAR(100) NOT NULL,
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

INSERT INTO paciente(Nombre, Apellido, Edad, Direccion_casa, IDCiudad, IDGenero) VALUES
	("James", "Rodríguez", 22, "Carrera 7 # 84-72", 1, 1),
	("Jose", "Gomez", 35, "Calle 12 # 34-30", 1, 1),
	("Rosa", "Elvira", 68, "Carrera 4 # 4-36", 5, 2),
	("Alejandra", "Ortiz", 28, "Calle 3 # 4-89", 5, 2),
	("Alejandro", "Cano", 45, "Calle 1 # 10-8", 2, 1),
	("Manuel", "Castellanos", 58, "Calle 5 # 7-51", 2, 1),
	("Maria", "Jiménez", 25, "Carrera 2 Este # 21-92", 3, 2),
	("Carlos", "Cisneros", 58, "Carrera 4 # 2-72", 3, 1),
	("Manuela", "Ballen", 88, "Carrera 6 # 7-53", 4, 2),
	("Karol", "Ballesteros", 39, "Carrera 6 # 41-05", 4, 2),
	("David", "Silva", 31, "Calle 10 # 5-76", 6, 1),
	("Carolina", "Galvis", 63, "Calle 7 # 11-02", 6, 2);
