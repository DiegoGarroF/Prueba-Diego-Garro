/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.RegistroCursos;
import vista.GuiAccionesCursos;
import vista.GuiAccionesEstudiante;
import vista.GuiConsultarCurso;
import vista.GuiEliminarCurso;
import vista.GuiEliminarEstudiante;
import vista.GuiModificarCurso;
import vista.GuiRegistroCursos;
import vista.PanelBotonesAccion;
import vista.PanelBotonesSeleccion;

/**
 *
 * @author Diego
 */
public class ManejadorAccionCursos implements ActionListener
{
    private GuiAccionesCursos guiAccionesCursos;
    private PanelBotonesSeleccion panelBotones;
    private RegistroCursos registroCursos;

    public ManejadorAccionCursos(GuiAccionesCursos guiAccionesCursos, PanelBotonesSeleccion panelBotones,RegistroCursos registroCursos) {
        this.guiAccionesCursos = guiAccionesCursos;
        this.panelBotones = panelBotones;
        this.registroCursos= registroCursos;
    }
    
    public void actionPerformed(ActionEvent evento) 
    {
        if(evento.getActionCommand().equalsIgnoreCase(panelBotones.BOTON_REGISTRAR))
        {
            GuiRegistroCursos guiRegistroCursos = new GuiRegistroCursos();
            guiRegistroCursos.init(registroCursos);
            guiRegistroCursos.setVisible(true);
        }
        else if(evento.getActionCommand().equalsIgnoreCase(panelBotones.BOTON_ELIMINAR))
        {
            GuiEliminarCurso guiEliminarCurso= new GuiEliminarCurso();
            guiEliminarCurso.init(registroCursos);
            guiEliminarCurso.setVisible(true);
        }
        else if(evento.getActionCommand().equalsIgnoreCase(panelBotones.BOTON_MODIFICAR))
        {
            GuiModificarCurso guiModificarCurso= new GuiModificarCurso();
            guiModificarCurso.init(registroCursos);
            guiModificarCurso.setVisible(true);
        }
        else if(evento.getActionCommand().equalsIgnoreCase(panelBotones.BOTON_CONSULTAR))
        {
            GuiConsultarCurso guiConsultarCurso= new GuiConsultarCurso();
            guiConsultarCurso.init(registroCursos);
            guiConsultarCurso.setVisible(true);
        }
    }
   
    
}
