/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Curso;
import modelo.RegistroCursos;
import vista.GuiRegistroCursos;
import vista.PanelBotonesAccion;

/**
 *
 * @author Diego
 */
public class ManejadorRegistroCursos implements ActionListener{

    private GuiRegistroCursos guiRegistroCursos;
    private PanelBotonesAccion panelBotonesAccion;
    private RegistroCursos registroCursos;
    public ManejadorRegistroCursos(GuiRegistroCursos guiRegistroCursos, PanelBotonesAccion panelBotonesAccion,RegistroCursos registroCursos) {
        this.guiRegistroCursos = guiRegistroCursos;
        this.panelBotonesAccion = panelBotonesAccion;
        this.registroCursos=registroCursos;
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) 
    {
        if(evento.getActionCommand().equalsIgnoreCase(panelBotonesAccion.BOTON_ACEPTAR))
        {
            if(guiRegistroCursos.verificarEspaciosVacios()==false)
            {
                if(registroCursos.verificarExistenciaCurso(guiRegistroCursos.getSiglas().getText()))
                {
                    guiRegistroCursos.getAreaDetExto().setText("Este Curso Ya se Encuentra Registrado");
                }
                else
                {
                    if(registroCursos.validarCreditos(guiRegistroCursos.getCreditos().getText()))
                    {
                     Curso nuevoCurso = new Curso(guiRegistroCursos.getSiglas().getText(), guiRegistroCursos.getNombre().getText(),
                             Double.parseDouble(guiRegistroCursos.getCreditos().getText()) );
  
                        guiRegistroCursos.getAreaDetExto().setText(registroCursos.agregarNuevoCurso(nuevoCurso));
                        guiRegistroCursos.limpiarCampos();
                    }
                    else
                    {
                        guiRegistroCursos.getAreaDetExto().setText("Los Creditos Deben de ser numeros");
                    }
                    
                }
            }
            else
            {
                guiRegistroCursos.getAreaDetExto().setText("Debe De Completar Los Datos");
               
            }
        }
        if(evento.getActionCommand().equalsIgnoreCase(panelBotonesAccion.BOTON_CANCELAR))
        {
            guiRegistroCursos.limpiarCampos();
        }
    }
    
}
