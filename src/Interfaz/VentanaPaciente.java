/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Modelo.Bacteriologa.ConexionBacteriologa;
import Modelo.Examen.ConexionExamen;
import Modelo.Examen.Examen;
import Modelo.Medico.ConexionMedico;
import Modelo.Paciente.Paciente;
import Modelo.Parametro.ConexionParametro;
import Modelo.Parametro.Parametro;
import Modelo.Remision.ConexionRemision;
import Modelo.Remision.Remision;
import Modelo.Resultado.ConexionResultado;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JOptionPane;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Desktop;
/**
 *
 * @author Andrés
 */
public class VentanaPaciente extends javax.swing.JFrame {
    public VentanaPaciente(String examen, Paciente pac) {
        initComponents(pac, examen);
    }
    
    @SuppressWarnings({"unchecked", "Convert2Lambda"})
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(Paciente pac, String examen) {
        
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Paciente2 = new javax.swing.JLabel();
        Medico2 = new javax.swing.JLabel();
        Fecha2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Examen2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        TipoExamen = new javax.swing.JLabel();
        Medico = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        analisis = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MUESTRA DE RESULTADOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Examen:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Remitido por:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(Examen2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(Paciente2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(Medico2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(Fecha2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Examen2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Paciente2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Medico2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fecha2)
                .addGap(40, 40, 40))
        );

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt, pac);
            }
        });

        jButton2.setText("Generar Archivo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt, pac, examen);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Analizado por:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jButton1)
                        .addGap(57, 57, 57)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TipoExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Medico, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel13)
                                .addGap(70, 70, 70)
                                .addComponent(analisis, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TipoExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Medico, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(analisis, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(22, 22, 22))
        );
        setModelo(examen, pac);

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt, Paciente pac) {                                         
        SeleccionExamen v = new SeleccionExamen(pac);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
        this.setVisible(false);
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt, Paciente pac, String examen) {                                         
        PDF(pac, examen);
    }                                        
    
    private void setModelo(String examen, Paciente pac){
        try {
            ConexionRemision cr = new ConexionRemision();
            ConexionExamen ce = new ConexionExamen();
            ConexionMedico cm = new ConexionMedico();
            ConexionParametro cp = new ConexionParametro();
            ConexionBacteriologa cb = new ConexionBacteriologa();
            ConexionResultado ct = new ConexionResultado();

            String[] partes = examen.split(" - ");
            String[] id = partes[0].split("");
            
            Remision r = cr.obtenerRemision(Integer.parseInt(id[0]));
            TipoExamen.setText(partes[1]);
            
            @SuppressWarnings("UnusedAssignment")
            String dr = "";
            if(cm.obtenerMedico(r.getIDMedico()).getIDGenero() == 1){
                dr = "Dr.";
            }else{
                dr= "Dra.";
            }           
            Medico.setText(dr+" "+cm.obtenerMedico(r.getIDMedico()).getNombre()+" "+cm.obtenerMedico(r.getIDMedico()).getApellido());
            analisis.setText("Dra. "+cb.obtenerBacteriologa(Integer.parseInt(id[2])).getNombre()+" "+cb.obtenerBacteriologa(Integer.parseInt(id[2])).getApellido());
            
            
            Examen e = ce.obtenerExamen(Integer.parseInt(id[1]));
            List<Parametro> parametros = cp.obtenerParametrosExamen(e.getIDExamen());
            
            String[][] parametroT = new String[parametros.size()][5];
            for( int i = 0 ; i < parametros.size() ; i++  ){
                parametroT[i][0] = parametros.get(i).getNombre();
            }
            for (int i = 0; i < parametros.size(); i++) {
                parametroT[i][1] = Float.toString(parametros.get(i).getValorMinimo());
            }
            for (int i = 0; i < parametros.size(); i++) {
                parametroT[i][2] = Float.toString(parametros.get(i).getValorMaximo());
            }
            for (int i = 0; i < parametros.size(); i++) {
                String resultado = ct.obtenerResultadoP(parametros.get(i).getIDParametro(), Integer.parseInt(id[0]));
                String[] valores = resultado.split(" - ");
                parametroT[i][3] = valores[2];
            }
            for (int i = 0; i < parametros.size(); i++) {
                if(Float.parseFloat(parametroT[i][3])>=Float.parseFloat(parametroT[i][2])){
                    if(parametroT[i][0].endsWith("s")){
                        parametroT[i][4] = parametroT[i][0]+" muy altos";
                    }
                    else{
                        parametroT[i][4] = parametroT[i][0]+" muy alto";
                    }
                }
                else{
                    if(Float.parseFloat(parametroT[i][3])<=Float.parseFloat(parametroT[i][1])){
                        if(parametroT[i][0].endsWith("s")){
                            parametroT[i][4] = parametroT[i][0]+" muy bajos";
                        }
                        else{
                            parametroT[i][4] = parametroT[i][0]+" muy bajo";
                        }
                        
                    }
                    else{
                        parametroT[i][4] = parametroT[i][0]+" en buen estado";
                    }
                }
            }
            
            jTable3.setModel(new javax.swing.table.DefaultTableModel(
                    parametroT,
                    new String[]{
                        "Parametro", "Valor Mínimo", "Valor Máximo", "Valor", "Análisis"
                    }
            ) {
                Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false
                };

                @Override
                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });
            jTable3.getTableHeader().setReorderingAllowed(false);
            jScrollPane3.setViewportView(jTable3);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void PDF(Paciente pac, String examen){
        try{
            String[] partes = examen.split(" - ");
            Document doc = new Document();
            FileOutputStream archivo = new FileOutputStream(new File("Resultados "+partes[1]+" de "+pac.getNombre()+" "+pac.getApellido()+".pdf"));
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            if(pac.getIDGenero() == 1){
                doc.add(new Paragraph("RESULTADOS EXAMEN SR: "+pac.getNombre()+" "+pac.getApellido()));
            }
            else{
                doc.add(new Paragraph("RESULTADOS EXAMEN SRA: "+pac.getNombre()+" "+pac.getApellido()));
            }
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph("TIPO DE EXAMEN: "+TipoExamen.getText()));
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph("REMISION REALIZADA POR: "+Medico.getText()));
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph("PARAMETROS DEL EXAMEN: "));
            PdfPTable table = new PdfPTable(5);
            doc.add(new Paragraph(" "));
            table.addCell("Paràmetro");
            table.addCell("Valor Mìnimo");
            table.addCell("Valor Màximo");
            table.addCell("Valor Obtenido");
            table.addCell("Anàlisis");
            for(int i=0; i<jTable3.getRowCount(); i++){
                for(int j=0; j<5; j++){
                    table.addCell(jTable3.getValueAt(i, j).toString());
                }
            }
            doc.add(table);
            doc.close();
            Desktop desktop = Desktop.getDesktop();
            File f = new File("Resultados " + partes[1] + " de " + pac.getNombre() + " " + pac.getApellido() + ".pdf");
            desktop.open(f);

            JOptionPane.showMessageDialog(null, "Archivo PDF Generado Correctamente");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
     

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Examen2;
    private javax.swing.JLabel Fecha2;
    private javax.swing.JLabel Medico2;
    private javax.swing.JLabel Paciente2;
    private javax.swing.JLabel Medico;
    private javax.swing.JLabel TipoExamen;
    private javax.swing.JLabel analisis;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration       
}
