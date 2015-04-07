/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.RegistroEstudiante;
import vista.GuiModificarEstudiante;
import vista.PanelBotonesAccion;

/**
 *
 * @author Diego
 */
public class ManejadorModificarEstudiante implements ActionListener{

    private RegistroEstudiante registroEstudiante;
    private GuiModificarEstudiante guiModificarEstudiante;
    private PanelBotonesAccion panelBotonesAccion;

    public ManejadorModificarEstudiante(RegistroEstudiante registroEstudiante, GuiModificarEstudiante guiModificarEstudiante, PanelBotonesAccion panelBotonesAccion) {
        this.registroEstudiante = registroEstudiante;
        this.guiModificarEstudiante = guiModificarEstudiante;
        this.panelBotonesAccion = panelBotonesAccion;
    }
    
    public void actionPerformed(ActionEvent evento) 
    {
        if(evento.getActionCommand().equalsIgnoreCase(panelBotonesAccion.BOTON_ACEPTAR))
        {
            if(!guiModificarEstudiante.getCarnet().getText().trim().equalsIgnoreCase(""))
            {
                if(registroEstudiante.verificarExistenciaEstudiante(guiModificarEstudiante.getCarnet().getText()))
                {
                    if(!guiModificarEstudiante.getNombre().getText().trim().equalsIgnoreCase(""))
                    {
                        guiModificarEstudiante.getAreaDeInformacion().setText(registroEstudiante.modificarEstudiante(guiModificarEstudiante.getNombre().getText()));
                    }
                    else
                    {
                         guiModificarEstudiante.getAreaDeInformacion().setText("Ingrese Un Nuevo Nombre");
                    }    
                }
                else
                {
                    guiModificarEstudiante.getAreaDeInformacion().setText("No Se Encuentra Este Carnet");
                }
            }
            else
            {
                guiModificarEstudiante.getAreaDeInformacion().setText("Ingrese un Numero de carnet");
            }
        }
         if(evento.getActionCommand().equalsIgnoreCase(guiModificarEstudiante.BOTON_BUSCAR))
        {
            if(!guiModificarEstudiante.getCarnet().getText().trim().equalsIgnoreCase(""))
            {
                if(registroEstudiante.verificarExistenciaEstudiante(guiModificarEstudiante.getCarnet().getText()))
                {
                   panelBotonesAccion.getBotonAceptar().setEnabled(true);
                   guiModificarEstudiante.getAreaDeInformacion().setText("Ingrese Un Nuevo Nombre");
                        
                }
                else
                {
                    guiModificarEstudiante.getAreaDeInformacion().setText("No Se Encuentra Este Carnet");
                }
            }
            else
            {
                guiModificarEstudiante.getAreaDeInformacion().setText("Ingrese un Numero de carnet");
            }
        }
         if(evento.getActionCommand().equalsIgnoreCase(panelBotonesAccion.BOTON_CANCELAR))
        {
            guiModificarEstudiante.limpiarCampos();
        }
    }
    
}
