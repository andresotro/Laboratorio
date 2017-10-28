/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Genero;

import Conexion.ConexionDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class ConexionGenero {
    public List<Genero> obtenerGeneros() throws Exception{
        
        List<Genero> generos = new ArrayList<>();

        Connection connection;
        Statement statement;
        ResultSet resultSet;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement
        String sentenciaSQL = "SELECT * FROM genero";
        statement = connection.createStatement();

        //Ejecutar SQL y guardar valores de consulta en resultSet
        resultSet = statement.executeQuery(sentenciaSQL);
        
        while (resultSet.next()) {
            int id = resultSet.getInt("IDGenero");
            String nombre = resultSet.getString("Genero");

            generos.add(new Genero(id, nombre));
        }
        
        statement.close();
        resultSet.close();
        connection.close();
        
        return generos;
        
    }
}
