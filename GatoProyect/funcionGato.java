import java.util.*;
//import java.util.stream.Collectors;
//utilizamos la palabra reservada extends para poder heredar las funciones de la super clase o en este caso
//de la libreria java.util.stream.Collectors;
public class funcionGato /*extends java.util.stream.Collectors*/{

    //uso de arrays bidimensionales
    ArrayList<String> cat = new ArrayList<String>();
    /*private*/ int turno = 0;
    //uso de booleanos para definir siempre el inicio del jugador 1, y el permiso
    /*private*/ boolean player1 = true;
    private boolean player2 = false;
    private boolean permiso = true;
    private int pos = 0;

    //metodo con retonro de un entero, que en este caso es para el simbolo "O"
    //tambien nos auxiliamos de los metodos set que establecen la posicion de o, y de x
    public int catO(int nro){
        cat.set(nro,"O");
        return nro;

    }

    //metodo con retonro de un entero, que en este caso es para el simbolo "X"
    public int catX(int nro){
        cat.set(nro,"X");
        return nro;
    }

    public void Inicio(){
        cat.clear();
        //ciclo for para el llenado del array mediante el ingreso de los numeros de la posicion
        for(int i=1; i<=9; i++){

            cat.add(" ");

        }

        System.out.println("[0, 1, 2]"+"\n"+"[3, 4, 5]"+"\n"+"[6, 7, 8]"+"\n");

    }

    public void mostrarGato(){
        //Aqui con el metodo sublist colocamos coordenadas entre intervalos de numeros
        //toString nos ayuda a la impresion en formato cadena de las filas
        String fila1=cat.subList(0, 3).toString();
        String fila2=cat.subList(3, 6).toString();
        String fila3=cat.subList(6, 9).toString();
        //con ayuda de saltos de linea, le damos forma a nuestro tablero del gato
        System.out.println(fila1+"\n"+fila2+"\n"+fila3+"\n");
        
    }

    public void Validacion(){

        String jG1=cat.subList(0, 3).toString();
        String jG2=cat.subList(3, 6).toString();
        String jG3=cat.subList(6, 9).toString();

        //ciclo if que determina las posibles opciones en las que el jugador que ocupa la "X" gana, es decir, el player1
        if(((cat.get(0)=="X")&&(cat.get(3)=="X")&&(cat.get(6)=="X"))||
            ((cat.get(1)=="X")&&(cat.get(4)=="X")&&(cat.get(7)=="X"))||
            ((cat.get(2)=="X")&&(cat.get(5)=="X")&&(cat.get(8)=="X"))||
            ((cat.get(0)=="X")&&(cat.get(4)=="X")&&(cat.get(8)=="X"))||
            ((cat.get(2)=="X")&&(cat.get(4)=="X")&&(cat.get(6)=="X"))||
            (jG1.equals("[X, X, X]"))||(jG2.equals("[X, X, X]"))||(jG3.equals("[X, X, X]"))){
                System.out.println("El jugador 1 ha ganado");
                turno=9;
            //ahora procedemos a ahacer lo mismo, pero para las posibles opciones en donde el jugador
            //que ocupa la "O" sea el ganador, es decir, el player2        
        }else if(((cat.get(0)=="O")&&(cat.get(3)=="O")&&(cat.get(6)=="O"))||
            ((cat.get(1)=="O")&&(cat.get(4)=="O")&&(cat.get(7)=="O"))||
            ((cat.get(2)=="O")&&(cat.get(5)=="O")&&(cat.get(8)=="O"))||
            ((cat.get(0)=="O")&&(cat.get(4)=="O")&&(cat.get(8)=="O"))||
            ((cat.get(2)=="X")&&(cat.get(4)=="X")&&(cat.get(6)=="X"))||
            (jG1.equals("[O, O, O]"))||(jG2.equals("[O, O, O]"))||(jG3.equals("[O, O, O]"))){
                System.out.println("El jugador 2 ha ganado");
                turno=9;
            //Y en caso de que se lleguen a las 8 rondas, esto significa empate   
        }else if(turno>=8){
            System.out.println("Empate: Nadie ha ganado -,_-");
        } 
    }

        public void Juego(){
            //invocamos al metodo de inico del juego
            Inicio();//{
                do{
                    //ciclos if 
                    if(player1==true){
                        System.out.println("Es el turno del jugador 1");
                        Scanner entrada = new Scanner(System.in);
                        //bloque try y catch
                        /*try{
                            do{
                                System.out.println("Ingresa la posicion donde quieres colocar X");
                                pos = entrada.nextInt(); 
                            }while(pos >=0 && pos <9);
                                 //System.out.println("Ingresa la posicion donde quieres colocar X");
                                 //pos = entrada.nextInt();
                            //salir del proceso try
                            break;
                            //recibimos el error mediante el objeto e
                        }catch(Exception e){
                            System.out.println("Error: Solo ingrese numeros enteros de acuerdo al tablero");
                            //pos = entrada.NextInt();
                            System.out.println("Error: "+ e.getMessage());
                            entrada.next();
                        }*/
                        System.out.println("Ingresa la posicion donde quieres colocar X");
                        pos = entrada.nextInt();

                        if(cat.get(pos)==" "){
                            catX(pos);
                            permiso=true; //Nuestra variable booleana en true indica que el jugador si puede usar la casilla en desuso
                        }else{ //El else arrojara mensaje de que la casilla ya esta llena, otrogando un false a permiso
                            System.out.println("La casilla seleccionada esta ocupada, espere al otro turno muajajaj");
                            System.out.println("\n");

                            //se derementa el truno para que sigan las 9 jugadas en curso
                            turno--;
                            permiso = false;

                        }if(permiso = false){
                            player1 = false;
                        }

                        mostrarGato();
                        Validacion();
                        //se hace el cambio de turno a partir de nuestras variables booleanas
                        player1 = false;
                        player2 = true;

                    }else if(player2 == true){
                        System.out.println("Turno del jugador 2");
                        Scanner entrada = new Scanner(System.in);
                        System.out.println("Ingresa la posicion donde quieres colocar O");
                        pos = entrada.nextInt();

                        if(cat.get(pos)==" "){
                            catO(pos);
                            permiso=true;

                        }else{
                            System.out.println("La casilla seleccionada esta ocupada, espere al otro turno muajajaj");
                            System.out.println("\n");
                            turno--;
                            permiso = false;

                        }if(permiso = false){
                            player2 = false;
                        }

                        mostrarGato();
                        Validacion();
                        player2 = false;
                        player1 = true;
                        
                    }

                    turno++; //Se incrementa el tunro por cada jugada regular, asi para llegar hasta las 9 jugadas

                    //fin del ciclo while
                }while(turno <= 8);
                System.out.println("Game Over");
                //invocamos de vuelta al metodo que muestra el tablero
                mostrarGato();

            }




        }
        

            



    //}




//}