
//librerias
//no necesitamos de la libreria util puesto a que no habrá ingreso de datos por parte del teclado
//tanto del usuario como del desarrollador
import javax.swing.JOptionPane;
import java.lang.Math;

//Clase pubica que contiene a los atributos y metodos
public class sueldoEmpleado{

    //variables

    private int ID_empleado, extra_diurnas, extra_nocturnas;
    private String nombre_empleado, puesto, option, text;
    private int sueldo_quincenal[] = new int [16];
    private int totalSup;

    //Colocaremos un metodo que despliegue un menu en pantalla para los puestos y ID
    public void MenuEmpleados(){

        //abrimos ciclo do para la seleccion del puesto
    do{ 
        try{
            text = JOptionPane.showInputDialog("Bienvenido al programa para obtener su sueldo!\nAntes que nada ingrese su nombre: ");
            nombre_empleado = (text);

        }catch(Exception e){ //e.getMessage

            JOptionPane.showMessageDialog(null," "+e.getMessage);

        }
        text = JOptionPane.showInputDialog("Bienvenido al programa para obtener su sueldo!\nAntes que nada ingrese su nombre: ");
        nombre_empleado = (text);
        text = JOptionPane.showInputDialog("Ahora por favor escoja su puesto según la lista de abajo\n1.-Empleado\n2.-Empleado supervisor");
        puesto = Integer.parseInt(text);
        JOptionPane.showMessageDialog(null,"El ID para los dos puestos son:\n1.- Empleado: 1111\n2.- Empleado supervisor: 2222\nEn caso de ser erróneo, se le denegara el acceso");

        switch(option){
            case 1:
            accesoDatos();
                TotalPagoEmpleado();
                break;
            case 2:
            accesoDatos();
                TotalPagoSup();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error: Ingrese un valor acorde a la lista");
                break; 
        }


    }while(option < 3);



    }

    //metodo para acceso o restricción segun ID y puesto
    public void accesoDatos(){

        while(option == 1){
            text = JOptionPane.showInputDialog("Por favor, ingrese su ID: ");
            ID_empleado = Integer.ParseInt(text);
            while(ID_empleado != 1111){
                JOptionPane.showMessageDialog(null,"Error: Ingrese un ID acorde a su puesto");
                text = JOptionPane.showInputDialog("Por favor, ingrese su ID: ");
                ID_empleado = Integer.ParseInt(text);
            }

        }

        while(option == 2){
            text = JOptionPane.showInputDialog("Por favor, ingrese su ID: ");
            ID_empleado = Integer.ParseInt(text);
            while(ID_empleado != 2222){
                JOptionPane.showMessageDialog(null,"Error: Ingrese un ID acorde a su puesto");
                text = JOptionPane.showInputDialog("Por favor, ingrese su ID: ");
                ID_empleado = Integer.ParseInt(text);

            }

        }
    }


    //metodo para calcular el total de pago
    public void TotalPagoEmpleado(){
        //se muestra el sueldo fijo quincenal almacenado en un array unidimensional
        sueldo_quincenal = 5000;
        JOptionPane.showMessageDialog(null,"Bien "+nombre_empleado+" ,su sueldo fijo quincenal es de: "+sueldo_quincenal[]);
        //horas extra diurnas y nocturnas
        text = JOptionPane.showInputDialog("Ingrese su total de horas extras diurnas trabajadas: ");
        extra_diurnas = Integer.ParseInt(text);
        extra_diurnas *= 50;
        text = JOptionPane.showInputDialog("Ingrese su total de horas extras nocturnas trabajadas: ");
        extra_nocturnas = Integer.ParseInt(text);
        extra_nocturnas *= 60;
        text = JOptionPane.showMessageDialog(null,"Su total correspondiente a las horas extras diurnas es de: "+extra_diurnas"\nY para las horas extras nocturnas trabajadas es de: "+extra_nocturnas);
        
    }

    public void TotalPagoSup(){
        sueldo_quincenal = (8000);
        JOptionPane.showMessageDialog(null,"Bien "+nombre_empleado+" ,su sueldo fijo quincenal es de: "+sueldo_quincenal[]);
        JOptionPane.showMessageDialog(null,"Espere un momento mientras realizamos el conteo...");
        //operaciones
        totalSup = (sueldo_quincenal * .02) - (sueldo_quincenal *.01) - (sueldo_quincenal * .016);
        JOptionPane.showMessageDialog(null,"Su total es de: "+totalSup); 

    }



}