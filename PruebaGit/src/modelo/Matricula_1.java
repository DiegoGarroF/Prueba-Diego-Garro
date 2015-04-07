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
public class Matricula {
    private String fechaMatricula,carnetEstudiante;
    private ArrayList<String> siglasCursos;

    public Matricula(String fechaMatricula, String carnetEstudiante, ArrayList<String> siglasCursos) {
        this.fechaMatricula = fechaMatricula;
        this.siglasCursos = siglasCursos;
        this.carnetEstudiante = carnetEstudiante;
    }

    public String getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public String getCarnetEstudiante() {
        return carnetEstudiante;
    }

    public void setCarnetEstudiante(String carnetEstudiante) {
        this.carnetEstudiante = carnetEstudiante;
    }

    public ArrayList<String> getSiglasCursos() {
        return siglasCursos;
    }

    public void setSiglasCursos(ArrayList<String> siglasCursos) {
        this.siglasCursos = siglasCursos;
    }

    public String mostrarCursos()
    {
        String datos="";
        for(int i=0; i<siglasCursos.size(); i++)
        {
            datos+=siglasCursos.get(i)+"\n";
        }
        return datos;
    }
}
