/*
Grimaldo Guadarrama Jorge Leonell
*/

//clase publica principal

//public class Gato extends javax.swing.JFrame{

//}

//librerias
import java.util.Scanner;
import java.util.stream.Collectors;

//clase principal
public class Gato{
    //metodo principal
    public static void main(String[] args){
        //variables
        char match = 's';

        //instancia para la invocacion del objeto
        funcionGato g = new funcionGato();

        //ciclo while para los metodos
        while(match == 's'){
            //metodo que contiene el funcionamiento del mismo
            g.Juego();
            //lo inicializamos con true para iniciar siempre una nueva partida con el jugador 1
            g.player1 = true;
            //reinicio del juego
            g.turno=0;

            //instancia para el metodo Scanner
            Scanner entrada = new Scanner(System.in);

            //uso del bloque try y catch
            /*try{

                System.out.println("Desea jugar otra partida... (s/n)");
                match = entrada.next().charAt(0);
                system.exit(0);

            //"cachamos" el error con el objeto e    
            }catch(Exception e){

                System.out.println("Ingrese un valor valido: ");
                //match = entrada.next().charAt(0);
                System.out.println("Error: "+ e.getMessage());
                
            }*/

                System.out.println("Desea jugar otra partida... (s/n)");
                match = entrada.next().charAt(0);
            

        }
        //MENSAJE DE DESPEDIDA U.U
        System.out.println("Gracias por jugar! :D ");

    }

}