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
public class RegistroCursos {
    // Atributos 
    private int posicionCurso;
    private ArrayList<Curso> cursos;
    
    // Metodo constructor
    public RegistroCursos() 
    {
        posicionCurso=0;
        cursos= new ArrayList<>();
    }
    
    // Metodo para agregar un curso
    public String agregarNuevoCurso(Curso nuevoCurso)
    {
        cursos.add(nuevoCurso);
        return "Curso agregado con Exito";
    }
    
    // Metodo para verificar si existe un curso o no
    public boolean verificarExistenciaCurso(String siglas)
    {
        boolean estadoCurso=false;
        for(int i=0; i<cursos.size(); i++)
        {
            if(cursos.get(i).getSiglasDelCurso().equalsIgnoreCase(siglas))
            {
                estadoCurso=true;
                posicionCurso=i;
            }
        }
        return estadoCurso;
    }
    
    // Metodo para eliminar un curso
    public String eliminarCurso()
    {
        String cursoEliminar=cursos.get(posicionCurso).getSiglasDelCurso();
        cursos.remove(posicionCurso);
        return "El Curso:"+cursoEliminar+ " fue eliminado exitosamente";
    }
    
    //validar entrada de datos para los creditos
    public boolean validarCreditos(String creditos)
    {
        try
        {
            double cantidadCreditos= 0;
            cantidadCreditos=Double.parseDouble(creditos);
            return true;
        }
        catch(NumberFormatException exception)
        {
            return false ;
        }
    }
    // modificar curso
    public String modificarNombre(String nombre,double creditos)
    {
        if(!cursos.get(posicionCurso).getNombreDelCurso().equalsIgnoreCase(nombre)||cursos.get(posicionCurso).getCreditos()!=creditos)
        {
            cursos.get(posicionCurso).setCreditos(creditos);
            cursos.get(posicionCurso).setNombreDelCurso(nombre);
            return " Se Realizo la Modificacion con exito";
        }
        else
        {
            return "No!!! Se Realizo Ninguna Modificacion";
        }
    }
   // Metodo para llenar la tabla con los datos
    public String [][] llenarTablaDatos()
    {
        String datosTabla[][]= new String[cursos.size()][3];
        for(int i=0; i<datosTabla.length; i++)
        {
            for(int j=0; j<datosTabla[0].length; j++)
            {
                datosTabla[i][j]=cursos.get(i).getNombreDelCurso();
                datosTabla[i][j+1]=cursos.get(i).getSiglasDelCurso();
                 datosTabla[i][j+2]=String.valueOf(cursos.get(i).getCreditos());
                j+=2;
            }
        }
        return datosTabla;
    
    }
    public String []titulosTabla()
    {
        String titulos[]=new String[3];
        titulos[0]="Nombre Del Curso";
        titulos[1]="Siglas";
        titulos[2]="Cantidad De Creditos";
        return titulos;
    }
    
    public String [][] mostrarCursoEspecifico()
    {
        String datosTabla[][]= new String[cursos.size()][3];
        for(int i=0; i<1; i++)
        {
            for(int j=0; j<datosTabla[0].length; j++)
            {
                datosTabla[i][j]=cursos.get(posicionCurso).getNombreDelCurso();
                datosTabla[i][j+1]=cursos.get(posicionCurso).getSiglasDelCurso();
                datosTabla[i][j+2]=String.valueOf(cursos.get(posicionCurso).getCreditos());
                j+=2;
            }
        }
        return datosTabla;
    }
    
   public ArrayList<Curso> getArrayCursos()
   {
       return cursos;
   }
   public int getPosicion()
   {
       return posicionCurso;
   }
}
