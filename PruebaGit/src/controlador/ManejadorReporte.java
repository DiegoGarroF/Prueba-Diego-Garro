/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.RegistroEstudiante;
import modelo.RegistroMatricula;
import vista.GuiReporte;

/**
 *
 * @author Diego
 */
public class ManejadorReporte implements ActionListener{

    private GuiReporte guiReporte;
    private RegistroMatricula registroMatricula;
    private RegistroEstudiante registroEstudiante;
    public ManejadorReporte(GuiReporte guiReporte,RegistroMatricula registroMatricula,RegistroEstudiante registroEstudiante) {
        this.guiReporte = guiReporte;
        this.registroMatricula=registroMatricula;
        this.registroEstudiante=registroEstudiante;
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) 
    {
        if(evento.getActionCommand().equalsIgnoreCase(guiReporte.BOTON_ACEPTAR))
        {
            if(registroMatricula.buscarMatriculaRealizada(guiReporte.getCarnet().getText()))
            {
                guiReporte.setDatosTabla(registroMatricula.llenarTabla(), registroMatricula.titulos());
                registroEstudiante.verificarExistenciaEstudiante(guiReporte.getCarnet().getText());
                guiReporte.areaTexto().setText(registroEstudiante.mostrarUnEstudiante());
                guiReporte.getCreditos().setText(String.valueOf(registroMatricula.cantidadCreditos()));
                guiReporte.getFecha().setText(registroMatricula.obtenerFechaMatricula());
            }
            else
            {
                if(registroEstudiante.verificarExistenciaEstudiante(guiReporte.getCarnet().getText()))
                {
                guiReporte.areaTexto().setText(registroEstudiante.mostrarUnEstudiante());
                }
                else
                {
                    guiReporte.areaTexto().setText("No Existe Este carnet");
                }
            }
        }
        
    }
    
}
