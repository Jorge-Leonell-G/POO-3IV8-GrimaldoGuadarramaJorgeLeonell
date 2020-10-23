import java.util.Scanner;

class FigurasClasico{

    /*
    vamos a crear un programa que se encargue de realizar
    un menu en el cual se pueda elegir entre calcular
    el area o el perimetro de las siguientes figuras
    triangulo
    cuadrado
    circulo
    actualizacion, ahora quiero que se repita todo el programa
    para volver a calcular otra area,
    como trabajo
    ustedes deben agregar las opciones del perimetro
    y dos figuras mas
    rectangulo pentagono
    */

    public static void main(String[] args){

        //instancIa de nuestro objeto
        Scanner entrada = new Scanner(System.in);

        //variables
        int base, altura, opcion, lado2, lado3, diametro;
        char letra;
        //char es el tipo de dato y letra es el nombre de la variable
        double resultado;
    do{
        //el cuerpo del programa
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- Calcular el área de un cuadrado ");
        System.out.println("2.- Calcular el perímetro de un cuadrado ");
        System.out.println("3.- Calcular el área de un triángulo ");
        System.out.print("4.- Calcular el perímetro de un círculo");
        System.out.println("5.- Calcular el área de un circulo ");
        System.out.println("6.- Calcular el perímetro de un círculo ");
        System.out.println("7.- Salir ");

        //asignar la opción

        opcion = entrada.nextInt();

        //según, porque vamos a dar opciones a elegir

        switch (opcion) {
            case 1:
                //aqui es donde realizamos las operaciones
                System.out.println("Ingrese el valor del lado");
                base = entrada.nextInt();

                resultado = base*base;

                System.out.println("El área del cuadrado es de: "+resultado);
                break;

            case 1.1:
                System.out.println("Ingrese el valor del lado");
                base = entrada.nextInt();

                resultado = base * 4;

                System.out.println("El perímetro del cuadrado es de: "+resultado);
                break;

            case 2:
                System.out.println("Ingrese el valor de la base");
                base = entrada.nextInt();

                System.out.println("Ingrese el valor de la altura");
                altura = entrada.nextInt();

                resultado = (base*altura)/2;

                System.out.println("El área del triangulo es de: "+resultado);
                break;

            case 2.2:
                System.out.println("Ingrese el valor del primer lado");
                base = entrada.nextInt();

                System.out.println("Ingrese el valor del segundo lado");
                lado2 = entrada.nextlnt();

                System.out.println("Ingrese el valor del tercer y último lado");
                lado3 = entrada.nextInt();

                resultado = (base + lado2+ lado3);

                System.out.pritnln("El perímetro del triángulo es de: "+resultado);
                break;

            case 3:
                System.out.println("Ingrese el valor de la radio");
                base = entrada.nextInt();

                resultado = 3.1416*base*base;

                System.out.println("El área del circulo es de: "+resultado);
                break;

            case 3.3:
                System.out.println("Ingrese el valor del diámetro");
                diametro = entrada.nextInt();

                resultado = 3.1416*diametro;

                System.out.println("El perímetro del círculo es de: "+resultado);
                break;

            default:
                System.out.println("Gracias por participar :D ");
        

            
                
                
        }

        System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");
        //recibir una respuesta de si o no
        //booleano o un char s
        letra = entrada.next().charAt(0);

        //si utilizamos char se usa '' 
        //si usamos string   se usa ""
        //char num = 1       1 + 1 = 11

    }while(letra == 's');
        
        //System.out.println(letra);
        
    }
}


