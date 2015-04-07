/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorPrincipal;
import java.awt.Color;
import java.awt.event.ActionListener;
import modelo.Matricula;

/**
 *
 * @author Diego
 */
public class GuiPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form GuiPrincipal
     */
    public static final String JRADIOBUTTON__ESTUDIANTES="Estudiantes";
    public static final String JRADIOBUTTON__CURSOS="Cursos";
    public static final String JRADIOBUTTON__MATRICULA="Matricula";
    public static final String JRADIOBUTTON__REPORTE="Reporte";
    public static final String JRADIOBUTTON__SALIR="Salir";
    public ManejadorPrincipal manejadorPrincipal;
    public GuiPrincipal() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        jRadCursos.setText(JRADIOBUTTON__CURSOS);
        jRasalir.setText(JRADIOBUTTON__SALIR);
        jRamatricula.setText(JRADIOBUTTON__MATRICULA);
        jRestudiantes.setText(JRADIOBUTTON__ESTUDIANTES);
        jRareporte.setText(JRADIOBUTTON__REPORTE);
        manejadorPrincipal=new ManejadorPrincipal(this);
    }

    public void setManejador(ActionListener manejadorPrincipal)
    {
      jRadCursos.addActionListener(manejadorPrincipal);
      jRamatricula.addActionListener(manejadorPrincipal);
      jRareporte.addActionListener(manejadorPrincipal);
      jRasalir.addActionListener(manejadorPrincipal);
      jRestudiantes.addActionListener(manejadorPrincipal);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadCursos = new javax.swing.JRadioButton();
        jRamatricula = new javax.swing.JRadioButton();
        jRareporte = new javax.swing.JRadioButton();
        jRestudiantes = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRasalir = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Universidad  de Costa Rica ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(jRadCursos);
        jRadCursos.setText("Cursos");
        getContentPane().add(jRadCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 81, -1));

        buttonGroup1.add(jRamatricula);
        jRamatricula.setText("Matricula");
        jRamatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRamatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(jRamatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 81, -1));

        buttonGroup1.add(jRareporte);
        jRareporte.setText("Reporte");
        getContentPane().add(jRareporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 81, -1));

        buttonGroup1.add(jRestudiantes);
        jRestudiantes.setText("Estudiantes");
        getContentPane().add(jRestudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        jLabel1.setText("Opciones");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 73, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 230));

        buttonGroup1.add(jRasalir);
        jRasalir.setText("Salir");
        getContentPane().add(jRasalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRamatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRamatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRamatriculaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadCursos;
    private javax.swing.JRadioButton jRamatricula;
    private javax.swing.JRadioButton jRareporte;
    private javax.swing.JRadioButton jRasalir;
    private javax.swing.JRadioButton jRestudiantes;
    // End of variables declaration//GEN-END:variables
}
