/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bernat.fiol.m03uf05practica4.entidadfinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pep
 */
public class CuentaCorrienteADebito extends CuentaCorritenteImpl {

    //Solo se da un abono si hay saldo, sino se lanza una excepcion
    @Override
    public void abona(double abono) {
        if(getSaldo() <= abono){
            setSaldo(getSaldo() - abono); 
        } else {
            throw new UnsupportedOperationException("No tens suficient saldo per realitzar aquest abono."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }

    public CuentaCorrienteADebito(String titular, double saldo) {
        super(titular, saldo);
    }
    
}
