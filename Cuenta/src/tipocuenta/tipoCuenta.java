/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tipocuenta;

import Persona.Cliente;

/**
 *
 * @author rash2
 */
public class tipoCuenta {
    
    private int num_cuenta; 
    private int num_tarjeta;
    private int[] expirationdate;
    private double saldo;
    private int NIP;
    private int cod_seguridad;

    public tipoCuenta(int num_cuenta, int num_tarjeta, int[] expirationdate, double saldo, int NIP, int cod_seguridad) {
        this.num_cuenta = num_cuenta;
        this.num_tarjeta = num_tarjeta;
        this.expirationdate = expirationdate;
        this.saldo = saldo;
        this.NIP = NIP;
        this.cod_seguridad = cod_seguridad;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public int getNum_tarjeta() {
        return num_tarjeta;
    }

    public void setNum_tarjeta(int num_tarjeta) {
        this.num_tarjeta = num_tarjeta;
    }

    public int[] getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(int[] expirationdate) {
        this.expirationdate = expirationdate;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public int getCod_seguridad() {
        return cod_seguridad;
    }

    public void setCod_seguridad(int cod_seguridad) {
        this.cod_seguridad = cod_seguridad;
    }
    
   //¿que operaciones tiene una cuenta
    
    public void ConsultarCuenta(){
        //los datos de la cuenta
        Cliente cli = new Cliente();
        
        System.out.println("El nombre del clienet: ");
        System.out.println(cli.getNombre());
        System.out.println("El numero de cuenta es: ");
        System.out.println(cli.getNum_cuenta());
        System.out.println("Su saldo actual es de: ");
        System.out.println(this.saldo);
        
    }
    
    public void depositar(double monto){
       //que le hago al saldo
        this.saldo+=monto;
    }
    
    public void retirar(double monto){
        //tengo que saber si tengo saldo
        if(this.saldo < monto){
            System.out.println("Cuenta con saldo insuficiente, bienvenido a latinoamerica u.u"); 
        }else{
            this.saldo-=monto;
            System.out.println("Gracias por usar este banco!");
        }
    }
}
    

