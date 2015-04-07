/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.RegistroCursos;
import vista.GuiModificarCurso;
import vista.PanelBotonesAccion;

/**
 *
 * @author Diego
 */
public class ManejadorModificarCursos implements ActionListener{

  private GuiModificarCurso guiModificarCurso;
  private RegistroCursos registroCursos;
  private PanelBotonesAccion panelBotonesAccion;
    public ManejadorModificarCursos(GuiModificarCurso guiModificarCurso, RegistroCursos registroCursos,PanelBotonesAccion panelBotonesAccion) {
        this.guiModificarCurso = guiModificarCurso;
        this.registroCursos = registroCursos;
        this.panelBotonesAccion=panelBotonesAccion;
    }
  
    public void actionPerformed(ActionEvent evento) {
        if(evento.getActionCommand().equalsIgnoreCase(panelBotonesAccion.BOTON_ACEPTAR))
        {
            if(!guiModificarCurso.getSiglas().getText().trim().equalsIgnoreCase(""))
            {
                if(registroCursos.verificarExistenciaCurso(guiModificarCurso.getSiglas().getText()))
                {
                    if(!guiModificarCurso.getNombre().getText().trim().equalsIgnoreCase(""))
                    {
                        if(registroCursos.validarCreditos(guiModificarCurso.getCreditos().getText()))
                        {
                        guiModificarCurso.getArea().setText(registroCursos.modificarNombre(guiModificarCurso.getNombre().getText(), 
                                Double.parseDouble(guiModificarCurso.getCreditos().getText())));
                        }
                        else
                        {
                            guiModificarCurso.getArea().setText("Ingrese Correctamente los Creditos");
                        }
                    }
                    else
                    {
                        guiModificarCurso.getArea().setText("Complete los datos");
                    }
                }
                else
                {
                    guiModificarCurso.getArea().setText("No Se Encuentra Registrado Este Curso");
                }
            }
            else
            {
                guiModificarCurso.getArea().setText("Ingrese Las Siglas Del Curso");
            }
        }
         if(evento.getActionCommand().equalsIgnoreCase(panelBotonesAccion.BOTON_CANCELAR))
        {
            guiModificarCurso.limpiarCampos();
        }
      }
    
}
