/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Ciudad;

import Conexion.ConexionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class ConexionCiudad {
    public List<Ciudad> obtenerCiudades() throws Exception{
        
        List<Ciudad> ciudades = new ArrayList<>();

        Connection connection;
        Statement statement;
        ResultSet resultSet;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement
        String sentenciaSQL = "SELECT * FROM ciudad";
        statement = connection.createStatement();

        //Ejecutar SQL y guardar valores de consulta en resultSet
        resultSet = statement.executeQuery(sentenciaSQL);
        
        while (resultSet.next()) {
            int id = resultSet.getInt("IDCiudad");
            String nombre = resultSet.getString("Nombre");

            ciudades.add(new Ciudad(id, nombre));
        }
        
        statement.close();
        resultSet.close();
        connection.close();
        
        return ciudades;
        
    }
}
