/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tipocuenta;

/**
 *
 * @author rash2
 */
public class credito extends tipoCuenta {
    
    private double limcredito;

    public credito(double limcredito, int num_cuenta, int num_tarjeta, int[] expirationdate, double saldo, int NIP, int cod_seguridad) {
        super(num_cuenta, num_tarjeta, expirationdate, saldo, NIP, cod_seguridad);
        this.limcredito = limcredito;
    }
    
    public double getLimcredito(){
        return limcredito;
    }
    
    public void setLimcredito(double limcredito){
       this.limcredito = limcredito;
    } 
}
