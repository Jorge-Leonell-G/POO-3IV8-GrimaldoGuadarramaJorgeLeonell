/*Elabore un programa que lea por el teclado 10 números enteros y los guarde en un Array, 
posteriormente que calcule y muestre el promedio de los valores positivos y  de los negativos.

Elabore un programa que lea 10 números enteros por teclado y los guarde en un array. 
Calcula y muestre el promedio de los números que estén en las posiciones pares del array.
Considera la primera posición del array (posición 0) como par.

Realice un programa que permita leer 10 calificaciones de una asignatura y los guarde en un array 
para que muestre:
Imprimir todas las calificaciones.
Promedio de las calificaciones.
La calificación más alta y la más baja.
El número de calificaciones superiores al promedio.
La cantidad de alumnos aprobados y reprobados.

Leer una matriz A de 3X3 y una matriz B de 3X3 y sumarla en la matriz S.
Condiciones, debe de estar separado en métodos un solo programa implementar si desea repetir, 
y debe de estar en su github.
Deberán de entrar el enlace de su git y capturas de pantalla en un pdf o word de la ejecución del programa*/

import java.util.Scanner;

public class ejerciciosArreglos{
    /*Se van a colocar variables globales, ya que todos los programas tienen
    en común el ingreso de numeros enteros por teclado y los promedios*/
    int numeros[] = new int[10];
    double promedio = 0;
    
    public static void main(String[] args){
        //objetos
        Scanner entrada = new Scanner(System.in);
        ejerciciosArreglos deploy = new ejerciciosArreglos();

        char repeat;

        do{
            deploy.menu();

            System.out.println("Desea repetir el programa? Presione r si ese es el caso: ");
            repeat = entrada.next().charAt(0);
        }while(repeat=='r'); 

    }
    //ahora procederemos a crear los metodos y mas abajo, sus parametros
    public void menu(){
        Scanner entrada = new Scanner(System.in);
        int option;
        //Se colocan las opciones a elegir
        System.out.println("Elija la opcion que desee ejecutar: ");
        System.out.println("1. Promedio de positivos y negativos");
        System.out.println("2. Promedio segun posicion par");
        System.out.println("3. Calificaciones");
        System.out.println("4. Suma de matrices bidimensionales");
        
        option = entrada.nextInt();

        switch (option){
            case 1:
                promedioPosNeg();
                break;
            case 2:
                promedioParImp();
                break;
            case 3:
                calificaciones();
                break;
            case 4:
                sumadematriz();
                break;
            default:
                System.out.println("Error: Por favor ingrese un numero valido acorde a su eleccion :D");

        }

    }

    //Aqui procedemos a realizar las operaciones para las clases que se mostraron en el switch
    public void promedioPosNeg(){
    /*debe de llevar el nombre que colocamos en el case 1, puesto que ese es el nombre de la clase
    al igual que con los demas casos*/
        Scanner entrada = new Scanner(System.in);

        int nropositivos = 0, nronegativos = 0;
        double promedioplus = 0, promedionega = 0;

        for(int i=0; i < numeros.length; i++){
            System.out.println("Ingrese el valor: "+(i+1)+":");
            numeros[i] = entrada.nextInt();
            //asi es como se guardan datos ingresados por teclado en un array
            
            //iniciamos un if 
            if(numeros[i]<0){
                promedionega = promedionega + numeros[i];
                nronegativos++;
                //Se hace un incremento en los valores negativos en función a que el array sea menor a cero
            }else{
                promedioplus = promedioplus + numeros[i];
                nropositivos++;
            }
        } 
    
        promedioplus = promedioplus/nropositivos;
        promedionega = promedionega/nronegativos;
        //No hay que olvidarse de imprimir con formato parseando a String
        System.out.println(String.format("El promedio correspondiente a los valores positivos es de: %.1f",promedioplus));
        System.out.println(String.format("El promedio correspondiente a los valores negativos es de: %.1f",promedionega));
    }

    public void promedioParImp(){
        Scanner entrada = new Scanner(System.in);

        for(int i=0; i < numeros.length; i++){
            System.out.println("Ingrese el valor de "+i+":");
            numeros[i] = entrada.nextInt();
            /*El signo de porcentaje representa el mod (modulo), es decir, el residuo de la division para verificar
            si se trata de un par o impar*/
            if(i % 2 == 0){
                promedio = promedio + numeros[i];
            }
        }

        promedio = promedio/5;

        System.out.println(String.format("El promedio de los valores segun su posicion par es de: %.1f",promedio));

    }

    public void calificaciones(){
        Scanner entrada = new Scanner(System.in);

        int aprove = 0, renegate = 0, high = 0, down = 10, superior = 0;
        promedio = 0;

        for(int i=0; i < numeros.length; i++){
            System.out.println("Ingrese el valor de "+(i+1)+":");
            numeros[i] = entrada.nextInt();
            promedio = promedio + numeros[i];

            if(numeros[i] > high){
                high = numeros[i];
            }
            if(numeros[i] < down){
                down = numeros[i];
            }
            if(numeros[i] >= 6){
                aprove++;
            }
        }

        renegate = 10 - aprove;
        promedio = promedio/10;

        for(int i = 0; i < 10; i++){
            System.out.println(String.format("La calificacion numero %d es: %d",i+1,numeros[i]));
            if(numeros[i] > promedio){
                superior++;
            }
        }
        //se hace el listado dentro del cual se imprimiran con fromato las condiciones del ejercicio 3
        System.out.println(String.format("El promedio del grupo es: %.1f",promedio));
        System.out.println(String.format("La calificacion mas alta es: %d",high));
        System.out.println(String.format("La calificacion mas baja es: %d",down));
        System.out.println(String.format("La cantidad de calificaciones que son superiores al promedio fijo son de: %d",superior));
        System.out.println(String.format("Los alumnos que aprobaron fueron: %d",aprove));
        System.out.println(String.format("Los alumnos que reprobaron fueron: %d",renegate));

    }

    public void sumadematriz(){
        Scanner entrada = new Scanner(System.in);

        /*como en este ejercicio se manejaran matrizes de mas de una dimension, 
        se colocaran dos llaves indicando las dimensiones de las variables de los arreglos*/ 
        int matrizA[][] = new int[3][3];
        int matrizB[][] = new int[3][3];
        int matrizS[][] = new int[3][3];

        for(int i=0; i < 3; i++){
            for(int j=0; j < 3; j++){
                System.out.println("Ingrese el valor numerico "+(i+j+1)+" de la matriz A: ");
                matrizA[i][j] = entrada.nextInt();

            }

        }

        for(int i=0; i < 3; i++){
            for(int j=0; j < 3; j++){
                System.out.println("Ingrese el valor numerico "+(i+j+1)+" de la matriz B: ");
                matrizB[i][j] = entrada.nextInt();    
            }
        }

        System.out.println("El resultado de la suma de matrices A y B en la matriz S es: ");
        for(int i=0; i < 3; i++){
            for(int j=0; j < 3; j++){
                System.out.println(" "+matrizS[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
