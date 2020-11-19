
/*
Autor: Grimaldo Guadarrama Jorge Leonell
Grupo: 3IV8
*/

//librerias
import javax.swing.JOptionPane;
//Clase publica que se empleará para llamar a los metodos 
public class MainMenu{
    //objetos que llaman a las clases con variables privadas
    private CalculoEdad edad = new CalculoEdad();
    private AreaPer figuras = new AreaPer();
    private CostoCall llamadas = new CostoCall();

    //las siguientes variables al ser globales van antes del "public static void main"
    private int optionmenu;
    private String text;
    //funcion principal
    public static void main(String[] args){
        //creamos un objeto a partir de nuestra clase publica
        MainMenu panel = new MainMenu();

        panel.MenuChoice();
        JOptionPane.showMessageDialog(null,"GRACIAS POR PARTICIPIAR");
    }

    //Método para elegir las opciones del menú

    public void MenuChoice(){
        //Al tener void, eso significa que va a retornar valores.
        MainMenu panel = new MainMenu();

        do{

            panel.text = JOptionPane.showInputDialog("Autor: Grimaldo Guadarrama Jorge Leonell\nGrupo: 3IV8\nSeleccione una funcion de acuerdo a la lista del menu\n1.- Calculo de edad\n2.- Area y perimetro de figuras\n3.- Costo y credito de llamadas");
            panel.optionmenu = Integer.parseInt(panel.text);
             //colocamos un switch para las 3 opciones y un default
            switch(panel.optionmenu){
                case 1:
                    edad.calcularEdad();
                    break;
                case 2:
                    figuras.menuFig();
                    break;
                case 3:
                    llamadas.menuCall();
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Error: Ingrese un numero acorde a la lista mostrada en pantalla :DDDD");
                    break;

            }   


        }while(panel.optionmenu != 4);


    }

}
