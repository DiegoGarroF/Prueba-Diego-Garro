/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.RegistroCursos;
import vista.GuiConsultarCurso;
import vista.PanelBotonesAccion;

/**
 *
 * @author Diego
 */
public class ManejadorConsultaCursos implements ActionListener{

    private RegistroCursos registroCursos;
    private GuiConsultarCurso guiConsultarCurso;
    private PanelBotonesAccion panelBotonesAccion;

    public ManejadorConsultaCursos(RegistroCursos registroCursos, GuiConsultarCurso guiConsultarCurso, PanelBotonesAccion panelBotonesAccion) {
        this.registroCursos = registroCursos;
        this.guiConsultarCurso = guiConsultarCurso;
        this.panelBotonesAccion = panelBotonesAccion;
    }
    
    public void actionPerformed(ActionEvent evento) {
        if(guiConsultarCurso.getJRadioEspecifico().isSelected())
        {
          panelBotonesAccion.getBotonAceptar().setEnabled(true);
          guiConsultarCurso.getSiglas().setEditable(true);
          
            if (evento.getActionCommand().equalsIgnoreCase(panelBotonesAccion.BOTON_ACEPTAR)) {
                if(!guiConsultarCurso.getSiglas().getText().trim().equalsIgnoreCase(""))
                {
                    if(registroCursos.verificarExistenciaCurso(guiConsultarCurso.getSiglas().getText()))
                    {
                        guiConsultarCurso.setDatosTabla(registroCursos.mostrarCursoEspecifico(), registroCursos.titulosTabla());
                    }
                    else
                    {
                        guiConsultarCurso.getArea().setText( "No Se Encontrar las Siglas");
                    }
                }
                else
                {
                     guiConsultarCurso.getArea().setText( "Digite las Siglas Del Curso");
                }
            }
        }
        else if(guiConsultarCurso.getJRadioGeneral().isSelected())
        {
             panelBotonesAccion.getBotonAceptar().setEnabled(true);
             guiConsultarCurso.getSiglas().setEditable(false);
            guiConsultarCurso.setDatosTabla(registroCursos.llenarTablaDatos(), registroCursos.titulosTabla());
        }
        if (evento.getActionCommand().equalsIgnoreCase(panelBotonesAccion.BOTON_CANCELAR)) {
            guiConsultarCurso.limpiarCampos(registroCursos.titulosTabla());
        }
    }
    
}
