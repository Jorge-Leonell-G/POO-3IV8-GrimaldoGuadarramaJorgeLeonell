/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemploswing;

/**
 *
 * @author rash2
 */

import javax.swing.*;
public class Ejemploswing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Lo primero que se necesita para poder realizar una interfaz es
        un frame
        */
        
        JFrame frame = new JFrame("Ejemlo Ventanita");
        //definir su tamaño
        frame.setSize(350, 200); //tamaño es en pixeles
        //vamos a agregarle una opcion del cerrado, en este caso, al presionar
        //boton cerrar
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //ahora necesito un panel de control
        //dentro del panel agregamos elementos
        
        JPanel panel = new JPanel();
        frame.add(panel);
        
        //metodo para carga de componentes
        placeComponents(panel);
        
        //Hacemos visible la ventana
        frame.setVisible(true);
    }
    
    private static void placeComponents(JPanel panel){
        
        panel.setLayout(null);
        
        //ya que tengo una capa (layout) activa a esa se le asignan
        //componentes
        
        //label
        JLabel userLabel = new JLabel("Usuario");
        //para inicializar el componente se utiliza el metodo
        //setBounds
        userLabel.setBounds(10, 10, 80, 25);
        //se agrega al panel
        panel.add(userLabel);
        
        //textfield con capacidad de 20 caracteres
        JTextField userText = new JTextField(20);
        //de igual forma lo inicializamos con el metodo
        //setBounds
        userText.setBounds(10, 10, 160, 25);
        panel.add(userText);
        
        //label
        JLabel userpasslabel = new JLabel("Password");
        //para inicializar el componente se utiliza el metodo
        //setBounds
        userpasslabel.setBounds(10, 40, 80, 25);
        //se agrega al panel
        panel.add(userpasslabel);
        
        //textfield
        JTextField userpassText = new JTextField(20);
        userpassText.setBounds(100, 40, 160, 25);
        panel.add(userpassText);
        
        //boton
        JButton loginbutton = new JButton("Iniciar sesión");
        loginbutton.setBounds(10, 80, 120, 25);
        panel.add(loginbutton);
        
        JButton registrobutton = new JButton("Registrarse");
        registrobutton.setBounds(180, 80, 100, 20);
        panel.add(registrobutton);
        
        
    }
    
}
