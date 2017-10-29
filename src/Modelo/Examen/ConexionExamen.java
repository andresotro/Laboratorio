/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Examen;

import Conexion.ConexionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrés
 */
public class ConexionExamen {
    public List<Examen> obtenerExamenes() throws Exception{
        
        List<Examen> examenes = new ArrayList<>();

        Connection connection;
        Statement statement;
        ResultSet resultSet;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement
        String sentenciaSQL = "SELECT * FROM examen";
        statement = connection.createStatement();

        //Ejecutar SQL y guardar valores de consulta en resultSet
        resultSet = statement.executeQuery(sentenciaSQL);
        
        while (resultSet.next()) {
            int id = resultSet.getInt("IDExamen");
            String nombre = resultSet.getString("Nombre");
            String descripcion = resultSet.getString("Descripcion");

            examenes.add(new Examen(id, nombre, descripcion));
        }
        
        statement.close();
        resultSet.close();
        connection.close();
        
        return examenes;
        
    }
}
