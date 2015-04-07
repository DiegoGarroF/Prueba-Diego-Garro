/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import vista.GuiMatricula;

/**
 *
 * @author Diego
 */
public class RegistroMatricula {
    private ArrayList<Matricula> matriculas;
    private ArrayList<String> guardaCursosTemporalmente;
    private int posicionMatricula;
    private RegistroCursos registroCursos;
    private RegistroEstudiante regitroEstudiantes;
    private double cantidadCreditos;
    public RegistroMatricula(RegistroCursos registroCursos,RegistroEstudiante regitroEstudiantes) {
        posicionMatricula=0;
        matriculas= new ArrayList<>();
        guardaCursosTemporalmente= new ArrayList<>();
        this.registroCursos=registroCursos;
        this.regitroEstudiantes=regitroEstudiantes;
        cantidadCreditos=0;
        
    }
    // Metodo para registrar una nueva matricula
    public String registrarNuevaMatricula(Matricula nuevaMatricula)
    {
        matriculas.add(nuevaMatricula);
        
        return " La Matricula se Realizo Con Exito";
    }
    // Metodo para agregar Un curso temporamente para agregarlos despues en la matricula
    public void agregarCursoTemporalmente(GuiMatricula guiMatricula)
    {
        guardaCursosTemporalmente.add((String) guiMatricula.getComboCursos().getSelectedItem());
    }
    // metodo para retornar el array que contiene las siglas de los cursos para despues enviarselo al objeto matricula
    public ArrayList<String> getArrayTemporal()
    {
        return guardaCursosTemporalmente;
    }
    // Metodo para buscar si existe una matricula para un estudiante determinado
    public boolean buscarMatriculaRealizada(String carnetCarnet)
    {
        boolean existeCarnet=false;
        for(int i=0; i<matriculas.size(); i++)
        {
            if(matriculas.get(i).getCarnetEstudiante().equalsIgnoreCase(carnetCarnet))
            {
                existeCarnet=true;
                posicionMatricula=i;
                break;
            }
        }
        return existeCarnet;
    }
    // Metodo para agrgar items a los jComboBox de cursos y los de estudiantes 
   public void AgregarItemCombos(GuiMatricula guiMatricula)
    {
        guiMatricula.getComboCursos().removeAllItems();
        guiMatricula.getComboEstudiantes().removeAllItems();
        for(int i=0; i<registroCursos.getArrayCursos().size(); i++)
        {
            guiMatricula.getComboCursos().addItem(registroCursos.getArrayCursos().get(i).getSiglasDelCurso());
        }
        for(int j=0; j<regitroEstudiantes.getArrayEstudiantes().size(); j++)
        {
            guiMatricula.getComboEstudiantes().addItem(regitroEstudiantes.getArrayEstudiantes().get(j).getCarnet());
            
        }
    }
   // Metodo que me va a devolver la fecha en la cual se realiza una matricula 
   public String obtenerFechaMatricula()
   {
       Calendar fechaMatricula = GregorianCalendar.getInstance();
        return fechaMatricula.getTime().toLocaleString();
   }
   // Metodo que inicializa en array de siglas para despues empieze nuevamente vacio y no agregue todos los cursos de todos los estudiantes 
   public void iniciarArray()
   {
       guardaCursosTemporalmente= new ArrayList<>();
   }
   
  
 public String getCarnetEstudiante(GuiMatricula guiMatricula)
 {
     return (String) guiMatricula.getComboEstudiantes().getSelectedItem();
 }
 public String [][] llenarTabla()
    {
        String datosTabla[][]= new String[matriculas.get(posicionMatricula).getSiglasCursos().size()][3];
       
        
        for(int i=0; i<registroCursos.getArrayCursos().size(); i++)
        {
            cantidadCreditos=0;
         for(int j=0; j<matriculas.get(posicionMatricula).getSiglasCursos().size(); j++)
            {
                if(registroCursos.verificarExistenciaCurso(matriculas.get(posicionMatricula).getSiglasCursos().get(j)))
                {
                    datosTabla[j][0]=registroCursos.getArrayCursos().get(registroCursos.getPosicion()).getNombreDelCurso();
                    datosTabla[j][1]=registroCursos.getArrayCursos().get(registroCursos.getPosicion()).getSiglasDelCurso();
                    datosTabla[j][2]=String.valueOf(registroCursos.getArrayCursos().get(registroCursos.getPosicion()).getCreditos());
                    cantidadCreditos+= registroCursos.getArrayCursos().get(registroCursos.getPosicion()).getCreditos();
                }
                
            }
        }
        return datosTabla;
    }
 public String [] titulos()
 {
     String titulos []= new String[3];
     titulos[0]="Nombre";
     titulos[1]="Siglas";
     titulos[2]="Creditos";
     return titulos;
 }
 public String [][] agregarCursoTablaTemporalmente()
 {
      String datosTabla[][]= new String[getArrayTemporal().size()][3];
        for(int i=0; i<datosTabla.length; i++)
        {
           for(int j=0; j<registroCursos.getArrayCursos().size(); j++)
            {
                if(registroCursos.getArrayCursos().get(j).getSiglasDelCurso().equalsIgnoreCase(guardaCursosTemporalmente.get(i)))
                {
                    datosTabla[i][0]=registroCursos.getArrayCursos().get(j).getNombreDelCurso();
                    datosTabla[i][1]=registroCursos.getArrayCursos().get(j).getSiglasDelCurso();
                    datosTabla[i][2]=String.valueOf(registroCursos.getArrayCursos().get(j).getCreditos());  
                }
                
            }
        }
        return datosTabla;
 }
 public boolean  verificarCursoAgregado(String siglas)
 {
     boolean existeCurso=false;
     for(int i=0; i<guardaCursosTemporalmente.size();i++)
     {
         if(guardaCursosTemporalmente.get(i).equalsIgnoreCase(siglas))
         {
             existeCurso=true;
             break;
         }
     }
     return existeCurso;
 }
 
 // Este Metodo me retorna la cantidad de creditos que tiene matriculado un estudiante
 public double cantidadCreditos()
 {
     return cantidadCreditos;
 }
}
