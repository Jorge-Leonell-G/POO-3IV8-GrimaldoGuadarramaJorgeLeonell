/*
va a ser la clase principal en donde podremos hacer las invocaciones de los diferentes
objetos de clase y sus metodos de un reino animal
*/

public class Principal{

    //el metodo principal de todo programa
    public static void main(String[] args){
        //uso correcto de git aaaaa por fin lo comprendi, bueno, por ahora :/...

        Perro dog = new Perro("Teddy", "Callejero", "Croquetas", 2, "Fuerte");
        Gato cat = new Gato("Miau", "Hogareño", "Atún", 1, 7);
        //Perico
        Perico parrot = new Perico("Pericles", "Loro gris", "Galletas", 1, "Saludos humanos");
        //Hamster
        Hamster ham = new Hamster("Hamilton", "Hamster chino", "Apio", 4, "Morado");
        //No recuerdo lol...

        //los metodos
        dog.mostrarPerro();
        System.out.println("-------");
        cat.mostrarGato();
        System.out.println("-------");
        parrot.mostrarPerico();
        System.out.println("-------");
        ham.mostrarHamster();
        System.out.println("_______");
        
    }
}