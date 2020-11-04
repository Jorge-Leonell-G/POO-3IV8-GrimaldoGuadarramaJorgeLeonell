 import java.util.Scanner;

 class pokedex{

    public static void main(String []args){

    Scanner entrada = new Scanner(System.in);
    //variables
    int energiavital, defensavida, fuerza, numero;
    defensavida = 150;
    fuerza = 10;

System.out.println("Grupo: 3IV8");
System.out.println("Nombre: Grimaldo Guadarrama Jorge Leonell");

//menu
System.out.println("Bienvenido a la versión alfa de la pokedex");
System.out.println("Elija su pokemon de la siguiente lista");
System.out.println("1.- Charmander");
System.out.println("2.- Bulbasaur");
System.out.println("3.- Squartle");
System.out.println("4.- Opción batalla pokemon");
System.out.println("5.- Gracias por probar el programa :D");

opcion = entrada.nextInt();

switch (opcion) {
    case 1:
    System.out.println("Los datos de Charmander son: ");
    System.out.println("Vida: "+defensavida);
    System.out.println("Fuerza: "+fuerza);
    break;
    case 2:
    System.out.println("Los datos de Bulbasaur son: ");
    System.out.println("Vida: "+defensavida);
    System.out.println("Fuerza: "+fuerza);
    break;
    case 3:
    System.out.println("Los datos de Squartle son: ");
    System.out.println("Vida: "+defensavida);
    System.out.println("Fuerza: "+fuerza);
    break;
    case 4:
    System.out.println("Usted ha elegido el modo de batalla ");
    System.out.println("Ingrese el numero correspondiente a su pokemon con el que va a luchar ");
    numero = entrada.nextInt();
    if (numero = 1){
    System.out.println("Usted ha elelgido a Charmander");
    System.out.print("Su fuerza es de: "+fuerza);
     } 
    }   
  }
}

