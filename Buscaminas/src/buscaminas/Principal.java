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

/*
Clase principal en donde controlaremos mas facil los procesos de nuestra ventana
link de github: https://github.com/Jorge-Leonell-G/POO-3IV8-GrimaldoGuadarramaJorgeLeonell/tree/main/Buscaminas
*/
public class Principal {
    public static void main(String[] args) {
        //Creamos un objeto a partir de la clase Buscaminas para una gestion 
        //mas sencilla de sus acciones principales
        BuscaminasMenu window = new BuscaminasMenu();
        //Establecemos la visibilidad de nuestra ventana
        window.setVisible(true);
        
        //BuscaminasJuego windowJuego = new BuscaminasJuego();
        //Establecemos la visibilidad de nuestra ventana
        //windowJuego.setVisible(true);
    }
    
}
