public class Hamster extends Animal{

    private String bola_habitat;

    //constructor
    public Hamster(){

    }

    //metodo para acceder a la clase animal y a la palabra favorita del loro
    public Hamster(String nombre, String raza, String tipo_alimento, int edad, String bola_habitat){

        //acceso a los atributos de la clase padre
        super(nombre, raza, tipo_alimento, edad);
        //acceso al atributo propio de la clase
        this.bola_habitat = bola_habitat;
    }

    //metodos get y set

     //recibe u obtiene
    public int getBolaHabitat(){
        return bola_habitat;
    }
    //envia o establece
    public void setPalabraFavorita(String bola_habitat){
        this.bola_habitat = bola_habitat;
    }

    public void mostrarHamster(){
        System.out.println("El nombre del hamster es: " + getNombre()
                            + " su raza es: " + getRaza()
                            + " come: " + getTipoAlimento()
                            + " su edad en meses es de: " + getEdad()
                            + " su bola en la que habita es de color: " + getBolaHabitat());
    }

}