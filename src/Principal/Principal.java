/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Interfaz.VentanaPrincipal;
import javax.swing.JFrame;

/**
 *
 * @author USUARIO
 */
public class Principal {
    public static void main(String[] args){
        VentanaPrincipal interfaz = new VentanaPrincipal();
        interfaz.setVisible(true);
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        interfaz.pack();
        interfaz.setLocationRelativeTo(null);      
    }
}
