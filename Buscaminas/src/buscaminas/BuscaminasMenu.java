/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package buscaminas;

//import buscaminas.BuscaminasJuego;
import buscaminas.Casillas;
import buscaminas.Controlador;
import buscaminas.Principal;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author rash2
 * 
 */

public class BuscaminasMenu extends JFrame{
    public JPanel panelscore;
    public JPanel panelJuego;
    int contadorScore = 0;
    int contadorMinas = 0;
    int numeroCuadros = 64;

    //public static void main(String[] args) {
        
    // TODO code application logic here
        
    public BuscaminasMenu(){
       
        //Ventanajuego window = new Ventanajuego();
        //JFrame window = new JFrame();
        //Establecemos el titulo
        this.setTitle("Programación Orientada a Objetos 3IV8");
        //Establecemos la posicion inicial de la ventana, en este caso al centro
        //junto con su tamaño
        //window.setLocation(475, 200);
        //window.setBounds(475, 150, 500, 500);
        this.setSize(450, 450);
        this.setLocationRelativeTo(null);
        //Establecemos que cuando se de click al boton cerrar, el proceso tambien
        //finalizara
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //instancias de nuestros metodos a utilizar
        iniciarComp();
       
    }
    
     private void iniciarComp(){
        //Instancias de nuestros metodos correspondientes a nuestros componentes
         Paneles();
         Etiquetas();
         Botones();
         //ListaDesplegable();
        /*Creamos otro panel para el tablero de nuestro buscaminas
        JPanel paneltablero = new JPanel();
        panelscore.setBackground(Color.PINK);
        this.getContentPane().add(paneltablero);
        */
    }
    
    private void Paneles(){
        //Aqui crearemos e inicializaremos componentes para nuestro panel que ira en nuestra
        //ventana
        
        //Creacion de nuestro primer panel, donde se visualizara el puntaje
        panelscore = new JPanel();
        //Damos color a nuestro panel
        //panelscore.setBackground(Color.GREEN);
        //this.getContentPane().add(panel);
        //Modificamos la ventana y listo, añadimos nuestro primer panel :D
        this.getContentPane().add(panelscore);
        
        //panelJuego = new JPanel();
        
    }
    
    private void Etiquetas(){
        //iniciamos con nuestra primera etiqueta 
        JLabel etiquetascore = new JLabel("score:",SwingConstants.CENTER);
        //etiquetascore.setText("score:");
        //Desactivamos el diseño predeterminado de nuestro panel para asi
        //modificarlo
        panelscore.setLayout(null);
        //Ubicacion y tamaño
        etiquetascore.setBounds(325, 5, 60, 30);
        //Color, fuente, estilo y tamaño de nuestra etiqueta
        etiquetascore.setForeground(Color.MAGENTA);
        etiquetascore.setFont(new Font("arial", Font.ITALIC, 16));
        //agregamos nuestra etiqueta al panel
        panelscore.add(etiquetascore);
        
        JLabel titulo = new JLabel("BUSCAMINAS",SwingConstants.CENTER);
        titulo.setBounds(120, 20, 200, 25);
        titulo.setForeground(Color.BLUE);
        titulo.setFont(new Font("Cooper plate", Font.BOLD, 20));
        panelscore.add(titulo);
        
        //etiqueta de imagen
        //es de mi mascota, se llama karim :3
        ImageIcon image = new ImageIcon("karim_logo.jpg");
        JLabel label_image = new JLabel();
        label_image.setBounds(10, 80, 300, 300);
        /*
        A través de todo esto, establecemos el tamaño de nuestra imagen que se mostrara
        como logotipo, primero establecemos una nueva imagen, obtenemos la imagen a traves de get
        y utilizamos el metodo getScaledInstance para definir el ancho, alto y tipo de escala, en 
        este caso, una escala suave (SCALE_SMOOTH)
        */
        label_image.setIcon(new ImageIcon(image.getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH)));
        panelscore.add(label_image);
        
    }
    
   
    
    private void Botones(){
        JButton botoninicio = new JButton();
        botoninicio.setText("Comenzar!");
        botoninicio.setBounds(145, 250, 150, 40);
        botoninicio.setFont(new Font("arial", Font.BOLD, 16));
        panelscore.add(botoninicio);
        
        JButton botonsave = new JButton();
        botonsave.setText("Guardar registro de usuario");
        botonsave.setBounds(35, 300, 150, 45);
        botonsave.setFont(new Font("arial", Font.PLAIN, 16));
        panelscore.add(botonsave);
       
        JButton botondelete = new JButton();
        botondelete.setText("Borrar registro de usuario");
        botondelete.setBounds(250, 300, 150, 45);
        botondelete.setFont(new Font("arial", Font.PLAIN, 16));
        panelscore.add(botondelete);
       
        JButton highscore = new JButton();
        highscore.setText("Marcadores");
        highscore.setBounds(10, 50, 150, 40);
        highscore.setFont(new Font("arial", Font.PLAIN, 16));
        panelscore.add(highscore);
        
        JButton edit = new JButton();
        edit.setText("Editar");
        edit.setBounds(145, 350, 150, 40);
        edit.setFont(new Font("arial", Font.PLAIN, 16));
        panelscore.add(edit);
        
        //De una vez creamos un objeto a partir de la clase Controlador
        //para la instancia de nuetrso metodos dedicados a los eventos
        Controlador control = new Controlador();
        //Partida match = new Partida();
        
        //Comenzamos con los eventos de ActionListener u.u
        ActionListener listeninicio = new ActionListener() {
            
            //Agregamos todos los metodos abstractos de ActionListener, lo que 
            //deriva en un override (sobrecarga)
            @Override
            public void actionPerformed(ActionEvent e) {
                //Aqui mostramos nuestra otra ventana que contiene al tablero
                
                BuscaminasJuego windowJuego = new BuscaminasJuego();
                JPanel panelJuego = new JPanel();
                windowJuego.getContentPane().add(panelJuego);
                //Establecemos la visibilidad de nuestra ventana
                windowJuego.setVisible(true);
                windowJuego.setDefaultCloseOperation(HIDE_ON_CLOSE);
                
                Partida();
                //panelJuego.paintAll(panelJuego.getGraphics());
                Casillas temp2 = (Casillas)e.getSource();
                if(temp2.campoMinado()){
                    JOptionPane.showMessageDialog(null,"Game Over");
                     String opcion = JOptionPane.showInputDialog("¿Deseas volcver a jugar...(s/n)");
                     if(opcion.equalsIgnoreCase("si")){
                         guardarPuntaje();
                         iniciarComp();
                     }
                }else{
                    temp2.setBackground(Color.GREEN);
                    contadorScore++;
                    if((numeroCuadros-contadorMinas)==contadorScore){
                        JOptionPane.showMessageDialog(null,"Has ganado!");
                        String opcion = JOptionPane.showInputDialog("¿Deseas volcver a jugar...(s/n)");
                        if(opcion.equalsIgnoreCase("si")){
                            guardarPuntaje();
                            contadorScore = 0;
                            Partida();
                        }else{
                            iniciarComp();
                        }
                        
                    }
                }
                
                 
            }

            

            
        };                  
        botoninicio.addActionListener(listeninicio);
        
        ActionListener listensave = new ActionListener() {
            
            //Agregamos todos los metodos abstractos de ActionListener, lo que 
            //deriva en un override (sobrecarga)
            @Override
            public void actionPerformed(ActionEvent e) {
                //Aqui mostramos nuestra otra ventana que contiene al tablero
                //metodo();
                String nombre = JOptionPane.showInputDialog("Por favor ingrese el nombre del jugador ");
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la edad del jugador "));
                int ID = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el ID del jugador "));
                int score = Integer.parseInt(JOptionPane.showInputDialog("Por último ingrese el puntaje del jugador "));
                
                //creación de un objeto jugador nuevo a partir de nuestra clase
                //Jugador con los parametros que debe de tener para ser un jugador
                //totalmente
                Jugador jugadorNuevo = new Jugador(nombre, edad, ID, score);
                
                try {
                    //En los parametros añadimos al objeto "personaNueva", pues es el resultado
                    //de la actualizacion de datos
                    control.agregarJugador(jugadorNuevo);
                    
                } catch (IOException ex) {
                    Logger.getLogger(BuscaminasMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
                iniciarComp();
                
            }
        };                  
        botonsave.addActionListener(listensave);
        
        ActionListener listendelete = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //metodo
                int ID_eliminar = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del jugador "
                        + "que desea eliminar:  "));
                
                //Creamos otro objeto a partir de la clase (plantilla) Persona
                Jugador jugadorEliminar = control.buscarJugador(ID_eliminar);
                
                control.eliminarJugador(jugadorEliminar);
                
                //JOptionPane.showMessageDialog(null,"El registro se ha borrado con exito");
                iniciarComp();
            }
        };
        botondelete.addActionListener(listendelete);
        
        ActionListener listenhigh = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //Instanciamos nuestro metodo a partir de un objeto de nuetro 
                //ArrayList
                ArrayList<Jugador>listaJugadores = control.mostrarJugadores();
                //Procedemos a recorrer el array
                   //Clase //Objeto
                for(Jugador obj : listaJugadores){
                    //imprimir registros
                    JOptionPane.showMessageDialog(null,"Nombre del jugador: "+obj.getNombre()
                    +"\nEdad del jugador: "+obj.getEdad()
                    +"\nID del jugador: "+obj.getID()
                    +"\nPuntaje del jugador: "+obj.getScore());
                    
                }
                
            }
        };
        highscore.addActionListener(listenhigh);    
     
        ActionListener listenedit = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int ID = Integer.parseInt(JOptionPane.showInputDialog("Digite "
                        + "el ID del jugador al que actualizará sus datos"));
                
                //En el parametro del metodo ingresamos el score ya que es indispensable para 
                //la busqueda del jugador
                
                //objeto a partir de la clase  //metodo a partir de objeto
                Jugador jugadorBuscar = control.buscarJugador(ID);
                
                //visualizamos la info de esa persona
                
                JOptionPane.showMessageDialog(null,"La informacion de esa persona es:\n"
                +"Nombre: " + jugadorBuscar.getNombre()+"\n"
                +"Edad: " + jugadorBuscar.getEdad()+"\n"
                +"ID: " + jugadorBuscar.getID());
                
                //ahora vamos a cambiar los datos
                String nuevonombre = JOptionPane.showInputDialog("Ingresa el nuevo nombre: ");
                int nuevaedad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nueva edad: "));
                
                //El puntaje es lo unico que no se podrá cambiar muajjajaj ;)
                //También el ID no se podrá cambiar
                
                //con el metodo set establecemos esos nuevos parametros
                jugadorBuscar.setNombre(nuevonombre);
                jugadorBuscar.setEdad(nuevaedad);
                JOptionPane.showMessageDialog(null,"Cambios realizados correctamente");
                //Ahora se actualiza la lista
                control.actualizarJugador(jugadorBuscar);
                  iniciarComp();  
                
            }
        };
        edit.addActionListener(listenedit);
        
        //guardar();
        
    }
    
    //Nuestra lista desplegable que contiene las 4 dificultades a elegir
    /*
    private void ListaDesplegable(){
        String [] dificultades = {"Fácil", "Normal", "Difícil", "Pesadilla!"};
        JComboBox listadesp = new JComboBox(dificultades);
        listadesp.setBounds(35, 20, 100, 30);
        panelscore.add(listadesp);
        */
        //private void botoninicio ActionPerformed(java.awt.event.ActionEvent event e)
        
    private void Partida() {

                int nFilas = 8;
                int nCol = 8;
                this.numeroCuadros = nFilas * nCol;
                this.contadorScore = 0;
                this.contadorMinas = 0;
                //ciclo for anidado para la creación de nuestras casilla (botones)
                for(int i =0; i<nFilas;i++){
                    for(int j = 0; j<nCol; j++){
                        Casillas temp = new Casillas();
                        //temp.addActionListener(this);
                        if(temp.campoMinado())
                            this.contadorMinas++;
                        temp.setVisible(true);
                        this.panelJuego.add(temp);
                        
                    }
                }
            }
    
    private void guardarPuntaje ()  {
    //Asignamos el valor del puntaje que se contó a la variable score
    int score;
    score = contadorScore;
    
        
        
            }
        
    }
   
     
   

    /*
    private void colocarBotones(){
        JButton botoninicio = new JButton("Comenzar!");
        botoninicio.setBounds(10, 20, 30, 25);
        paneltablero.add(botoninicio);
        
    }*/

    
    
   
//}
