/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Matricula;
import modelo.RegistroMatricula;
import vista.GuiMatricula;
import vista.PanelBotonesAccion;

/**
 *
 * @author Diego
 */
public class ManejadorMatricula implements ActionListener{
    private PanelBotonesAccion panelBotonesAccion;
    private GuiMatricula guiMatricula;
    private RegistroMatricula registroMatricula;
    private Matricula matricula;
    public ManejadorMatricula(GuiMatricula guiMatricula,PanelBotonesAccion panelBotonesAccion,RegistroMatricula registroMatricula) 
    {
        this.panelBotonesAccion=panelBotonesAccion;
        this.guiMatricula=guiMatricula;
        this.registroMatricula=registroMatricula;
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        
        if(evento.getActionCommand().equalsIgnoreCase(guiMatricula.BOTON_AGREGAR))
        {
            if(registroMatricula.verificarCursoAgregado(guiMatricula.getComboCursos().getSelectedItem().toString()))
            {
                guiMatricula.getArea().setText("Este Curso Ya se Encuentra Agregado");
            }
            else
            {
                registroMatricula.agregarCursoTemporalmente(guiMatricula);
                guiMatricula.setDatosTabla(registroMatricula.agregarCursoTablaTemporalmente(),registroMatricula.titulos());
                
            }
            }
      else if(evento.getActionCommand().equalsIgnoreCase(panelBotonesAccion.BOTON_ACEPTAR))
        {
            if(!guiMatricula.getComboCursos().getSelectedItem().equals(""))
            {
                if(registroMatricula.buscarMatriculaRealizada(guiMatricula.getComboEstudiantes().getSelectedItem().toString()))
                {
                    guiMatricula.getArea().setText("Ya Existe una Matricula Para Este Estudiante");  
                }
                else
                {
                    if(registroMatricula.getArrayTemporal().size()>0)
                    {
                    matricula= new Matricula(registroMatricula.obtenerFechaMatricula(),registroMatricula.getCarnetEstudiante(guiMatricula),
                    registroMatricula.getArrayTemporal());
                    registroMatricula.registrarNuevaMatricula(matricula);
                    registroMatricula.iniciarArray();
                    guiMatricula.setDatosTabla(registroMatricula.agregarCursoTablaTemporalmente(),registroMatricula.titulos());
                     guiMatricula.getArea().setText("Matricula Realizada");
                  }
                    else
                    {
                         guiMatricula.getArea().setText("Debe agregar cursos");
                    }
                    }
            }
        }
        else if(evento.getActionCommand().equalsIgnoreCase(panelBotonesAccion.BOTON_CANCELAR))
        {
         registroMatricula.iniciarArray();
         guiMatricula.limpiar(registroMatricula.agregarCursoTablaTemporalmente(), registroMatricula.titulos());
         
        }
    }
}
