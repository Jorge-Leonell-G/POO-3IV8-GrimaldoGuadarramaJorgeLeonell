/*
Autor: Grimaldo Guadarrama Jorge Leonell
Grupo: 3IV8
*/


//librerias
import javax.swing.JOptionPane;

//clase publica que contiene los atributos y metodos
public class CostoCall{
    //variables globales
    //para el numero, se utiliza un dato de tipo long, ya que no vamos a hacer ninguna operacion matematica
    //solo lo utilizaremos para almacenar numeros grandes
    private int option, recarga, callOption, minutos;
    private float credito;
    private String text,aux;

    //metodo con ejecucion principal
    public void menuCall(){

        do{
            text = JOptionPane.showInputDialog("Ingrese la accion que desesa ejecutar: \n1.- Realizar llamada telefonica \n2.- Realizar recarga \n3.- Consulta de recarga");
            option = Integer.parseInt(text);
            //abrimos switch para las posibles decisioes del usuario
            switch(option){
                case 1:
                    makeCall();
                    break;
                case 2:
                    recargaCreditos();
                    break;
                case 3:
                    consultaCreditos();
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Error: Ingrese un numero acorde a la lista: ");

            }

        }while(option != 4);


    }

    //metodo para realizar llamadas
    public void makeCall(){

        JOptionPane.showMessageDialog(null,"Estos son los precios por cada media hora y tipo de llamada: \n$0.5 pesos la Llamada Local Nacional \n$0.6 pesos la Llamda Local Internacional \n Y finalmente $0.2 pesos la Llamada a celulares.");

        aux = JOptionPane.showInputDialog("¿Que tipo de llamada es?\n1.- Llamada Local Nacional\n2.- Llamada Local Internacional\n3.- Llamada a celular");
        callOption = Integer.parseInt(aux);

        while(callOption < 1 || callOption > 3){
            JOptionPane.showMessageDialog(null,"Error: Ingrese una opcion valida");
            
            aux = JOptionPane.showInputDialog("¿Que tipo de llamada es?\n.- Llamada Local Nacional\n2.- Llamada Local Internacional\n3.- Llamada a celular");
            callOption = Integer.parseInt(aux);
        }

        aux = JOptionPane.showInputDialog("¿De cuantos minutos fue la llamada?: ");
        minutos = Integer.parseInt(aux);
        while(minutos < 0){
            JOptionPane.showMessageDialog(null,"Error: Ingrese un tiempo valido");
            aux = JOptionPane.showInputDialog("¿De cuantos minutos fue la llamada?: ");
            minutos = Integer.parseInt(aux);

        }
        //otro switch para el tipo de llamada
        switch(callOption){
            case 1:
                credito -= minutos / 60;
                break;
            case 2:
                credito-= minutos / 50;
                break;
            case 3:
                credito -= minutos / 150;
                break;
            default:

        }



    }

    public void recargaCreditos(){

        aux = JOptionPane.showInputDialog("Ingrese el monto de su recarga $...");
        recarga = Integer.parseInt(aux);
        while(recarga < 0){
            JOptionPane.showMessageDialog(null,"Error: Ingrese un monto valido");
            aux = JOptionPane.showInputDialog("Ingrese el monto de su recarga $...");
            recarga = Integer.parseInt(aux);
        }

        credito += recarga;
        JOptionPane.showMessageDialog(null,"Su nuevo saldo es de: "+credito+" pesos.\nQUE LO DISFRUTE, IT IS ON THE HOUSE");

    }

    public void consultaCreditos(){

        JOptionPane.showMessageDialog(null,String.format("Por el momento, tiene un saldo de: %.1f pesos",credito));
        
    }


}