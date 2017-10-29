/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Modelo.Examen.ConexionExamen;
import Modelo.Examen.Examen;
import Modelo.ExamenRemision.ConexionExaRem;
import Modelo.ExamenRemision.ExamenRemision;
import Modelo.Medico.Medico;
import Modelo.Paciente.ConexionPaciente;
import Modelo.Paciente.Paciente;
import Modelo.Remision.ConexionRemision;
import Modelo.Remision.Remision;
import java.text.*;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class VentanaMedico extends javax.swing.JFrame{
    
    public VentanaMedico(Medico m) {
        initComponents(m);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(Medico m) {

        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PacienteP = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        ExamenP = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Razon = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        if(m.getIDGenero() == 1){
            jLabel11.setText("¡Bienvenido Doctor!");
        }else{
            jLabel11.setText("¡Bienvenida Doctora!");
        }

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("En esta pestaña podrá remitir pacientes a sus");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("respectivos exámenes.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel10)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(31, 31, 31)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel1.setText("Nombre Paciente");


        jLabel2.setText("Tipo de Examen");

        jLabel3.setText("Razón del Examen");

        jButton1.setText("Remitir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt, m);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Razon.setColumns(20);
        Razon.setRows(5);
        jScrollPane1.setViewportView(Razon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExamenP, 0, 203, Short.MAX_VALUE)
                    .addComponent(PacienteP, 0, 203, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jButton2)
                .addGap(62, 62, 62)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PacienteP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExamenP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(28, Short.MAX_VALUE))
        );
           
        setModeloPaciente();
        setModeloExamen();
        
        pack();
    }// </editor-fold>                                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt, Medico m){                                         
        ConexionRemision cr = new ConexionRemision();
        ConexionExaRem er = new ConexionExaRem();
        Object paciente = PacienteP.getSelectedItem();
        Object examen = ExamenP.getSelectedItem();
        String razon = Razon.getText();
        if( paciente == null || examen == null || razon.equals("") ){
            JOptionPane.showMessageDialog(null, "Por favor llena toda la información solicitada");
        } else {
            try {
                Remision r = new Remision();
                r.setIDPaciente(obtenerIDPaciente(paciente.toString()));
                // <editor-fold defaultstate="collapsed" desc="Pasos para obtener fecha date2">
                Calendar cal = Calendar.getInstance();
                Date date = cal.getTime();
                DateFormat formato = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
                String fecha = formato.format(date);
                Date date2 = formato.parse(fecha);
                // </editor-fold>
                r.setFecha(date2);
                r.setIDMedico(m.getIDMedico());
                r.setRazon(razon);
                cr.insertarRemision(r);
                
                JOptionPane.showMessageDialog(null, "¡Remisión Exitosa!");
                VentanaMedico v = new VentanaMedico(m);
                v.setLocationRelativeTo(null);
                v.setVisible(true);
                this.dispose();
                
                ExamenRemision xr = new ExamenRemision();
                xr.setiDExamen(obtenerIDExamen(examen.toString()));
                xr.setiDRemision(cr.obtenerRemision(r).getIDRemision());
                er.insertarExaRem(xr);
                
            } catch (Exception e) {
                e.printStackTrace();
            }

        }              
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        VentanaPrincipal v = new VentanaPrincipal();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
        this.dispose();
    }               
    
    private int obtenerIDExamen(String examen) throws Exception{
        ConexionExamen ce = new ConexionExamen();
        Examen ex = new Examen();
        for(Examen exam : ce.obtenerExamenes()){
            if(exam.getNombre().equals(examen)){
                ex = exam;
                break;
            }
        }
        return ex.getIDExamen();
    }
    
    private int obtenerIDPaciente(String paciente) throws Exception{
        ConexionPaciente cp = new ConexionPaciente();
        Paciente pa = new Paciente();
        for(Paciente patient : cp.obtenerPacientes()){
            String nombres = patient.getNombre()+" "+patient.getApellido();
            if(nombres.equals(paciente)){
                pa = patient;
                break;
            }
        }
        return pa.getIDPaciente();
    }

    @SuppressWarnings("CallToPrintStackTrace")
    private void setModeloPaciente(){
        ConexionPaciente p = new ConexionPaciente();
        List<String> pacientes = new ArrayList<>();
        pacientes.add(null);
        try{
            for(Paciente paciente : p.obtenerPacientes()){
                pacientes.add(paciente.getNombre()+" "+paciente.getApellido());
            }
            PacienteP.setModel(new DefaultComboBoxModel(pacientes.toArray(new String[pacientes.size()])));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void setModeloExamen(){
        ConexionExamen e = new ConexionExamen();
        List<String> examenes = new ArrayList<>();
        examenes.add(null);
        try{
            for(Examen examen : e.obtenerExamenes()){
                examenes.add(examen.getNombre());
            }
            ExamenP.setModel(new DefaultComboBoxModel(examenes.toArray(new String[examenes.size()])));
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }


    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> ExamenP;
    private javax.swing.JComboBox<String> PacienteP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea Razon;
    // End of variables declaration                    
}
