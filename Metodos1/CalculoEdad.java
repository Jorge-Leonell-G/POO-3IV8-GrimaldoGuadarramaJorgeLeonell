/*
Autor: Grimaldo Guadarrama Jorge Leonell
Grupo: 3iv8
*/

//libreria
import javax.swing.JOptionPane;
//clase publica y su declaracion, teniendo el mismo nombre que el archivo
public class CalculoEdad{
    //variables privadas globales colocadas antes del metodo
    private int repeat;
    private String text;
    private int birthYear, actualYear, edad;
    //Metodo con retorno de valores que aparecera en el switch principal
    public void calcularEdad(){

        do{
            inputDatos();
            operacionDatos();
            mostrarEdad();
            text = JOptionPane.showInputDialog("Desea calcular otra edad,\nPresione 1 si ese es el caso\nSi no lo desea, presione 0");
            repeat = Integer.parseInt(text);
        }while(repeat == 1);

    }

    //Procedemos a llenar los parametros del primer metodo del ciclo do
    public void inputDatos(){

        text = JOptionPane.showInputDialog("Ingrese su ano de nacimiento: ");
        birthYear = Integer.parseInt(text);
        text = JOptionPane.showInputDialog("Ingrese el ano actual: ");
        actualYear = Integer.parseInt(text);

    }

    //Operaciones del segundo metodo para el calculo de la edad
    public void operacionDatos(){

        edad = actualYear - birthYear;
    }

    //Metodo para la salida en pantalla de la edad
    public void mostrarEdad(){

        JOptionPane.showMessageDialog(null,"Su edad es de "+edad+" anos");
    }
}

