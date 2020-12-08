//librerias
import java.util.Scanner;

//clase publica
public class palindromo{
    //metodo principal
    public static void main(String[] args){

        //variables
        String validacion = "";
        String palabra = "";
        char option;

        //metodo Scanner
        Scanner input = new Scanner(System.in);

        do{ 
        System.out.println("Bienvenido al programa para verificar si su palabra es o no es palindromo");
        System.out.println("Ingrese su palabra a verificar aqui: ");
        palabra = input.nextLine();

        //ciclo for para el proceso de verificacion
        for (int i = 0; i < palabra.length(); i++){
            validacion = palabra.charAt(i) + validacion;
        }

        //caso if para las demostraciones utilizando metodo equals
        if(palabra.equals(validacion)){
            System.out.println("La palabra en efecto es un palindromo \nlel");
        }else{
            System.out.println("La palabra no es un palindromo u.u");
        }

        System.out.println("Desea repetir el programa en busca de un palindromo?...  s/n");
        option = input.nextLine().charAt(0);

         }while(option == 's');

    }

}