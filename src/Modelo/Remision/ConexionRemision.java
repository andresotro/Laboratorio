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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Andrés
 */
public class ConexionRemision {
    
    public List<Remision> obtenerRemisiones() throws Exception{
        
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
            int idPaciente = resultSet.getInt("idPaciente");
            Date fecha = resultSet.getDate("Fecha");
            int idMedico = resultSet.getInt("IDMedico");
            String razon = resultSet.getString("Razon");
            remisiones.add(new Remision(id, idPaciente, fecha, idMedico, razon));
        }
        
        statement.close();
        resultSet.close();
        connection.close();
        
        return remisiones;
        
    }
    
    public void insertarRemision(Remision r) {

        try {
            Connection connection;
            PreparedStatement preparedStatement;

            //Establecer la conexi�n
            connection = ConexionDB.conectar();

            //Crear sentencia SQL y statement y ejecutar
            String sentenciaSQL = "INSERT INTO remision (IDPaciente, Fecha, IDMedico, Razon) VALUES (?,?,?,?)";
            preparedStatement = connection.prepareStatement(sentenciaSQL);
            preparedStatement.setInt(1, r.getIDPaciente());
            SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
            preparedStatement.setString(2, formatDate.format(r.getFecha()));
            preparedStatement.setInt(3, r.getIDMedico());
            preparedStatement.setString(4, r.getRazon());
            
            preparedStatement.execute();

            preparedStatement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Remision obtenerRemision( Remision r ) throws Exception{
        
        Remision remision = new Remision();

        Connection connection;
        PreparedStatement preparedStatement;
        ResultSet resultSet;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement
        String sentenciaSQL = "SELECT * FROM remision WHERE IDMedico=? AND IDPaciente=? AND Fecha=? AND Razon=?";
        preparedStatement = connection.prepareStatement(sentenciaSQL);
        preparedStatement.setInt(1, r.getIDMedico());
        preparedStatement.setInt(2, r.getIDPaciente());
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
        preparedStatement.setString(3, formatDate.format(r.getFecha()));
        preparedStatement.setString(4, r.getRazon());

        //Ejecutar SQL y guardar valores de consulta en resultSet
        resultSet = preparedStatement.executeQuery();
        
        while (resultSet.next()) {
            int id = resultSet.getInt("IDRemision");
            int idPaciente = resultSet.getInt("idPaciente");
            Date fecha = resultSet.getDate("Fecha");
            int idMedico = resultSet.getInt("IDMedico");
            String razon = resultSet.getString("Razon");
            remision = new Remision(id, idPaciente, fecha, idMedico, razon);
        }
        
        preparedStatement.close();
        resultSet.close();
        connection.close();
        
        return remision;
        
    }
    
        public Remision obtenerRemision( int iDRemision ) throws Exception{
        
        Remision remision = new Remision();

        Connection connection;
        PreparedStatement preparedStatement;
        ResultSet resultSet;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement
        String sentenciaSQL = "SELECT * FROM remision WHERE IDRemision="+iDRemision;
        preparedStatement = connection.prepareStatement(sentenciaSQL);

        //Ejecutar SQL y guardar valores de consulta en resultSet
        resultSet = preparedStatement.executeQuery();
        
        while (resultSet.next()) {
            int id = resultSet.getInt("IDRemision");
            int idPaciente = resultSet.getInt("idPaciente");
            Date fecha = resultSet.getDate("Fecha");
            int idMedico = resultSet.getInt("IDMedico");
            String razon = resultSet.getString("Razon");
            remision = new Remision(id, idPaciente, fecha, idMedico, razon);
        }
        
        preparedStatement.close();
        resultSet.close();
        connection.close();
        
        return remision;
        
    }
    
}
