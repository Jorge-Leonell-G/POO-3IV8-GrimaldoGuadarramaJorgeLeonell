/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package buscaminas;

/**
 *
 * @author rash2
 */

import javax.swing.*;

public class Casillas extends JButton{
    
    //variable tipo boolean para definir si la casilla sera o no sera una mina
    private boolean mina;
    private boolean vacio;
    
    //constructor
    public Casillas(){
        super();
        
        double random = Math.random(); //por defualt tendremos numeros aleatorios del 0 al 1
                                        // y a la vez, una probabilidad del 50% de que haya minas
        if(random>0.5){
            mina=true;
        }else{
            mina=false;
        }
        
    }
    
     public boolean campoMinado(){
            return mina;
        }
     
     public boolean campoLibre(){
         return vacio;
     }
    
    //Se descarta la opcion de las dificultades :/...
    //Solo habrá una dificultad que este conectada con el evento del botón "Comenzar!"
    
    
    //metodo para la primera dificultad (facil)
    
    /*
    public void CasillasFacil(){
        double randomfacil = Math.random();//por defualt tendremos numeros aleatorios del 0 al 1
                                        // y a la vez, una probabilidad del 10% de que haya minas
        if(randomfacil>0.9){
            mina=true;
        }else{
            mina=false;
        }
        
    }
    
    //metodo para la segunda dificultad (normal)
    
    
    
    public void CasillasNormal(){
        double randomnormal = Math.random();
        //aumentamos la dificultad de forma gradual al cambiar
        //las condiciones de nuestro ciclo if
        //Tenemos 50% de probabilidad de que o haya casillas normales o minadas
        if(randomnormal>0.5){
            mina=true;
        }else{
            mina=false;
        }
    }
    
    //metodo para la tercera dificultad (dificil)
    //copiamos y pegamos codigo :D
    public void CasillasDificil(){
        double randomdificil = Math.random();
        if(randomdificil>0.3){
            mina=true;
        }else{
            mina=false;
        }
    }
    
    //metodo para la cuarta dificultad (pesadilla!)
    public void CasillasPesadilla(){
        double randompes = Math.random();
        if(randompes>0.1){
            mina=true;
        }else{
            mina=false;
        }
    }
    */
   
    
}
