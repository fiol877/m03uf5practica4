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
public abstract class CuentaCorritenteImpl implements CuentaCorriente {
    
    private double saldo;
    private String titular;
    
    
    public void ingresa(double ingreso) {
        saldo += ingreso;
    }
    
    public void abona(double abono){}

    public CuentaCorritenteImpl(String titular, double saldo) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
    
    
    @Override
    public String toString() {
        return "CuentaCorrienteImp{" + "saldo=" + saldo + ", titular=" + titular + '}';
    }
}
