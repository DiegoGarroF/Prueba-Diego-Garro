/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.RegistroEstudiante;
import vista.GuiAccionesEstudiante;
import vista.GuiConsultarEstudiante;
import vista.GuiEliminarEstudiante;
import vista.GuiModificarEstudiante;
import vista.GuiRegistroEstudiantes;
import vista.PanelBotonesSeleccion;

/**
 *
 * @author Diego
 */

public class ManejadorAccionEstudiante implements ActionListener{

    private PanelBotonesSeleccion panelBotones;
    private GuiAccionesEstudiante guiAccionesRegistros;
    private RegistroEstudiante registroEstudiante;
    public ManejadorAccionEstudiante(PanelBotonesSeleccion panelBotones,GuiAccionesEstudiante guiAccionesEstudiante,RegistroEstudiante registroEstudiante) 
    {
        this.panelBotones=panelBotones;
        this.guiAccionesRegistros=guiAccionesRegistros;
        this.registroEstudiante=registroEstudiante;
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) 
    {
        if(evento.getActionCommand().equals(panelBotones.BOTON_REGISTRAR))
        {
            
            GuiRegistroEstudiantes guiRegistroEstudiante= new GuiRegistroEstudiantes();
            guiRegistroEstudiante.init(registroEstudiante);
            guiRegistroEstudiante.setVisible(true);
        }
        if(evento.getActionCommand().equals(panelBotones.BOTON_ELIMINAR))
        {
            
            GuiEliminarEstudiante guiEliminarEstudiante= new GuiEliminarEstudiante();
            guiEliminarEstudiante.init(registroEstudiante);
            guiEliminarEstudiante.setVisible(true);
        }
        if(evento.getActionCommand().equals(panelBotones.BOTON_MODIFICAR))
        {
            
            GuiModificarEstudiante guiModificarEstudiante = new GuiModificarEstudiante();
            guiModificarEstudiante.init(registroEstudiante);
            guiModificarEstudiante.setVisible(true);
            
        }
        if(evento.getActionCommand().equals(panelBotones.BOTON_CONSULTAR))
        {
            
            GuiConsultarEstudiante guiConsultarEstudiante = new GuiConsultarEstudiante();
            guiConsultarEstudiante.init(registroEstudiante);
            guiConsultarEstudiante.setVisible(true);
            
        }
     
    }
    
}
