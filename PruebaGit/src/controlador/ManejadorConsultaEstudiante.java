/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.RegistroEstudiante;
import vista.GuiConsultarEstudiante;
import vista.PanelBotonesAccion;

/**
 *
 * @author Diego
 */
public class ManejadorConsultaEstudiante implements ActionListener{

    private RegistroEstudiante registroEstudiante;
    private GuiConsultarEstudiante guiConsultarEstudiante;
    private PanelBotonesAccion panelBotonesAccion;

    public ManejadorConsultaEstudiante(RegistroEstudiante registroEstudiante, GuiConsultarEstudiante guiConsultarEstudiante, PanelBotonesAccion panelBotonesAccion) {
        this.registroEstudiante = registroEstudiante;
        this.guiConsultarEstudiante = guiConsultarEstudiante;
        this.panelBotonesAccion = panelBotonesAccion;
    }

    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(guiConsultarEstudiante.getJRadioEspecifico().isSelected())
        {
          panelBotonesAccion.getBotonAceptar().setEnabled(true);
          guiConsultarEstudiante.getCarnet().setEditable(true);
          
            if (evento.getActionCommand().equalsIgnoreCase(panelBotonesAccion.BOTON_ACEPTAR)) {
                if(!guiConsultarEstudiante.getCarnet().getText().trim().equalsIgnoreCase(""))
                {
                    if(registroEstudiante.verificarExistenciaEstudiante(guiConsultarEstudiante.getCarnet().getText()))
                    {
                        guiConsultarEstudiante.setDatosTabla(registroEstudiante.mostrarEstudianteEspecifico(), registroEstudiante.titulosTabla());
                    }
                    else
                    {
                        guiConsultarEstudiante.getArea().setText( "No Se Encontro este carnet");
                    }
                }
                else
                {
                     guiConsultarEstudiante.getArea().setText( "Digite el numero de carnet");
                }
            }
        }
        else if(guiConsultarEstudiante.getJRadioGeneral().isSelected())
        {
             panelBotonesAccion.getBotonAceptar().setEnabled(true);
             guiConsultarEstudiante.getCarnet().setEditable(false);
            guiConsultarEstudiante.setDatosTabla(registroEstudiante.llenarTablaDatos(), registroEstudiante.titulosTabla());
        }
        if(evento.getActionCommand().equalsIgnoreCase(panelBotonesAccion.BOTON_CANCELAR))
        {
            guiConsultarEstudiante.limpiarCampos(registroEstudiante.titulosTabla());
        }
    }
    
}
