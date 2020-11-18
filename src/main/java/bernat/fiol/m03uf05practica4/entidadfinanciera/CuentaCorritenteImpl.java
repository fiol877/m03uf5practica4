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
public abstract class CuentaCorritenteImpl implements CuentaCorriente {
    
    //private double saldo;
    protected double saldo;
    private String titular;
    
    public void ingresa(double ingreso) {
        if(ingreso > 0) saldo += ingreso;
        else throw new UnsupportedOperationException("El ingres no pot ser negatiu.");
    }
    
    public CuentaCorritenteImpl(String titular, double saldo) {
        this.saldo = saldo;
        this.titular = titular;
    }

    /*public void setSaldo(double saldo) {
        this.saldo = saldo;
    }*/

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

    public boolean checkAbono(double abono){
        boolean b = false;
        if(abono <=0) throw new UnsupportedOperationException("El abono no pot ser negatiu.");
        else b = true;
        
        return b;
    }
}
