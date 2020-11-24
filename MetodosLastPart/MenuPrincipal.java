
//librerias
import java.util.Scanner;
import javax.swing.JOptionPane;

//Clase publica que invocará a los metodos
public class MenuPrincipal{

//funcion principal para el alojamiento de args
public static void main(String[] args){

    //variables 
    int choice;
    String text_menu;
    String text, option;


    //objetos que invocan a los atributos privados
    private sueldoEmpleado sueldo = new sueldoEmpleado();
    //private Proovedores costo = new Proovedores();
    private Biblioteca library = new Biblioteca();

    MenuPrincipal mainm = new MenuPrincipal();

    //ciclo do para regresar al menu
    do{
        mainmenu.MenuP();
        text = JOptionPane.showInputDialog("En caso de que desea regresar al menu principal, presione 1\nSi no es asi, presione 0");
        option = Integer.parseInt(text);

    }while(option == 1);

  }

  //menu para la lista de ocpiones
  public void MenuP(){

    //bloque try{
        try{
            text = JOptionPane.showInputDialog("Seleccione el programa a aejecutar de la sig. lista: \n1.-Consultar el sueldo de un empleado\n2.- Costos y proovedores\n3.- Prestamo y devolucion de libros");
            option = Integer.parseInt(text);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Para acceder a un programa, solo ingresa enteros del 1 al 3");
            JOptionPane.showMessageDialog(null," "+e.getMessage());
        }

        //switch para los 3 programas
        switch(option){
            case 1:
                MenuEmpleados();
                break;
            case 2:
                //menuPro();
                //esta incompleto
                break;
            case 3:
                Libros();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Vuelva pronto");
                break;

        }
    

  }

}