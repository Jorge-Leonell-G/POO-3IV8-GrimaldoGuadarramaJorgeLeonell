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
        //Perico ...
        //Hamster...
        //No recuerdo lol...

        //los metodos
        dog.mostrarPerro();
        System.out.println("_______");
        cat.mostrarGato();
        System.out.println("_______");
        
    }
}