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
public class Vegetariana extends Pizza{
   
    public Vegetariana(){
    }

    public Vegetariana(String masa, String salsa, String[] ingredientes) {
        super(masa, salsa, ingredientes);
        //parmesano rallao, champiñones, piña, tofu, soya, albaca
        
        this.ingredientes = new String[6];
        this.ingredientes[0] = "Parmesano rallao";
        this.ingredientes[1] = "Champinones";
        this.ingredientes[2] = "Pina";
        this.ingredientes[3] = "Tofu";
        this.ingredientes[4] = "Soya";
        this.ingredientes[5] = "Albaca"; 
    }
    
    public String[] getIngredientes(){
       return this.ingredientes; 
    }
    
    
    
}
