package br.com.bancosantander;

import java.util.Date;

public class Cheque {

    private double valor;
    private String bancoEmissor;
    private Date dataEmissao;


//getters
    public double getValor() {
        return this.valor;
    }
    public String getBancoEmissor() {
        return this.bancoEmissor;
    }
    public Date getDataEmissao() {
        return this.dataEmissao;
    }


//setters

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setBancoEmissor(String bancoEmissor) {
        this.bancoEmissor = bancoEmissor;
    }
    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

}
