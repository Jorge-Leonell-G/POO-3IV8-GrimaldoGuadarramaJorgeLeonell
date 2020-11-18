//en esta clase vamos a comprobar que pasa cuando se ponen letras en lugar de numeros

import java.util.*;

public class Operaciones{

    //objeto Scanner
    Scanner input = new Scanner(System.in);

    //variable
    int y = 0;

    //metodo para verificar un numero

    public void Ejemplo(){

        //para el manejo de excepciones hay que utilizar
        try{

            System.out.println("Ingresa un valor numerico: ");
            y = input.nextInt();
            System.out.println("El numero es: "+y);
            //para salir
            System.exit(0);
            //cacha el error mediante el objeto e
        }catch(Exception e){
            //mensaje de error
            System.out.println("Ingrese unicamente valores enteros");
            //para saber el tipo de error
            System.out.println("Error: "+e.getMessage());
        }

    }


}