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
public class CuentaCorrienteACreditoPlatinum extends CuentaCorrienteACredito {

    public CuentaCorrienteACreditoPlatinum(String titular, double saldo) {
        super(titular, saldo);
    }

    //Esta cuenta permite un descubierto de hasta 5000 euros, si es más lanza una excepcion.
    @Override
    public void abona(double abono) {
        if (checkAbono(abono)) {
            if ((getSaldo() + 5000) >= abono) {
                this.saldo -= abono;
            } else {
                throw new UnsupportedOperationException("Has sobrepasat el descubert de 5000 euros."); //To change body of generated methods, choose Tools | Templates.
            }
        }
    }

}
