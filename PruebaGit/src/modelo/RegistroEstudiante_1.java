/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class RegistroEstudiante {
    
    // Atributos 
    private int posicionEstudiante;
    private ArrayList<Estudiante> estudiantes;
    
    // Metodo constructor
    public RegistroEstudiante() 
    {
        posicionEstudiante=0;
        estudiantes= new ArrayList<>();
    }
    
    // Metodo para agregar un estudiante 
    public String agregarNuevoEstudiante(Estudiante nuevoEstudiante)
    {
        estudiantes.add(nuevoEstudiante);
        return "Carnet:  "+nuevoEstudiante.getCarnet()+" agregado con Exito";
    }
    
    // Metodo para verificar si existe un estudiante o no
    public boolean verificarExistenciaEstudiante(String carnet)
    {
        boolean estadoEstudiante=false;
        for(int i=0; i<estudiantes.size(); i++)
        {
            if(estudiantes.get(i).getCarnet().equalsIgnoreCase(carnet))
            {
                estadoEstudiante=true;
                posicionEstudiante=i;
            }
        }
        return estadoEstudiante;
    }
    
    // Metodo para eliminar un estudiante
    public String eliminarEstudiante()
    {
        String carnetEliminar=estudiantes.get(posicionEstudiante).getCarnet();
        estudiantes.remove(posicionEstudiante);
        return "El Estudiante Carnet:"+carnetEliminar+ " fue eliminado exitosamente";
    }
    
  
    // Modificar un Estudiante
    public String modificarEstudiante(String nombre)
    {
        if(estudiantes.get(posicionEstudiante).getNombre().equalsIgnoreCase(nombre))
        {
            return "No Se Realizaron Modificaciones En Su Nombre";
        }
        else
        {
            estudiantes.get(posicionEstudiante).setNombre(nombre);
            return "Se Modifico l Nombre Con Exito";
        }
    }
    
    // Metodo para llenar la tabla con los datos
    public String [][] llenarTablaDatos()
    {
        String datosTabla[][]= new String[estudiantes.size()][2];
        for(int i=0; i<datosTabla.length; i++)
        {
            for(int j=0; j<datosTabla[0].length; j++)
            {
                datosTabla[i][j]=estudiantes.get(i).getNombre();
                datosTabla[i][j+1]=estudiantes.get(i).getCarnet();
                j+=1;
            }
        }
        return datosTabla;
    
    }
    public String []titulosTabla()
    {
        String titulos[]=new String[2];
        titulos[0]="Nombre";
        titulos[1]="Carnet";
        return titulos;
    }
    
    public String [][] mostrarEstudianteEspecifico()
    {
        String datosTabla[][]= new String[estudiantes.size()][2];
        for(int i=0; i<1; i++)
        {
            for(int j=0; j<datosTabla[0].length; j++)
            {
                datosTabla[i][j]=estudiantes.get(posicionEstudiante).getNombre();
                datosTabla[i][j+1]=estudiantes.get(posicionEstudiante).getCarnet();
                j+=1;
            }
        }
        return datosTabla;
    
    }
        public ArrayList<Estudiante> getArrayEstudiantes()
    {
        return estudiantes;
    }
        public String mostrarUnEstudiante()
        {
            return estudiantes.get(posicionEstudiante).toString();
        }
}
