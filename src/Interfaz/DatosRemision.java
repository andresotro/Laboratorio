/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Modelo.Examen.Examen;
import Modelo.Paciente.Paciente;

/**
 *
 * @author Andrés
 */
public class DatosRemision extends javax.swing.JFrame{
    
    public DatosRemision(String h) {
        initComponents(h);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(String h) {

        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Res1 = new javax.swing.JLabel();
        Res2 = new javax.swing.JLabel();
        Res3 = new javax.swing.JLabel();
        Res4 = new javax.swing.JLabel();
        Res5 = new javax.swing.JLabel();
        Res6 = new javax.swing.JLabel();
        Res7 = new javax.swing.JLabel();
        Res8 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        Insertar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INSERTAR DATOS DE EXAMEN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese los datos de "+h.toString());
        
        Insertar.setText("Insertar");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField9.setText("");
        jTextField11.setText("");
        jTextField5.setText("");
        jTextField8.setText("");
        jTextField10.setText("");

        
        if(h.contains("Hemograma")){
            Res1.setText("Globulos Rojos");
            Res2.setText("Hemoglobina");
            Res3.setText("Linfocitos");
            Res4.setText("Eosinófilos");
            Res5.setText("Plaquetas");
            Res6.setText("VCM");
            Res7.setText("Monocitos");
            Res8.setText("Vasofilos");
        }
        if(h.contains("Urianálisis")){
            Res1.setText("pH");
            Res2.setText("Leucocitos");
            Res3.setText("Glucosa");
            Res4.setText("Cuerpos Cetónicos");
            Res5.setText("SEC");
            Res6.setVisible(false);
            Res7.setVisible(false);
            Res8.setVisible(false);
            jTextField7.setVisible(false);
            jTextField9.setVisible(false);
            jTextField11.setVisible(false);
        }
        if(h.contains("Heces")){
            Res1.setText("Grasa");
            Res2.setText("Nitrogeno");
            Res3.setText("Urobilinógeno");
            Res4.setText("Peso");
            Res5.setVisible(false);
            Res6.setVisible(false);
            Res7.setVisible(false);
            Res8.setVisible(false);
            jTextField6.setVisible(false);
            jTextField7.setVisible(false);
            jTextField9.setVisible(false);
            jTextField11.setVisible(false);
        }
        if(h.contains("Renal")){
            Res1.setText("Creatinina");
            Res2.setText("Urea");
            Res3.setText("Acido Urico");
            Res4.setText("Trigliceridos");
            Res5.setVisible(false);
            Res6.setVisible(false);
            Res7.setVisible(false);
            Res8.setVisible(false);
            jTextField6.setVisible(false);
            jTextField7.setVisible(false);
            jTextField9.setVisible(false);
            jTextField11.setVisible(false);
        }
        if(h.contains("Lipídico")){
            Res1.setText("Colesterol Total");
            Res2.setText("Colesterol HDL");
            Res3.setText("Colesterol LDL");
            Res4.setVisible(false);
            Res5.setVisible(false);
            Res6.setVisible(false);
            Res7.setVisible(false);
            Res8.setVisible(false);
            jTextField4.setVisible(false);
            jTextField6.setVisible(false);
            jTextField7.setVisible(false);
            jTextField9.setVisible(false);
            jTextField11.setVisible(false);
        }
        if(h.contains("Hepático")){
            Res1.setText("Proteinas");
            Res2.setText("Bilirrubina Total");
            Res3.setText("Fosfatasa Alcalina");
            Res4.setText("Gamma Glutamiltransferasa");
            Res5.setText("Colinesterasa");
            Res6.setText("Alanino aminotransferasa");
            Res7.setVisible(false);
            Res8.setVisible(false);
            jTextField9.setVisible(false);
            jTextField11.setVisible(false);
        }
        if(h.contains("Tiroidéo")){
            Res1.setText("Calcitocina");
            Res2.setText("TGB");
            Res3.setText("PTH");
            Res4.setText("Tiroglobulina");
            Res5.setText("Tirotropina");
            Res6.setText("Tiroxina T4");
            Res7.setText("Triyodotironina T3");
            Res8.setVisible(false);
            jTextField11.setVisible(false);
        }
        

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Res2)
                    .addComponent(Res3)
                    .addComponent(Res4)
                    .addComponent(Res1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Res6)
                    .addComponent(Res8)
                    .addComponent(Res5)
                    .addComponent(Res7))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cancelar)
                .addGap(118, 118, 118)
                .addComponent(Insertar)
                .addGap(201, 201, 201))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Res1)
                    .addComponent(Res5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Res2)
                    .addComponent(Res6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Res3)
                    .addComponent(Res7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Res4)
                    .addComponent(Res8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(Insertar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold> 
    
    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.dispose();
        VentanaPrincipal v = new VentanaPrincipal();
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }  

    // Variables declaration - do not modify   
    
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Insertar;
    private javax.swing.JLabel Res1;
    private javax.swing.JLabel Res2;
    private javax.swing.JLabel Res3;
    private javax.swing.JLabel Res4;
    private javax.swing.JLabel Res5;
    private javax.swing.JLabel Res6;
    private javax.swing.JLabel Res7;
    private javax.swing.JLabel Res8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;

}
