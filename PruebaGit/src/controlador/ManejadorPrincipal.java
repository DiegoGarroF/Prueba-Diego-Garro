/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Matricula;
import modelo.RegistroCursos;
import modelo.RegistroEstudiante;
import modelo.RegistroMatricula;
import vista.GuiAccionesCursos;
import vista.GuiAccionesEstudiante;
import vista.GuiMatricula;
import vista.GuiPrincipal;
import vista.GuiRegistroEstudiantes;
import vista.GuiReporte;
import vista.PanelTablaInformacion;

/**
 *
 * @author Diego
 */

public class ManejadorPrincipal implements ActionListener {

    
    private GuiPrincipal guiprincipal;

    private RegistroCursos registroCursos;
    private RegistroEstudiante registroEstudiante;
    private RegistroMatricula registroMatricula;
    public ManejadorPrincipal(GuiPrincipal guiprincipal) {
        this.guiprincipal = guiprincipal;
        registroCursos= new RegistroCursos();
        registroEstudiante= new RegistroEstudiante();
        registroMatricula= new RegistroMatricula(registroCursos, registroEstudiante);
        guiprincipal.setManejador(this);
    }
   
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(evento.getActionCommand().equalsIgnoreCase(guiprincipal.JRADIOBUTTON__ESTUDIANTES))
        {
            GuiAccionesEstudiante guiAccionEstudiante = new GuiAccionesEstudiante();
            guiAccionEstudiante.init(registroEstudiante);
            guiAccionEstudiante.setVisible(true);
        }
         if(evento.getActionCommand().equalsIgnoreCase(guiprincipal.JRADIOBUTTON__CURSOS))
        {
            GuiAccionesCursos guiAccionesCursos = new GuiAccionesCursos();
            guiAccionesCursos.setTitle("Area De Cursos");
            guiAccionesCursos.init(registroCursos);
            guiAccionesCursos.setVisible(true);
        }
         if(evento.getActionCommand().equalsIgnoreCase(guiprincipal.JRADIOBUTTON__MATRICULA))
        {
            // condicion pporque debe de crear estudiantes y cursos antes de matricular
            if(registroCursos.getArrayCursos().size()>0&& registroEstudiante.getArrayEstudiantes().size()>0)
            {
                GuiMatricula guiMatricula = new GuiMatricula();
                guiMatricula.setVisible(true);
                guiMatricula.init(registroMatricula);
            }
            
        }
          if(evento.getActionCommand().equalsIgnoreCase(guiprincipal.JRADIOBUTTON__REPORTE))
        {
            GuiReporte guiReporte = new GuiReporte();
            guiReporte.setVisible(true);
            guiReporte.setTitle("Reporte De Matricula");
            guiReporte.init(registroMatricula, registroEstudiante);
        }
           if(evento.getActionCommand().equalsIgnoreCase(guiprincipal.JRADIOBUTTON__SALIR))
        {
            System.exit(0);
        }
        
    }
    
}
