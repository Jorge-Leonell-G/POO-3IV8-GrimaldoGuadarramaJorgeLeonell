/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cuenta;
import java.util.*;

/**
 *
 * @author rash2
 */
public class Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        int opc;
        
        do{
        
        System.out.println("Bienvenido al banquito :3\n");
        System.out.println("¿Que operacion deseas realizar:\n");
        System.out.println("1.- Cuenta de debito");
        System.out.println("2.- Cuenta de credito");
        System.out.println("3.- Cuenta de cheques");
        System.out.println("4.- Salir");
        
        opc = entrada.nextInt();
        
        switch(opc){
            case 1:
                //abrir una cuenta debito
                break;
            case 2:
                //abrir cuenta credito
                break;
            case 3:
                //abrir cuenta de cheques
                break;
            default:
                
                
            
        }
    
        
        }while(opc!=4);
    
    }
}
