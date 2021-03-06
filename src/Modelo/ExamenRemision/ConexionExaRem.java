/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.ExamenRemision;

import Conexion.ConexionDB;
import java.sql.*;
import java.util.*;

/**
 *
 * @author USUARIO
 */
public class ConexionExaRem {
    
    public List<ExamenRemision> obtenerExaRems() throws Exception {
        
        List<ExamenRemision> exarems = new ArrayList<>();

        Connection connection;
        Statement statement;
        ResultSet resultSet;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement
        String sentenciaSQL = "SELECT * FROM remision_examen";
        statement = connection.createStatement();

        //Ejecutar SQL y guardar valores de consulta en resultSet
        resultSet = statement.executeQuery(sentenciaSQL);

        while (resultSet.next()) {
            int idRemision = resultSet.getInt("IDRemision");
            int idExamen = resultSet.getInt("IDExamen");

            exarems.add(new ExamenRemision(idRemision, idExamen));
        }

        statement.close();
        resultSet.close();
        connection.close();

        return exarems;

    }
    
    public void insertarExaRem(ExamenRemision er) throws SQLException{
        
        Connection connection;
        PreparedStatement preparedStatement;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();
        
        //Crear sentencia SQL y statement
        String sentenciaSQL = "INSERT INTO remision_examen (IDRemision, IDExamen) VALUES (?,?)";
        preparedStatement = connection.prepareStatement(sentenciaSQL);
        preparedStatement.setInt(1, er.getiDRemision());
        preparedStatement.setInt(2, er.getiDExamen());
        preparedStatement.execute();
        
        preparedStatement.close();
        connection.close();
    }
    
    public List<String> obtenerNombresBacteriologa() throws SQLException{
        
        List<String> nombres = new ArrayList<>();
        
        Connection connection;
        Statement statement;
        ResultSet resultSet;
        String sentenciaSQL;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();
            sentenciaSQL = "SELECT * FROM PacienteExamen";
        
        //Crear sentencia SQL y statement
        
        statement = connection.createStatement();

        //Ejecutar SQL y guardar valores de consulta en resultSet
        resultSet = statement.executeQuery(sentenciaSQL);

        while (resultSet.next()) {
            String nombrePaciente = resultSet.getString("NombrePaciente");
            String nombreExamen = resultSet.getString("NombreExamen");
            String idRemision = resultSet.getString("IDRemision");
            String idExamen = resultSet.getString("IDExamen");
            
            nombres.add(idRemision+idExamen +" - "+nombreExamen+" - "+nombrePaciente);
            }  
        
        statement.close();
        resultSet.close();
        connection.close();

        return nombres;
        
    }
    
    public List<String> obtenerNombresPaciente() throws SQLException{
        
        List<String> nombres = new ArrayList<>();
        
        Connection connection;
        Statement statement;
        ResultSet resultSet;
        String sentenciaSQL;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();
            sentenciaSQL = "SELECT * FROM PacienteExamen1";
        
        //Crear sentencia SQL y statement
        
        statement = connection.createStatement();

        //Ejecutar SQL y guardar valores de consulta en resultSet
        resultSet = statement.executeQuery(sentenciaSQL);

        while (resultSet.next()) {
            String nombrePaciente = resultSet.getString("NombrePaciente");
            String nombreExamen = resultSet.getString("NombreExamen");
            String idRemision = resultSet.getString("IDRemision");
            String idExamen = resultSet.getString("IDExamen");
            String idPaciente = resultSet.getString("IDPaciente");
            String idBac = resultSet.getString("IDBacteriologa");
            
            nombres.add(idPaciente +" - "+idRemision+" - "+nombreExamen+" - "+idExamen+" - "+nombrePaciente+" - "+idBac);
        }  
        
        statement.close();
        resultSet.close();
        connection.close();

        return nombres;
    }
}

