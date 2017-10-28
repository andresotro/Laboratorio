/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class ConexionDB {    
    
    Connection conn = null;
    
    public static Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/laboratorio", "root", "wiwi1999");
            return connection;
        } catch (Exception ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void desconectar() throws SQLException {
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception e) {
                /* ignore close errors */
            }
        }
    }
}
