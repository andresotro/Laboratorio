CREATE DATABASE laboratorio;
USE laboratorio;

CREATE TABLE ciudad(IDCiudad INTEGER(11) NOT NULL AUTO_INCREMENT, Nombre VARCHAR(100) NOT NULL, PRIMARY KEY(IDCiudad));

CREATE TABLE paciente(IDPaciente INTEGER(11) NOT NULL AUTO_INCREMENT, Nombre VARCHAR(100) NOT NULL, Apellido VARCHAR(100) NOT NULL, 
					  Identificacion BIGINT(10) NOT NULL UNIQUE, Edad INTEGER(11) NOT NULL, Direccion_casa VARCHAR(100) NOT NULL, IDCiudad INTEGER(11), 
					  Usuario VARCHAR(50) NOT NULL UNIQUE, Password VARCHAR(100) NOT NULL, IDGenero INTEGER(11) NOT NULL, PRIMARY KEY(IDPaciente));
					  
CREATE TABLE remision(IDRemision INTEGER(11) NOT NULL AUTO_INCREMENT, IDPaciente INTEGER(11) NOT NULL, Fecha DATE NOT NULL, 
					  VerificaParametros BOOLEAN DEFAULT FALSE, IDMedico INTEGER(11) NOT NULL, Razon VARCHAR(255) NOT NULL, PRIMARY KEY(IDRemision));
					  
CREATE TABLE medico(IDMedico INTEGER(11) NOT NULL AUTO_INCREMENT, Nombre VARCHAR(100) NOT NULL, Apellido VARCHAR(100) NOT NULL, IDGenero INTEGER(11) NOT NULL,
                    Telefono BIGINT(11) NOT NULL, Nro_Registros INTEGER(11) DEFAULT 0, Usuario VARCHAR(50) NOT NULL UNIQUE, 
					Password VARCHAR(100) NOT NULL, Identificacion BIGINT(10) NOT NULL UNIQUE, PRIMARY KEY(IDMedico));
					
CREATE TABLE examen(IDExamen INTEGER(11) NOT NULL AUTO_INCREMENT, Nombre VARCHAR(100) NOT NULL, Descripcion VARCHAR(255) NOT NULL,
					PRIMARY KEY(IDExamen));
					
CREATE TABLE remision_examen(IDRemision INTEGER(11) NOT NULL, IDExamen INTEGER(11) NOT NULL, 
							 PRIMARY KEY(IDRemision, IDExamen));

CREATE TABLE bacteriologa(IDBacteriologa INTEGER(11) NOT NULL AUTO_INCREMENT, Nombre VARCHAR(100) NOT NULL, Apellido VARCHAR(100) NOT NULL,
						  Usuario VARCHAR(50) NOT NULL UNIQUE, Password VARCHAR(100) NOT NULL, Identificacion BIGINT(10) NOT NULL UNIQUE,
						  PRIMARY KEY(IDBacteriologa));
						  
CREATE TABLE laboratorio(IDLaboratorio INTEGER(11) NOT NULL, NIT VARCHAR(20) NOT NULL, Nombre VARCHAR(100) NOT NULL,
						PRIMARY KEY(IDLaboratorio));
						
CREATE TABLE parametro(IDParametro INTEGER(11) NOT NULL AUTO_INCREMENT, IDExamen INTEGER(11), ValorMinimo FLOAT NOT NULL, 
					   ValorMaximo FLOAT NOT NULL, Nombre VARCHAR(100) NOT NULL, Descripcion VARCHAR(255) NOT NULL, 
					   PRIMARY KEY(IDParametro));
					   
CREATE TABLE resultado(IDResultado INTEGER(11) NOT NULL AUTO_INCREMENT, IDParametro INTEGER(11) NOT NULL, IDPaciente INTEGER(11) NOT NULL,
					   Valor FLOAT NOT NULL, IDBacteriologa INTEGER(11) NOT NULL, Fecha_Realizacion DATE NOT NULL, PRIMARY KEY(IDResultado));
					   
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
	("James", "Rodríguez", 1075939211, 23, "Carrera 7 # 84-72", 1, "JaMe", "SoyJames", 1),
	("Jose", "Gomez", 1015435278, 41, "Calle 12 # 34-30", 1, "JoGo", "JuegoenBrasileiro", 1),
	("Rosa", "Elvira", 845939933, 67, "Carrera 4 # 4-36", 5, "RoEl", "Elnoyo", 2),
	("Alejandra", "Ortiz", 775954901, 35, "Calle 3 # 4-89", 5, "AleOr", "Yeseusuarioque", 2),
	("Alejandro", "Cano", 1055745198, 45, "Calle 1 # 10-8", 2, "AlCano", "ProfesorProfeta", 1),
	("Manuel", "Castellanos", 1001748999, 52, "Calle 5 # 7-51", 2, "ManuCastel", "DonManu1", 1),
	("Maria", "Jiménez", 955712568, 22, "Carrera 2 Este # 21-92", 3, "MarJim", "Nomegustaelmar", 2),
	("Carlos", "Cisneros", 555776654, 29, "Carrera 4 # 2-72", 3, "Carsis", "Carroconsis", 1),
	("Manuela", "Ballen", 405745205, 88, "Carrera 6 # 7-53", 4, "ManuBalle", "Bilobedvalle",2),
	("Karol", "Ballesteros", 823009345, 47, "Carrera 6 # 41-05", 4, "KarolBal", "Pelotacalorada", 2),
	("David", "Silva", 1001235120, 20, "Calle 10 # 5-76", 6, "ElcalvoSilva", "MagodelCity21", 1),
	("Carolina", "Galvis", 705679390, 61, "Calle 7 # 11-02", 6, "CaroGal", "PrimeraGal",2);
	
INSERT INTO medico(Nombre, Apellido, IDGenero, Telefono, Usuario, Password, Identificacion) VALUES
	("Juan", "Ospina", 1, 3145679304, "JuanEs", "CantanteFalso", 705679399),
	("Felipe", "García", 1, 3152390567, "FelipGarcia", "Comoelchiqui", 605109391),
	("Andres", "Perdigón", 1, 3110568490, "Andresper", "EnseñenmeBDplz", 1066791901),
	("Alex", "Rozo", 1, 3120009879, "Alzorro", "Midocomo190", 902616459),
	("Jenny", "Perez", 2, 3157390405, "Jenpe", "HailNintendo", 456971432),
	("Natalia", "Rivera", 2, 3170988890, "Nariver", "JodeteBoca", 376669666),
	("Diego", "Sandoval", 1, 3167829983, "DieSan", "Diegosensei", 895673426),
	("Fran", "Luque", 1, 3133334333, "FLuqueño", "BolivianosSA", 1078673109);
	
INSERT INTO bacteriologa(Nombre, Apellido, Usuario, Password, Identificacion) VALUES
	("Laura", "Soto", "LauraSo", "Iosequesabesquienesjpg", 1045630975),
	("Karen", "Correa", "KarCor", "Khalesieasteregg", 897304591);

INSERT INTO examen(Nombre, Descripcion) VALUES
	("Hemograma", "En el se reflejan todos los elementos o componentes de la sangre, su número, su proporción en el organismo y si sufren alteraciones"),
	("Urianálisis", "Usado para detectar y medir de manera semicuantitativa distintos componentes eliminados por la orina, incluyendo 
	productos intermediarios del metabolismo así como también células, bacterias y fragmentos celulares."),
	("Examen de Heces",  "Usado para detectar enfermedades de todo el tubo digestivo y las glándulas asociadas."),
	("Perfil Renal", "Usado para detectar qué personas pueden presentar un mayor riesgo de desarrollar enfermedad 
	renal o para monitorizar a las que ya la han desarrollado."),
	("Perfil Lipídico", "Usado para determinar el estado del metabolismo de los lípidos corporales."),
	("Perfil Hepático", "Usado para medir la presencia de algunas enzimas, proteínas y bilirrubina en sangre, 
	con el objetivo de determinar si existe alguna alteración en el hígado."),
	("Perfil Tiroidéo", "Utilizado para evaluar la función tiroidea y/o como ayuda en el diagnóstico del hipotiroidismo y del hipertiroidismo 
	debidos a diversas alteraciones de la tiroides.");
	
INSERT INTO parametro(IDExamen, ValorMinimo, ValorMaximo, Nombre, Descripcion) VALUES
	(1, 4.50, 6.20, "Globulos Rojos", "Celulas Sanguineas mas Importantes."),
	(1, 14, 17.5, "Hemoglobina", "Proteina formada por el hierro."),
	(1, 0.9, 4.52, "Linfocitos", "Tipos de Globulos Blancos."),
	(1, 0.09, 0.45, "Eosinófilos", "Tipos de Globulos Blancos."),
	(1, 150, 450, "Plaquetas", "Elementos mas Pequeños de la Sangre."),
	(1, 88, 100, "VCM", "Volumen Corpuscular Medio."),
	(1, 0, 1.24, "Monocitos", "Tipos de Globulos Blancos."),
	(1, 0, 0.11, "Basofilos", "Tipos de Globulos Blancos."),
	(2, 4.5, 8, "pH", "Acidez o Alcalinidad de la Orina."),
	(2, 0, 10, "Leucocitos", "Globulos Blancos."),
	(2, 0, 30, "Glucosa", "Azucar en la sangre."),
	(2, 0, 5, "Cuerpos Cetónicos", "Productos de desecho de las grasas."),
	(2, 0, 5, "SEC", "Celulas Epiteliales Escamosas."),
	(3, 0, 5, "Grasa", "Cantidad de Grasa en las Heces."),
	(3, 0, 2, "Nitrogeno", "Indicador de Digestibilidad."),
	(3, 40, 280, "Urobilinógeno", "Producto Incoloro producido por Bacterias en la Flora Intestinal."),
	(3, 0, 200, "Peso", "Promedio de Peso de Materia Fecal."),
	(4, 0.6, 1.2, "Creatinina", "Producto Desecho de la Sangre que es eliminado por los riñones."),
	(4, 7, 20, "Urea", "Producto de la Degradacion de las Proteinas."),
	(4, 3, 8.5, "Acido Urico", "Producto Generado cuando se descomponen las purinas."),
	(4, 150, 200, "Trigliceridos", "Tipo de Lípidos que se encuentran en el cuerpo."),
	(5, 200, 240, "Colesterol Total", "Cantidad Total de Colesterol HDL y LDL."),
	(5, 40, 60, "Colesterol HDL", "Colesterol bueno que ayuda a eliminar el colesterol LDL."),
	(5, 100, 160, "Colesterol LDL", "Colesterol malo, principal causa de obstrucciones en las arterias."),
	(6, 0, 10, "Proteinas", "Moleculas formadas por Aminoacidos."),
	(6, 0.3, 1.3, "Bilirrubina Total", "Pigmento de color amarillo que se encuentra en la sangre y las heces."),
	(6, 33, 96, "Fosfatasa Alcalina", "Proteína que se encuentra en todos los tejidos corporales."),
	(6, 9, 58, "Gamma Glutamiltransferasa", "Enzima que se encuentra en las celulas del higado."),
	(6, 5, 12, "Colinesterasa", "Enzima que se encuentra en la sangre."),
	(6, 7, 41, "Alanino aminotransferasa", "Enzima con gran concentración en el higado."),
	(7, 0, 7, "Calcitocina", "Hormona que interviene en el metabolismo del calcio y el fósforo."),
	(7, 1.3, 3, "TBG", "Globulina transportadora de tiroxina."),
	(7, 8, 51, "PTH", "Hormona Paratiroidea."),
	(7, 1.3, 31.8, "Tiroglobulina", "Proteína sintetizada por la glándula tiroidea."),
	(7, 0.34, 4.25, "Tirotropina", "Hormona estimulante de la Tiroides"),
	(7, 5.4, 11.7, "Tiroxina T4", "Hormona producida por la tiroides, que juega papel en la energía."),
	(7, 77, 135, "Triyodotironina T3", "Hormona Tiroidea que juega un papel importante en el metabolismo.");
	
CREATE VIEW PacienteExamen AS
 SELECT re.IDRemision, re.IDExamen, CONCAT(p.Nombre,' ',p.Apellido) AS NombrePaciente, e.Nombre AS NombreExamen
 FROM remision_examen re
 INNER JOIN Examen e ON re.IDExamen = e.IDExamen
 INNER JOIN Remision r ON re.IDRemision = r.IDRemision
 INNER JOIN Paciente p ON p.IDPaciente = r.IDPaciente
 WHERE r.VerificaParametros = 0;
	
	
CREATE VIEW PacienteExamen1 AS
 SELECT re.IDRemision, re.IDExamen, CONCAT(p.Nombre,' ',p.Apellido) AS NombrePaciente, e.Nombre AS NombreExamen, p.IDPaciente, ba.IDBacteriologa
 FROM remision_examen re
 INNER JOIN Examen e ON re.IDExamen = e.IDExamen
 INNER JOIN Remision r ON re.IDRemision = r.IDRemision
 INNER JOIN Paciente p ON p.IDPaciente = r.IDPaciente
 INNER JOIN Resultado res ON res.IDPaciente = p.IDPaciente
 INNER JOIN Bacteriologa ba ON ba.IDBacteriologa = res.IDBacteriologa
 WHERE r.VerificaParametros = 1
 GROUP BY p.IDPaciente, e.Nombre;
	
CREATE VIEW RemisionValor AS
 SELECT r.IDRemision, p.IDParametro, rt.Valor
 FROM resultado rt
 INNER JOIN parametro p ON p.IDParametro = rt.IDParametro
 INNER JOIN examen e ON p.IDExamen = e.IDExamen
 INNER JOIN remision_examen re ON re.IDExamen = e.IDExamen
 INNER JOIN remision r ON r.IDRemision = re.IDRemision;









