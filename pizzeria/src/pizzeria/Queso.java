/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizzeria;

/**
 *
 * @author rash2
 */
public class Queso extends Pizza{

    public Queso() {
    }

    public Queso(String masa, String salsa, String[] ingredientes) {
        super();
        //vamos a suponer que hay diferentes tipos de queso
        //parmesano
        //cheddar o mozzarela
        this.masa = "Corteza regular";
        this.salsa = "Tomate";
        
        this.ingredientes = new String[2];
        this.ingredientes[0] = "Queso Parmesano";
        this.ingredientes[1] = "Queso Mozzarela";
    }
    
    
    
    
    
    
}
