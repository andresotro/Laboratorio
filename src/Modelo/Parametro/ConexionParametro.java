/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Parametro;

import Conexion.ConexionDB;
import java.sql.*;
import java.util.*;

/**
 *
 * @author USUARIO
 */
public class ConexionParametro {
    
    public List<Parametro> obtenerParametros() throws Exception{
        
        List<Parametro> parametros = new ArrayList<>();

        Connection connection;
        Statement statement;
        ResultSet resultSet;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement
        String sentenciaSQL = "SELECT * FROM parametro";
        statement = connection.createStatement();

        //Ejecutar SQL y guardar valores de consulta en resultSet
        resultSet = statement.executeQuery(sentenciaSQL);
        
        while (resultSet.next()) {
            int idParametro = resultSet.getInt("IDParametro");
            int idExamen = resultSet.getInt("IDExamen");
            float minV = resultSet.getFloat("ValorMinimo");
            float maxV = resultSet.getFloat("ValorMaximo");
            String nombre = resultSet.getString("Nombre");
            String descripcion = resultSet.getString("Descripcion");

            parametros.add(new Parametro(idParametro, idExamen, minV, maxV, nombre, descripcion));
        }
        
        statement.close();
        resultSet.close();
        connection.close();
        
        return parametros;
        
    }
    
    public List<Parametro> obtenerParametrosExamen( int iDExamen ) throws Exception{
        
        List<Parametro> parametros = new ArrayList<>();

        Connection connection;
        Statement statement;
        ResultSet resultSet;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement
        String sentenciaSQL = "SELECT * FROM parametro WHERE IDExamen="+iDExamen;
        statement = connection.createStatement();

        //Ejecutar SQL y guardar valores de consulta en resultSet
        resultSet = statement.executeQuery(sentenciaSQL);
        
        while (resultSet.next()) {
            int idParametro = resultSet.getInt("IDParametro");
            int idExamen = resultSet.getInt("IDExamen");
            float minV = resultSet.getFloat("ValorMinimo");
            float maxV = resultSet.getFloat("ValorMaximo");
            String nombre = resultSet.getString("Nombre");
            String descripcion = resultSet.getString("Descripcion");

            parametros.add(new Parametro(idParametro, idExamen, minV, maxV, nombre, descripcion));
        }
        
        statement.close();
        resultSet.close();
        connection.close();
        
        return parametros;
        
    }
    
}
