import java.util.Scanner;
import java.util.JOptionPane;

public class Biblioteca{
    //objeto
    Scanner entrada = new Scanner(System.in);
//variables
String tittle, autor;
int nrod, opcion, ejemplares, total, subtotal;
int libros=10;
    //metodo
public void Libros(){

text = JOptionPane.showInputDialog("Elija la funcion a ejecutar: \n1.- Prestamo de un libro\n2.- Devolucion de un libro");
opcion = Integer.parseInt(text);
//switch para las opciones
switch(opcion){

    case 1:
        Prestamo();
        break;

    case 2:
        Devolucion();
        breaak;
    default:
        JOptionPane.showMessageDialog(null,"Gracias por ingresar al programa!");
        break;

    }
 
 }

 //vamos con los metodos
 public void Prestamo(){
     text = JOptionPane.showInputDialog("Ingrese el titulo de la obra: ");
     tittle = text;






 }



}