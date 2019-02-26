/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author christian
 */
public class CuentaBancaria {
    private float saldo;
    private int noCuenta;
    private String[] historial;
    private int noMovimiento;
    
    public CuentaBancaria(int noCuenta,float saldo ){
        this.saldo=saldo;
        this.noCuenta=noCuenta;
        this.historial = new String[10];
        this.noMovimiento=0;
    }
    public float getSaldo(){
        return saldo;
    }
    public String[] getHistorial(){
        return historial;
    }
    public void depositar(float cantidad){
        this.saldo= this.saldo+cantidad;
        this.historial[noMovimiento]="Deposito de "+cantidad;
        noMovimiento= noMovimiento+1;
    }
    public float retirar(float cantidad){
        if(this.saldo>=cantidad){
            this.saldo=this.saldo-cantidad;
            this.historial[noMovimiento]="Retiro de "+cantidad;
            noMovimiento++;
        }
        return this.saldo;
        
    }
    
}
