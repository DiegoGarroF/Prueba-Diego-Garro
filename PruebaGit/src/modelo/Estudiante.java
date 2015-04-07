/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JTextField;

/**
 *
 * @author Diego
 */
public class Estudiante {
    // Atributos que voy a utilizar 
    private String carnet,nombre;

    public Estudiante(String carnet, String nombre) {
        this.carnet = carnet;
        this.nombre = nombre;
    }

   
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estudiante\n" + "carnet=" +getCarnet()+"\nNombre= "+getNombre() ;
    }
    
    
}
