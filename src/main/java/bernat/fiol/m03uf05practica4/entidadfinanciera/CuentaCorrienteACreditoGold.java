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
public class CuentaCorrienteACreditoGold extends CuentaCorrienteACredito {

    public CuentaCorrienteACreditoGold(String titular, double saldo) {
        super(titular, saldo);
    }

    //Esta cuenta permite un descubierto de hasta 3000 euros, si es más lanza una excepcion.
    @Override
    public void abona(double abono) {
        if (checkAbono(abono)) {
            if ((getSaldo() + 3000) >= abono) {
                setSaldo(getSaldo() - abono);
            } else {
                throw new UnsupportedOperationException("Has sobrepasat el descubert de 3000 euros."); //To change body of generated methods, choose Tools | Templates.
            }
        }
    }

}
