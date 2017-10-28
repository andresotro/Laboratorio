/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Medico;

import Conexion.ConexionDB;
import java.sql.*;
import java.util.*;

/**
 *
 * @author USUARIO
 */
public class ConexionMedico {
    
    public List<Medico> obtenerMedicos() throws Exception{
        
        List<Medico> medicos = new ArrayList<>();

        Connection connection;
        Statement statement;
        ResultSet resultSet;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement
        String sentenciaSQL = "SELECT * FROM paciente";
        statement = connection.createStatement();

        //Ejecutar SQL y guardar valores de consulta en resultSet
        resultSet = statement.executeQuery(sentenciaSQL);
        
        while (resultSet.next()) {
            int id = resultSet.getInt("IDMedico");
            String nombre = resultSet.getString("Nombre");
            String apellido = resultSet.getString("Apellido");
            long identificacion = resultSet.getLong("Identificacion");
            long telefono = resultSet.getLong("Telefono");
            int noRegistro = resultSet.getInt("Nro_Registros");
            String usuario = resultSet.getString("Usuario");
            String contraseña = resultSet.getString("Password");
            int idGenero = resultSet.getInt("IDGenero");

            medicos.add(new Medico(id, nombre, apellido, identificacion, telefono, noRegistro, usuario, contraseña, idGenero));
        }
        
        statement.close();
        resultSet.close();
        connection.close();
        
        return medicos;
        
    }
    
    public void insertarMedico(Medico m) throws Exception{
        
        Connection connection;
        PreparedStatement preparedStatement;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement y ejecutar
        String sentenciaSQL = "INSERT INTO paciente (Nombre, Apellido, Telefono, Nro_Registros, Usuario, Password, Identificacion, IDGenero) VALUES (?,?,?,?,?,?,?,?)";
        preparedStatement = connection.prepareStatement(sentenciaSQL);
        preparedStatement.setString(1, m.getNombre());
        preparedStatement.setString(2, m.getApellido());
        preparedStatement.setLong(3, m.getTelefono());
        preparedStatement.setInt(4, m.getNroRegistros());
        preparedStatement.setString(5, m.getUsuario());
        preparedStatement.setString(6, m.getPassword());
        preparedStatement.setLong(7, m.getIdentificacion());
        preparedStatement.setInt(8, m.getIDGenero());
        
        preparedStatement.execute();
        
        preparedStatement.close();
        connection.close();
        
    }
    
}
