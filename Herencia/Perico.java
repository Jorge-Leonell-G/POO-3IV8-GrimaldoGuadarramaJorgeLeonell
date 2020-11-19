public class Perico extends Animal{

    private String palabra_favorita;

    //constructor
    public Perico(){

    }

    //metodo para acceder a la clase animal y a la palabra favorita del loro
    public Perico(String nombre, String raza, String tipo_alimento, int edad, String palabra_favorita){

        //acceso a los atributos de la clase padre
        super(nombre, raza, tipo_alimento, edad);
        //acceso al atributo propio de la clase
        this.palabra_favorita = palabra_favorita;
    }

    //metodos get y set

     //recibe u obtiene
    public int getPalabraFavorita(){
        return palabra_favorita;
    }
    //envia o establece
    public void setPalabraFavorita(String palabra_favorita){
        this.palabra_favorita = palabra_favorita;
    }

    public void mostrarPerico(){
        System.out.println("El nombre del perico es: " + getNombre()
                            + " su raza es: " + getRaza()
                            + " come: " + getTipoAlimento()
                            + " su edad es de: " + getEdad()
                            + " su palabra favorita es: " + getPalabraFavorita());
    }

}