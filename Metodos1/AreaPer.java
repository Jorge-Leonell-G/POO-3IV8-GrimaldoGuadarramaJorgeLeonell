/*
Autor: Grimaldo Guadarrama Jorge Leonell
Grupo: 3IV8
*/

//librerias
//Requerimos de una libreria con caracteristicas algebraicas especiales, tales como el valor de PI
import javax.swing.JOptionPane;
import java.lang.Math.*;

//Clase publica que contiene los atributos y metodos
public class AreaPer{

    //variables globales, ya que se utilizarana para las 4 figuras del programa
    private double area, perimetro, base, altura, lado1, lado2;
    private int menuOption;
    private String text;
    //colocamos nuestro metodo del switch principal
    public void menuFig(){

        //abrimos ciclo do y while para la seleccion de funciones con las figuras
        do{
           text = JOptionPane.showInputDialog("Seleccione una figura de la siguiente lista: \n1.- Circulo \n2.- Rectangulo \n3.- Cuadrado \n4.- Triangulo");
           menuOption = Integer.parseInt(text);
           //abrimos un switch para la decision del usuario
            
            switch(menuOption){
                case 1:
                    circulo();
                    break;
                case 2:
                    rectangulo();
                    break;
                case 3:
                    cuadrado();
                    break;
                case 4:
                    triangulo();
                    break;
                //Y no nos olvidemos de nuestro default :DDDD
                default:
                    JOptionPane.showMessageDialog(null,"Ingrese un nuemro aocrde a la lista mostrada en pantalla :DDD");
                    break;          

            }

        }while(menuOption != 5);

    }

    //Primero vamos con el metodo de calculo para el circulo 
    public void circulo(){

        text = JOptionPane.showInputDialog("Ingrese el valor del radio de la circunferencia: ");
        //utilizamos la variable base para almacenar el valor del radio, no es necesario
        //no es necesario crear una variable especifica para cada dato
        base = Double.parseDouble(text);
        while(base <= 0){
            JOptionPane.showMessageDialog(null,"Error: Ingrese un valor valido");
            text = JOptionPane.showInputDialog("Ingrese el valor del radio de la circunferencia: ");
            base = Double.parseDouble(text);
        }

        //hacemos uso de la libreria para operar con PI
        area = (Math.PI * base * base);
        perimetro = (Math.PI * base * 2);
        JOptionPane.showMessageDialog(null,String.format("El valor del area del circulo es de %.1f unidades cuadradas \nEl valor del perimetro es de %.1f unidades",area,perimetro));

    }

    public void rectangulo(){

        text = JOptionPane.showInputDialog("Ingrese el valor de una base del rectangulo: ");
        base = Double.parseDouble(text);
        //uso de whiles para favorecimiento de condiciones
        while(base <= 0 ){
           JOptionPane.showMessageDialog(null,"Error: Ingrese un valor valido");
           text = JOptionPane.showInputDialog("Ingrese el valor de una base del rectangulo: ");
           base = Double.parseDouble(text); 
        }

        text = JOptionPane.showInputDialog("Ingrese el valor de una altura del rectangulo: ");
        base = Double.parseDouble(text);
        while(altura <= 0){
            JOptionPane.showMessageDialog(null,"Error: Ingrese un valor valido");
            text = JOptionPane.showInputDialog("Ingrese el valor de una altura del rectangulo: ");
            base = Double.parseDouble(text);         
        }

        area = base * altura;
        perimetro = (base*2) + (altura*2);

        JOptionPane.showMessageDialog(null,String.format("El valor del area del rectangulo es de %.1f unidades cuadradas \nY el perimetro es de %.1f",area,perimetro));

    }

    public void cuadrado(){

        text = JOptionPane.showInputDialog(null,"Ingrese el valor de uno de los lados del cuadrado: ");
        base = Double.parseDouble(text);
        while(base <= 0){
            JOptionPane.showMessageDialog(null,"Error: Ingrese un valor valido");
            text = JOptionPane.showInputDialog(null,"Ingrese el valor de uno de los lados del cuadrado: ");
            base = Double.parseDouble(text);
        }

        area = base * base;
        perimetro = base * 4;

        JOptionPane.showMessageDialog(null,String.format("El valor del area del cuadrado es de %.1f unidades cuadraticas \nMientras que el valor del perimetro es de unas %.1f unidades",area,perimetro));

    }

    public void triangulo(){

        text = JOptionPane.showInputDialog("Ingrese el valor de la base del triangulo: ");
        base = Double.parseDouble(text);
        while(base <= 0){
            JOptionPane.showMessageDialog(null,"Error: Ingrese un valor valido");
            text = JOptionPane.showInputDialog("Ingrese el valor de la base del triangulo: ");
            base = Double.parseDouble(text);

        }

        text = JOptionPane.showInputDialog("Ingrese el valor del primer lado del triangulo: ");
        lado1 = Double.parseDouble(text);
        while(lado1 <= 0){
            JOptionPane.showMessageDialog(null,"Error: Ingrese un valor valido");
            text = JOptionPane.showInputDialog("Ingrese el valor del primer lado del triangulo: ");
            lado1 = Double.parseDouble(text);

        }

        text = JOptionPane.showInputDialog("Ingrese el valor del segundo lado del triangulo: ");
        lado2 = Double.parseDouble(text);
        while(lado2 <= 0){
            JOptionPane.showMessageDialog(null,"Error: Ingrese un valor valido");
            text = JOptionPane.showInputDialog("Ingrese el valor del segundo lado del triangulo: ");
            lado2 = Double.parseDouble(text);

        }

        text = JOptionPane.showInputDialog("Ingrese el valor de la altura del triangulo: ");
        altura = Double.parseDouble(text);
        while(altura <= 0){
            JOptionPane.showMessageDialog(null,"Error: Ingrese un valor valido");
            text = JOptionPane.showInputDialog("Ingrese el valor de la latura del triangulo: ");
            altura = Double.parseDouble(text);

        }

        area = (base * altura)/2;
        perimetro = base + lado1 + lado2;

        JOptionPane.showMessageDialog(null,String.format("El valor del area del triangulo es de %.1f unidades cuadraticas \nMientras que el valor del perimetro es de unas %.1f unidades",area,perimetro));

    }

}