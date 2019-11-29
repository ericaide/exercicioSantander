package br.com.bancosantander;

public class Clientes {

    private int numeroConta;
    private String sobrenome;
    private String rg;
    private String cpf;

    // construtor padrão
    public Clientes(){

    }

    public Clientes(int numeroConta, String sobrenome, String rg, String cpf){
        this.numeroConta = numeroConta;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
    }


//getters

    public int getNumeroConta() {
        return this.numeroConta;
    }
    public String getSobrenome() {
        return this.sobrenome;
    }
    public String getRg() {
        return this.rg;
    }
    public String getCpf() {
        return this.cpf;
    }

//setters

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
