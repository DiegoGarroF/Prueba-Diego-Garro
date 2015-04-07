/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.RegistroCursos;
import modelo.RegistroEstudiante;
import vista.GuiRegistroEstudiantes;
import vista.PanelBotonesAccion;

/**
 *
 * @author Diego
 */
public class ManejadorRegisrtroEstudiantes implements ActionListener{
    private PanelBotonesAccion panelBotonesAccion;
    private GuiRegistroEstudiantes guiRegistroEstudiantes;
    private RegistroEstudiante registroEstudiante;
    public ManejadorRegisrtroEstudiantes(PanelBotonesAccion panelBotonesAccion,GuiRegistroEstudiantes guiRegistroEstudiantes,RegistroEstudiante registroEstudiante) 
    {
        this.registroEstudiante = registroEstudiante;
        this.panelBotonesAccion=panelBotonesAccion;
        this.guiRegistroEstudiantes=guiRegistroEstudiantes;
        
    }
    
    public void actionPerformed(ActionEvent evento) 
    {
        
        if(evento.getActionCommand().equalsIgnoreCase(panelBotonesAccion.BOTON_ACEPTAR))
        {
            if(guiRegistroEstudiantes.verificarCamposVacios())
            {
                guiRegistroEstudiantes.getAreaDeTexto().setText("Debe De Completar los Espacios");
            }
            else
            {
                if(registroEstudiante.verificarExistenciaEstudiante(guiRegistroEstudiantes.getCarnet()))
                {
                            
                    guiRegistroEstudiantes.getAreaDeTexto().setText("Ya Existe este Carnet");
                }
                else
                {
                    guiRegistroEstudiantes.getAreaDeTexto().setText(registroEstudiante.agregarNuevoEstudiante(guiRegistroEstudiantes.getEstudiante()));
                    guiRegistroEstudiantes.limpiarCampos();
                }
            }
        }
        if(evento.getActionCommand().equalsIgnoreCase(panelBotonesAccion.BOTON_CANCELAR))
        {
            guiRegistroEstudiantes.limpiarCampos();
        }
    }
}
