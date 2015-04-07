/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Diego
 */
public class Curso {
    
    private String siglasDelCurso,nombreDelCurso;
    private double creditos;

    public Curso(String siglasDelCurso, String nombreDelCurso, double creditos) {
        this.siglasDelCurso = siglasDelCurso;
        this.nombreDelCurso = nombreDelCurso;
        this.creditos = creditos;
    }

    public String getSiglasDelCurso() {
        return siglasDelCurso;
    }

    public void setSiglasDelCurso(String siglasDelCurso) {
        this.siglasDelCurso = siglasDelCurso;
    }

    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

    public double getCreditos() {
        return creditos;
    }

    public void setCreditos(double creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Curso{" + "siglasDelCurso=" + siglasDelCurso + ", nombreDelCurso=" + nombreDelCurso + ", creditos=" + creditos + '}';
    }
    
}
