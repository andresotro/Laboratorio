/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Bacteriologa;

import Conexion.ConexionDB;
import java.sql.*;
import java.util.*;

/**
 *
 * @author USUARIO
 */
public class ConexionBacteriologa {
    
    public List<Bacteriologa> obtenerBacteriologas() throws Exception{
        
        List<Bacteriologa> bacteriologas = new ArrayList<>();

        Connection connection;
        Statement statement;
        ResultSet resultSet;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement
        String sentenciaSQL = "SELECT * FROM bacteriologa";
        statement = connection.createStatement();

        //Ejecutar SQL y guardar valores de consulta en resultSet
        resultSet = statement.executeQuery(sentenciaSQL);
        
        while (resultSet.next()) {
            int id = resultSet.getInt("IDBacteriologa");
            String nombre = resultSet.getString("Nombre");
            String apellido = resultSet.getString("Apellido");
            long identificacion = resultSet.getLong("Identificacion");
            String usuario = resultSet.getString("Usuario");
            String contraseña = resultSet.getString("Password");

            bacteriologas.add(new Bacteriologa(id, nombre, apellido, identificacion, usuario, contraseña));
        }
        
        statement.close();
        resultSet.close();
        connection.close();
        
        return bacteriologas;
        
    }
    
    public void insertarBacteriologa(Bacteriologa b) throws Exception{
        
        Connection connection;
        PreparedStatement preparedStatement;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement y ejecutar
        String sentenciaSQL = "INSERT INTO bacteriologa (Nombre, Apellido, Usuario, Password, Identificacion) VALUES (?,?,?,?,?)";
        preparedStatement = connection.prepareStatement(sentenciaSQL);
        preparedStatement.setString(1, b.getNombre());
        preparedStatement.setString(2, b.getApellido());
        preparedStatement.setString(3, b.getUsuario());
        preparedStatement.setString(4, b.getPassword());
        preparedStatement.setLong(5, b.getIdentificacion());
        
        preparedStatement.execute();
        
        preparedStatement.close();
        connection.close();
        
    }
    
}
