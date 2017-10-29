/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Paciente;

import Conexion.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class ConexionPaciente {
    
    public List<Paciente> obtenerPacientes() throws Exception{
        
        List<Paciente> pacientes = new ArrayList<>();

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
            int id = resultSet.getInt("IDPaciente");
            String nombre = resultSet.getString("Nombre");
            String apellido = resultSet.getString("Apellido");
            long identificacion = resultSet.getLong("Identificacion");
            int edad = resultSet.getInt("Edad");
            String direccion = resultSet.getString("Direccion_casa");
            int idCiudad = resultSet.getInt("IDCiudad");
            String usuario = resultSet.getString("Usuario");
            String contraseña = resultSet.getString("Password");
            int idGenero = resultSet.getInt("IDGenero");

            pacientes.add(new Paciente(id, nombre, apellido, identificacion, edad, direccion, idCiudad, usuario, contraseña, idGenero));
        }
        
        statement.close();
        resultSet.close();
        connection.close();
        
        return pacientes;
        
    }
    
    public void insertarPaciente(Paciente p) throws Exception{
        
        Connection connection;
        PreparedStatement preparedStatement;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement y ejecutar
        String sentenciaSQL = "INSERT INTO paciente (Nombre, Apellido, Identificacion, Edad, Direccion_casa, IDCiudad, Usuario, Password, IDGenero) VALUES (?,?,?,?,?,?,?,?,?)";
        preparedStatement = connection.prepareStatement(sentenciaSQL);
        preparedStatement.setString(1, p.getNombre());
        preparedStatement.setString(2, p.getApellido());
        preparedStatement.setLong(3, p.getIdentificacion());
        preparedStatement.setInt(4, p.getEdad());
        preparedStatement.setString(5, p.getDireccioncasa());
        preparedStatement.setInt(6, p.getIDCiudad());
        preparedStatement.setString(7, p.getUsuario());
        preparedStatement.setString(8, p.getPassword());
        preparedStatement.setInt(9, p.getIDGenero());
        preparedStatement.execute();
        
        preparedStatement.close();
        connection.close();
        
    }
    
    public Paciente obtenerPaciente( int idPaciente ) throws Exception{
        Connection connection;
        Statement statement;
        ResultSet resultSet;

        Paciente patient = new Paciente();
        
        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement
        String sentenciaSQL = "SELECT * FROM paciente WHERE IDPaciente="+idPaciente;
        statement = connection.createStatement();

        //Ejecutar SQL y guardar valores de consulta en resultSet
        resultSet = statement.executeQuery(sentenciaSQL);
        
        while (resultSet.next()) {
            int id = resultSet.getInt("IDPaciente");
            String nombre = resultSet.getString("Nombre");
            String apellido = resultSet.getString("Apellido");
            long identificacion = resultSet.getLong("Identificacion");
            int edad = resultSet.getInt("Edad");
            String direccion = resultSet.getString("Direccion_casa");
            int idCiudad = resultSet.getInt("IDCiudad");
            String usuario = resultSet.getString("Usuario");
            String contraseña = resultSet.getString("Password");
            int idGenero = resultSet.getInt("IDGenero");

            patient = new Paciente(id, nombre, apellido, identificacion, edad, direccion, idCiudad, usuario, contraseña, idGenero);
        }
        
        statement.close();
        resultSet.close();
        connection.close();
        
        return patient;   
    }
               
}
