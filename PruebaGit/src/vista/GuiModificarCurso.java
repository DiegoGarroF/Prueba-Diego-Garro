/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ManejadorModificarCursos;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import modelo.RegistroCursos;

/**
 *
 * @author Diego
 */
public class GuiModificarCurso extends javax.swing.JFrame {

    /**
     * Creates new form GuiModificarCurso
     */
    private ManejadorModificarCursos manejador;
    public GuiModificarCurso() {
        initComponents();
        setTitle("Modificar Un Curso");
    }
    public void init(RegistroCursos registroCursos)
    {
        manejador=new ManejadorModificarCursos(this, registroCursos, panelBotonesAccion1);
        panelBotonesAccion1.setManejador(manejador);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBotonesAccion1 = new vista.PanelBotonesAccion();
        jLabel1 = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLCreditos = new javax.swing.JLabel();
        jTeSiglas = new javax.swing.JTextField();
        jTexnombre = new javax.swing.JTextField();
        jTexCreditos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Siglas");

        jLNombre.setText("Nombre");

        jLCreditos.setText("Creditos");

        jTeSiglas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeSiglasActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBotonesAccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(41, 41, 41))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLNombre)
                                    .addGap(31, 31, 31)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLCreditos)
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTeSiglas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTexnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTeSiglas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNombre)
                            .addComponent(jTexnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCreditos)
                            .addComponent(jTexCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(panelBotonesAccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTeSiglasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeSiglasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTeSiglasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLCreditos;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTeSiglas;
    private javax.swing.JTextField jTexCreditos;
    private javax.swing.JTextField jTexnombre;
    private javax.swing.JTextArea jTextArea1;
    private vista.PanelBotonesAccion panelBotonesAccion1;
    // End of variables declaration//GEN-END:variables

public JTextField getNombre()
{
    return jTexnombre;
}
public  JTextArea getArea()
{
    return jTextArea1;
}
public JTextField getSiglas()
{
    return jTeSiglas;
}
public JTextField getCreditos()
{
    return jTexCreditos;
}
public void limpiarCampos()
{
    jTeSiglas.setText("");
    jTexCreditos.setText("");
    jTexnombre.setText("");
}
}
