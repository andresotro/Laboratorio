/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Remision;

import Conexion.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Andrés
 */
public class ConexionRemision {
    public List<Remision> obtenerRemision() throws Exception{
        
        List<Remision> remisiones = new ArrayList<>();

        Connection connection;
        Statement statement;
        ResultSet resultSet;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement
        String sentenciaSQL = "SELECT * FROM remision";
        statement = connection.createStatement();

        //Ejecutar SQL y guardar valores de consulta en resultSet
        resultSet = statement.executeQuery(sentenciaSQL);
        
        while (resultSet.next()) {
            int id = resultSet.getInt("IDRemision");
            String fecha = resultSet.getString("Fecha");
            String razon = resultSet.getString("Razon");
            remisiones.add(new Remision(id, fecha, razon));
        }
        
        statement.close();
        resultSet.close();
        connection.close();
        
        return remisiones;
        
    }
    
    public void insertarRemision(Remision r) throws Exception{
        
        Connection connection;
        PreparedStatement preparedStatement;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement y ejecutar
        String sentenciaSQL = "INSERT INTO remision (Fecha, Razon) VALUES (?,?,?,?,?,?,?,?,?)";
        preparedStatement = connection.prepareStatement(sentenciaSQL);
        preparedStatement.setString(1, r.getFecha());
        preparedStatement.setString(2, r.getRazon());
        preparedStatement.execute();
        
        preparedStatement.close();
        connection.close();
    }
}
