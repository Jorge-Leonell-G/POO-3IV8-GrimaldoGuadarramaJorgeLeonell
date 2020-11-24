
//librerias

import javax.swing.JOptionPane;
import java.lang.Math;
import java.util.Scanner;

//Clase publica
public class Proovedores{

    //variables
    private String nombre_cliente;
    private String producto[] = new String[10];
    private int costo[] = new int[10];
    private int producto_existente[] = new int[10];

    //metodo menu
    public void menuPro(){
        do{
        text = JOptionPane.showInputDialog("Seleccione la funcion de la siguiente lista: \n1.- Suma total de costos\n2.- Costo Mayor\n3.- Costo Menor\n4.- Costo Promedio\n5.- Costo Total del Producto");
        option = Integer.parseInt(text);

        //switch para la decision del ususario
        switch(option){
            case 1:
                SumaTotal();
                break;
            case 2:
                CostoMayor();
                break;
            case 3:
                CostoMenor();
                break;
            case 4:
                CostoPromedio();
                break;
            case 5:
                CostoTotal();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error:Ingrese un numero valido");
                text = JOptionPane.showInputDialog("Seleccione la funcion de la siguiente lista: \n1.- Suma total de costos\n2.- Costo Mayor\n3.- Costo Menor\n4.- Costo Promedio\n5.- Costo Total del Producto");
                option = Integer.parseInt(text);
                break;

            }

        }while(option != 6);

    }

    //metodo para la suma total
    public void SumaTotal(){
        
        Scanner entrada = new Scanner(System.in);

        //ciclo for para el llenado del arreglo
        for(int i = 0, i < costo.length, i++){
            text = JOptionPane.showInputDialog("Ingrese los costos: "+(i+1)+":");
            costo[i] = Integer.parseInt();
            JOptionPane.showMessageDialog(null,"La suma total es de: %.1f "+costo[i]+":");

        }
    }

    
   

    
    













}
