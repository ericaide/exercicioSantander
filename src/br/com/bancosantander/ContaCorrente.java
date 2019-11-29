package br.com.bancosantander;

public class ContaCorrente extends Contas {

    private double saldo;
    private double limiteChequeEspecial;

//construtor padrão
    public ContaCorrente(){

    }

//getters
    public double getSaldo() {
        return this.saldo;
    }
    public double getLimiteChequeEspecial() {
        return this.limiteChequeEspecial;
    }


//setters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }


    @Override
    public void depositar(double dinheiro) {

    }

    @Override
    public void sacar(double dinheiro) {

    }

    @Override
    public void consultaSaldo(double saldo) {

    }
}
