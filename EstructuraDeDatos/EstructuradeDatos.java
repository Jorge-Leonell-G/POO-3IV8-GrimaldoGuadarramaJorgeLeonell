import java.util.Scanner;

class estructuradedatos{
public static void main(String[] args){

//Instancia
Scanner entrada = new Scanner(System.in);

//variables para cada programa :(
    int edad, opcion, decimal, mod;
    double abono, resultado;
    String bin = "", respuesta = "";
    char respuestaR, respuestaE;

do{
   System.out.println("Bienvenido al programa de Estructura de Datos :D ");
   System.out.println("Elija el programa que desea ejecutar ");
   System.out.print("1.- Edad y abonos ");
   System.out.print("2.- Numero decimal a binario ");
   System.out.print("3.- Temperatura en grados Fahrenheit, Kelvin, Celsius y Rankine ");
   System.out.print("4.- Contador de positivos y negativos ");
   System.out.print("5.- Lectura de cantidades ");
   System.out.print("6.- Area, perimetro y volumen ");
   System.out.print("7.- Tabla de valores ");
   System.out.print("8.- Factorial de un numero no negativo ");

//asignar la opción
opcion = entrada.nextInt();
do{ 
switch (opcion){   
case 1:
   System.out.println("Hola, por favor ingrese su edad: ");
   edad = entrada.nextInt();
   System.out.println("Ahora ingrese el monto de su bono: ");
   abono = entrada.nextDouble();
   if (edad > 65){
   resultado = abono * .40;
   System.out.println("Su monto total es de: "+resultado);    

   if (edad < 21){
   System.out.println("¿Sus padres son socios de este corporativo? Escriba si o no según sea su caso ");
   respuesta = entrada.nextLine();    

   if (respuesta.equals("si")){
   resultado = abono * .45;
   System.out.println("Su monto con descuento es de: "+resultado);    

   if (respuesta.equals("no")){
   resultado = abono * .25;
   System.out.println("Su monto con descuento es de: "+resultado);    
   } 
   else {
   System.out.println("Por favor, escriba si o no según sea su caso ");    
   }}}}
   break; 
   do{
case 2:
   System.out.println("Ingrese su numero decimal: ");
   decimal = entrada.nextInt();
   while (decimal > 0){
   mod = (decimal%2);
   bin = mod + bin;
   decimal = decimal/2;
   }
   System.out.println("El numero decimal en base 10 es igual en base 2 a "+bin);
   System.out.println("¿Desea repetir el programa? Si es asi, presione la tecla R");
   respuestaR = entrada.next().charAt(0);   
}while(respuestaR == 'R');
break;



}     


 
System.out.println("¿Desea repetir el programa? Si es así, presione la tecla R");
respuestaR = entrada.next().charAt(0);
   }while(respuestaR == 'R');
System.out.println("¿Desea regresar al menú principal? Si es así, presione la tecla E");
respuestaE = entrada.next().charAt(0);
   }while(respuestaE == 'E');    
  }
 }


    


     
      
    


  
 
 