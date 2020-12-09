/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crud;

import crud.ControladorPersona;

/**
 *
 * @author rash2
 */

import java.util.Scanner;
import java.util.ArrayList;

public class manipularPrograma {
    
    public void principal(){
       Scanner entrada = new Scanner(System.in);
       
       ControladorPersona control = new ControladorPersona();
       
       
        System.out.println("Bienvenido a la administración del registro"
        + "de la UAC");
        System.out.println("Ingrese la opcion que desee: "
        +"\n1.- Mostrar Personas"
        +"\n2.- Registrar una nueva persona"
        +"\n3.- Editar registro de persona"
        +"\n4.- Borrar el registro de persona"
        +"\n5.- Salir");
        
        int opcion = Integer.parseInt(entrada.nextLine());
        
        switch (opcion) {
            case 1:
                ArrayList<Persona> listaPersona = control.mostrarPersonas();
                //Procedemos a recorrer el array
                for(Persona objeto : listaPersona){
                    //imprimir registros
                    System.out.println("El id es: "+objeto.getId()
                    +"\nEl nombre: "+objeto.getNombre()
                    +"\nLa edad: "+objeto.getEdad());
                    
                }
                principal();
                break;
                
            case 2:
                System.out.println("Por favor ingrese el ID de la persona: ");
                int IDpersona = Integer.parseInt(entrada.nextLine());
                System.out.println("Por favor ingrese el nombre de la persona: ");
                String nompersona = entrada.nextLine();
                System.out.println("Por favor ingrese la edad de la persona: ");
                int edadpersona = Integer.parseInt(entrada.nextLine());
                //crecaión de un objeto persona nueva a partir de nuestra clase
                //Persona con los parametros que debe de tener para ser una persona
                //totalmente
                Persona personaNueva = new Persona(IDpersona, nompersona, edadpersona);
                
                //En los parametros añadimos al objeto "personaNueva", pues es el resultado
                //de la actualizacion de datos
                control.agregarPersona(personaNueva);
                principal();
                break;
            
            case 3:
                System.out.println("Digite el ID de la persona a la que actualizarás sus datos");
                int ID = Integer.parseInt(entrada.nextLine());
                
                //En el parametro del metodo ingresamos el ID ya que es indispensable para 
                //la busqueda de la persona
                
                //objeto a partir de la clase  //metodo a partir de objeto
                Persona personaBuscar = control.buscarPersona(ID);
                
                //visualizamos la info de esa persona
                
                System.out.println("La informacion de esa persona es:\n"
                +"ID: " + personaBuscar.getId()+"\n"
                +"Nombre: " + personaBuscar.getNombre()+"\n"
                +"Edad: " + personaBuscar.getEdad());
                
                //ahora vamos a cambiar los datos
                System.out.println("Ingresa el nuevo nombre: ");
                String nuevonombre = entrada.nextLine();
                System.out.println("Ingresa la nueva edad: ");
                int nuevaedad = Integer.parseInt(entrada.nextLine());
                
                //con el metodo set establecemos esos nuevos parametros
                personaBuscar.setNombre(nuevonombre);
                personaBuscar.setEdad(nuevaedad);
                //Hay que saber que el ID no se modifica
                
                //Ahora se actualiza la lista
                control.actualizarPersona(personaBuscar);
                principal();
                break;
                
            case 4:
                System.out.println("Digite el ID de la persona que desea eliminar:  ");
                int ID_eliminar = Integer.parseInt(entrada.nextLine());
                
                //Creamos otro objeto a partir de la clase (plantilla) Persona
                Persona personaEliminar = control.buscarPersona(ID_eliminar);
                
                control.eliminarPersona(personaEliminar);
                
                System.out.println("El registro se ha borrado con exito");
                principal();
                break;
                
            case 5:
                
                System.out.println("unu");
                System.exit(0);
          
            default:
                System.out.println("Por favor ingrese una opcion acorde al menu");
        }
         
        
    }
    
}
