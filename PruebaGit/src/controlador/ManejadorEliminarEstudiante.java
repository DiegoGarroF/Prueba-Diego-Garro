/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.RegistroEstudiante;
import vista.GuiEliminarEstudiante;
import vista.GuiRegistroEstudiantes;
import vista.PanelBotonesAccion;

/**
 *
 * @author Diego
 */
public class ManejadorEliminarEstudiante implements ActionListener{

   private PanelBotonesAccion panelBotonesAccion;
    private GuiEliminarEstudiante guiEliminarEstudiante;
    private RegistroEstudiante registroEstudiante;

    public ManejadorEliminarEstudiante(PanelBotonesAccion panelBotonesAccion, GuiEliminarEstudiante guiEliminarEstudiante,RegistroEstudiante registroEstudiante) {
        this.panelBotonesAccion = panelBotonesAccion;
        this.guiEliminarEstudiante = guiEliminarEstudiante;
        this.registroEstudiante= registroEstudiante;
    }
    

    
    public void actionPerformed(ActionEvent evento) {
       if(evento.getActionCommand().equalsIgnoreCase(panelBotonesAccion.BOTON_ACEPTAR))
       {
           if(!guiEliminarEstudiante.getCarnet().equalsIgnoreCase(""))
           {
               if(registroEstudiante.verificarExistenciaEstudiante(guiEliminarEstudiante.getCarnet()))
               {
                   guiEliminarEstudiante.getAreaDeTexto().setText(registroEstudiante.eliminarEstudiante());
                   guiEliminarEstudiante.limpiarCampos();
               }
               else
               {
                   guiEliminarEstudiante.getAreaDeTexto().setText("No Se Encuentra este Carnet");
               }
           }
           else
           {
               guiEliminarEstudiante.getAreaDeTexto().setText("Debe De Ingresar un Carnet");
           }
       }
       else if(evento.getActionCommand().equalsIgnoreCase(panelBotonesAccion.BOTON_CANCELAR))
       {
           guiEliminarEstudiante.limpiarCampos();
       }
    }
    
}
