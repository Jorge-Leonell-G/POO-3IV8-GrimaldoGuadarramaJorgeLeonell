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

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controlador {
    
    //Creacion de nuestro ArrayList
    
    public ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
    
    //comenzamos con los metodos fundamentales de un CRUD
    
    //agregar un jugador      //clase  //objeto
    public void agregarJugador(Jugador j) throws FileNotFoundException, IOException{
        //agregamos a nuestro objeto de la lista de jugadores
        listaJugadores.add(j);
        //Creacion de nuestro archivo/fichero
        guardar();
        
    }
    
    //buscar a una persona a través de su puntaje (score)
    public Jugador buscarJugador(int score){
        //creamos un objeto a partir de la clase Jugador
        Jugador encontrado = new Jugador();
        //recorremos los registros a partir de un ciclo for
        for(Jugador j : listaJugadores){
            //anidamos un ciclo if para la busqueda hasta encontrar nuestro score
            if(score == j.getScore()){
                encontrado = j;
                JOptionPane.showMessageDialog(null,"El proceso se llevó con éxito");
            }else{
                JOptionPane.showMessageDialog(null, "No existe registro del dato ingresado");
            }
            
        }
        
        return encontrado;
    }
    
    
    
    //actualizar los datos del jugador
                                 //clase    //objeto
    public void actualizarJugador(Jugador actualizado){
        //para actualizar datos del jugador, se debe hacer su busqueda
        //es por eso que se vuleve a utilizar el metodo buscarJugador
        //junto con el metodo getScore
        Jugador actualizar = buscarJugador(actualizado.getScore());
        
        //primero debemos de remover el score
        listaJugadores.remove(actualizar);
        
        //se vuelve a añadir el socre
        listaJugadores.add(actualizado);
        
    }
    
    //metodo para eliminar jugador
    public void eliminarJugador(Jugador eliminar){
        listaJugadores.remove(eliminar);
    }
    
    //mostrar jugadores
    
    public ArrayList<Jugador> mostrarJugadores(){
        return listaJugadores;
    }
    
    public void guardar() throws FileNotFoundException, IOException{
        //Generamos una salida al guardar un archivo, por lo que generamos 
        //un flujo que se encrague del aspecto serializable
        FileOutputStream archivo = new FileOutputStream("archivo.dat");
        ObjectOutputStream salida = new ObjectOutputStream(archivo);
        salida.writeObject(listaJugadores);
        //cerrar el flujo
        salida.close();
        
    }
    
}
