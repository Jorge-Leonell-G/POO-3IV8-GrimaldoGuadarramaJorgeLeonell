//vamos a crear una clase animal general para
//mascotas domesticas

public class Animal{

    //vamos a utilizar el principio de encapsulamiento 
    //para poder proteger el acceso a las variables
    private String nombre, raza, tipo_alimento;
    private int edad;

    //ahora vamos a crear el constructor 
    public Animal(){
        /*
        Y los constructores se crean automaticamente en java, si es que no son
        invocados, y sirven para la inicializacion de variables y poder crear objetos
        de la clase
        
        */
    }

    //acceder a los datos     estos son parametros
    public Animal(String nombre, String raza, String tipo_alimento, int edad){

        //para poder acceder a las variables porque son privadas es necesario 
        //utilizar la palabra reservada this

        this.nombre = nombre;
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;

    }

    //para poder enviar y obtener las variables necesitamos los metodos get y set

    //recibe
    public String getNombre(){
        return nombre;
    }
    //envia u establece (prefiero establece XDD)
    public void setNombre(){
        this.nombre = nombre;
    }

    public String getRaza(){
        return raza;
    }
    //envia u establece (prefiero establece XDD)
    public void setRaza(){
        this.raza = raza;
    }

    public String getTipoAlimento(){
        return tipo_alimento;
    }
    //envia u establece (prefiero establece XDD)
    public void setTipoAlimento(){
        this.tipo_alimento = tipo_alimento;
    }

    public int getEdad(){
        return edad;
    }
    //envia u establece (prefiero establece XDD)
    public void setEdad(){
        this.edad = edad;
    }


}