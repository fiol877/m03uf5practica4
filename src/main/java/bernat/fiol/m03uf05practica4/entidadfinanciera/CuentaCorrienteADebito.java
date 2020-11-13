/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bernat.fiol.m03uf05practica4.entidadfinanciera;

/**
 *
 * @author pep
 */
public class CuentaCorrienteADebito extends CuentaCorritenteImpl {

    public CuentaCorrienteADebito(String titular, double saldo) {
        super(titular, saldo);
    }

    /**
     * 
     * Solamente se da un abono si hay saldo, si no se lanza una exception
     * 
     * @param abono 
     */
    @Override
    public void abona(double abono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
