/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.RegistroCursos;
import vista.GuiEliminarCurso;
import vista.PanelBotonesAccion;

/**
 *
 * @author Diego
 */
public class ManejadorEliminarCurso implements ActionListener{

    private GuiEliminarCurso guiEliminarCurso;
    private PanelBotonesAccion panelBotonesAccion;
    private RegistroCursos registroCursos;
    public ManejadorEliminarCurso(GuiEliminarCurso guiEliminarCurso, PanelBotonesAccion panelBotonesAccion,RegistroCursos registroCursos) {
        this.guiEliminarCurso = guiEliminarCurso;
        this.panelBotonesAccion = panelBotonesAccion;
        this. registroCursos=registroCursos;
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) 
    {
        if(evento.getActionCommand().equalsIgnoreCase(panelBotonesAccion.BOTON_ACEPTAR))
        {
            if(!guiEliminarCurso.getSiglas().getText().trim().equalsIgnoreCase(""))
            {
                if(registroCursos.verificarExistenciaCurso(guiEliminarCurso.getSiglas().getText()))
                {
                    guiEliminarCurso.getAreaDeTexto().setText(registroCursos.eliminarCurso());
                }
                else
                {
                    guiEliminarCurso.getAreaDeTexto().setText("No Existe Este Curso");
                }
            }
            else 
            {
                guiEliminarCurso.getAreaDeTexto().setText("Digte la Siglas");
            }
        }
        if(evento.getActionCommand().equalsIgnoreCase(panelBotonesAccion.BOTON_CANCELAR))
        {
            guiEliminarCurso.limpiarCampos();
        }
    }
    
}
