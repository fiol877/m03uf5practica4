package bernat.fiol.m03uf05practica4.entidadfinanciera;

/**
 *
 * @author Bernat
 */
public class CuentaCorrienteMain {
    public static void main(String[] args) {
        CuentaCorritenteImpl conta = new CuentaCorrienteADebito("asdsad", 1000.0);
        //conta.ingresa(1000.0);
        //conta.abona(-999.0);
        System.out.println(conta.getSaldo());
    }
}
