/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package buscaminas;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author rash2
 */


public class BuscaminasJuego extends JFrame{

    /*
    Esta clase es nuestra plantilla para abrir otra ventana donde
    se muestre nuestro tablero, una vez se haya dado al botón de comenzar en la ventana
    inicial
    */
    
    
    public BuscaminasJuego(){
        this.setTitle("Consejo: Buena Suerte");
        this.setVisible(true);
        this.setSize(450,450);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
    }
    
   //BuscaminasJuego tablero = new BuscaminasJuego();
   
  
    //JFrame windowTablero = new JFrame();
    //windowJuego.setVisible(true);
    
}
