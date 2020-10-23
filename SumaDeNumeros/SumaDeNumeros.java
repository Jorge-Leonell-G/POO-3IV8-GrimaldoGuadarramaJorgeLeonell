//libreria
import java.util.Scanner;

class sumadenumeros{

    public static void main(String[] args){
        /*
        Vamos a crear un programa que se encargue de sumar
        2 numeros positivos*/
        
        //Que sume n numeros positivos 
        

        //Instancia del objeto
        Scanner entrada = new Scanner(System.in);

        //Variables
        int num1, num2;
        int resultado=0;
        do{

        System.out.println("Ingrese su primer numero: ");
        
        num1 = entrada.nextInt();
        
        while(num1<0){

            System.out.println("Introduzca un valor positivo :D ");
            num1 = entrada.nextInt();
        }
        
        
        System.out.println("Ingrese su segundo numero: ");
        num2 = entrada.nextInt();
        while(num2<0){
            System.out.println("Introduzca un valor positivo :D");
            num2 = entrada.nextInt();
        }
        
        resultado = resultado + num1;

        }while(num1 != 0);
        
        System.out.println("La suma es de: " + resultado);
    }
}






