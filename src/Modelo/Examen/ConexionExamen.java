/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Examen;

import Conexion.ConexionDB;
import Modelo.Paciente.Paciente;
import Modelo.Remision.Remision;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
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
    
    
    public void insertarExamen(Examen e) throws Exception{
        
        Connection connection;
        PreparedStatement preparedStatement;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement y ejecutar
        String sentenciaSQL = "INSERT INTO examen (Nombre, Descripcion) VALUES (?,?,?,?,?,?,?,?,?)";
        preparedStatement = connection.prepareStatement(sentenciaSQL);
        preparedStatement.setString(1, e.getNombre());
        preparedStatement.setString(2, e.getDescripcion());
        preparedStatement.execute();
        
        preparedStatement.close();
        connection.close();
    }
    
    public Examen obtenerExamen( int idExamen ) throws Exception{
        
        Connection connection;
        Statement statement;
        ResultSet resultSet;
        
        Examen examen = new Examen();

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement
        String sentenciaSQL = "SELECT * FROM examen WHERE IDExamen="+idExamen;
        statement = connection.createStatement();

        //Ejecutar SQL y guardar valores de consulta en resultSet
        resultSet = statement.executeQuery(sentenciaSQL);
        
        while (resultSet.next()) {
            int id = resultSet.getInt("IDExamen");
            String nombre = resultSet.getString("Nombre");
            String descripcion = resultSet.getString("Descripcion");
            examen = new Examen(id, nombre, descripcion);
        }
        
        statement.close();
        resultSet.close();
        connection.close();
        
        return examen;
        
    }
}
