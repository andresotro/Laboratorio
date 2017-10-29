/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Resultado;

import Conexion.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author USUARIO
 */
public class ConexionResultado {

    public List<Resultado> obtenerResultados() throws Exception{
        
        List<Resultado> resultados = new ArrayList<>();

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
            int idResultado = resultSet.getInt("IDResultado");
            int idParametro = resultSet.getInt("IDParametro");
            int idPaciente = resultSet.getInt("IDPaciente");
            float valor = resultSet.getFloat("Valor");
            int idBacteriologa = resultSet.getInt("IDBacteriologa");
            Date fecha = resultSet.getDate("Fecha_Realizacion");

            resultados.add(new Resultado(idResultado, idParametro, idPaciente, valor, idBacteriologa, fecha));
        }
        
        statement.close();
        resultSet.close();
        connection.close();
        
        return resultados;
        
    }
    
    public void insertarResultado(Resultado r) throws Exception{
        
        Connection connection;
        PreparedStatement preparedStatement;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement y ejecutar
        String sentenciaSQL = "INSERT INTO resultado (IDParametro, IDPaciente, Valor, IDBacteriologa, Fecha_Realizacion) VALUES (?,?,?,?,?)";
        preparedStatement = connection.prepareStatement(sentenciaSQL);
        preparedStatement.setInt(1, r.getIDParametro());
        preparedStatement.setInt(2, r.getIDPaciente());
        preparedStatement.setFloat(3, r.getValor());
        preparedStatement.setInt(4, r.getIDBacteriologa());
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
        preparedStatement.setString(5, formatDate.format(r.getFechaRealizacion()));
        
        preparedStatement.execute();
        
        preparedStatement.close();
        connection.close();
        
    }
    
    public Resultado obtenerResultado( Resultado r ) throws Exception{
        
        Resultado resultado = new Resultado();

        Connection connection;
        PreparedStatement preparedStatement;
        ResultSet resultSet;

        //Establecer la conexi�n
        connection = ConexionDB.conectar();

        //Crear sentencia SQL y statement
        String sentenciaSQL = "SELECT * FROM resultado WHERE IDParametro=? AND IDPaciente=? AND IDBacteriologa=?";
        preparedStatement = connection.prepareStatement(sentenciaSQL);
        preparedStatement.setInt(1, r.getIDParametro());
        preparedStatement.setInt(2, r.getIDPaciente());
        preparedStatement.setInt(3, r.getIDBacteriologa());

        //Ejecutar SQL y guardar valores de consulta en resultSet
        resultSet = preparedStatement.executeQuery();
        
        while (resultSet.next()) {
            int idResultado = resultSet.getInt("IDResultado");
            int idParametro = resultSet.getInt("IDParametro");
            int idPaciente = resultSet.getInt("IDPaciente");
            float valor = resultSet.getFloat("Valor");
            int idBacteriologa = resultSet.getInt("IDBacteriologa");
            Date fecha = resultSet.getDate("Fecha_Realizacion");

            resultado = new Resultado(idResultado, idParametro, idPaciente, valor, idBacteriologa, fecha);
        }
        
        preparedStatement.close();
        resultSet.close();
        connection.close();
        
        return resultado;
        
    }
    
}
