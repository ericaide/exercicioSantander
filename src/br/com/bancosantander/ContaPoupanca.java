package br.com.bancosantander;

public class ContaPoupanca extends Contas{

    private double saldo;
    private double juros;

    //construtor padrão
    public ContaPoupanca(){

    }

    //getters
    public double getSaldo() {
        return this.saldo;
    }
    public double getJuros() {
        return this.juros;
    }


    //setters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setJuros(double juros) {
        this.juros = juros;
    }


    @Override
    public void depositar(double dinheiro) {
        saldo = saldo + dinheiro;
        System.out.println("Você depositou " + dinheiro + ". Seu saldo atual é " + saldo);

    }

    @Override
    public void sacar(double dinheiro) {

    }

    @Override
    public void consultaSaldo(double saldo) {

    }
}
