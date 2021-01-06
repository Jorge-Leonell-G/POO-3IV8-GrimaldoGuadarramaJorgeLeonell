/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package buscaminas;

import java.io.Serializable;

/**
 *
 * @author rash2
 */
public class Jugador implements Serializable{
    
    private String nombre;
    private int edad;
    private int ID;
    private int score;
    
    //constructor
    public Jugador(){
    }
    
    //constructor sobrecargado con parametros
    public Jugador(String nombre, int edad, int ID, int score) {
        this.nombre = nombre;
        this.edad = edad;
        this.ID = ID;
        this.score = score;
        
    }
    
    //getters & setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getID(){
        return ID;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    
    
    
    
}
